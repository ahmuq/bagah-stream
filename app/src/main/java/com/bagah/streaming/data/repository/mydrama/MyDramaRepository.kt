package com.bagah.streaming.data.repository.mydrama

import com.bagah.streaming.data.model.MyDramaDetailResponse
import com.bagah.streaming.data.model.MyDramaEpisodeResponse
import com.bagah.streaming.data.model.MyDramaItem

interface MyDramaRepository {
    suspend fun getFeed(cursor: String? = null): Result<Pair<List<MyDramaItem>, String?>>
    suspend fun getDetail(seriesId: String): Result<MyDramaDetailResponse>
    suspend fun getEpisode(seriesId: String, episode: Int): Result<MyDramaEpisodeResponse>
    suspend fun search(keyword: String, page: Int = 1): Result<List<MyDramaItem>>
}
