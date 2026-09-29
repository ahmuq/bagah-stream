package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FlickReelsItem(
    val id: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String? = null,
    val totalEpisodes: Int = 0,
    @Serializable(with = FlexibleStringSerializer::class)
    val views: String = "",
    val tags: List<String> = emptyList(),
    val lastChapterNum: Int? = null
)

@Serializable
data class FlickReelsBrowseResponse(
    val success: Boolean = false,
    val title: String? = null,
    val page: Int? = null,
    val nextCursor: String? = null,
    val items: List<FlickReelsItem> = emptyList()
)

@Serializable
data class FlickReelsEpisode(
    val episodeNum: Int = 1,
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    val bestUrl: String = "",
    val duration: Int? = null
)

@Serializable
data class FlickReelsDetailResponse(
    val success: Boolean = false,
    val id: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String = "",
    val totalEpisodes: Int = 0,
    @Serializable(with = FlexibleStringSerializer::class)
    val views: String = "",
    val tags: List<String> = emptyList(),
    val chapters: List<FlickReelsEpisode> = emptyList()
)

@Serializable
data class FlickReelsEpisodeResponse(
    val success: Boolean = false,
    val seriesId: String = "",
    val episodeNum: Int = 1,
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    val bestUrl: String = "",
    val duration: Int? = null
)

@Serializable
data class FlickReelsSearchResponse(
    val success: Boolean = false,
    val query: String? = null,
    val page: Int? = null,
    val total: Int = 0,
    val items: List<FlickReelsItem> = emptyList()
)
