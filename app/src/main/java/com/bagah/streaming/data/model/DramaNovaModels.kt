package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DramaNovaItem(
    val id: String = "",
    val seriesId: String = "",
    @SerialName("series_id")
    val seriesIdSnake: String? = null,
    val title: String = "",
    val description: String? = null,
    val cover: String = "",
    val totalEpisodes: Int = 0,
    @SerialName("total_episodes")
    val totalEpisodesSnake: Int? = null,
    val views: Long? = null,
    val tags: List<String> = emptyList(),
    val category: String? = null,
    val score: Double? = null
) {
    fun stableId(): String = seriesId.ifBlank { seriesIdSnake.orEmpty() }.ifBlank { id }

    fun episodeCount(): Int =
        if (totalEpisodes > 0) totalEpisodes else totalEpisodesSnake ?: 0
}

@Serializable
data class DramaNovaModule(
    val title: String = "",
    val name: String = "",
    val subtitle: String? = null,
    @SerialName("displayType")
    val displayType: String? = null,
    @SerialName("sourceType")
    val sourceType: String? = null,
    val total: Int = 0,
    val items: List<DramaNovaItem> = emptyList()
)

@Serializable
data class DramaNovaHomeResponse(
    val success: Boolean = false,
    val modules: List<DramaNovaModule> = emptyList()
) {
    val allItems: List<DramaNovaItem>
        get() = modules.flatMap { it.items }
}

@Serializable
data class DramaNovaListResponse(
    val success: Boolean = false,
    val title: String? = null,
    val page: Int? = null,
    val total: Int = 0,
    val items: List<DramaNovaItem> = emptyList()
)

@Serializable
data class DramaNovaDetailResponse(
    val success: Boolean = false,
    val id: String = "",
    val seriesId: String = "",
    @SerialName("series_id")
    val seriesIdSnake: String? = null,
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    val totalEpisodes: Int = 0,
    @SerialName("total_episodes")
    val totalEpisodesSnake: Int? = null,
    val views: Long? = null,
    val tags: List<String> = emptyList(),
    val category: String? = null,
    val score: Double? = null
) {
    fun stableId(): String = seriesId.ifBlank { seriesIdSnake.orEmpty() }.ifBlank { id }

    fun episodeCount(): Int =
        if (totalEpisodes > 0) totalEpisodes else totalEpisodesSnake ?: 0
}

@Serializable
data class DramaNovaEpisode(
    @SerialName("episodeNum")
    val episodeNum: Int = 1,
    @SerialName("episode_num")
    val episodeNumSnake: Int? = null,
    @SerialName("episodeId")
    val episodeId: String = "",
    @SerialName("episode_id")
    val episodeIdSnake: String? = null,
    val title: String = "",
    val locked: Boolean = false,
    val duration: Int? = null
) {
    fun number(): Int = if (episodeNum > 0) episodeNum else episodeNumSnake ?: 1

    fun id(): String = episodeId.ifBlank { episodeIdSnake.orEmpty() }
}

@Serializable
data class DramaNovaEpisodesResponse(
    val success: Boolean = false,
    val seriesId: String = "",
    @SerialName("series_id")
    val seriesIdSnake: String? = null,
    val title: String = "",
    val totalEpisodes: Int = 0,
    val items: List<DramaNovaEpisode> = emptyList()
)

@Serializable
data class DramaNovaEpisodeResponse(
    val success: Boolean = false,
    @SerialName("episodeNum")
    val episodeNum: Int = 1,
    @SerialName("episodeId")
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    val duration: Int? = null,
    val bestUrl: String = "",
    @SerialName("best_url")
    val bestUrlSnake: String? = null,
    val qualities: Map<String, String> = emptyMap()
) {
    fun streamUrl(preferred: String = "720p"): String =
        qualities[preferred].orEmpty().ifBlank { bestUrl.ifBlank { bestUrlSnake.orEmpty() } }
}

@Serializable
data class DramaNovaCategoriesResponse(
    val success: Boolean = false,
    val categories: List<DramaNovaCategory> = emptyList()
)

@Serializable
data class DramaNovaCategory(
    val id: String = "",
    val title: String = "",
    val name: String = ""
)
