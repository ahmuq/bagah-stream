package com.bagah.streaming.data.repository.dramanova

import com.bagah.streaming.data.model.DramaNovaDetailResponse
import com.bagah.streaming.data.model.DramaNovaEpisode
import com.bagah.streaming.data.model.DramaNovaEpisodeResponse
import com.bagah.streaming.data.model.DramaNovaItem

interface DramaNovaRepository {
    suspend fun getHome(): Result<List<DramaNovaItem>>
    suspend fun getTrending(page: Int = 1): Result<List<DramaNovaItem>>
    suspend fun getLatest(page: Int = 1): Result<List<DramaNovaItem>>
    suspend fun getRankings(page: Int = 1): Result<List<DramaNovaItem>>
    suspend fun getDetail(seriesId: String): Result<DramaNovaDetailResponse>
    suspend fun getEpisodes(seriesId: String): Result<List<DramaNovaEpisode>>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<DramaNovaEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<DramaNovaItem>>
}
