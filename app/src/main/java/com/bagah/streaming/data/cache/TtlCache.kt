package com.bagah.streaming.data.cache

import java.util.concurrent.ConcurrentHashMap

/**
 * Cache in-memory level proses, di atas cache disk OkHttp. Menghindari baca disk +
 * deserialisasi berulang untuk data yang stabil (feed, detail, daftar referensi).
 */
object TtlCache {
    private data class Entry(val value: Any, val expiresAt: Long)

    private val store = ConcurrentHashMap<String, Entry>()

    const val SHORT = 5 * 60 * 1000L
    const val MEDIUM = 10 * 60 * 1000L
    const val LONG = 6 * 60 * 60 * 1000L

    @Suppress("UNCHECKED_CAST")
    fun <T : Any> get(key: String): T? {
        val entry = store[key] ?: return null
        if (entry.expiresAt <= System.currentTimeMillis()) {
            store.remove(key)
            return null
        }
        return entry.value as? T
    }

    fun put(key: String, value: Any, ttlMs: Long) {
        store[key] = Entry(value, System.currentTimeMillis() + ttlMs)
    }

    fun clear() {
        store.clear()
    }
}

/**
 * Ambil dari cache memori; kalau tidak ada/kedaluwarsa, jalankan [loader] dan simpan
 * hasil suksesnya saja.
 */
suspend fun <T : Any> cachedResult(
    key: String,
    ttlMs: Long,
    loader: suspend () -> Result<T>
): Result<T> {
    TtlCache.get<T>(key)?.let { return Result.success(it) }
    val result = loader()
    result.onSuccess { TtlCache.put(key, it, ttlMs) }
    return result
}
