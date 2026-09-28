package com.bagah.streaming.data.model

import kotlinx.serialization.Serializable

@Serializable
data class DramaApiResponse<T>(
    val success: Boolean = false,
    val data: T? = null
)

@Serializable
data class DramaItem(
    @Serializable(with = FlexibleStringSerializer::class)
    val bookId: String = "",
    val bookName: String = "",
    val coverWap: String = "",
    val chapterCount: Int = 0,
    val introduction: String = "",
    val tags: List<String> = emptyList(),
    val protagonist: String? = null,
    val playCount: String? = null
)

@Serializable
data class DramaChapter(
    val chapterId: String = "",
    val chapterIndex: Int = 0,
    val chapterName: String = "",
    val cdnList: List<DramaCdn> = emptyList(),
    val chapterImg: String? = null
) {
    fun getPreferredVideoUrl(preferredQuality: Int = 720): String? {
        val defaultCdn = cdnList.firstOrNull { it.isDefault == 1 } ?: cdnList.firstOrNull()
        val videoList = defaultCdn?.videoPathList ?: emptyList()
        val matchedQuality = videoList.firstOrNull { it.quality == preferredQuality }
        val defaultQuality = videoList.firstOrNull { it.isDefault == 1 }
        return (matchedQuality ?: defaultQuality ?: videoList.firstOrNull())?.videoPath
    }
}

@Serializable
data class DramaCdn(
    val cdnDomain: String? = null,
    val isDefault: Int = 0,
    val videoPathList: List<DramaVideoPath> = emptyList()
)

@Serializable
data class DramaVideoPath(
    val quality: Int = 720,
    val videoPath: String = "",
    val isDefault: Int = 0
)
