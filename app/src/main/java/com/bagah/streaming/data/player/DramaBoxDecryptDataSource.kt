package com.bagah.streaming.data.player

import android.net.Uri
import androidx.media3.common.C
import androidx.media3.datasource.BaseDataSource
import androidx.media3.datasource.DataSource
import androidx.media3.datasource.DataSpec
import androidx.media3.datasource.TransferListener
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.IOException
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

/**
 * Menyimpan kunci AES episode yang sedang diputar. Kunci berubah tiap episode,
 * sementara ExoPlayer membuat DataSource saat `open()`, jadi holder ini yang
 * menjembatani keduanya.
 */
class DramaBoxKeyHolder {
    @Volatile
    var keyHex: String? = null
}

/**
 * DramaBox mengirim MP4 penuh yang terenkripsi AES-128-ECB per sample video.
 * ExoPlayer tidak bisa memutar file mentahnya, jadi seluruh berkas diunduh lebih
 * dulu, lalu hanya rentang byte sample video yang didekripsi (header container dan
 * atom metadata dibiarkan utuh agar tetap bisa di-parse).
 */
class DramaBoxDecryptDataSource(
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
                .header("User-Agent", "okhttp/4.12.0")
                .build()
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    throw IOException("HTTP ${response.code} saat mengunduh video")
                }
                val raw = response.body?.bytes() ?: throw IOException("Body video kosong")
                data = DramaBoxDecryptor.decryptSamples(raw, keyHex)
            }
        } catch (e: IOException) {
            throw e
        } catch (e: Exception) {
            throw IOException("Gagal mengunduh/mendekripsi video DramaBox", e)
        }

        readPosition = dataSpec.position
        bytesRemaining = (data.size - dataSpec.position).coerceAtLeast(0)
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
        private val keyHolder: DramaBoxKeyHolder
    ) : DataSource.Factory {
        override fun createDataSource(): DataSource =
            DramaBoxDecryptDataSource(client, keyHolder.keyHex.orEmpty())

        /** Dipakai saat kunci belum tersedia; pemutaran menunggu sampai key terisi. */
        fun hasKey(): Boolean = !keyHolder.keyHex.isNullOrBlank()
    }
}

object DramaBoxDecryptor {

    private const val BLOCK_SIZE = 16

    fun decryptSamples(raw: ByteArray, keyHex: String): ByteArray {
        val key = hexToBytes(keyHex)
        if (key.size != 16) return raw

        val out = raw.copyOf()
        val cipher = Cipher.getInstance("AES/ECB/NoPadding")
        cipher.init(Cipher.DECRYPT_MODE, SecretKeySpec(key, "AES"))

        for ((offset, size) in parseMp4Samples(out)) {
            val n = size - (size % BLOCK_SIZE)
            if (n <= 0) continue
            if (offset < 0 || offset + n > out.size) continue
            val decrypted = cipher.doFinal(out, offset, n)
            System.arraycopy(decrypted, 0, out, offset, n)
        }
        return out
    }

    private fun hexToBytes(hex: String): ByteArray {
        val clean = hex.trim()
        if (clean.length % 2 != 0) return ByteArray(0)
        return ByteArray(clean.length / 2) {
            ((Character.digit(clean[it * 2], 16) shl 4) or
                Character.digit(clean[it * 2 + 1], 16)).toByte()
        }
    }

    private fun parseMp4Samples(data: ByteArray): List<Pair<Int, Int>> {
        val out = ArrayList<Pair<Int, Int>>()

        fun u32(pos: Int): Int = ((data[pos].toInt() and 0xFF) shl 24) or
            ((data[pos + 1].toInt() and 0xFF) shl 16) or
            ((data[pos + 2].toInt() and 0xFF) shl 8) or
            (data[pos + 3].toInt() and 0xFF)

        fun u64(pos: Int): Long = (u32(pos).toLong() shl 32) or (u32(pos + 4).toLong() and 0xFFFFFFFFL)

        fun childBoxes(start: Int, end: Int): List<Triple<String, Int, Int>> {
            val result = ArrayList<Triple<String, Int, Int>>()
            var i = start
            while (i + 8 <= end) {
                var size = u32(i).toLong()
                val type = String(data, i + 4, 4, Charsets.ISO_8859_1)
                val header = when (size) {
                    1L -> 16
                    0L -> {
                        size = (end - i).toLong()
                        8
                    }
                    else -> 8
                }
                if (size == 1L) size = u64(i + 8)
                if (size < 8 || i + size > end) break
                result.add(Triple(type, i + header, (i + size).toInt()))
                i += size.toInt()
            }
            return result
        }

        fun collect(start: Int, end: Int, want: Set<String>): Map<String, Pair<Int, Int>> {
            val found = HashMap<String, Pair<Int, Int>>()
            val stack = ArrayDeque<Pair<Int, Int>>()
            stack.addLast(start to end)
            while (stack.isNotEmpty()) {
                val (a, b) = stack.removeLast()
                for ((type, ps, pe) in childBoxes(a, b)) {
                    if (type in setOf("moov", "trak", "mdia", "minf", "stbl")) {
                        stack.addLast(ps to pe)
                    } else if (type in want) {
                        found[type] = ps to pe
                    }
                }
            }
            return found
        }

        for ((type, ps, pe) in childBoxes(0, data.size)) {
            if (type != "moov") continue
            for ((trk, a1, b1) in childBoxes(ps, pe)) {
                if (trk != "trak") continue
                val f = collect(a1, b1, setOf("stsz", "stco", "stsc"))
                if (!f.keys.containsAll(setOf("stsz", "stco", "stsc"))) continue

                val a2 = f.getValue("stsz").first
                val a3 = f.getValue("stco").first
                val a4 = f.getValue("stsc").first

                val sampleSize = u32(a2 + 4)
                val sampleCount = u32(a2 + 8)
                val sizes = if (sampleSize != 0) {
                    IntArray(sampleCount) { sampleSize }
                } else {
                    IntArray(sampleCount) { u32(a2 + 12 + 4 * it) }
                }

                val chunkCount = u32(a3 + 4)
                val chunkOffsets = LongArray(chunkCount) { u32(a3 + 8 + 4 * it).toLong() and 0xFFFFFFFFL }

                val stscCount = u32(a4 + 4)
                val stsc = Array(stscCount) {
                    u32(a4 + 8 + 12 * it) to u32(a4 + 12 + 12 * it)
                }

                var si = 0
                for (ci in 0 until chunkCount) {
                    var perChunk = 1
                    for ((first, n) in stsc) {
                        if (ci + 1 >= first) perChunk = n
                    }
                    var off = chunkOffsets[ci]
                    repeat(perChunk) {
                        if (si >= sizes.size) return@repeat
                        out.add(off.toInt() to sizes[si])
                        off += sizes[si]
                        si++
                    }
                }
            }
        }
        out.sortBy { it.first }
        return out
    }
}
