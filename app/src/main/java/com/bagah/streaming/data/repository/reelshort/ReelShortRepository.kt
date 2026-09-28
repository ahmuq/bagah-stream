package com.bagah.streaming.data.repository.reelshort

import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.data.model.ReelShortChapter
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.model.ReelShortHomepageData
import com.bagah.streaming.data.model.ReelShortSearchResult
import com.bagah.streaming.data.model.ReelShortVideoStream

interface ReelShortRepository {
    suspend fun getHomepage(page: Int = 1): Result<ReelShortHomepageData>
    suspend fun getForYou(page: Int = 1): Result<List<ReelShortBook>>
    suspend fun getDetail(bookId: String): Result<ReelShortDetailResponse>
    suspend fun getEpisode(bookId: String, episode: Int): Result<List<ReelShortVideoStream>>
    suspend fun search(keyword: String, page: Int = 1): Result<List<ReelShortBook>>
}
