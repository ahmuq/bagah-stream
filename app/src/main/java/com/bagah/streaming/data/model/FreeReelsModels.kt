package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FreeReelsOperationTag(
    val text: String = "",
    @SerialName("text_color")
    val textColor: String = "",
    @SerialName("bg_start")
    val bgStart: String = "",
    @SerialName("bg_end")
    val bgEnd: String = ""
)

@Serializable
data class FreeReelsItem(
    val id: String = "",
    @SerialName("series_id")
    val seriesId: String = "",
    val key: String = "",
    val title: String = "",
    val description: String? = null,
    val cover: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val views: Long? = null,
    val followers: Long? = null,
    val free: Boolean = true,
    @SerialName("pay_mode")
    val payMode: String? = null,
    val tags: List<String> = emptyList(),
    @SerialName("operation_tags")
    val operationTags: List<FreeReelsOperationTag> = emptyList(),
    val episode: FreeReelsEpisode? = null
) {
    /** Sebagian item tidak mengirim `key`, jadi pakai seriesId/id sebagai cadangan. */
    fun stableId(): String = key.ifBlank { seriesId }.ifBlank { id }
}

@Serializable
data class FreeReelsSection(
    @SerialName("module_key")
    val moduleKey: String = "",
    @SerialName("module_name")
    val title: String = "",
    @SerialName("module_type")
    val moduleType: String? = null,
    val cursor: String? = null,
    @SerialName("has_more")
    val hasMore: Boolean? = null,
    val items: List<FreeReelsItem> = emptyList()
)

/** Respons `freereels/browse` untuk semua tab (foryou dan tab angka). */
@Serializable
data class FreeReelsBrowseResponse(
    val success: Boolean = false,
    val tab: String? = null,
    @SerialName("tab_key")
    val tabKey: String? = null,
    @SerialName("tab_name")
    val tabName: String? = null,
    @SerialName("module_key")
    val moduleKey: String? = null,
    val cursor: String? = null,
    @SerialName("has_more")
    val hasMore: Boolean? = null,
    val items: List<FreeReelsItem> = emptyList(),
    val sections: List<FreeReelsSection> = emptyList()
) {
    val allItems: List<FreeReelsItem>
        get() = if (items.isNotEmpty()) items else sections.flatMap { it.items }
}

@Serializable
data class FreeReelsDetailResponse(
    val success: Boolean = false,
    @SerialName("series_id")
    val seriesId: String = "",
    val title: String = "",
    val description: String = "",
    val cover: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val views: Long? = null,
    @SerialName("pay_mode")
    val payMode: String? = null,
    val free: Boolean = true,
    val tags: List<String> = emptyList(),
    val items: List<FreeReelsEpisode> = emptyList()
)

@Serializable
data class FreeReelsSubtitle(
    val language: String = "",
    val name: String = "",
    val subtitle: String = "",
    val vtt: String = ""
)

@Serializable
data class FreeReelsEpisode(
    @SerialName("episode_id")
    val episodeId: String = "",
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("best_url")
    val bestUrl: String = "",
    @SerialName("h264_m3u8")
    val h264M3u8: String = "",
    @SerialName("h265_m3u8")
    val h265M3u8: String = "",
    val duration: Int? = null,
    @SerialName("video_type")
    val videoType: String? = null,
    val unlocked: Boolean = false,
    val subtitles: List<FreeReelsSubtitle> = emptyList()
) {
    /** HLS H264 lebih dulu demi kompatibilitas decoder hardware, lalu best_url. */
    fun streamUrl(): String = h264M3u8.ifBlank { bestUrl }.ifBlank { h265M3u8 }
}

@Serializable
data class FreeReelsEpisodeResponse(
    val success: Boolean = false,
    @SerialName("series_id")
    val seriesId: String = "",
    @SerialName("episode_id")
    val episodeId: String = "",
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("best_url")
    val bestUrl: String = "",
    @SerialName("h264_m3u8")
    val h264M3u8: String = "",
    @SerialName("h265_m3u8")
    val h265M3u8: String = "",
    val duration: Int? = null,
    @SerialName("video_type")
    val videoType: String? = null,
    val unlocked: Boolean = false,
    val subtitles: List<FreeReelsSubtitle> = emptyList()
) {
    fun streamUrl(): String = h264M3u8.ifBlank { bestUrl }.ifBlank { h265M3u8 }

    /** Prioritaskan subtitle Indonesia, fallback Inggris, lalu yang pertama tersedia. */
    fun preferredSubtitle(): FreeReelsSubtitle? {
        val withVtt = subtitles.filter { it.vtt.isNotBlank() }
        return withVtt.firstOrNull { it.language.equals("id-ID", true) }
            ?: withVtt.firstOrNull { it.language.startsWith("id", true) }
            ?: withVtt.firstOrNull { it.language.startsWith("en", true) }
            ?: withVtt.firstOrNull()
    }
}

@Serializable
data class FreeReelsSearchResponse(
    val success: Boolean = false,
    val query: String? = null,
    val keyword: String? = null,
    @SerialName("tab_key")
    val tabKey: String? = null,
    val cursor: String? = null,
    @SerialName("has_more")
    val hasMore: Boolean? = null,
    val items: List<FreeReelsItem> = emptyList()
)
