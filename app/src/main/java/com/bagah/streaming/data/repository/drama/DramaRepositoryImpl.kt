package com.bagah.streaming.data.repository.drama

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.DramaChapter
import com.bagah.streaming.data.model.DramaItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DramaRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : DramaRepository {

    override suspend fun getPopular(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getDramaPopular()
            response.data ?: emptyList()
        }
    }

    override suspend fun getLatest(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getDramaLatest()
            response.data ?: emptyList()
        }
    }

    override suspend fun getDubbed(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getDramaDubbed()
            response.data ?: emptyList()
        }
    }

    override suspend fun getVip(): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getDramaVip()
            response.data ?: emptyList()
        }
    }

    override suspend fun getChapters(bookId: String): Result<List<DramaChapter>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.getDramaChapters(bookId, getAll = true)
            response.data ?: emptyList()
        }
    }

    override suspend fun search(keyword: String): Result<List<DramaItem>> = withContext(ioDispatcher) {
        runCatching {
            val response = api.searchDrama(keyword)
            response.data ?: emptyList()
        }
    }
}
