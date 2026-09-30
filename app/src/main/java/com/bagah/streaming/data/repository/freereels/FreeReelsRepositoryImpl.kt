package com.bagah.streaming.data.repository.freereels

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.cache.TtlCache
import com.bagah.streaming.data.cache.cachedResult
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

    private val tabPopular = "503"
    private val tabNew = "505"
    private val tabAnime = "547"

    private fun List<FreeReelsItem>.validItems(): List<FreeReelsItem> =
        filter { it.stableId().isNotBlank() }

    override suspend fun getBrowse(
        tab: String,
        cursor: String?
    ): Result<Pair<List<FreeReelsItem>, String?>> = withContext(ioDispatcher) {
        cachedResult("freereels:browse:$tab:${cursor ?: "first"}", TtlCache.SHORT) {
            runCatching {
                val response = api.browseFreeReels(tab = tab, cursor = cursor)
                response.allItems.validItems() to response.cursor
            }
        }
    }

    override suspend fun getForYou(next: String?): Result<Pair<List<FreeReelsItem>, String?>> =
        getBrowse(tab = "foryou", cursor = next)

    override suspend fun getTrending(): Result<List<FreeReelsItem>> =
        getBrowse(tabPopular).map { it.first }

    override suspend fun getLatest(): Result<List<FreeReelsItem>> =
        getBrowse(tabNew).map { it.first }

    override suspend fun getAnime(): Result<List<FreeReelsItem>> =
        getBrowse(tabAnime).map { it.first }

    override suspend fun getTab(tabKey: String): Result<List<FreeReelsItem>> =
        getBrowse(tabKey).map { it.first }

    override suspend fun getDetail(seriesId: String): Result<FreeReelsDetailResponse> =
        withContext(ioDispatcher) {
            cachedResult("freereels:detail:$seriesId", TtlCache.MEDIUM) {
                runCatching { api.getFreeReelsDetail(seriesId) }
            }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<FreeReelsEpisode>> =
        getDetail(seriesId).map { it.items }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<FreeReelsEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getFreeReelsEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String): Result<List<FreeReelsItem>> =
        withContext(ioDispatcher) {
            cachedResult("freereels:search:$keyword", TtlCache.SHORT) {
                runCatching { api.searchFreeReels(keyword).items.validItems() }
            }
        }
}
