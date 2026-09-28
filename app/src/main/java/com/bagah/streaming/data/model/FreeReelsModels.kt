package com.bagah.streaming.data.model

import kotlinx.serialization.Serializable

@Serializable
data class FreeReelsItem(
    val seriesId: String = "",
    val key: String = "",
    val title: String = "",
    val description: String? = null,
    val cover: String = "",
    val totalEpisodes: Int = 0,
    val views: Long? = null,
    val payMode: String? = null,
    val free: Boolean = true
) {
    /** Sebagian item search tidak mengirim `key`, jadi pakai seriesId sebagai cadangan. */
    fun stableId(): String = key.ifBlank { seriesId }
}

@Serializable
data class FreeReelsSection(
    val title: String = "",
    val moduleKey: String = "",
    val items: List<FreeReelsItem> = emptyList()
)

@Serializable
data class FreeReelsSectionResponse(
    val success: Boolean = false,
    val tabKey: String? = null,
    val sections: List<FreeReelsSection> = emptyList()
) {
    val allItems: List<FreeReelsItem>
        get() = sections.flatMap { it.items }
}

@Serializable
data class FreeReelsForYouResponse(
    val success: Boolean = false,
    val offset: Int? = null,
    val next: String? = null,
    val items: List<FreeReelsItem> = emptyList()
)

@Serializable
data class FreeReelsDetailResponse(
    val success: Boolean = false,
    val seriesId: String = "",
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    val totalEpisodes: Int = 0,
    val views: Long? = null,
    val payMode: String? = null,
    val free: Boolean = true
)

@Serializable
data class FreeReelsEpisode(
    val episodeId: String = "",
    val episodeNum: Int = 1,
    val title: String = "",
    val locked: Boolean = false,
    val bestUrl: String = "",
    val duration: Int? = null,
    val videoType: String? = null
)

@Serializable
data class FreeReelsEpisodesResponse(
    val success: Boolean = false,
    val seriesId: String = "",
    val items: List<FreeReelsEpisode> = emptyList()
)

@Serializable
data class FreeReelsEpisodeResponse(
    val success: Boolean = false,
    val episodeId: String = "",
    val episodeNum: Int = 1,
    val title: String = "",
    val locked: Boolean = false,
    val bestUrl: String = "",
    val duration: Int? = null,
    val videoType: String? = null
)

@Serializable
data class FreeReelsSearchResponse(
    val success: Boolean = false,
    val keyword: String? = null,
    val items: List<FreeReelsItem> = emptyList()
)
