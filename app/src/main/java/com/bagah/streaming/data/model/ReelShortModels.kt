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
    val searchKeywords: List<String> = emptyList(),
    val items: List<ReelShortBook> = emptyList()
)

@Serializable
data class ReelShortBrowseResponse(
    val success: Boolean = false,
    val title: String? = null,
    val page: Int? = null,
    @SerialName("totalPages")
    val totalPages: Int? = null,
    @SerialName("last_book_id")
    val lastBookId: String? = null,
    val groups: List<ReelShortCategoryGroup> = emptyList(),
    val items: List<ReelShortBook> = emptyList()
)

@Serializable
data class ReelShortCategoryGroup(
    @SerialName("category_name")
    val categoryName: String = "",
    val options: List<ReelShortCategoryOption> = emptyList()
)

@Serializable
data class ReelShortCategoryOption(
    val id: String = "",
    val text: String = ""
)

@Serializable
data class ReelShortChapter(
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("chapter_id")
    val chapterId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("serial_number")
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
data class ReelShortVideoStream(
    val url: String = "",
    val encode: String? = null,
    val quality: String? = null,
    val bitrate: Int? = null
)

@Serializable
data class ReelShortEpisodeResponse(
    val success: Boolean = false,
    @SerialName("book_id")
    val bookId: String = "",
    @SerialName("episode_num")
    val episodeNum: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    val locked: Boolean = false,
    @SerialName("best_url")
    val bestUrl: String = "",
    @SerialName("video_list")
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
