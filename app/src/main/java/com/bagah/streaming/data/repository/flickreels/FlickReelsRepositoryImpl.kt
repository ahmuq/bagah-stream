package com.bagah.streaming.data.repository.flickreels

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
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

    override suspend fun getForYou(): Result<List<FlickReelsItem>> = withContext(ioDispatcher) {
        runCatching { api.browseFlickReels(type = "foryou").items.validItems() }
    }

    override suspend fun getTrending(): Result<List<FlickReelsItem>> = withContext(ioDispatcher) {
        runCatching { api.browseFlickReels(type = "trending").items.validItems() }
    }

    override suspend fun getDetail(seriesId: String): Result<FlickReelsDetailResponse> =
        withContext(ioDispatcher) {
            runCatching { api.getFlickReelsDetail(seriesId) }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<FlickReelsEpisode>> =
        withContext(ioDispatcher) {
            // Endpoint episodes dihapus; daftar chapter sudah ikut di detail.
            runCatching { api.getFlickReelsDetail(seriesId).chapters }
        }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<FlickReelsEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getFlickReelsEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String): Result<List<FlickReelsItem>> =
        withContext(ioDispatcher) {
            runCatching { api.searchFlickReels(keyword).items.validItems() }
        }
}
