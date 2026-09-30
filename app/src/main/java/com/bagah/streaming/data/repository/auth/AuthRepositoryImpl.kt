package com.bagah.streaming.data.repository.auth

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.ApiKeyInfo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : AuthRepository {

    override suspend fun checkKey(apiKey: String): Result<ApiKeyInfo> = withContext(ioDispatcher) {
        runCatching {
            val response = api.checkApiKey(apiKey.trim())
            val data = response.data
            if (response.success && data != null) {
                data
            } else {
                error(response.message.ifBlank { "API key tidak valid" })
            }
        }.recoverCatching { err ->
            // Pesan default bila server menolak (401/403 dsb).
            if (err is IllegalStateException) throw err
            throw IllegalStateException("API key tidak valid atau koneksi bermasalah")
        }
    }
}
