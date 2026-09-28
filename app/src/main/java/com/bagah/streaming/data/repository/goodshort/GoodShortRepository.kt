package com.bagah.streaming.data.repository.goodshort

import com.bagah.streaming.data.model.GoodShortDetailResponse
import com.bagah.streaming.data.model.GoodShortEpisode
import com.bagah.streaming.data.model.GoodShortHomeModule
import com.bagah.streaming.data.model.GoodShortItem

interface GoodShortRepository {
    suspend fun getHome(): Result<List<GoodShortHomeModule>>
    suspend fun getForYou(): Result<List<GoodShortItem>>
    suspend fun getTrending(page: Int = 1): Result<List<GoodShortItem>>
    suspend fun getDetail(seriesId: String): Result<GoodShortDetailResponse>
    suspend fun getEpisodes(seriesId: String): Result<List<GoodShortEpisode>>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<GoodShortEpisode>
    suspend fun search(keyword: String): Result<List<GoodShortItem>>
}
