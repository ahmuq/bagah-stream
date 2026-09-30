package com.bagah.streaming.data.repository.flickreels

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.cache.TtlCache
import com.bagah.streaming.data.cache.cachedResult
import com.bagah.streaming.data.model.FlickReelsDetailResponse
import com.bagah.streaming.data.model.FlickReelsEpisode
import com.bagah.streaming.data.model.FlickReelsEpisodeResponse
import com.bagah.streaming.data.model.FlickReelsItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FlickReelsRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : FlickReelsRepository {

    // Item tanpa id tidak bisa dibuka; dibuang seperti di platform lain.
    private fun List<FlickReelsItem>.validItems(): List<FlickReelsItem> =
        filter { it.id.isNotBlank() }

    override suspend fun getClassify(
        tag: String?,
        channel: String?,
        region: String?,
        sort: String?,
        cursor: String?
    ): Result<Pair<List<FlickReelsItem>, String?>> = withContext(ioDispatcher) {
        cachedResult(
            "flickreels:classify:${tag ?: "All"}:${channel ?: "All"}:${region ?: "All"}:${sort ?: "1"}:${cursor ?: "first"}",
            TtlCache.SHORT
        ) {
            runCatching {
                val response = api.browseFlickReels(
                    type = "classify",
                    tag = tag,
                    channel = channel,
                    region = region,
                    sort = sort,
                    cursor = cursor
                )
                response.items.validItems() to response.nextCursor
            }
        }
    }

    override suspend fun getForYou(): Result<List<FlickReelsItem>> = withContext(ioDispatcher) {
        cachedResult("flickreels:foryou", TtlCache.SHORT) {
            runCatching { api.browseFlickReels(type = "foryou").items.validItems() }
        }
    }

    override suspend fun getTrending(): Result<List<FlickReelsItem>> = withContext(ioDispatcher) {
        cachedResult("flickreels:trending", TtlCache.SHORT) {
            runCatching { api.browseFlickReels(type = "trending").items.validItems() }
        }
    }

    override suspend fun getLatest(): Result<List<FlickReelsItem>> = withContext(ioDispatcher) {
        cachedResult("flickreels:latest", TtlCache.SHORT) {
            runCatching { api.browseFlickReels(type = "latest").items.validItems() }
        }
    }

    override suspend fun getDetail(seriesId: String): Result<FlickReelsDetailResponse> =
        withContext(ioDispatcher) {
            cachedResult("flickreels:detail:$seriesId", TtlCache.MEDIUM) {
                runCatching { api.getFlickReelsDetail(seriesId) }
            }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<FlickReelsEpisode>> =
        // Ambil dari detail yang sama agar tidak request dua kali.
        getDetail(seriesId).map { it.chapters }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<FlickReelsEpisodeResponse> = withContext(ioDispatcher) {
        // URL stream bertanda tangan: jangan dicache.
        runCatching { api.getFlickReelsEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String): Result<List<FlickReelsItem>> =
        withContext(ioDispatcher) {
            cachedResult("flickreels:search:$keyword", TtlCache.SHORT) {
                runCatching { api.searchFlickReels(keyword).items.validItems() }
            }
        }
}
