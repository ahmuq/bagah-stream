package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DramaItem(
    @SerialName("series_id")
    val bookId: String = "",
    val title: String = "",
    val cover: String = "",
    @SerialName("total_episodes")
    val chapterCount: Int = 0,
    val description: String = "",
    val category: String? = null,
    val views: String? = null,
    @SerialName("is_complete")
    val isComplete: Boolean = false
)

@Serializable
data class DramaHomeResponse(
    val success: Boolean = false,
    val page: Int? = null,
    val items: List<DramaItem> = emptyList()
)

@Serializable
data class DramaSearchResponse(
    val success: Boolean = false,
    val query: String? = null,
    val page: Int? = null,
    val items: List<DramaItem> = emptyList()
)

@Serializable
data class DramaDetailResponse(
    val success: Boolean = false,
    @SerialName("series_id")
    val bookId: String = "",
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val views: String? = null,
    val category: String? = null,
    @SerialName("is_complete")
    val isComplete: Boolean = false
)

@Serializable
data class DramaEpisode(
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    val qualities: Map<String, Int> = emptyMap()
)

@Serializable
data class DramaEpisodesResponse(
    val success: Boolean = false,
    @SerialName("series_id")
    val bookId: String = "",
    val items: List<DramaEpisode> = emptyList()
)

@Serializable
data class DramaEpisodeResponse(
    val success: Boolean = false,
    @SerialName("series_id")
    val bookId: String = "",
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("best_url")
    val bestUrl: String = "",
    @SerialName("best_quality")
    val bestQuality: String? = null,
    val encrypted: Boolean = false,
    @SerialName("key_hex")
    val keyHex: String? = null,
    val qualities: Map<String, String> = emptyMap()
) {
    fun preferredUrl(preferredQuality: String = "720"): String {
        return qualities[preferredQuality] ?: bestUrl
    }
}
