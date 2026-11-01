package com.bagah.streaming.data.repository.melolo

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.cache.TtlCache
import com.bagah.streaming.data.cache.cachedResult
import com.bagah.streaming.data.model.MeloloDetailResponse
import com.bagah.streaming.data.model.MeloloEpisodeResponse
import com.bagah.streaming.data.model.MeloloItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MeloloRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : MeloloRepository {

    private fun List<MeloloItem>.validItems(): List<MeloloItem> =
        filter { it.stableId().isNotBlank() }

    override suspend fun getFeed(size: Int): Result<List<MeloloItem>> =
        withContext(ioDispatcher) {
            cachedResult("melolo:foryou:$size", TtlCache.SHORT) {
                runCatching { api.browseMelolo(type = "foryou", size = size).items.validItems() }
            }
        }

    override suspend fun getDetail(seriesId: String): Result<MeloloDetailResponse> =
        withContext(ioDispatcher) {
            cachedResult("melolo:detail:$seriesId", TtlCache.MEDIUM) {
                runCatching { api.getMeloloDetail(seriesId) }
            }
        }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<MeloloEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getMeloloEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<MeloloItem>> =
        withContext(ioDispatcher) {
            cachedResult("melolo:search:$keyword:$page", TtlCache.SHORT) {
                runCatching { api.searchMelolo(keyword, page).items.validItems() }
            }
        }
}
