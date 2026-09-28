package com.bagah.streaming.data.repository.drama

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.DramaEpisode
import com.bagah.streaming.data.model.DramaEpisodeResponse
import com.bagah.streaming.data.model.DramaItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DramaRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : DramaRepository {

    override suspend fun getHome(page: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaHome(page).items }
    }

    override suspend fun getForYou(page: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaForYou(page).items }
    }

    override suspend fun getCategories(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaCategories().items }
    }

    override suspend fun getEpisodes(bookId: String): Result<List<DramaEpisode>> = withContext(ioDispatcher) {
        runCatching { api.getDramaEpisodes(bookId).items }
    }

    override suspend fun getEpisodeStream(
        bookId: String,
        episode: Int
    ): Result<DramaEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getDramaEpisodeStream(bookId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.searchDrama(keyword, page).items }
    }
}
