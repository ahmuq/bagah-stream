package com.bagah.streaming.data.repository.mydrama

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.cache.TtlCache
import com.bagah.streaming.data.cache.cachedResult
import com.bagah.streaming.data.model.MyDramaDetailResponse
import com.bagah.streaming.data.model.MyDramaEpisodeResponse
import com.bagah.streaming.data.model.MyDramaItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MyDramaRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : MyDramaRepository {

    private fun List<MyDramaItem>.validItems(): List<MyDramaItem> =
        filter { it.stableId().isNotBlank() }

    override suspend fun getFeed(cursor: String?): Result<Pair<List<MyDramaItem>, String?>> =
        withContext(ioDispatcher) {
            cachedResult("mydrama:feed:${cursor ?: "first"}", TtlCache.SHORT) {
                runCatching {
                    val response = api.browseMyDrama(cursor = cursor)
                    val next = response.nextCursor?.takeIf { response.hasMore && it.isNotBlank() }
                    response.items.validItems() to next
                }
            }
        }

    override suspend fun getDetail(seriesId: String): Result<MyDramaDetailResponse> =
        withContext(ioDispatcher) {
            cachedResult("mydrama:detail:$seriesId", TtlCache.MEDIUM) {
                runCatching { api.getMyDramaDetail(seriesId) }
            }
        }

    // Stream URLs expire, so episode responses are never cached.
    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<MyDramaEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getMyDramaEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<MyDramaItem>> =
        withContext(ioDispatcher) {
            cachedResult("mydrama:search:$keyword:$page", TtlCache.SHORT) {
                runCatching { api.searchMyDrama(keyword, page).items.validItems() }
            }
        }
}
