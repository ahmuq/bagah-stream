package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MeloloItem(
    val id: String = "",
    @SerialName("seriesId")
    val seriesId: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String = "",
    @SerialName("totalEpisodes")
    val totalEpisodes: Int = 0,
    @Serializable(with = FlexibleStringSerializer::class)
    val views: String = "",
    val tags: List<String> = emptyList(),
    val author: String = "",
    @SerialName("is_dubbed")
    val isDubbed: Boolean = false
) {
    fun stableId(): String = seriesId.ifBlank { id }
}

@Serializable
data class MeloloBrowseResponse(
    val success: Boolean = false,
    val items: List<MeloloItem> = emptyList(),
    val page: Int = 1,
    @SerialName("has_more")
    val hasMore: Boolean = false,
    @SerialName("next_offset")
    val nextOffset: Int? = null,
    @SerialName("effective_lang")
    val effectiveLang: String = "",
    @SerialName("total_returned")
    val totalReturned: Int = 0
)

@Serializable
data class MeloloEpisodeMeta(
    @SerialName("episodeId")
    val episodeId: String = "",
    @SerialName("episodeNum")
    val episodeNum: Int = 0,
    val title: String = "",
    val cover: String = "",
    val duration: Int = 0,
    val playable: Boolean = false
)

@Serializable
data class MeloloDetailResponse(
    val success: Boolean = false,
    val id: String = "",
    @SerialName("seriesId")
    val seriesId: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String = "",
    @SerialName("totalEpisodes")
    val totalEpisodes: Int = 0,
    val tags: List<String> = emptyList(),
    val episodes: List<MeloloEpisodeMeta> = emptyList()
) {
    fun stableId(): String = seriesId.ifBlank { id }
}

@Serializable
data class MeloloEpisodeResponse(
    val success: Boolean = false,
    val id: String = "",
    @SerialName("seriesId")
    val seriesId: String = "",
    @SerialName("episodeNum")
    val episodeNum: Int = 0,
    val title: String = "",
    @SerialName("play_url")
    val playUrl: String = "",
    val qualities: Map<String, String> = emptyMap(),
    val encrypted: Boolean = false,
    @SerialName("encryption_method")
    val encryptionMethod: String = "",
    /** AES-128 content key (32 hex chars) for CENC AES-CTR MP4. */
    val key: String = "",
    val kid: String = "",
    val locked: Boolean = false,
    val playable: Boolean = false
) {
    fun streamUrl(): String = playUrl.ifBlank { qualities.values.firstOrNull().orEmpty() }
}

@Serializable
data class MeloloSearchResponse(
    val success: Boolean = false,
    val items: List<MeloloItem> = emptyList(),
    val page: Int = 1,
    @SerialName("has_more")
    val hasMore: Boolean = false,
    @SerialName("next_offset")
    val nextOffset: Int? = null,
    @SerialName("total_returned")
    val totalReturned: Int = 0,
    val exact: Boolean = false,
    @SerialName("indeed_empty")
    val indeedEmpty: Boolean = false
)
