package com.bagah.streaming.data.repository.dramanova

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.DramaNovaDetailResponse
import com.bagah.streaming.data.model.DramaNovaEpisode
import com.bagah.streaming.data.model.DramaNovaEpisodeResponse
import com.bagah.streaming.data.model.DramaNovaItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DramaNovaRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : DramaNovaRepository {

    private fun List<DramaNovaItem>.validItems(): List<DramaNovaItem> =
        filter { it.stableId().isNotBlank() }

    override suspend fun getHome(): Result<List<DramaNovaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaNovaHome().allItems.validItems() }
    }

    override suspend fun getTrending(page: Int): Result<List<DramaNovaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaNovaTrending(page).items.validItems() }
    }

    override suspend fun getLatest(page: Int): Result<List<DramaNovaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaNovaLatest(page).items.validItems() }
    }

    override suspend fun getRankings(page: Int): Result<List<DramaNovaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaNovaRankings(page).items.validItems() }
    }

    override suspend fun getDetail(seriesId: String): Result<DramaNovaDetailResponse> =
        withContext(ioDispatcher) {
            runCatching { api.getDramaNovaDetail(seriesId) }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<DramaNovaEpisode>> =
        withContext(ioDispatcher) {
            runCatching { api.getDramaNovaEpisodes(seriesId).items }
        }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<DramaNovaEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getDramaNovaEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<DramaNovaItem>> =
        withContext(ioDispatcher) {
            runCatching { api.searchDramaNova(keyword, page).items.validItems() }
        }
}
