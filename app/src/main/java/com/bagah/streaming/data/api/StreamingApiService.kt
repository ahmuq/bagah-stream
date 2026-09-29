package com.bagah.streaming.data.api

import com.bagah.streaming.data.model.AnimeApiResponse
import com.bagah.streaming.data.model.AnimeDetailWrapper
import com.bagah.streaming.data.model.AnimeEpisodeData
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.AnimeScheduleDataWrapper
import com.bagah.streaming.data.model.DramaBrowseResponse
import com.bagah.streaming.data.model.DramaDetailResponse
import com.bagah.streaming.data.model.DramaEpisodeResponse
import com.bagah.streaming.data.model.DramaSearchResponse
import com.bagah.streaming.data.model.DramaNovaDetailResponse
import com.bagah.streaming.data.model.DramaNovaEpisodeResponse
import com.bagah.streaming.data.model.DramaNovaEpisodesResponse
import com.bagah.streaming.data.model.DramaNovaHomeResponse
import com.bagah.streaming.data.model.DramaNovaListResponse
import com.bagah.streaming.data.model.MeloloDetailResponse
import com.bagah.streaming.data.model.MeloloEpisodeResponse
import com.bagah.streaming.data.model.MeloloEpisodesResponse
import com.bagah.streaming.data.model.MeloloListResponse
import com.bagah.streaming.data.model.MeloloSearchResponse
import com.bagah.streaming.data.model.PineDramaCollectionsResponse
import com.bagah.streaming.data.model.PineDramaDetailResponse
import com.bagah.streaming.data.model.FlickReelsBrowseResponse
import com.bagah.streaming.data.model.FlickReelsDetailResponse
import com.bagah.streaming.data.model.FlickReelsEpisodeResponse
import com.bagah.streaming.data.model.FlickReelsSearchResponse
import com.bagah.streaming.data.model.FreeReelsBrowseResponse
import com.bagah.streaming.data.model.FreeReelsDetailResponse
import com.bagah.streaming.data.model.FreeReelsEpisodeResponse
import com.bagah.streaming.data.model.FreeReelsSearchResponse
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
    // Satu endpoint `browse` menggantikan home/foryou/categories/ranking.
    // `type` = foryou | classify | theater | ranking | reserve | filters.

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

    // --- REELSHORT ENDPOINTS ---
    // `type` = foryou | trending | latest | ranking | categories | waterfall | bookshelf | classify.

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

    // --- FREEREELS ENDPOINTS ---
    // `browse` menggantikan foryou/trending/latest/anime/tab.
    // `tab` = foryou | 503 (Populer) | 505 (New) | 547 (Anime) | 622 | 516 | 504 | 506.
    // Pagination memakai cursor: kirim `cursor` dari response sebelumnya.

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

    // --- FLICKREELS ENDPOINTS ---
    // `type` = foryou | trending | latest | ranking | categories | navigation | classify.
    // `foryou`/`classify` memakai `nextCursor`; `trending` statis.

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

    // --- SHORTMAX ENDPOINTS ---
    // `type` = trending | latest | rankings | foryou | classes | <classId> (200001..200014).
    // Stream HLS dengan segmen .ts terenkripsi custom (lihat ShortMaxDecryptDataSource).

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

    // --- MELOLO ENDPOINTS ---
    // Feed dibungkus `data.items`; stream berupa MP4 langsung di `data.urls.video_1`.

    @GET("api/melolo/foryou")
    suspend fun getMeloloForYou(
        @Query("page") page: Int = 1
    ): MeloloListResponse

    @GET("api/melolo/trending")
    suspend fun getMeloloTrending(
        @Query("page") page: Int = 1
    ): MeloloListResponse

    @GET("api/melolo/latest")
    suspend fun getMeloloLatest(
        @Query("page") page: Int = 1
    ): MeloloListResponse

    @GET("api/melolo/rankings")
    suspend fun getMeloloRankings(
        @Query("page") page: Int = 1
    ): MeloloListResponse

    @GET("api/melolo/detail")
    suspend fun getMeloloDetail(
        @Query("seriesId") seriesId: String
    ): MeloloDetailResponse

    @GET("api/melolo/episodes")
    suspend fun getMeloloEpisodes(
        @Query("seriesId") seriesId: String
    ): MeloloEpisodesResponse

    @GET("api/melolo/episode")
    suspend fun getMeloloEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int
    ): MeloloEpisodeResponse

    @GET("api/melolo/search")
    suspend fun searchMelolo(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("pageSize") pageSize: Int = 20
    ): MeloloSearchResponse

    // --- PINEDRAMA ENDPOINTS ---

    @GET("api/pinedrama/foryou")
    suspend fun getPineDramaForYou(): PineDramaCollectionsResponse

    @GET("api/pinedrama/trending")
    suspend fun getPineDramaTrending(): PineDramaCollectionsResponse

    @GET("api/pinedrama/detail")
    suspend fun getPineDramaDetail(
        @Query("collectionId") collectionId: String
    ): PineDramaDetailResponse

    // --- DRAMANOVA ENDPOINTS ---

    @GET("api/dramanova/home")
    suspend fun getDramaNovaHome(
        @Query("lang") lang: String = "id"
    ): DramaNovaHomeResponse

    @GET("api/dramanova/trending")
    suspend fun getDramaNovaTrending(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): DramaNovaListResponse

    @GET("api/dramanova/latest")
    suspend fun getDramaNovaLatest(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): DramaNovaListResponse

    @GET("api/dramanova/rankings")
    suspend fun getDramaNovaRankings(
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): DramaNovaListResponse

    @GET("api/dramanova/search")
    suspend fun searchDramaNova(
        @Query("keyword") keyword: String,
        @Query("page") page: Int = 1,
        @Query("lang") lang: String = "id"
    ): DramaNovaListResponse

    @GET("api/dramanova/detail")
    suspend fun getDramaNovaDetail(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): DramaNovaDetailResponse

    @GET("api/dramanova/episodes")
    suspend fun getDramaNovaEpisodes(
        @Query("seriesId") seriesId: String,
        @Query("lang") lang: String = "id"
    ): DramaNovaEpisodesResponse

    @GET("api/dramanova/episode")
    suspend fun getDramaNovaEpisode(
        @Query("seriesId") seriesId: String,
        @Query("episode") episode: Int,
        @Query("lang") lang: String = "id"
    ): DramaNovaEpisodeResponse
}
