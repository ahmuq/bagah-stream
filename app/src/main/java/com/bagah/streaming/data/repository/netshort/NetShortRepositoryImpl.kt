package com.bagah.streaming.data.repository.netshort

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.cache.TtlCache
import com.bagah.streaming.data.cache.cachedResult
import com.bagah.streaming.data.model.NetShortDetailResponse
import com.bagah.streaming.data.model.NetShortEpisode
import com.bagah.streaming.data.model.NetShortEpisodeResponse
import com.bagah.streaming.data.model.NetShortItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class NetShortRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : NetShortRepository {

    private fun List<NetShortItem>.validItems(): List<NetShortItem> =
        filter { it.stableId().isNotBlank() }

    override suspend fun getRanking(type: String): Result<List<NetShortItem>> =
        withContext(ioDispatcher) {
            cachedResult("netshort:ranking:$type", TtlCache.LONG) {
                runCatching { api.browseNetShort(type = type).allItems.validItems() }
            }
        }

    override suspend fun getChannel(channelId: String): Result<List<NetShortItem>> =
        withContext(ioDispatcher) {
            cachedResult("netshort:channel:$channelId", TtlCache.MEDIUM) {
                runCatching { api.browseNetShort(type = channelId).allItems.validItems() }
            }
        }

    override suspend fun getDetail(seriesId: String): Result<NetShortDetailResponse> =
        withContext(ioDispatcher) {
            cachedResult("netshort:detail:$seriesId", TtlCache.MEDIUM) {
                runCatching { api.getNetShortDetail(seriesId) }
            }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<NetShortEpisode>> =
        getDetail(seriesId).map { it.episodeList() }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<NetShortEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getNetShortEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<NetShortItem>> =
        withContext(ioDispatcher) {
            cachedResult("netshort:search:$keyword:$page", TtlCache.SHORT) {
                runCatching { api.searchNetShort(keyword, page).items.validItems() }
            }
        }
}
