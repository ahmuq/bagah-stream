package com.bagah.streaming.data.repository.melolo

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.MeloloDetailResponse
import com.bagah.streaming.data.model.MeloloEpisode
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

    override suspend fun getForYou(page: Int): Result<List<MeloloItem>> = withContext(ioDispatcher) {
        runCatching { api.getMeloloForYou(page).items.validItems() }
    }

    override suspend fun getTrending(page: Int): Result<List<MeloloItem>> = withContext(ioDispatcher) {
        runCatching { api.getMeloloTrending(page).items.validItems() }
    }

    override suspend fun getLatest(page: Int): Result<List<MeloloItem>> = withContext(ioDispatcher) {
        runCatching { api.getMeloloLatest(page).items.validItems() }
    }

    override suspend fun getRankings(page: Int): Result<List<MeloloItem>> = withContext(ioDispatcher) {
        runCatching { api.getMeloloRankings(page).items.validItems() }
    }

    override suspend fun getDetail(seriesId: String): Result<MeloloDetailResponse> =
        withContext(ioDispatcher) {
            runCatching { api.getMeloloDetail(seriesId) }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<MeloloEpisode>> =
        withContext(ioDispatcher) {
            runCatching {
                api.getMeloloEpisodes(seriesId).data?.episodes
                    ?: api.getMeloloDetail(seriesId).data?.episodes
                    ?: emptyList()
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
            runCatching { api.searchMelolo(keyword, page).items.validItems() }
        }
}
