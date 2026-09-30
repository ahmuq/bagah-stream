package com.bagah.streaming.data.repository.pinedrama

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.cache.TtlCache
import com.bagah.streaming.data.cache.cachedResult
import com.bagah.streaming.data.model.PineDramaCategory
import com.bagah.streaming.data.model.PineDramaChapter
import com.bagah.streaming.data.model.PineDramaDetailResponse
import com.bagah.streaming.data.model.PineDramaEpisodeResponse
import com.bagah.streaming.data.model.PineDramaItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PineDramaRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : PineDramaRepository {

    private fun List<PineDramaItem>.validItems(): List<PineDramaItem> =
        filter { it.stableId().isNotBlank() }

    override suspend fun getForYou(page: Int): Result<List<PineDramaItem>> =
        withContext(ioDispatcher) {
            cachedResult("pinedrama:foryou:$page", TtlCache.SHORT) {
                runCatching { api.browsePineDrama(type = "foryou", page = page).items.validItems() }
            }
        }

    override suspend fun getCategories(): Result<List<PineDramaCategory>> =
        withContext(ioDispatcher) {
            cachedResult("pinedrama:categories", TtlCache.LONG) {
                runCatching { api.browsePineDrama(type = "categories").categories }
            }
        }

    override suspend fun getCategory(
        categoryId: String,
        cursor: String?
    ): Result<Pair<List<PineDramaItem>, String?>> = withContext(ioDispatcher) {
        cachedResult("pinedrama:category:$categoryId:${cursor ?: "first"}", TtlCache.SHORT) {
            runCatching {
                val response = api.browsePineDrama(type = categoryId, count = 20, lang = "id")
                response.items.validItems() to response.cursor
            }
        }
    }

    override suspend fun getDetail(seriesId: String): Result<PineDramaDetailResponse> =
        withContext(ioDispatcher) {
            cachedResult("pinedrama:detail:$seriesId", TtlCache.MEDIUM) {
                runCatching { api.getPineDramaDetail(seriesId) }
            }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<PineDramaChapter>> =
        getDetail(seriesId).map { it.chapters }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<PineDramaEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getPineDramaEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<PineDramaItem>> =
        withContext(ioDispatcher) {
            cachedResult("pinedrama:search:$keyword:$page", TtlCache.SHORT) {
                runCatching { api.searchPineDrama(keyword, page).items.validItems() }
            }
        }
}
