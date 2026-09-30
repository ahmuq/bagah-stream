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
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

class ShortMaxDecryptDataSource(
    private val client: OkHttpClient
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
                .build()
            client.newCall(request).execute().use { response ->
                if (!response.isSuccessful) {
                    throw IOException("HTTP ${response.code} saat mengunduh segmen")
                }
                val raw = response.body?.bytes() ?: throw IOException("Body segmen kosong")
                data = ShortMaxSegmentDecryptor.decryptSegment(raw)
            }
        } catch (e: IOException) {
            throw e
        } catch (e: Exception) {
            throw IOException("Gagal mengunduh/mendekripsi segmen ShortMax", e)
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
        private val client: OkHttpClient
    ) : DataSource.Factory {
        override fun createDataSource(): DataSource = ShortMaxDecryptDataSource(client)
    }
}

object ShortMaxSegmentDecryptor {

    private const val HEADER_SIZE = 1024
    private val SEGMENT_IV = "shortmax00000000".toByteArray(Charsets.ISO_8859_1)

    fun decryptSegment(data: ByteArray): ByteArray {
        if (data.size < HEADER_SIZE) return data
        if (!startsWithShortMax(data)) return data

        return try {
            val header = String(data, 0, HEADER_SIZE, Charsets.ISO_8859_1)
            val keyOffset = header.substring(16, 20).trim().toIntOrNull() ?: return data
            val encLength = header.substring(20, 24).trim().toIntOrNull() ?: return data

            if (keyOffset + 16 > HEADER_SIZE) return data
            if (encLength <= 0 || HEADER_SIZE + encLength > data.size) return data
            if (encLength % 16 != 0) return data

            val key = data.copyOfRange(keyOffset, keyOffset + 16)
            val encrypted = data.copyOfRange(HEADER_SIZE, HEADER_SIZE + encLength)
            val remainder = data.copyOfRange(HEADER_SIZE + encLength, data.size)

            val cipher = Cipher.getInstance("AES/CBC/NoPadding")
            cipher.init(
                Cipher.DECRYPT_MODE,
                SecretKeySpec(key, "AES"),
                IvParameterSpec(SEGMENT_IV)
            )
            val decrypted = cipher.doFinal(encrypted)
            val unpadded = removePkcs7Padding(decrypted)

            unpadded + remainder
        } catch (e: Exception) {
            data
        }
    }

    private fun startsWithShortMax(data: ByteArray): Boolean {
        val magic = "shortmax"
        if (data.size < magic.length) return false
        for (i in magic.indices) {
            if (data[i] != magic[i].code.toByte()) return false
        }
        return true
    }

    private fun removePkcs7Padding(data: ByteArray): ByteArray {
        if (data.isEmpty()) return data
        val pad = data.last().toInt() and 0xFF
        if (pad !in 1..16 || pad > data.size) return data
        for (i in data.size - pad until data.size) {
            if ((data[i].toInt() and 0xFF) != pad) return data
        }
        return data.copyOf(data.size - pad)
    }
}
