package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MeloloItem(
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
    val isComplete: Boolean? = null
) {
    fun stableId(): String = seriesId.ifBlank { seriesIdSnake.orEmpty() }.ifBlank { id }

    fun episodeCount(): Int =
        if (totalEpisodes > 0) totalEpisodes else totalEpisodesSnake ?: 0
}

@Serializable
data class MeloloPage(
    val page: Int? = null,
    val provider: String? = null,
    val total: Int? = null,
    val items: List<MeloloItem> = emptyList()
)

@Serializable
data class MeloloListResponse(
    val success: Boolean = false,
    val message: String? = null,
    val data: MeloloPage? = null
) {
    val items: List<MeloloItem> get() = data?.items ?: emptyList()
}

@Serializable
data class MeloloEpisode(
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
data class MeloloDetailData(
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
    val episodes: List<MeloloEpisode> = emptyList()
) {
    fun stableId(): String = seriesId.ifBlank { seriesIdSnake.orEmpty() }.ifBlank { id }

    fun episodeCount(): Int =
        if (totalEpisodes > 0) totalEpisodes else totalEpisodesSnake ?: 0
}

@Serializable
data class MeloloDetailResponse(
    val success: Boolean = false,
    val message: String? = null,
    val data: MeloloDetailData? = null
)

@Serializable
data class MeloloEpisodesData(
    @SerialName("series_id")
    val seriesId: String = "",
    val provider: String? = null,
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val episodes: List<MeloloEpisode> = emptyList()
)

@Serializable
data class MeloloEpisodesResponse(
    val success: Boolean = false,
    val message: String? = null,
    val data: MeloloEpisodesData? = null
)

@Serializable
data class MeloloEpisodeData(
    @SerialName("series_id")
    val seriesId: String = "",
    val provider: String? = null,
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val duration: Int? = null,
    val locked: Boolean = false,
    val urls: Map<String, String> = emptyMap()
) {
    /** Melolo mengirim MP4 langsung; `video_1` adalah varian utamanya. */
    fun streamUrl(): String =
        urls["video_1"].orEmpty().ifBlank { urls.values.firstOrNull { it.isNotBlank() }.orEmpty() }
}

@Serializable
data class MeloloEpisodeResponse(
    val success: Boolean = false,
    val message: String? = null,
    val data: MeloloEpisodeData? = null
)

@Serializable
data class MeloloSearchResponse(
    val success: Boolean = false,
    val message: String? = null,
    val data: MeloloPage? = null
) {
    val items: List<MeloloItem> get() = data?.items ?: emptyList()
}
