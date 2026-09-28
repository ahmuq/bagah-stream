package com.bagah.streaming.data.repository.reelshort

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
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
        runCatching {
            val response = api.getReelShortHomepage(page)
            response.data ?: ReelShortHomepageData()
        }
    }

    override suspend fun getTrending(): Result<List<ReelShortBook>> = withContext(ioDispatcher) {
        runCatching { api.getReelShortTrending().items }
    }

    override suspend fun getLatest(): Result<List<ReelShortBook>> = withContext(ioDispatcher) {
        runCatching { api.getReelShortLatest().items }
    }

    override suspend fun getForYou(page: Int): Result<List<ReelShortBook>> = withContext(ioDispatcher) {
        runCatching { api.getReelShortForYou(page).items }
    }

    override suspend fun getDetail(bookId: String): Result<ReelShortDetailResponse> = withContext(ioDispatcher) {
        runCatching { api.getReelShortDetail(bookId) }
    }

    override suspend fun getEpisodes(bookId: String): Result<List<ReelShortChapter>> = withContext(ioDispatcher) {
        runCatching { api.getReelShortEpisodes(bookId).items }
    }

    override suspend fun getEpisode(
        bookId: String,
        episode: Int
    ): Result<ReelShortEpisodeResponse> = withContext(ioDispatcher) {
        runCatching { api.getReelShortEpisode(bookId, episode) }
    }

    override suspend fun search(keyword: String, page: Int): Result<List<ReelShortBook>> =
        withContext(ioDispatcher) {
            runCatching { api.searchReelShort(keyword, page).items.map { it.toBook() } }
        }
}
