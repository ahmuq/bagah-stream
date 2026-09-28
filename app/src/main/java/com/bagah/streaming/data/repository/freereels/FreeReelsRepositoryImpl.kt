package com.bagah.streaming.data.repository.freereels

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.FreeReelsDetailResponse
import com.bagah.streaming.data.model.FreeReelsEpisode
import com.bagah.streaming.data.model.FreeReelsEpisodeResponse
import com.bagah.streaming.data.model.FreeReelsItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FreeReelsRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : FreeReelsRepository {

    // Item dengan seriesId kosong tidak bisa dibuka; dibuang seperti di DramaBox.
    private fun List<FreeReelsItem>.validItems(): List<FreeReelsItem> =
        filter { it.seriesId.isNotBlank() }

    override suspend fun getForYou(next: String?): Result<Pair<List<FreeReelsItem>, String?>> =
        withContext(ioDispatcher) {
            runCatching {
                val response = if (next.isNullOrBlank()) {
                    api.getFreeReelsForYou()
                } else {
                    api.getFreeReelsForYouNext(next)
                }
                response.items.validItems() to response.next
            }
        }

    override suspend fun getTrending(): Result<List<FreeReelsItem>> = withContext(ioDispatcher) {
        runCatching { api.getFreeReelsTrending().allItems.validItems() }
    }

    override suspend fun getLatest(): Result<List<FreeReelsItem>> = withContext(ioDispatcher) {
        runCatching { api.getFreeReelsLatest().allItems.validItems() }
    }

    override suspend fun getAnime(): Result<List<FreeReelsItem>> = withContext(ioDispatcher) {
        runCatching { api.getFreeReelsAnime().allItems.validItems() }
    }

    override suspend fun getTab(tabKey: String): Result<List<FreeReelsItem>> = withContext(ioDispatcher) {
        runCatching { api.getFreeReelsTab(tabKey).allItems.validItems() }
    }

    override suspend fun getDetail(seriesId: String): Result<FreeReelsDetailResponse> =
        withContext(ioDispatcher) {
            runCatching { api.getFreeReelsDetail(seriesId) }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<FreeReelsEpisode>> =
        withContext(ioDispatcher) {
            runCatching { api.getFreeReelsEpisodes(seriesId).items }
        }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<FreeReelsEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getFreeReelsEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String): Result<List<FreeReelsItem>> =
        withContext(ioDispatcher) {
            runCatching { api.searchFreeReels(keyword).items.validItems() }
        }
}
