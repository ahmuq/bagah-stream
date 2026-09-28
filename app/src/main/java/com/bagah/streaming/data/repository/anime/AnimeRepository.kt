package com.bagah.streaming.data.repository.anime

import com.bagah.streaming.data.model.AnimeDetailItem
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem

interface AnimeRepository {
    suspend fun getLatest(page: Int = 1): Result<List<AnimeItem>>
    suspend fun getOngoing(page: Int = 1): Result<List<AnimeItem>>
    suspend fun getMovies(): Result<List<AnimeItem>>
    suspend fun getRecommendations(): Result<List<AnimeItem>>
    suspend fun getDetail(url: String): Result<AnimeDetailItem>
    suspend fun getEpisodeStream(url: String, quality: String? = null): Result<AnimeEpisodeData>
    suspend fun search(keyword: String): Result<List<AnimeItem>>
}
