package com.bagah.streaming.data.player

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

class MeloloDecryptorTest {

    private val keyHex = "000102030405060708090a0b0c0d0e0f"
    private val key = hexToBytes(keyHex)
    private val plainOne = ByteArray(32) { it.toByte() }
    private val plainTwo = ByteArray(48) { (0x40 + it).toByte() }
    private val ivOne = byteArrayOf(0, 1, 2, 3, 4, 5, 6, 7)
    private val ivTwo = byteArrayOf(8, 9, 10, 11, 12, 13, 14, 15)

    @Test
    fun decryptsCencSamplesAndRenamesSampleEntry() {
        val mp4 = buildEncryptedMp4()
        val mdatPayload = ftypSize() + 8

        val clear = MeloloDecryptor.decrypt(mp4, keyHex)

        assertArrayEquals(plainOne, clear.copyOfRange(mdatPayload, mdatPayload + plainOne.size))
        assertArrayEquals(
            plainTwo,
            clear.copyOfRange(mdatPayload + plainOne.size, mdatPayload + plainOne.size + plainTwo.size)
        )
        assertTrue("encv must be renamed", String(clear, Charsets.ISO_8859_1).contains("hvc1"))
        assertTrue("encv must not survive", !String(clear, Charsets.ISO_8859_1).contains("encv"))
    }

    @Test
    fun invalidKeyLeavesInputUntouched() {
        val mp4 = buildEncryptedMp4()
        assertArrayEquals(mp4, MeloloDecryptor.decrypt(mp4, ""))
        assertArrayEquals(mp4, MeloloDecryptor.decrypt(mp4, "abcd"))
    }

    @Test
    fun renamedEntryKeepsOriginalSizeFields() {
        val mp4 = buildEncryptedMp4()
        val clear = MeloloDecryptor.decrypt(mp4, keyHex)
        assertEquals(mp4.size, clear.size)
    }

    private fun buildEncryptedMp4(): ByteArray {
        val ivBlob = ivOne + ivTwo
        val moov = box(
            "moov",
            box(
                "trak",
                box(
                    "mdia",
                    box(
                        "minf",
                        box(
                            "stbl",
                            box("stsd", fullBoxHeader(0) + u32(1) + sampleEntry()) +
                                box("stsz", fullBoxHeader(0) + u32(0) + u32(2) + u32(plainOne.size) + u32(plainTwo.size)) +
                                box("stco", fullBoxHeader(0) + u32(1) + u32(mdatPayloadOffset())) +
                                box("stsc", fullBoxHeader(0) + u32(1) + u32(1) + u32(2) + u32(1)) +
                                box("senc", fullBoxHeader(0) + u32(2) + ivBlob) +
                                box("saiz", fullBoxHeader(0) + byteArrayOf(8) + u32(2))
                        )
                    )
                )
            )
        )
        val mdat = box("mdat", ctr(plainOne, ivOne) + ctr(plainTwo, ivTwo))
        val ftyp = box("ftyp", "isom".toByteArray() + u32(0x200) + "isomiso2mp41".toByteArray())
        return ftyp + mdat + moov
    }

    private fun sampleEntry(): ByteArray {
        val header = ByteArray(78).also { it[7] = 1 }
        return box("encv", header + box("hvcC", ByteArray(0)))
    }

    private fun ctr(input: ByteArray, iv8: ByteArray): ByteArray {
        val iv = ByteArray(16)
        iv8.copyInto(iv)
        val cipher = Cipher.getInstance("AES/CTR/NoPadding")
        cipher.init(Cipher.ENCRYPT_MODE, SecretKeySpec(key, "AES"), IvParameterSpec(iv))
        return cipher.doFinal(input)
    }

    private fun ftypSize(): Int = box("ftyp", "isom".toByteArray() + u32(0x200) + "isomiso2mp41".toByteArray()).size

    private fun mdatPayloadOffset(): Int = ftypSize() + 8

    private fun fullBoxHeader(version: Int): ByteArray = byteArrayOf(version.toByte(), 0, 0, 0)

    private fun box(type: String, payload: ByteArray): ByteArray =
        u32(8 + payload.size) + type.toByteArray(Charsets.ISO_8859_1) + payload

    private fun u32(value: Int): ByteArray = byteArrayOf(
        (value ushr 24).toByte(),
        (value ushr 16).toByte(),
        (value ushr 8).toByte(),
        value.toByte()
    )

    private fun hexToBytes(hex: String): ByteArray = ByteArray(hex.length / 2) {
        ((Character.digit(hex[it * 2], 16) shl 4) or Character.digit(hex[it * 2 + 1], 16)).toByte()
    }
}
