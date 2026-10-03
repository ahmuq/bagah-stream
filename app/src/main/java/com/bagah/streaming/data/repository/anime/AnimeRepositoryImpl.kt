package com.bagah.streaming.data.repository.anime

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.AnimeDetailItem
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.AnimeScheduleDay
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AnimeRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : AnimeRepository {

    override suspend fun getLatest(page: Int): Result<List<AnimeItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getAnimeLatest(page)
            response.data ?: emptyList()
        }
    }

    override suspend fun getOngoing(page: Int): Result<List<AnimeItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getAnimeOngoing(page, "all")
            response.data ?: emptyList()
        }
    }

    override suspend fun getSchedule(): Result<List<AnimeScheduleDay>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getAnimeSchedule()
            response.data?.data ?: emptyList()
        }
    }

    override suspend fun getMovies(): Result<List<AnimeItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getAnimeMovies()
            response.data ?: emptyList()
        }
    }

    override suspend fun getRecommendations(): Result<List<AnimeItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getAnimeRecommendations()
            response.data ?: emptyList()
        }
    }

    override suspend fun getDetail(url: String): Result<AnimeDetailItem> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getAnimeDetail(url)
            val item = response.data?.data?.firstOrNull()
            item ?: throw IllegalStateException("Detail anime tidak ditemukan")
        }
    }

    override suspend fun getEpisodeStream(url: String, quality: String?): Result<AnimeEpisodeData> =
        withContext(ioDispatcher) {
            runCatching {
                val response = api.getAnimeEpisodeStream(url, quality)
                response.data ?: throw IllegalStateException("Stream episode tidak ditemukan")
            }
        }

    override suspend fun search(keyword: String): Result<List<AnimeItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.searchAnime(keyword)
            response.data?.data?.flatMap { it.result } ?: emptyList()
        }
    }
}
