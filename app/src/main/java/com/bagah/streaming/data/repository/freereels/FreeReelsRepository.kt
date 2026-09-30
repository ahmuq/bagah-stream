package com.bagah.streaming.data.repository.freereels

import com.bagah.streaming.data.model.FreeReelsDetailResponse
import com.bagah.streaming.data.model.FreeReelsEpisode
import com.bagah.streaming.data.model.FreeReelsEpisodeResponse
import com.bagah.streaming.data.model.FreeReelsItem

interface FreeReelsRepository {
    suspend fun getBrowse(tab: String, cursor: String? = null): Result<Pair<List<FreeReelsItem>, String?>>
    suspend fun getForYou(next: String? = null): Result<Pair<List<FreeReelsItem>, String?>>
    suspend fun getTrending(): Result<List<FreeReelsItem>>
    suspend fun getLatest(): Result<List<FreeReelsItem>>
    suspend fun getAnime(): Result<List<FreeReelsItem>>
    suspend fun getTab(tabKey: String): Result<List<FreeReelsItem>>
    suspend fun getDetail(seriesId: String): Result<FreeReelsDetailResponse>
    suspend fun getEpisodes(seriesId: String): Result<List<FreeReelsEpisode>>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<FreeReelsEpisodeResponse>
    suspend fun search(keyword: String): Result<List<FreeReelsItem>>
}
