package com.bagah.streaming.data.repository.pinedrama

import com.bagah.streaming.data.model.PineDramaCategory
import com.bagah.streaming.data.model.PineDramaChapter
import com.bagah.streaming.data.model.PineDramaDetailResponse
import com.bagah.streaming.data.model.PineDramaEpisodeResponse
import com.bagah.streaming.data.model.PineDramaItem

interface PineDramaRepository {
    suspend fun getForYou(page: Int = 1): Result<List<PineDramaItem>>
    suspend fun getCategories(): Result<List<PineDramaCategory>>
    suspend fun getCategory(
        categoryId: String,
        cursor: String? = null
    ): Result<Pair<List<PineDramaItem>, String?>>
    suspend fun getDetail(seriesId: String): Result<PineDramaDetailResponse>
    suspend fun getEpisodes(seriesId: String): Result<List<PineDramaChapter>>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<PineDramaEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<PineDramaItem>>
}
