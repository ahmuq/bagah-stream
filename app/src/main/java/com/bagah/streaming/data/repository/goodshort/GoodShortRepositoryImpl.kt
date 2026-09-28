package com.bagah.streaming.data.repository.goodshort

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.GoodShortDetailResponse
import com.bagah.streaming.data.model.GoodShortEpisode
import com.bagah.streaming.data.model.GoodShortHomeModule
import com.bagah.streaming.data.model.GoodShortItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GoodShortRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : GoodShortRepository {

    override suspend fun getHome(): Result<List<GoodShortHomeModule>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getGoodShortHome()
            response.modules
        }
    }

    override suspend fun getForYou(): Result<List<GoodShortItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getGoodShortForYou()
            response.items
        }
    }

    override suspend fun getTrending(page: Int): Result<List<GoodShortItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getGoodShortTrending(page)
            response.items
        }
    }

    override suspend fun getDetail(seriesId: String): Result<GoodShortDetailResponse> = withContext(ioDispatcher) {
        runCatching {
            api.getGoodShortDetail(seriesId)
        }
    }

    override suspend fun getEpisodes(seriesId: String): Result<List<GoodShortEpisode>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getGoodShortEpisodes(seriesId)
            response.items
        }
    }

    override suspend fun getEpisode(seriesId: String, episode: Int): Result<GoodShortEpisode> = withContext(ioDispatcher) {
        runCatching {
            try {
                val response = api.getGoodShortEpisode(seriesId, episode)
                GoodShortEpisode(
                    episodeNum = response.episodeNum,
                    episodeId = response.episodeId,
                    title = response.title,
                    locked = response.locked,
                    duration = response.duration,
                    cover = response.cover,
                    bestUrl = response.bestUrl
                )
            } catch (e: retrofit2.HttpException) {
                val errorBody = e.response()?.errorBody()?.string() ?: ""
                if (errorBody.contains("locked", ignoreCase = true)) {
                    throw IllegalStateException("Episode $episode terkunci (Premium GoodShort).")
                } else {
                    val msg = runCatching {
                        kotlinx.serialization.json.Json.parseToJsonElement(errorBody)
                            .let {
                                if (it is kotlinx.serialization.json.JsonObject) {
                                    it["message"]?.let { m ->
                                        if (m is kotlinx.serialization.json.JsonPrimitive) m.content else null
                                    }
                                } else null
                            }
                    }.getOrNull()
                    throw IllegalStateException(msg ?: (e.localizedMessage ?: "Gagal memuat video episode $episode"))
                }
            }
        }
    }

    override suspend fun search(keyword: String): Result<List<GoodShortItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.searchGoodShort(keyword)
            response.items
        }
    }
}
