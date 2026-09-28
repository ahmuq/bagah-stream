package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * PineDrama hanya menyediakan katalog (trending/foryou/detail). Endpoint episode-nya
 * selalu mengembalikan "Episode video not found", jadi platform ini browse-only.
 */
@Serializable
data class PineDramaItem(
    @SerialName("collection_id")
    val collectionId: String = "",
    val title: String = "",
    val description: String? = null,
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val views: Long? = null,
    val categories: String? = null,
    val tags: List<String> = emptyList(),
    val cover: String = "",
    @SerialName("is_limited_free")
    val isLimitedFree: Boolean = false,
    @SerialName("label_hot")
    val labelHot: Boolean = false,
    @SerialName("label_new")
    val labelNew: Boolean = false
)

@Serializable
data class PineDramaCollectionsResponse(
    val success: Boolean = false,
    @SerialName("has_more")
    val hasMore: Boolean = false,
    val cursor: String? = null,
    val collections: List<PineDramaItem> = emptyList()
) {
    fun moreAvailable(): Boolean = hasMore
}

@Serializable
data class PineDramaDetailResponse(
    val success: Boolean = false,
    @SerialName("collection_id")
    val collectionId: String = "",
    val title: String = "",
    val description: String? = null,
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val views: Long? = null,
    val type: String? = null,
    @SerialName("episode_label")
    val episodeLabel: String? = null,
    @SerialName("cover_urls")
    val coverUrls: List<String> = emptyList()
) {
    /** Detail hanya memberi daftar URL cover; ambil yang pertama untuk poster. */
    fun cover(): String = coverUrls.firstOrNull().orEmpty()
}
