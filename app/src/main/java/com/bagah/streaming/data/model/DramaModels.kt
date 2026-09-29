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
    @Serializable(with = FlexibleStringSerializer::class)
    val views: String = "",
    @SerialName("is_complete")
    val isComplete: Boolean = false,
    val tags: List<String> = emptyList()
)

/** Respons `dramabox/browse` untuk seluruh tipe (foryou, classify, theater, ranking, reserve). */
@Serializable
data class DramaBrowseResponse(
    val success: Boolean = false,
    val page: Int? = null,
    @SerialName("is_more")
    val isMore: Boolean? = null,
    val items: List<DramaItem> = emptyList(),
    val columns: List<DramaColumn> = emptyList(),
    val banners: List<DramaBanner> = emptyList(),
    val types: List<DramaRankType> = emptyList(),
    val filters: List<DramaFilter> = emptyList()
) {
    /** theater mengelompokkan item per kolom; tab lain memakai `items` langsung. */
    val flatItems: List<DramaItem>
        get() = if (items.isNotEmpty()) items else columns.flatMap { it.items }
}

@Serializable
data class DramaColumn(
    @SerialName("column_id")
    val columnId: Long? = null,
    val title: String = "",
    val subtitle: String = "",
    val style: String? = null,
    val type: Int? = null,
    val items: List<DramaItem> = emptyList()
)

@Serializable
data class DramaBanner(
    val title: String = "",
    val cover: String = "",
    @SerialName("series_id")
    val seriesId: String = ""
)

@Serializable
data class DramaRankType(
    @SerialName("rank_type")
    val rankType: Int = 0,
    val name: String = ""
)

@Serializable
data class DramaFilter(
    val type: Int = 0,
    val categoryName: String = "",
    val options: List<DramaFilterOption> = emptyList()
)

@Serializable
data class DramaFilterOption(
    val display: String = "",
    val enDisplay: String = "",
    val value: String = ""
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
    @SerialName("episodes_total")
    val episodesTotal: Int? = null,
    @Serializable(with = FlexibleStringSerializer::class)
    val views: String = "",
    val category: String? = null,
    @SerialName("is_complete")
    val isComplete: Boolean = false,
    val tags: List<String> = emptyList(),
    val episodes: List<DramaEpisode> = emptyList()
) {
    fun episodeCount(): Int = if (totalEpisodes > 0) totalEpisodes else episodesTotal ?: episodes.size
}

@Serializable
data class DramaEpisode(
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("sizes")
    val qualities: Map<String, Int> = emptyMap()
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
