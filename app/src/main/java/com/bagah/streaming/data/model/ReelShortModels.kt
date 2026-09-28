package com.bagah.streaming.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ReelShortBook(
    val book_id: String = "",
    val book_title: String = "",
    val book_pic: String = "",
    val special_desc: String? = null,
    val share_text: String? = null,
    val chapter_count: Int? = null,
    val like_count: Long? = null,
    val collect_count: Long? = null,
    val rank_level: String? = null,
    val theme: List<String> = emptyList()
)

@Serializable
data class ReelShortTab(
    val tab_id: Long? = null,
    val tab_name: String = ""
)

@Serializable
data class ReelShortListSection(
    val bs_id: Long? = null,
    val tab_id: Long? = null,
    val books: List<ReelShortBook> = emptyList()
)

@Serializable
data class ReelShortHomepageData(
    val search_keyword_list: List<String> = emptyList(),
    val tab_list: List<ReelShortTab> = emptyList(),
    val lists: List<ReelShortListSection> = emptyList()
)

@Serializable
data class ReelShortHomepageResponse(
    val success: Boolean = false,
    val message: String? = null,
    val data: ReelShortHomepageData? = null
)

@Serializable
data class ReelShortForYouData(
    val lists: List<ReelShortBook> = emptyList(),
    val page: Int? = null,
    val total_page: Int? = null
)

@Serializable
data class ReelShortForYouResponse(
    val success: Boolean = false,
    val page: Int? = null,
    val data: ReelShortForYouData? = null
)

@Serializable
data class ReelShortChapter(
    val index: Int = 1,
    val chapterId: String = "",
    val title: String = "",
    val isLocked: Boolean = false,
    val serialNumber: String = ""
)

@Serializable
data class ReelShortDetailResponse(
    val success: Boolean = false,
    val bookId: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String = "",
    val totalEpisodes: Int = 0,
    val chapters: List<ReelShortChapter> = emptyList()
)

@Serializable
data class ReelShortVideoStream(
    val url: String = "",
    val encode: String? = null,
    val quality: String? = null,
    val bitrate: String? = null
)

@Serializable
data class ReelShortEpisodeResponse(
    val success: Boolean = false,
    val isLocked: Boolean = false,
    val videoList: List<ReelShortVideoStream> = emptyList()
)

@Serializable
data class ReelShortSearchResult(
    val bookId: String = "",
    val title: String = "",
    val cover: String = "",
    val description: String = "",
    val chapterCount: Int = 0
) {
    fun toBook(): ReelShortBook = ReelShortBook(
        book_id = bookId,
        book_title = title,
        book_pic = cover,
        special_desc = description,
        chapter_count = chapterCount
    )
}

@Serializable
data class ReelShortSearchResponse(
    val success: Boolean = false,
    val keyword: String? = null,
    val total: Int = 0,
    val results: List<ReelShortSearchResult> = emptyList()
)
