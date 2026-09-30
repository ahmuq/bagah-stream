package com.bagah.streaming.data.repository.reelshort

import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.data.model.ReelShortChapter
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.model.ReelShortEpisodeResponse
import com.bagah.streaming.data.model.ReelShortHomepageData

interface ReelShortRepository {
    suspend fun getHomepage(page: Int = 1): Result<ReelShortHomepageData>
    suspend fun getRanking(period: Int = 1, page: Int = 1): Result<List<ReelShortBook>>
    suspend fun getTrending(): Result<List<ReelShortBook>>
    suspend fun getLatest(): Result<List<ReelShortBook>>
    suspend fun getForYou(page: Int = 1): Result<List<ReelShortBook>>
    suspend fun getDetail(bookId: String): Result<ReelShortDetailResponse>
    suspend fun getEpisodes(bookId: String): Result<List<ReelShortChapter>>
    suspend fun getEpisode(bookId: String, episode: Int): Result<ReelShortEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<ReelShortBook>>
}
