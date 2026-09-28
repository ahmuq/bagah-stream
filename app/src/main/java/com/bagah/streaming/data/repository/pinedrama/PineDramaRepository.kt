package com.bagah.streaming.data.repository.pinedrama

import com.bagah.streaming.data.model.PineDramaDetailResponse
import com.bagah.streaming.data.model.PineDramaItem

/**
 * PineDrama hanya menyediakan katalog. Tidak ada method episode karena endpoint-nya
 * tidak pernah mengembalikan video.
 */
interface PineDramaRepository {
    suspend fun getForYou(): Result<List<PineDramaItem>>
    suspend fun getTrending(): Result<List<PineDramaItem>>
    suspend fun getDetail(collectionId: String): Result<PineDramaDetailResponse>
}
