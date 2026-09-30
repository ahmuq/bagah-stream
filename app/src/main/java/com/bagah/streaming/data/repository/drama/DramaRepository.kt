package com.bagah.streaming.data.repository.drama

import com.bagah.streaming.data.model.DramaDetailResponse
import com.bagah.streaming.data.model.DramaEpisode
import com.bagah.streaming.data.model.DramaEpisodeResponse
import com.bagah.streaming.data.model.DramaFilter
import com.bagah.streaming.data.model.DramaItem
import com.bagah.streaming.data.model.DramaSection

interface DramaRepository {
    suspend fun getHome(page: Int = 1, status: String? = null, genre: String? = null): Result<List<DramaItem>>
    suspend fun getForYou(page: Int = 1): Result<List<DramaItem>>
    suspend fun getCategories(): Result<List<DramaItem>>
    suspend fun getTheater(): Result<List<DramaSection>>
    suspend fun getFilters(): Result<List<DramaFilter>>
    suspend fun getRanking(rankType: Int = 1): Result<List<DramaItem>>
    suspend fun getDetail(bookId: String): Result<DramaDetailResponse>
    suspend fun getEpisodes(bookId: String): Result<List<DramaEpisode>>
    suspend fun getEpisodeStream(bookId: String, episode: Int): Result<DramaEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<DramaItem>>
}
