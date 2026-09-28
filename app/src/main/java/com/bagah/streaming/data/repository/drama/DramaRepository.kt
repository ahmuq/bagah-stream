package com.bagah.streaming.data.repository.drama

import com.bagah.streaming.data.model.DramaChapter
import com.bagah.streaming.data.model.DramaItem

interface DramaRepository {
    suspend fun getPopular(): Result<List<DramaItem>>
    suspend fun getLatest(): Result<List<DramaItem>>
    suspend fun getDubbed(): Result<List<DramaItem>>
    suspend fun getVip(): Result<List<DramaItem>>
    suspend fun getChapters(bookId: String): Result<List<DramaChapter>>
    suspend fun search(keyword: String): Result<List<DramaItem>>
}
