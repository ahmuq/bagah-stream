package com.bagah.streaming.data.repository.pinedrama

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
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

    // Item tanpa id tidak bisa dibuka; dibuang seperti di platform lain.
    private fun List<PineDramaItem>.validItems(): List<PineDramaItem> =
        filter { it.stableId().isNotBlank() }

    override suspend fun getForYou(page: Int): Result<List<PineDramaItem>> =
        withContext(ioDispatcher) {
            runCatching { api.browsePineDrama(type = "foryou", page = page).items.validItems() }
        }

    override suspend fun getCategories(): Result<List<PineDramaCategory>> =
        withContext(ioDispatcher) {
            runCatching { api.browsePineDrama(type = "categories").categories }
        }

    override suspend fun getCategory(
        categoryId: String,
        cursor: String?
    ): Result<Pair<List<PineDramaItem>, String?>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.browsePineDrama(type = categoryId, count = 20, lang = "id")
            response.items.validItems() to response.cursor
        }
    }

    override suspend fun getDetail(seriesId: String): Result<PineDramaDetailResponse> =
        withContext(ioDispatcher) {
            runCatching { api.getPineDramaDetail(seriesId) }
        }

    override suspend fun getEpisodes(seriesId: String): Result<List<PineDramaChapter>> =
        withContext(ioDispatcher) {
            runCatching { api.getPineDramaDetail(seriesId).chapters }
        }

    override suspend fun getEpisode(
        seriesId: String,
        episode: Int
    ): Result<PineDramaEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getPineDramaEpisode(seriesId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<PineDramaItem>> =
        withContext(ioDispatcher) {
            runCatching { api.searchPineDrama(keyword, page).items.validItems() }
        }
}
