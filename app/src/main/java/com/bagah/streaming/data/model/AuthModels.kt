package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ApiKeyInfo(
    val name: String = "",
    val email: String = "",
    val tier: String = "",
    val role: String = "",
    @Serializable(with = FlexibleStringSerializer::class)
    val limit: String = "",
    @SerialName("used_today")
    val usedToday: Long = 0,
    @Serializable(with = FlexibleStringSerializer::class)
    val remaining: String = "",
    @SerialName("total_used")
    val totalUsed: Long = 0,
    @SerialName("reset_at")
    val resetAt: String? = null,
    @SerialName("is_active")
    val isActive: Boolean = false,
    @SerialName("premium_expires")
    val premiumExpires: String? = null,
    @SerialName("created_at")
    val createdAt: String? = null
)

@Serializable
data class ApiKeyCheckResponse(
    val success: Boolean = false,
    val message: String = "",
    val data: ApiKeyInfo? = null
)
