package com.bagah.streaming.data.repository.melolo

import com.bagah.streaming.data.model.MeloloDetailResponse
import com.bagah.streaming.data.model.MeloloEpisode
import com.bagah.streaming.data.model.MeloloEpisodeResponse
import com.bagah.streaming.data.model.MeloloItem

interface MeloloRepository {
    suspend fun getForYou(page: Int = 1): Result<List<MeloloItem>>
    suspend fun getTrending(page: Int = 1): Result<List<MeloloItem>>
    suspend fun getLatest(page: Int = 1): Result<List<MeloloItem>>
    suspend fun getRankings(page: Int = 1): Result<List<MeloloItem>>
    suspend fun getDetail(seriesId: String): Result<MeloloDetailResponse>
    suspend fun getEpisodes(seriesId: String): Result<List<MeloloEpisode>>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<MeloloEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<MeloloItem>>
}
