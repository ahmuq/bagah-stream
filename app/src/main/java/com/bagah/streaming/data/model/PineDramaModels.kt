package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PineDramaItem(
    val id: String = "",
    @SerialName("series_id")
    val seriesId: String = "",
    @SerialName("video_id")
    val videoId: String = "",
    @SerialName("play_url")
    val playUrl: String = "",
    val title: String = "",
    val description: String? = null,
    val cover: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    @Serializable(with = FlexibleStringSerializer::class)
    val views: String = "",
    val tags: List<String> = emptyList()
) {
    fun stableId(): String = seriesId.ifBlank { id }
}

@Serializable
data class PineDramaCategory(
    val name: String = "",
    @SerialName("category_id")
    val categoryId: String = "",
    val scene: Int = 0
)

/** Respons `pinedrama/browse` untuk semua `type` (foryou, trending, categories, categoryId). */
@Serializable
data class PineDramaBrowseResponse(
    val success: Boolean = false,
    val type: String? = null,
    val title: String? = null,
    val page: Int? = null,
    val total: Int = 0,
    @SerialName("category_id")
    val categoryId: String? = null,
    @SerialName("category_name")
    val categoryName: String? = null,
    val scene: Int? = null,
    val cursor: String? = null,
    @SerialName("has_more")
    val hasMore: Boolean? = null,
    val categories: List<PineDramaCategory> = emptyList(),
    val items: List<PineDramaItem> = emptyList()
)

@Serializable
data class PineDramaChapter(
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("is_paid")
    val isPaid: Boolean = false,
    val duration: Int? = null,
    @SerialName("best_url")
    val bestUrl: String = ""
)

@Serializable
data class PineDramaDetailResponse(
    val success: Boolean = false,
    val id: String = "",
    @SerialName("series_id")
    val seriesId: String = "",
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val tags: List<String> = emptyList(),
    val chapters: List<PineDramaChapter> = emptyList()
)

@Serializable
data class PineDramaEpisodeResponse(
    val success: Boolean = false,
    @SerialName("series_id")
    val seriesId: String = "",
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("video_url")
    val videoUrl: String = "",
    @SerialName("play_url")
    val playUrl: String = ""
) {
    /** MP4 langsung (TikTok CDN), tanpa enkripsi. */
    fun streamUrl(): String = videoUrl.ifBlank { playUrl }
}

@Serializable
data class PineDramaSearchResponse(
    val success: Boolean = false,
    val query: String? = null,
    val keyword: String? = null,
    val page: Int? = null,
    val total: Int = 0,
    val items: List<PineDramaItem> = emptyList()
)
