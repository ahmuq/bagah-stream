package com.bagah.streaming.data.repository.shortmax

import com.bagah.streaming.data.model.ShortMaxDetailResponse
import com.bagah.streaming.data.model.ShortMaxEpisode
import com.bagah.streaming.data.model.ShortMaxEpisodeResponse
import com.bagah.streaming.data.model.ShortMaxItem

interface ShortMaxRepository {
    suspend fun getForYou(page: Int = 1): Result<List<ShortMaxItem>>
    suspend fun getTrending(page: Int = 1): Result<List<ShortMaxItem>>
    suspend fun getLatest(page: Int = 1): Result<List<ShortMaxItem>>
    suspend fun getRankings(page: Int = 1): Result<List<ShortMaxItem>>
    suspend fun getDetail(seriesId: String): Result<ShortMaxDetailResponse>
    suspend fun getEpisodes(seriesId: String): Result<List<ShortMaxEpisode>>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<ShortMaxEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<ShortMaxItem>>
}
