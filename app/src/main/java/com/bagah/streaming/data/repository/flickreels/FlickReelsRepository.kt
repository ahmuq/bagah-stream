package com.bagah.streaming.data.repository.flickreels

import com.bagah.streaming.data.model.FlickReelsDetailResponse
import com.bagah.streaming.data.model.FlickReelsEpisode
import com.bagah.streaming.data.model.FlickReelsEpisodeResponse
import com.bagah.streaming.data.model.FlickReelsItem

interface FlickReelsRepository {
    suspend fun getForYou(): Result<List<FlickReelsItem>>
    suspend fun getTrending(): Result<List<FlickReelsItem>>
    suspend fun getDetail(seriesId: String): Result<FlickReelsDetailResponse>
    suspend fun getEpisodes(seriesId: String): Result<List<FlickReelsEpisode>>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<FlickReelsEpisodeResponse>
    suspend fun search(keyword: String): Result<List<FlickReelsItem>>
}
