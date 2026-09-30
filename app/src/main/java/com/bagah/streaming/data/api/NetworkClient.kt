package com.bagah.streaming.data.api

import android.content.Context
import com.bagah.streaming.data.cache.TtlCache
import kotlinx.serialization.json.Json
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

object NetworkClient {
    private const val BASE_URL = "https://api.bagahproject.com/"
    const val DEFAULT_API_KEY = "ahmuqkey"

    private var appContext: Context? = null

    /**
     * Panggil sekali dari Activity/Application sebelum request pertama agar cache disk
     * punya lokasi. Kalau tidak dipanggil, caching dilewati (app tetap jalan).
     */
    fun install(context: Context) {
        appContext = context.applicationContext
    }

    private val json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        coerceInputValues = true
        encodeDefaults = true
    }

    private val authInterceptor = Interceptor { chain ->
        val originalRequest = chain.request()
        val originalUrl = originalRequest.url

        val urlWithKey = originalUrl.newBuilder()
            .addQueryParameter("apikey", DEFAULT_API_KEY)
            .build()

        val newRequest = originalRequest.newBuilder()
            .url(urlWithKey)
            .header("x-api-key", DEFAULT_API_KEY)
            .header("Accept", "application/json")
            .build()

        chain.proceed(newRequest)
    }

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BASIC
    }

    /**
     * Menetapkan Cache-Control pada response GET supaya OkHttp menyimpannya ke disk.
     * Endpoint stream episode tidak dicache (URL bertanda tangan + file besar).
     */
    private val cacheControlInterceptor = Interceptor { chain ->
        val request = chain.request()
        val response = chain.proceed(request)
        if (!request.method.equals("GET", ignoreCase = true)) return@Interceptor response

        val ttl = cacheTtlSeconds(request.url.toString())
        val control = if (ttl > 0) "public, max-age=$ttl" else "no-store"
        response.newBuilder().header("Cache-Control", control).build()
    }

    /** TTL cache per jenis endpoint (detik). 0 = jangan dicache. */
    private fun cacheTtlSeconds(url: String): Int = when {
        // Stream video episode: URL bertanda tangan, cepat kedaluwarsa.
        url.contains("/episode") -> 0
        // Hasil pencarian: singkat.
        url.contains("/search") -> 120
        // Metadata serial: sedang.
        url.contains("/detail") -> 600
        // Daftar referensi yang jarang berubah.
        url.contains("type=filters") ||
            url.contains("type=categories") ||
            url.contains("type=classes") ||
            url.contains("type=channels") -> 21_600
        // Feed/katalog umum.
        else -> 300
    }

    private val diskCache: Cache? by lazy {
        appContext?.let { Cache(File(it.cacheDir, "api_cache"), 64L * 1024 * 1024) }
    }

    private fun baseBuilder(): OkHttpClient.Builder = OkHttpClient.Builder()
        .addInterceptor(authInterceptor)
        .addInterceptor(loggingInterceptor)
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)

    /** Klien untuk media (dekripsi DramaBox/ShortMax): tanpa cache disk. */
    val okHttpClient: OkHttpClient by lazy { baseBuilder().build() }

    /** Klien untuk Retrofit (API): memakai cache disk dengan TTL. */
    private val apiHttpClient: OkHttpClient by lazy {
        baseBuilder()
            .apply { diskCache?.let { cache(it) } }
            .addNetworkInterceptor(cacheControlInterceptor)
            .build()
    }

    val apiService: StreamingApiService by lazy {
        val contentType = "application/json".toMediaType()
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(apiHttpClient)
            .addConverterFactory(json.asConverterFactory(contentType))
            .build()
            .create(StreamingApiService::class.java)
    }

    /** Hapus semua cache API (disk + memori). Dipakai untuk "tarik untuk refresh". */
    fun clearApiCache() {
        // evictAll (bukan delete) supaya instance Cache tetap valid dipakai OkHttp.
        diskCache?.evictAll()
        TtlCache.clear()
    }
}
