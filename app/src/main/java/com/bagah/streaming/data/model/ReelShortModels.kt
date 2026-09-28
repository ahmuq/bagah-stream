package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReelShortBook(
    val id: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String? = null,
    @SerialName("totalEpisodes")
    val chapterCount: Int? = null,
    val tags: List<String> = emptyList()
)

@Serializable
data class ReelShortHomepageData(
    @SerialName("hall_id")
    val hallId: Long? = null,
    @SerialName("search_keyword_list")
    val searchKeywords: List<String> = emptyList(),
    val items: List<ReelShortBook> = emptyList()
)

@Serializable
data class ReelShortHomepageResponse(
    val success: Boolean = false,
    val data: ReelShortHomepageData? = null
)

@Serializable
data class ReelShortTrendingResponse(
    val success: Boolean = false,
    val title: String? = null,
    val page: Int? = null,
    val items: List<ReelShortBook> = emptyList()
)

@Serializable
data class ReelShortChapter(
    @SerialName("episodeNum")
    val episodeNum: Int = 1,
    @SerialName("chapterId")
    val chapterId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("serialNumber")
    val serialNumber: String = ""
)

@Serializable
data class ReelShortDetailResponse(
    val success: Boolean = false,
    val id: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String = "",
    @SerialName("totalEpisodes")
    val totalEpisodes: Int = 0,
    val tags: List<String> = emptyList(),
    val chapters: List<ReelShortChapter> = emptyList()
)

@Serializable
data class ReelShortEpisodesResponse(
    val success: Boolean = false,
    val bookId: String = "",
    val title: String = "",
    @SerialName("totalEpisodes")
    val totalEpisodes: Int = 0,
    val items: List<ReelShortChapter> = emptyList()
)

@Serializable
data class ReelShortVideoStream(
    val url: String = "",
    @SerialName("encode")
    val encode: String? = null,
    val quality: String? = null,
    val bitrate: Int? = null
)

@Serializable
data class ReelShortEpisodeResponse(
    val success: Boolean = false,
    val bookId: String = "",
    @SerialName("episodeNum")
    val episodeNum: Int = 1,
    @SerialName("episodeId")
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("bestUrl")
    val bestUrl: String = "",
    @SerialName("videoList")
    val videoList: List<ReelShortVideoStream> = emptyList()
)

@Serializable
data class ReelShortSearchResult(
    val id: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String? = null,
    @SerialName("totalEpisodes")
    val chapterCount: Int? = null,
    val tags: List<String> = emptyList()
) {
    fun toBook(): ReelShortBook = ReelShortBook(
        id = id,
        title = title,
        cover = cover,
        description = description,
        chapterCount = chapterCount,
        tags = tags
    )
}

@Serializable
data class ReelShortSearchResponse(
    val success: Boolean = false,
    val query: String? = null,
    val page: Int? = null,
    val total: Int = 0,
    val items: List<ReelShortSearchResult> = emptyList()
)
