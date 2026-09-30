package com.bagah.streaming.data.repository.auth

import com.bagah.streaming.data.model.ApiKeyInfo

interface AuthRepository {
    suspend fun checkKey(apiKey: String): Result<ApiKeyInfo>
}
