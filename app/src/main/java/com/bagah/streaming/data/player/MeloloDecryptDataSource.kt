package com.bagah.streaming.data.player

import android.net.Uri
import androidx.media3.common.C
import androidx.media3.datasource.BaseDataSource
import androidx.media3.datasource.DataSource
import androidx.media3.datasource.DataSpec
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

class MeloloKeyHolder {
    @Volatile
    var keyHex: String? = null
}

/**
 * Downloads the whole encrypted MP4, decrypts CENC AES-128-CTR samples in memory and
 * hands the clear MP4 to ExoPlayer. Same approach as [DramaBoxDecryptDataSource].
 */
class MeloloDecryptDataSource(
    private val client: OkHttpClient,
    private val keyHex: String
) : BaseDataSource(true) {

    private var uri: Uri? = null
    private var data: ByteArray = ByteArray(0)
    private var readPosition: Long = 0
    private var bytesRemaining: Long = 0

    override fun open(dataSpec: DataSpec): Long {
        uri = dataSpec.uri
        transferInitializing(dataSpec)
        try {
            val request = Request.Builder()
                .url(dataSpec.uri.toString())
                .header("User-Agent", MELOLO_USER_AGENT)
                .build()
            val raw = client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) throw IOException("HTTP ${response.code}")
                response.body?.bytes() ?: throw IOException("Respons kosong")
            }
            data = MeloloDecryptor.decrypt(raw, keyHex)
        } catch (e: Exception) {
            throw IOException("Gagal mengunduh/mendekripsi video Melolo", e)
        }
        readPosition = dataSpec.position.coerceAtLeast(0)
        bytesRemaining = data.size - readPosition
        if (bytesRemaining < 0) throw IOException("Posisi di luar video")
        transferStarted(dataSpec)
        return bytesRemaining
    }

    override fun read(buffer: ByteArray, offset: Int, length: Int): Int {
        if (length == 0) return 0
        if (bytesRemaining == 0L) return C.RESULT_END_OF_INPUT
        val toRead = minOf(length.toLong(), bytesRemaining).toInt()
        System.arraycopy(data, readPosition.toInt(), buffer, offset, toRead)
        readPosition += toRead
        bytesRemaining -= toRead
        bytesTransferred(toRead)
        return toRead
    }

    override fun getUri(): Uri? = uri

    override fun close() {
        uri = null
        data = ByteArray(0)
        transferEnded()
    }

    class Factory(
        private val client: OkHttpClient,
        private val keyHolder: MeloloKeyHolder
    ) : DataSource.Factory {
        override fun createDataSource(): DataSource =
            MeloloDecryptDataSource(client, keyHolder.keyHex.orEmpty())
    }

    private companion object {
        // Required by the Melolo CDN, otherwise the download is rejected.
        const val MELOLO_USER_AGENT = "com.worldance.drama/54818"
    }
}

/**
 * Strips CENC AES-128-CTR encryption from a Melolo MP4: samples are encrypted with a
 * per-sample 8-byte IV stored in `senc`, the counter block is IV || zeroes, and the
 * content key comes from `GET /api/melolo/episode`.
 *
 * ponytail: only v0 `senc` with 8/16-byte IVs and no subsamples (what Melolo serves).
 * Upgrade path: parse subsample entries and `seig` groups if another source appears.
 */
object MeloloDecryptor {

    private const val BLOCK = 16

    fun decrypt(raw: ByteArray, keyHex: String): ByteArray {
        val key = hexToBytes(keyHex)
        if (key.size != BLOCK) return raw
        val out = raw.copyOf()
        var patchedAny = false

        val moov = children(out, 0, out.size).firstOrNull { it.type == "moov" } ?: return raw
        for (trak in moov.children.filter { it.type == "trak" }) {
            val stbl = findPath(trak, listOf("mdia", "minf", "stbl")) ?: continue
            val stsz = stbl.child("stsz") ?: continue
            val stco = stbl.child("stco") ?: stbl.child("co64") ?: continue
            val stsc = stbl.child("stsc") ?: continue
            val senc = stbl.child("senc") ?: continue

            val fixedSize = u32(out, stsz.contentStart + 4)
            val sampleCount = minOf(
                u32(out, stsz.contentStart + 8),
                u32(out, senc.contentStart + 4)
            )
            val sizes = IntArray(sampleCount) {
                if (fixedSize != 0) fixedSize else u32(out, stsz.contentStart + 12 + 4 * it)
            }

            val chunkCount = u32(out, stco.contentStart + 4)
            val chunkOffsets = LongArray(chunkCount) {
                if (stco.type == "co64") u64(out, stco.contentStart + 8 + 8 * it)
                else u32(out, stco.contentStart + 8 + 4 * it).toLong() and 0xFFFFFFFFL
            }

            val stscCount = u32(out, stsc.contentStart + 4)
            val perChunk = Array(stscCount) {
                u32(out, stsc.contentStart + 8 + 12 * it) to u32(out, stsc.contentStart + 12 + 12 * it)
            }

            val ivSize = sampleInfoSize(out, stbl) ?: 8
            if (ivSize != 8 && ivSize != 16) continue
            if ((u32(out, senc.contentStart) ushr 24) != 0) continue
            val ivBase = senc.contentStart + 8
            if (ivBase + sampleCount * ivSize > senc.end) continue

            var sampleIndex = 0
            for (chunk in 0 until chunkCount) {
                var count = if (perChunk.isNotEmpty()) perChunk[0].second else 1
                for ((first, n) in perChunk) if (chunk + 1 >= first) count = n
                var offset = chunkOffsets[chunk]
                repeat(count) {
                    if (sampleIndex >= sampleCount) return@repeat
                    val size = sizes[sampleIndex]
                    val start = offset.toInt()
                    if (size > 0 && start >= 0 && start + size <= out.size) {
                        decryptSample(out, start, size, key, ivBase + sampleIndex * ivSize, ivSize)
                    }
                    offset += size
                    sampleIndex++
                }
            }

            patchSampleEntry(out, stbl)
            patchedAny = true
        }
        return if (patchedAny) out else raw
    }

