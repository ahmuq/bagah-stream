package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ShortMaxItem(
    val id: String = "",
    val seriesId: String = "",
    @SerialName("series_id")
    val seriesIdSnake: String? = null,
    val code: Long? = null,
    val title: String = "",
    val description: String? = null,
    val cover: String = "",
    val totalEpisodes: Int = 0,
    @SerialName("total_episodes")
    val totalEpisodesSnake: Int? = null,
    val views: Long? = null,
    val tags: List<String> = emptyList()
) {
    /** API mengirim id/seriesId/series_id; ambil yang pertama tidak kosong. */
    fun stableId(): String = seriesId.ifBlank { seriesIdSnake.orEmpty() }.ifBlank { id }

    fun episodeCount(): Int =
        if (totalEpisodes > 0) totalEpisodes else totalEpisodesSnake ?: 0
}

@Serializable
data class ShortMaxListResponse(
    val success: Boolean = false,
    val title: String? = null,
    val page: Int? = null,
    @SerialName("classId")
    val classId: Int? = null,
    @SerialName("has_more")
    val hasMore: Boolean? = null,
    @SerialName("isEnd")
    val isEnd: Boolean? = null,
    val items: List<ShortMaxItem> = emptyList()
)

@Serializable
data class ShortMaxEpisode(
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
    val video480: String = "",
    val video720: String = "",
    val video1080: String = "",
    val bestUrl: String = "",
    @SerialName("best_url")
    val bestUrlSnake: String? = null
) {
    fun number(): Int = if (episodeNum > 0) episodeNum else episodeNumSnake ?: 1

    fun id(): String = episodeId.ifBlank { episodeIdSnake.orEmpty() }

    fun streamUrl(preferred: String = "720"): String = when (preferred) {
        "480" -> video480.ifBlank { bestUrl.ifBlank { bestUrlSnake.orEmpty() } }
        "1080" -> video1080.ifBlank { bestUrl.ifBlank { bestUrlSnake.orEmpty() } }
        else -> video720.ifBlank { bestUrl.ifBlank { bestUrlSnake.orEmpty() } }
    }
}

@Serializable
data class ShortMaxDetailResponse(
    val success: Boolean = false,
    val id: String = "",
    val seriesId: String = "",
    @SerialName("series_id")
    val seriesIdSnake: String? = null,
    val code: Long? = null,
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    val totalEpisodes: Int = 0,
    @SerialName("total_episodes")
    val totalEpisodesSnake: Int? = null,
    val views: Long? = null,
    val tags: List<String> = emptyList(),
    val chapters: List<ShortMaxEpisode> = emptyList()
) {
    fun stableId(): String = seriesId.ifBlank { seriesIdSnake.orEmpty() }.ifBlank { id }

    fun episodeCount(): Int =
        if (totalEpisodes > 0) totalEpisodes else totalEpisodesSnake ?: 0
}

@Serializable
data class ShortMaxCryptoInfo(
    val type: String = "",
    val algorithm: String = "",
    val iv: String = "",
    @SerialName("header_size")
    val headerSize: Int = 1024,
    @SerialName("key_offset_pos")
    val keyOffsetPos: List<Int> = emptyList(),
    @SerialName("enc_len_pos")
    val encLenPos: List<Int> = emptyList()
)

@Serializable
data class ShortMaxEpisodeResponse(
    val success: Boolean = false,
    @SerialName("episodeNum")
    val episodeNum: Int = 1,
    @SerialName("episode_num")
    val episodeNumSnake: Int? = null,
    @SerialName("episodeId")
    val episodeId: String = "",
    @SerialName("episode_id")
    val episodeIdSnake: String? = null,
    @SerialName("seriesId")
    val seriesId: String = "",
    @SerialName("series_id")
    val seriesIdSnake: String? = null,
    val title: String = "",
    val locked: Boolean = false,
    val video480: String = "",
    val video720: String = "",
    val video1080: String = "",
    val bestUrl: String = "",
    @SerialName("best_url")
    val bestUrlSnake: String? = null,
    val qualities: Map<String, String> = emptyMap(),
    val duration: Int? = null,
    val encrypted: Boolean = false,
    @SerialName("crypto_info")
    val cryptoInfo: ShortMaxCryptoInfo? = null
) {
    fun streamUrl(preferred: String = "720"): String {
        val fromMap = qualities["video_$preferred"] ?: when (preferred) {
            "480" -> video480
            "1080" -> video1080
            else -> video720
        }
        return fromMap.ifBlank { video720.ifBlank { video480.ifBlank { video1080 } } }
            .ifBlank { bestUrl.ifBlank { bestUrlSnake.orEmpty() } }
    }
}

@Serializable
data class ShortMaxSearchResponse(
    val success: Boolean = false,
    val keyword: String? = null,
    val query: String? = null,
    val page: Int? = null,
    val total: Int = 0,
    val items: List<ShortMaxItem> = emptyList()
)
