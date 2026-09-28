package com.bagah.streaming.data.api

import com.bagah.streaming.data.model.AnimeApiResponse
import com.bagah.streaming.data.model.AnimeDetailWrapper
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.AnimeScheduleDataWrapper
import com.bagah.streaming.data.model.DramaApiResponse
import com.bagah.streaming.data.model.DramaChapter
import com.bagah.streaming.data.model.DramaItem
import com.bagah.streaming.data.model.GoodShortDetailResponse
import com.bagah.streaming.data.model.GoodShortEpisodeResponse
import com.bagah.streaming.data.model.GoodShortEpisodesResponse
import com.bagah.streaming.data.model.GoodShortForYouResponse
import com.bagah.streaming.data.model.GoodShortHomeResponse
import com.bagah.streaming.data.model.GoodShortSearchResponse
import com.bagah.streaming.data.model.GoodShortTrendingResponse
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.model.ReelShortEpisodeResponse
import com.bagah.streaming.data.model.ReelShortForYouResponse
import com.bagah.streaming.data.model.ReelShortHomepageResponse
import com.bagah.streaming.data.model.ReelShortSearchResponse
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

    @GET("api/animeplay/schedule")
    suspend fun getAnimeSchedule(): AnimeApiResponse<AnimeScheduleDataWrapper>

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

    // --- REELSHORT ENDPOINTS ---

    @GET("api/reelshort/homepage")
    suspend fun getReelShortHomepage(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): ReelShortHomepageResponse

    @GET("api/reelshort/foryou")
    suspend fun getReelShortForYou(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): ReelShortForYouResponse

    @GET("api/reelshort/detail")
    suspend fun getReelShortDetail(
        @Query("bookId") bookId: String,
        @Query("lang") lang: String = "id"
    ): ReelShortDetailResponse

    @GET("api/reelshort/episode")
    suspend fun getReelShortEpisode(
        @Query("bookId") bookId: String,
        @Query("episode") episode: Int,
        @Query("lang") lang: String = "id"
    ): ReelShortEpisodeResponse

    @GET("api/reelshort/search")
    suspend fun searchReelShort(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): ReelShortSearchResponse

    // --- GOODSHORT ENDPOINTS ---

    @GET("api/goodshort/home")
    suspend fun getGoodShortHome(
        @Query("lang") lang: String = "id"
    ): GoodShortHomeResponse

    @GET("api/goodshort/foryou")
    suspend fun getGoodShortForYou(
        @Query("lang") lang: String = "id"
    ): GoodShortForYouResponse

    @GET("api/goodshort/trending")
    suspend fun getGoodShortTrending(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): GoodShortTrendingResponse

    @GET("api/goodshort/detail")
    suspend fun getGoodShortDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): GoodShortDetailResponse

    @GET("api/goodshort/episodes")
    suspend fun getGoodShortEpisodes(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): GoodShortEpisodesResponse

    @GET("api/goodshort/episode")
    suspend fun getGoodShortEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int,
        @Query("lang") lang: String = "id"
    ): GoodShortEpisodeResponse

    @GET("api/goodshort/search")
    suspend fun searchGoodShort(
        @Query("keyword") keyword: String,
        @Query("lang") lang: String = "id"
    ): GoodShortSearchResponse
}