    private fun decryptSample(
        data: ByteArray,
        offset: Int,
        size: Int,
        key: ByteArray,
        ivOffset: Int,
        ivSize: Int
    ) {
        val iv = ByteArray(BLOCK)
        System.arraycopy(data, ivOffset, iv, 0, ivSize)
        val cipher = Cipher.getInstance("AES/CTR/NoPadding")
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(key, "AES"), IvParameterSpec(iv))
        val plain = cipher.doFinal(data, offset, size)
        System.arraycopy(plain, 0, data, offset, size)
    }

    private fun sampleInfoSize(data: ByteArray, stbl: Box): Int? {
        val saiz = stbl.child("saiz") ?: return null
        return data[saiz.contentStart + 4].toInt() and 0xFF
    }

    /** Renames `encv`/`enca` sample entries so ExoPlayer treats the (now clear) samples as plain. */
    private fun patchSampleEntry(data: ByteArray, stbl: Box) {
        val stsd = stbl.child("stsd") ?: return
        for (entry in children(data, stsd.contentStart + 8, stsd.end)) {
            val plain = when (entry.type) {
                "encv" -> "hvc1"
                "enca" -> "mp4a"
                else -> null
            } ?: continue
            val typeOffset = entry.start + 4
            for (i in plain.indices) data[typeOffset + i] = plain[i].code.toByte()
        }
    }

    private class Box(
        val type: String,
        val start: Int,
        val contentStart: Int,
        val end: Int,
        private val data: ByteArray
    ) {
        val children: List<Box> by lazy { parseChildren(data, contentStart, end) }

        fun child(type: String): Box? = children.firstOrNull { it.type == type }
    }

    private fun children(data: ByteArray, start: Int, end: Int): List<Box> =
        parseChildren(data, start, end)

    private fun parseChildren(data: ByteArray, start: Int, end: Int): List<Box> {
        val result = ArrayList<Box>()
        var i = start
        while (i + 8 <= end) {
            var size = u32(data, i).toLong() and 0xFFFFFFFFL
            val type = String(data, i + 4, 4, Charsets.ISO_8859_1)
            var header = 8
            if (size == 1L) {
                size = u64(data, i + 8)
                header = 16
            } else if (size == 0L) {
                size = (end - i).toLong()
            }
            if (size < header || i + size > end) break
            result.add(Box(type, i, i + header, (i + size).toInt(), data))
            i += size.toInt()
        }
        return result
    }

    private fun findPath(from: Box, path: List<String>): Box? {
        var current: Box? = from
        for (name in path) current = current?.child(name) ?: return null
        return current
    }

    private fun hexToBytes(hex: String): ByteArray {
        if (hex.length % 2 != 0) return ByteArray(0)
        return ByteArray(hex.length / 2) {
            ((Character.digit(hex[it * 2], 16) shl 4) or Character.digit(hex[it * 2 + 1], 16)).toByte()
        }
    }

    private fun u32(data: ByteArray, pos: Int): Int =
        ((data[pos].toInt() and 0xFF) shl 24) or
            ((data[pos + 1].toInt() and 0xFF) shl 16) or
            ((data[pos + 2].toInt() and 0xFF) shl 8) or
            (data[pos + 3].toInt() and 0xFF)

    private fun u64(data: ByteArray, pos: Int): Long =
        (u32(data, pos).toLong() shl 32) or (u32(data, pos + 4).toLong() and 0xFFFFFFFFL)
}
