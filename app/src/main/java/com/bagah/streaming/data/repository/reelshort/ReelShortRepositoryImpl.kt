package com.bagah.streaming.data.repository.reelshort

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.cache.TtlCache
import com.bagah.streaming.data.cache.cachedResult
import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.data.model.ReelShortChapter
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.model.ReelShortEpisodeResponse
import com.bagah.streaming.data.model.ReelShortHomepageData
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ReelShortRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ReelShortRepository {

    override suspend fun getHomepage(page: Int): Result<ReelShortHomepageData> = withContext(ioDispatcher) {
        cachedResult("reelshort:homepage:$page", TtlCache.SHORT) {
            runCatching {
                val response = api.browseReelShort(type = "trending", page = page)
                ReelShortHomepageData(items = response.items)
            }
        }
    }

    override suspend fun getRanking(period: Int, page: Int): Result<List<ReelShortBook>> =
        withContext(ioDispatcher) {
            cachedResult("reelshort:ranking:$period:$page", TtlCache.SHORT) {
                runCatching {
                    api.browseReelShort(type = "ranking", period = period, page = page).items
                }
            }
        }

    override suspend fun getTrending(): Result<List<ReelShortBook>> = withContext(ioDispatcher) {
        cachedResult("reelshort:trending", TtlCache.SHORT) {
            runCatching { api.browseReelShort(type = "trending").items }
        }
    }

    override suspend fun getClassify(
        genre: String?,
        region: String?,
        page: Int
    ): Result<List<ReelShortBook>> = withContext(ioDispatcher) {
        cachedResult("reelshort:classify:${genre ?: "All"}:${region ?: "All"}:$page", TtlCache.SHORT) {
            runCatching {
                api.browseReelShort(type = "classify", genre = genre, region = region, page = page).items
            }
        }
    }

    override suspend fun getLatest(): Result<List<ReelShortBook>> = withContext(ioDispatcher) {
        cachedResult("reelshort:latest", TtlCache.SHORT) {
            runCatching { api.browseReelShort(type = "latest").items }
        }
    }

    override suspend fun getForYou(page: Int): Result<List<ReelShortBook>> = withContext(ioDispatcher) {
        cachedResult("reelshort:foryou:$page", TtlCache.SHORT) {
            runCatching { api.browseReelShort(type = "foryou", page = page).items }
        }
    }

    override suspend fun getDetail(bookId: String): Result<ReelShortDetailResponse> = withContext(ioDispatcher) {
        cachedResult("reelshort:detail:$bookId", TtlCache.MEDIUM) {
            runCatching { api.getReelShortDetail(bookId) }
        }
    }

    override suspend fun getEpisodes(bookId: String): Result<List<ReelShortChapter>> =
        getDetail(bookId).map { it.chapters }

    override suspend fun getEpisode(
        bookId: String,
        episode: Int
    ): Result<ReelShortEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getReelShortEpisode(bookId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<ReelShortBook>> =
        withContext(ioDispatcher) {
            cachedResult("reelshort:search:$keyword:$page", TtlCache.SHORT) {
                runCatching { api.searchReelShort(keyword, page).items.map { it.toBook() } }
            }
        }
}
