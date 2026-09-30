package com.bagah.streaming.data.repository.shortmax

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.cache.TtlCache
import com.bagah.streaming.data.cache.cachedResult
import com.bagah.streaming.data.model.ShortMaxDetailResponse
import com.bagah.streaming.data.model.ShortMaxEpisode
import com.bagah.streaming.data.model.ShortMaxEpisodeResponse
import com.bagah.streaming.data.model.ShortMaxItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ShortMaxRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ShortMaxRepository {

    private fun List<ShortMaxItem>.validItems(): List<ShortMaxItem> =
        filter { it.stableId().isNotBlank() }

    override suspend fun getForYou(page: Int): Result<List<ShortMaxItem>> = withContext(ioDispatcher) {
        cachedResult("shortmax:foryou:$page", TtlCache.SHORT) {
            runCatching { api.browseShortMax(type = "foryou", page = page).items.validItems() }
        }
    }

    override suspend fun getTrending(page: Int): Result<List<ShortMaxItem>> = withContext(ioDispatcher) {
        cachedResult("shortmax:trending:$page", TtlCache.SHORT) {
            runCatching { api.browseShortMax(type = "trending", page = page).items.validItems() }
        }
    }

    override suspend fun getLatest(page: Int): Result<List<ShortMaxItem>> = withContext(ioDispatcher) {
        cachedResult("shortmax:latest:$page", TtlCache.SHORT) {
            runCatching { api.browseShortMax(type = "latest", page = page).items.validItems() }
        }
    }

    override suspend fun getRankings(page: Int): Result<List<ShortMaxItem>> = withContext(ioDispatcher) {
        cachedResult("shortmax:rankings:$page", TtlCache.SHORT) {
            runCatching { api.browseShortMax(type = "rankings", page = page).items.validItems() }
        }
    }

    override suspend fun getDetail(seriesId: String): Result<ShortMaxDetailResponse> =
        withContext(ioDispatcher) {
            cachedResult("shortmax:detail:$seriesId", TtlCache.MEDIUM) {
                runCatching { api.getShortMaxDetail(seriesId) }
            }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<ShortMaxEpisode>> =
        getDetail(seriesId).map { it.chapters }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<ShortMaxEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getShortMaxEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<ShortMaxItem>> =
        withContext(ioDispatcher) {
            cachedResult("shortmax:search:$keyword:$page", TtlCache.SHORT) {
                runCatching { api.searchShortMax(keyword, page).items.validItems() }
            }
        }
}
