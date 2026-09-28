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

    override suspend fun getHome(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaHome().items }
    }

    override suspend fun getForYou(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaForYou().items }
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

    override suspend fun search(keyword: String): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.searchDrama(keyword).items }
    }
}
