package com.bagah.streaming.data.api

import com.bagah.streaming.data.model.AnimeApiResponse
import com.bagah.streaming.data.model.AnimeDetailWrapper
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.DramaApiResponse
import com.bagah.streaming.data.model.DramaChapter
import com.bagah.streaming.data.model.DramaItem
import retrofit2.http.GET
import retrofit2.http.Query

interface StreamingApiService {

    // --- ANIMEPLAY ENDPOINTS ---

    @GET("api/animeplay/latest")
    suspend fun getAnimeLatest(
        @Query("page") page: Int = 1
    ): AnimeApiResponse<List<AnimeItem>>

    @GET("api/animeplay/ongoing")
    suspend fun getAnimeOngoing(
        @Query("page") page: Int = 1,
        @Query("type") type: String = "all"
    ): AnimeApiResponse<List<AnimeItem>>

    @GET("api/animeplay/movies")
    suspend fun getAnimeMovies(): AnimeApiResponse<List<AnimeItem>>

    @GET("api/animeplay/recommendations")
    suspend fun getAnimeRecommendations(): AnimeApiResponse<List<AnimeItem>>

    @GET("api/animeplay/search")
    suspend fun searchAnime(
        @Query("keyword") keyword: String
    ): AnimeApiResponse<List<AnimeItem>>

    @GET("api/animeplay/detail")
    suspend fun getAnimeDetail(
        @Query("url") url: String
    ): AnimeApiResponse<AnimeDetailWrapper>

    @GET("api/animeplay/episode")
    suspend fun getAnimeEpisodeStream(
        @Query("url") url: String,
        @Query("quality") quality: String? = null
    ): AnimeApiResponse<AnimeEpisodeData>


    // --- DRAMABOX ENDPOINTS ---

    @GET("api/dramabox/popular")
    suspend fun getDramaPopular(): DramaApiResponse<List<DramaItem>>

    @GET("api/dramabox/latest")
    suspend fun getDramaLatest(): DramaApiResponse<List<DramaItem>>

    @GET("api/dramabox/dubbed")
    suspend fun getDramaDubbed(): DramaApiResponse<List<DramaItem>>

    @GET("api/dramabox/vip")
    suspend fun getDramaVip(): DramaApiResponse<List<DramaItem>>

    @GET("api/dramabox/search")
    suspend fun searchDrama(
        @Query("keyword") keyword: String
    ): DramaApiResponse<List<DramaItem>>

    @GET("api/dramabox/chapters")
    suspend fun getDramaChapters(
        @Query("bookId") bookId: String,
        @Query("getAll") getAll: Boolean = true
    ): DramaApiResponse<List<DramaChapter>>
}
