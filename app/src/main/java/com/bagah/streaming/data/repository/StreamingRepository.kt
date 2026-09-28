package com.bagah.streaming.data.repository

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.AnimeDetailItem
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.DramaChapter
import com.bagah.streaming.data.model.DramaItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class StreamingRepository(
    private val api: StreamingApiService = NetworkClient.apiService
) {
    // --- ANIME METHODS ---

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
            response.data ?: emptyList()
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


    // --- DRAMA METHODS ---

    suspend fun getDramaPopular(): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getDramaPopular()
            response.data ?: emptyList()
        }
    }

    suspend fun getDramaLatest(): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getDramaLatest()
            response.data ?: emptyList()
        }
    }

    suspend fun getDramaDubbed(): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getDramaDubbed()
            response.data ?: emptyList()
        }
    }

    suspend fun getDramaVip(): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getDramaVip()
            response.data ?: emptyList()
        }
    }

    suspend fun searchDrama(keyword: String): Result<List<DramaItem>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.searchDrama(keyword)
            response.data ?: emptyList()
        }
    }

    suspend fun getDramaChapters(bookId: String): Result<List<DramaChapter>> = withContext(Dispatchers.IO) {
        runCatching {
            val response = api.getDramaChapters(bookId, getAll = true)
            response.data ?: emptyList()
        }
    }
}
