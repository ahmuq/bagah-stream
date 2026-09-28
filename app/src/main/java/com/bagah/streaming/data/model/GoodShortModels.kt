package com.bagah.streaming.data.model

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonPrimitive

@Serializable
data class GoodShortItem(
    val seriesId: String = "",
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    val totalEpisodes: Int = 0,
    val views: JsonElement? = null,
    val author: String? = null,
    val category: List<String> = emptyList(),
    val isComplete: Boolean = false,
    val language: String? = null
) {
    val formattedViews: String
        get() {
            return runCatching { views?.jsonPrimitive?.content }.getOrNull() ?: ""
        }
}

@Serializable
data class GoodShortHomeModule(
    val title: String = "",
    val channelId: Long? = null,
    val total: Int = 0,
    val items: List<GoodShortItem> = emptyList()
) {
    val cleanTitle: String
        get() = title.replace(Regex("[\\p{So}\\p{Cn}]"), "").trim()
}

@Serializable
data class GoodShortHomeResponse(
    val success: Boolean = false,
    val modules: List<GoodShortHomeModule> = emptyList()
)

@Serializable
data class GoodShortForYouResponse(
    val success: Boolean = false,
    val items: List<GoodShortItem> = emptyList()
)

@Serializable
data class GoodShortTrendingResponse(
    val success: Boolean = false,
    val page: Int = 1,
    val total: Int = 0,
    val items: List<GoodShortItem> = emptyList()
)

@Serializable
data class GoodShortEpisode(
    val episodeNum: Int = 1,
    val episodeId: Long? = null,
    val title: String = "",
    val locked: Boolean = false,
    val duration: Int = 0,
    val cover: String = "",
    val bestUrl: String = ""
)

@Serializable
data class GoodShortEpisodesResponse(
    val success: Boolean = false,
    val seriesId: String = "",
    val items: List<GoodShortEpisode> = emptyList()
)

@Serializable
data class GoodShortEpisodeResponse(
    val success: Boolean = false,
    val episodeNum: Int = 1,
    val episodeId: Long? = null,
    val title: String = "",
    val locked: Boolean = false,
    val duration: Int = 0,
    val cover: String = "",
    val bestUrl: String = ""
)

@Serializable
data class GoodShortDetailResponse(
    val success: Boolean = false,
    val seriesId: String = "",
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    val totalEpisodes: Int = 0,
    val views: JsonElement? = null,
    val author: String? = null,
    val category: List<String> = emptyList(),
    val isComplete: Boolean = false,
    val language: String? = null,
    val episodesTotal: Int = 0,
    val firstEpisode: GoodShortEpisode? = null
) {
    val formattedViews: String
        get() {
            return runCatching { views?.jsonPrimitive?.content }.getOrNull() ?: ""
        }
}

@Serializable
data class GoodShortSearchResponse(
    val success: Boolean = false,
    val keyword: String? = null,
    val items: List<GoodShortItem> = emptyList()
)
