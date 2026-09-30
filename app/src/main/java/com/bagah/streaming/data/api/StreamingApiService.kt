package com.bagah.streaming.data.api

import com.bagah.streaming.data.model.AnimeApiResponse
import com.bagah.streaming.data.model.ApiKeyCheckResponse
import com.bagah.streaming.data.model.AnimeDetailWrapper
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.AnimeScheduleDataWrapper
import com.bagah.streaming.data.model.DramaBrowseResponse
import com.bagah.streaming.data.model.DramaDetailResponse
import com.bagah.streaming.data.model.DramaEpisodeResponse
import com.bagah.streaming.data.model.DramaSearchResponse
import com.bagah.streaming.data.model.PineDramaBrowseResponse
import com.bagah.streaming.data.model.PineDramaDetailResponse
import com.bagah.streaming.data.model.PineDramaEpisodeResponse
import com.bagah.streaming.data.model.PineDramaSearchResponse
import com.bagah.streaming.data.model.FlickReelsBrowseResponse
import com.bagah.streaming.data.model.FlickReelsDetailResponse
import com.bagah.streaming.data.model.FlickReelsEpisodeResponse
import com.bagah.streaming.data.model.FlickReelsSearchResponse
import com.bagah.streaming.data.model.FreeReelsBrowseResponse
import com.bagah.streaming.data.model.FreeReelsDetailResponse
import com.bagah.streaming.data.model.FreeReelsEpisodeResponse
import com.bagah.streaming.data.model.FreeReelsSearchResponse
import com.bagah.streaming.data.model.NetShortBrowseResponse
import com.bagah.streaming.data.model.NetShortDetailResponse
import com.bagah.streaming.data.model.NetShortEpisodeResponse
import com.bagah.streaming.data.model.NetShortSearchResponse
import com.bagah.streaming.data.model.ReelShortBrowseResponse
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.model.ReelShortEpisodeResponse
import com.bagah.streaming.data.model.ReelShortSearchResponse
import com.bagah.streaming.data.model.ShortMaxDetailResponse
import com.bagah.streaming.data.model.ShortMaxEpisodeResponse
import com.bagah.streaming.data.model.ShortMaxListResponse
import com.bagah.streaming.data.model.ShortMaxSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface StreamingApiService {

    @GET("api/check-key")
    suspend fun checkApiKey(
        @Query("apikey") apikey: String
    ): ApiKeyCheckResponse

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

    @GET("api/dramabox/browse")
    suspend fun browseDrama(
        @Query("type") type: String = "foryou",
        @Query("page") page: Int? = null,
        @Query("pageSize") pageSize: Int? = null,
        @Query("channelId") channelId: String? = null,
        @Query("genre") genre: String? = null,
        @Query("status") status: String? = null,
        @Query("dub") dub: String? = null,
        @Query("rankType") rankType: String? = null,
        @Query("lang") lang: String = "in"
    ): DramaBrowseResponse

    @GET("api/dramabox/detail")
    suspend fun getDramaDetail(
        @Query("bookId") bookId: String,
        @Query("full") full: String = "true",
        @Query("withRecommend") withRecommend: String = "false",
        @Query("lang") lang: String = "in"
    ): DramaDetailResponse

    @GET("api/dramabox/episode")
    suspend fun getDramaEpisodeStream(
        @Query("bookId") bookId: String,
        @Query("episode") episode: Int = 1,
        @Query("lang") lang: String = "in"
    ): DramaEpisodeResponse

    @GET("api/dramabox/search")
    suspend fun searchDrama(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "in"
    ): DramaSearchResponse

    @GET("api/reelshort/browse")
    suspend fun browseReelShort(
        @Query("type") type: String = "trending",
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("period") period: Int? = null,
        @Query("tag") tag: String? = null,
        @Query("genre") genre: String? = null,
        @Query("region") region: String? = null,
        @Query("dub") dub: String? = null,
        @Query("lastBookId") lastBookId: String? = null,
        @Query("lang") lang: String = "id"
    ): ReelShortBrowseResponse

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

    @GET("api/freereels/browse")
    suspend fun browseFreeReels(
        @Query("tab") tab: String = "foryou",
        @Query("cursor") cursor: String? = null,
        @Query("lang") lang: String = "id-ID"
    ): FreeReelsBrowseResponse

    @GET("api/freereels/detail")
    suspend fun getFreeReelsDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id-ID"
    ): FreeReelsDetailResponse

    @GET("api/freereels/episode")
    suspend fun getFreeReelsEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int,
        @Query("lang") lang: String = "id-ID"
    ): FreeReelsEpisodeResponse

    @GET("api/freereels/search")
    suspend fun searchFreeReels(
        @Query("keyword") keyword: String,
        @Query("tab") tab: String = "mix",
        @Query("cursor") cursor: String? = null,
        @Query("lang") lang: String = "id-ID"
    ): FreeReelsSearchResponse

    @GET("api/flickreels/browse")
    suspend fun browseFlickReels(
        @Query("type") type: String = "trending",
        @Query("page") page: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("tag") tag: String? = null,
        @Query("channel") channel: String? = null,
        @Query("region") region: String? = null,
        @Query("sort") sort: String? = null,
        @Query("cursor") cursor: String? = null,
        @Query("lang") lang: String = "id"
    ): FlickReelsBrowseResponse

    @GET("api/flickreels/detail")
    suspend fun getFlickReelsDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): FlickReelsDetailResponse

    @GET("api/flickreels/episode")
    suspend fun getFlickReelsEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int,
        @Query("lang") lang: String = "id"
    ): FlickReelsEpisodeResponse

    @GET("api/flickreels/search")
    suspend fun searchFlickReels(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): FlickReelsSearchResponse

    @GET("api/shortmax/browse")
    suspend fun browseShortMax(
        @Query("type") type: String = "trending",
        @Query("page") page: Int? = null,
        @Query("size") size: Int? = null,
        @Query("lang") lang: String = "id"
    ): ShortMaxListResponse

    @GET("api/shortmax/detail")
    suspend fun getShortMaxDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): ShortMaxDetailResponse

    @GET("api/shortmax/episode")
    suspend fun getShortMaxEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int,
        @Query("lang") lang: String = "id"
    ): ShortMaxEpisodeResponse

    @GET("api/shortmax/search")
    suspend fun searchShortMax(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("size") size: Int = 20,
        @Query("lang") lang: String = "id"
    ): ShortMaxSearchResponse

    @GET("api/pinedrama/browse")
    suspend fun browsePineDrama(
        @Query("type") type: String = "foryou",
        @Query("page") page: Int? = null,
        @Query("count") count: Int? = null,
        @Query("lang") lang: String = "id"
    ): PineDramaBrowseResponse

    @GET("api/pinedrama/detail")
    suspend fun getPineDramaDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): PineDramaDetailResponse

    @GET("api/pinedrama/episode")
    suspend fun getPineDramaEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int = 1,
        @Query("lang") lang: String = "id"
    ): PineDramaEpisodeResponse

    @GET("api/pinedrama/search")
    suspend fun searchPineDrama(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("size") size: Int = 20,
        @Query("lang") lang: String = "id"
    ): PineDramaSearchResponse

    @GET("api/netshort/browse")
    suspend fun browseNetShort(
        @Query("type") type: String = "mostTrending",
        @Query("codec") codec: String = "h264",
        @Query("lang") lang: String = "id_ID"
    ): NetShortBrowseResponse

    @GET("api/netshort/detail")
    suspend fun getNetShortDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id_ID"
    ): NetShortDetailResponse

    @GET("api/netshort/episode")
    suspend fun getNetShortEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int = 1,
        @Query("codec") codec: String = "h264",
        @Query("lang") lang: String = "id_ID"
    ): NetShortEpisodeResponse

    @GET("api/netshort/search")
    suspend fun searchNetShort(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("codec") codec: String = "h264",
        @Query("lang") lang: String = "id_ID"
    ): NetShortSearchResponse
}
