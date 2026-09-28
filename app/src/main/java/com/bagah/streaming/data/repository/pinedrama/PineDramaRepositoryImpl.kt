package com.bagah.streaming.data.repository.pinedrama

import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.api.StreamingApiService
import com.bagah.streaming.data.model.PineDramaDetailResponse
import com.bagah.streaming.data.model.PineDramaItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PineDramaRepositoryImpl(
    private val api: StreamingApiService = NetworkClient.apiService,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : PineDramaRepository {

    private fun List<PineDramaItem>.validItems(): List<PineDramaItem> =
        filter { it.collectionId.isNotBlank() }

    override suspend fun getForYou(): Result<List<PineDramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getPineDramaForYou().collections.validItems() }
    }

    override suspend fun getTrending(): Result<List<PineDramaItem>> = withContext(ioDispatcher) {
        runCatching { api.getPineDramaTrending().collections.validItems() }
    }

    override suspend fun getDetail(collectionId: String): Result<PineDramaDetailResponse> =
        withContext(ioDispatcher) {
            runCatching { api.getPineDramaDetail(collectionId) }
        }
}
