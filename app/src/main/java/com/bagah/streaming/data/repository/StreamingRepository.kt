package com.bagah.streaming.data.repository

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.AnimeDetailItem
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.AnimeScheduleDay
import com.bagah.streaming.data.model.DramaEpisode
import com.bagah.streaming.data.model.DramaItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StreamingRepository(
    private val api: StreamingApiService = NetworkClient.apiService
) {

    suspend fun getAnimeLatest(page: Int = 1): Result<List<AnimeItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getAnimeLatest(page)
            response.data ?: emptyList()
        }
    }

    suspend fun getAnimeOngoing(page: Int = 1): Result<List<AnimeItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getAnimeOngoing(page)
            response.data ?: emptyList()
        }
    }

    suspend fun getAnimeSchedule(): Result<List<AnimeScheduleDay>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getAnimeSchedule()
            response.data?.data ?: emptyList()
        }
    }

    suspend fun getAnimeMovies(): Result<List<AnimeItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getAnimeMovies()
            response.data ?: emptyList()
        }
    }

    suspend fun getAnimeRecommendations(): Result<List<AnimeItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getAnimeRecommendations()
            response.data ?: emptyList()
        }
    }

    suspend fun searchAnime(keyword: String): Result<List<AnimeItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.searchAnime(keyword)
            response.data?.data?.flatMap { it.result } ?: emptyList()
        }
    }

    suspend fun getAnimeDetail(url: String): Result<AnimeDetailItem> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getAnimeDetail(url)
            val item = response.data?.data?.firstOrNull()
            item ?: throw IllegalStateException("Detail anime tidak ditemukan")
        }
    }

    suspend fun getAnimeEpisodeStream(url: String, quality: String? = null): Result<AnimeEpisodeData> =
        withContext(Dispatchers.IO) {
            runCatching {
                val response = api.getAnimeEpisodeStream(url, quality)
                response.data ?: throw IllegalStateException("Stream episode tidak ditemukan")
            }
        }

    suspend fun getDramaHome(): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching { api.browseDrama(type = "foryou").flatItems }
    }

    suspend fun getDramaForYou(): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching { api.browseDrama(type = "classify").flatItems }
    }

    suspend fun getDramaCategories(): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching { api.browseDrama(type = "theater").flatItems }
    }

    suspend fun searchDrama(keyword: String): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching { api.searchDrama(keyword).items }
    }

    suspend fun getDramaEpisodes(bookId: String): Result<List<DramaEpisode>> = withContext(Dispatchers.IO) {
        runCatching { api.getDramaDetail(bookId = bookId, full = "true").episodes }
    }
}
