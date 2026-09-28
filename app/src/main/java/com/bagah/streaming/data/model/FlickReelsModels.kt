package com.bagah.streaming.data.model

import kotlinx.serialization.Serializable

@Serializable
data class FlickReelsItem(
    val id: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String? = null,
    val totalEpisodes: Int = 0,
    val views: String? = null,
    val tags: List<String> = emptyList()
)

@Serializable
data class FlickReelsListResponse(
    val success: Boolean = false,
    val title: String? = null,
    val page: Int? = null,
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
    val views: String? = null,
    val tags: List<String> = emptyList(),
    val chapters: List<FlickReelsEpisode> = emptyList()
)

@Serializable
data class FlickReelsEpisodesResponse(
    val success: Boolean = false,
    val seriesId: String = "",
    val title: String = "",
    val totalEpisodes: Int = 0,
    val items: List<FlickReelsEpisode> = emptyList()
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
