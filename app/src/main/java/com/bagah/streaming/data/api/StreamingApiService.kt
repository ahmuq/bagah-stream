package com.bagah.streaming.data.api

import com.bagah.streaming.data.model.AnimeApiResponse
import com.bagah.streaming.data.model.AnimeDetailWrapper
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.AnimeScheduleDataWrapper
import com.bagah.streaming.data.model.DramaDetailResponse
import com.bagah.streaming.data.model.DramaEpisodeResponse
import com.bagah.streaming.data.model.DramaEpisodesResponse
import com.bagah.streaming.data.model.DramaHomeResponse
import com.bagah.streaming.data.model.DramaSearchResponse
import com.bagah.streaming.data.model.FlickReelsDetailResponse
import com.bagah.streaming.data.model.FlickReelsEpisodeResponse
import com.bagah.streaming.data.model.FlickReelsEpisodesResponse
import com.bagah.streaming.data.model.FlickReelsListResponse
import com.bagah.streaming.data.model.FlickReelsSearchResponse
import com.bagah.streaming.data.model.FreeReelsDetailResponse
import com.bagah.streaming.data.model.FreeReelsEpisodeResponse
import com.bagah.streaming.data.model.FreeReelsEpisodesResponse
import com.bagah.streaming.data.model.FreeReelsForYouResponse
import com.bagah.streaming.data.model.FreeReelsSearchResponse
import com.bagah.streaming.data.model.FreeReelsSectionResponse
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.model.ReelShortEpisodeResponse
import com.bagah.streaming.data.model.ReelShortEpisodesResponse
import com.bagah.streaming.data.model.ReelShortHomepageResponse
import com.bagah.streaming.data.model.ReelShortSearchResponse
import com.bagah.streaming.data.model.ReelShortTrendingResponse
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

    @GET("api/dramabox/home")
    suspend fun getDramaHome(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "in"
    ): DramaHomeResponse

    @GET("api/dramabox/foryou")
    suspend fun getDramaForYou(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "in"
    ): DramaHomeResponse

    @GET("api/dramabox/categories")
    suspend fun getDramaCategories(
        @Query("lang") lang: String = "in"
    ): DramaHomeResponse

    @GET("api/dramabox/search")
    suspend fun searchDrama(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "in"
    ): DramaSearchResponse

    @GET("api/dramabox/detail")
    suspend fun getDramaDetail(
        @Query("bookId") bookId: String,
        @Query("lang") lang: String = "in"
    ): DramaDetailResponse

    @GET("api/dramabox/episodes")
    suspend fun getDramaEpisodes(
        @Query("bookId") bookId: String,
        @Query("lang") lang: String = "in"
    ): DramaEpisodesResponse

    @GET("api/dramabox/episode")
    suspend fun getDramaEpisodeStream(
        @Query("bookId") bookId: String,
        @Query("episode") episode: Int = 1,
        @Query("lang") lang: String = "in"
    ): DramaEpisodeResponse

    // --- REELSHORT ENDPOINTS ---

    @GET("api/reelshort/homepage")
    suspend fun getReelShortHomepage(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): ReelShortHomepageResponse

    @GET("api/reelshort/trending")
    suspend fun getReelShortTrending(
        @Query("lang") lang: String = "id"
    ): ReelShortTrendingResponse

    @GET("api/reelshort/latest")
    suspend fun getReelShortLatest(
        @Query("lang") lang: String = "id"
    ): ReelShortTrendingResponse

    @GET("api/reelshort/foryou")
    suspend fun getReelShortForYou(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): ReelShortTrendingResponse

    @GET("api/reelshort/detail")
    suspend fun getReelShortDetail(
        @Query("bookId") bookId: String,
        @Query("lang") lang: String = "id"
    ): ReelShortDetailResponse

    @GET("api/reelshort/episodes")
    suspend fun getReelShortEpisodes(
        @Query("bookId") bookId: String,
        @Query("lang") lang: String = "id"
    ): ReelShortEpisodesResponse

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

    // --- FREEREELS ENDPOINTS ---
    // Feed memakai cursor: field `next` dari response (mis. "offset=10") dioper ke request
    // berikutnya, bukan parameter offset manual.

    @GET("api/freereels/foryou")
    suspend fun getFreeReelsForYou(
        @Query("lang") lang: String = "id"
    ): FreeReelsForYouResponse

    @GET("api/freereels/foryou")
    suspend fun getFreeReelsForYouNext(
        @Query("next") next: String,
        @Query("lang") lang: String = "id"
    ): FreeReelsForYouResponse

    @GET("api/freereels/trending")
    suspend fun getFreeReelsTrending(
        @Query("lang") lang: String = "id"
    ): FreeReelsSectionResponse

    @GET("api/freereels/latest")
    suspend fun getFreeReelsLatest(
        @Query("lang") lang: String = "id"
    ): FreeReelsSectionResponse

    @GET("api/freereels/anime")
    suspend fun getFreeReelsAnime(
        @Query("lang") lang: String = "id"
    ): FreeReelsSectionResponse

    @GET("api/freereels/tab")
    suspend fun getFreeReelsTab(
        @Query("tabKey") tabKey: String,
        @Query("lang") lang: String = "id"
    ): FreeReelsSectionResponse

    @GET("api/freereels/detail")
    suspend fun getFreeReelsDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): FreeReelsDetailResponse

    @GET("api/freereels/episodes")
    suspend fun getFreeReelsEpisodes(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): FreeReelsEpisodesResponse

    @GET("api/freereels/episode")
    suspend fun getFreeReelsEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int,
        @Query("lang") lang: String = "id"
    ): FreeReelsEpisodeResponse

    @GET("api/freereels/search")
    suspend fun searchFreeReels(
        @Query("keyword") keyword: String,
        @Query("lang") lang: String = "id"
    ): FreeReelsSearchResponse

    // --- FLICKREELS ENDPOINTS ---
    // `foryou`, `trending`, `search` tidak menerapkan pagination (param page diabaikan
    // oleh server), jadi hanya satu halaman yang diambil.

    @GET("api/flickreels/foryou")
    suspend fun getFlickReelsForYou(
        @Query("lang") lang: String = "id"
    ): FlickReelsListResponse

    @GET("api/flickreels/trending")
    suspend fun getFlickReelsTrending(
        @Query("lang") lang: String = "id"
    ): FlickReelsListResponse

    @GET("api/flickreels/detail")
    suspend fun getFlickReelsDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): FlickReelsDetailResponse

    @GET("api/flickreels/episodes")
    suspend fun getFlickReelsEpisodes(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): FlickReelsEpisodesResponse

    @GET("api/flickreels/episode")
    suspend fun getFlickReelsEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int,
        @Query("lang") lang: String = "id"
    ): FlickReelsEpisodeResponse

    @GET("api/flickreels/search")
    suspend fun searchFlickReels(
        @Query("keyword") keyword: String,
        @Query("lang") lang: String = "id"
    ): FlickReelsSearchResponse
}
