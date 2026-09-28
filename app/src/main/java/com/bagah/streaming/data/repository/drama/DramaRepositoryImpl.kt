package com.bagah.streaming.data.repository.drama

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.DramaEpisode
import com.bagah.streaming.data.model.DramaEpisodeResponse
import com.bagah.streaming.data.model.DramaItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DramaRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : DramaRepository {

    // API dramabox/home menyertakan satu item rusak per halaman (series_id kosong).
    // Dibuang di sini supaya tidak dirender jadi kartu kosong yang memicu 400 saat ditap.
    private fun List<DramaItem>.validItems(): List<DramaItem> = filter { it.bookId.isNotBlank() }

    override suspend fun getHome(page: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaHome(page).items.validItems() }
    }

    override suspend fun getForYou(page: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaForYou(page).items.validItems() }
    }

    override suspend fun getCategories(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getDramaCategories().items.validItems() }
    }

    override suspend fun getEpisodes(bookId: String): Result<List<DramaEpisode>> = withContext(ioDispatcher) {
        runCatching { api.getDramaEpisodes(bookId).items }
    }

    override suspend fun getEpisodeStream(
        bookId: String,
        episode: Int
    ): Result<DramaEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getDramaEpisodeStream(bookId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.searchDrama(keyword, page).items }
    }
}
