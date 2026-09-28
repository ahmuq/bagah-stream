package com.bagah.streaming.data.repository.reelshort

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.model.ReelShortHomepageData
import com.bagah.streaming.data.model.ReelShortSearchResult
import com.bagah.streaming.data.model.ReelShortVideoStream
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

    override suspend fun getForYou(page: Int): Result<List<ReelShortBook>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getReelShortForYou(page)
            response.data?.lists ?: emptyList()
        }
    }

    override suspend fun getDetail(bookId: String): Result<ReelShortDetailResponse> = withContext(ioDispatcher) {
        runCatching {
            api.getReelShortDetail(bookId)
        }
    }

    override suspend fun getEpisode(bookId: String, episode: Int): Result<List<ReelShortVideoStream>> =
        withContext(ioDispatcher) {
            runCatching {
                val response = api.getReelShortEpisode(bookId, episode)
                response.videoList
            }
        }

    override suspend fun search(keyword: String, page: Int): Result<List<ReelShortBook>> =
        withContext(ioDispatcher) {
            runCatching {
                val response = api.searchReelShort(keyword, page)
                response.results.map { it.toBook() }
            }
        }
}
