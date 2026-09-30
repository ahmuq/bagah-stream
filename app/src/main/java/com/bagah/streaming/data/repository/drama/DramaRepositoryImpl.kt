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

    // API tetap bisa menyertakan item tanpa id; dibuang agar tidak jadi kartu kosong.
    private fun List<DramaItem>.validItems(): List<DramaItem> = filter { it.bookId.isNotBlank() }

    override suspend fun getHome(page: Int, status: String?): Result<List<DramaItem>> =
        withContext(ioDispatcher) {
            // classify mengirim total_episodes lengkap dan mendukung pagination + status.
            runCatching {
                api.browseDrama(type = "classify", page = page, status = status).flatItems.validItems()
            }
        }

    override suspend fun getForYou(page: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.browseDrama(type = "foryou", page = page).flatItems.validItems() }
    }

    override suspend fun getCategories(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        // theater mengelompokkan item per kolom; tidak mendukung pagination.
        runCatching { api.browseDrama(type = "theater").flatItems.validItems() }
    }

    override suspend fun getRanking(rankType: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching {
            api.browseDrama(type = "ranking", rankType = rankType.toString()).flatItems.validItems()
        }
    }

    override suspend fun getEpisodes(bookId: String): Result<List<DramaEpisode>> = withContext(ioDispatcher) {
        runCatching { api.getDramaDetail(bookId = bookId, full = "true").episodes }
    }

    override suspend fun getEpisodeStream(
        bookId: String,
        episode: Int
    ): Result<DramaEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getDramaEpisodeStream(bookId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching { api.searchDrama(keyword, page).items.validItems() }
    }
}
