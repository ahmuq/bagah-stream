package com.bagah.streaming.data.repository.drama

import com.bagah.streaming.data.model.DramaEpisode
import com.bagah.streaming.data.model.DramaEpisodeResponse
import com.bagah.streaming.data.model.DramaItem

interface DramaRepository {
    suspend fun getHome(page: Int = 1): Result<List<DramaItem>>
    suspend fun getForYou(page: Int = 1): Result<List<DramaItem>>
    suspend fun getCategories(): Result<List<DramaItem>>
    suspend fun getEpisodes(bookId: String): Result<List<DramaEpisode>>
    suspend fun getEpisodeStream(bookId: String, episode: Int): Result<DramaEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<DramaItem>>
}
