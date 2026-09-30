package com.bagah.streaming.data.repository.netshort

import com.bagah.streaming.data.model.NetShortDetailResponse
import com.bagah.streaming.data.model.NetShortEpisode
import com.bagah.streaming.data.model.NetShortEpisodeResponse
import com.bagah.streaming.data.model.NetShortItem

interface NetShortRepository {
    suspend fun getRanking(type: String): Result<List<NetShortItem>>
    suspend fun getChannel(channelId: String): Result<List<NetShortItem>>
    suspend fun getDetail(seriesId: String): Result<NetShortDetailResponse>
    suspend fun getEpisodes(seriesId: String): Result<List<NetShortEpisode>>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<NetShortEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<NetShortItem>>
}
