package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NetShortItem(
    val id: String = "",
    @SerialName("series_id")
    val seriesId: String = "",
    @SerialName("library_id")
    val libraryId: String = "",
    val title: String = "",
    val description: String? = null,
    val cover: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val finished: Boolean = false,
    val views: Long? = null,
    val language: String? = null,
    val tags: List<String> = emptyList()
) {
    fun stableId(): String = seriesId.ifBlank { id }
}

@Serializable
data class NetShortChannel(
    val id: Int = 0,
    val name: String = "",
    val children: List<NetShortChannel> = emptyList()
)

/** Respons `netshort/browse` untuk semua `type` (ranking, channels, dan channel angka). */
@Serializable
data class NetShortBrowseResponse(
    val success: Boolean = false,
    val tab: String? = null,
    @SerialName("ranking_name")
    val rankingName: String? = null,
    val total: Int = 0,
    @SerialName("theater_id")
    val theaterId: Int? = null,
    val channels: List<NetShortChannel> = emptyList(),
    @SerialName("channel_id")
    val channelId: Int? = null,
    @SerialName("channel_name")
    val channelName: String? = null,
    val sections: List<NetShortSection> = emptyList(),
    val items: List<NetShortItem> = emptyList()
) {
    val allItems: List<NetShortItem>
        get() = if (items.isNotEmpty()) items else sections.flatMap { it.items }
}

@Serializable
data class NetShortSection(
    @SerialName("module_key")
    val moduleKey: String = "",
    @SerialName("module_name")
    val title: String = "",
    val items: List<NetShortItem> = emptyList()
)

@Serializable
data class NetShortSubtitle(
    val url: String = "",
    val lang: String = ""
)

@Serializable
data class NetShortEpisode(
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val cover: String = "",
    val duration: String = "",
    val locked: Boolean = false,
    val vip: Boolean = false,
    val ad: Boolean = false,
    @SerialName("video_url")
    val videoUrl: String = "",
    @SerialName("play_url")
    val playUrl: String = "",
    val subtitles: List<NetShortSubtitle> = emptyList()
) {
    /** MP4 langsung, tanpa enkripsi. */
    fun streamUrl(): String = videoUrl.ifBlank { playUrl }

    fun durationSeconds(): Int = duration.toDoubleOrNull()?.toInt() ?: 0
}

@Serializable
data class NetShortDetailResponse(
    val success: Boolean = false,
    val id: String = "",
    @SerialName("series_id")
    val seriesId: String = "",
    @SerialName("library_id")
    val libraryId: String = "",
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val finished: Boolean = false,
    val views: Long? = null,
    val language: String? = null,
    val tags: List<String> = emptyList(),
    val chapters: List<NetShortEpisode> = emptyList(),
    val episodes: List<NetShortEpisode> = emptyList()
) {
    fun episodeList(): List<NetShortEpisode> = episodes.ifEmpty { chapters }
}

@Serializable
data class NetShortEpisodeResponse(
    val success: Boolean = false,
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val duration: String = "",
    val locked: Boolean = false,
    val vip: Boolean = false,
    val ad: Boolean = false,
    @SerialName("video_url")
    val videoUrl: String = "",
    @SerialName("play_url")
    val playUrl: String = ""
) {
    fun streamUrl(): String = videoUrl.ifBlank { playUrl }
}

@Serializable
data class NetShortSearchResponse(
    val success: Boolean = false,
    val query: String? = null,
    val keyword: String? = null,
    val page: Int? = null,
    val total: Int = 0,
    @SerialName("no_result")
    val noResult: Boolean = false,
    val items: List<NetShortItem> = emptyList()
)
