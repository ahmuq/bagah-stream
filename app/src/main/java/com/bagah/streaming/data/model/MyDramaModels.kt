package com.bagah.streaming.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MyDramaLocalized(
    @SerialName("cover_url")
    val coverUrl: String = "",
    val description: String = "",
    val title: String = ""
) {
    fun hasContent(): Boolean =
        title.isNotBlank() || coverUrl.isNotBlank() || description.isNotBlank()
}

/**
 * Picks the best localized variant: "id" -> "clear" -> "en" -> first with content.
 */
internal fun Map<String, MyDramaLocalized>?.pickLocalized(): MyDramaLocalized? {
    val map = this ?: return null
    return map["id"]?.takeIf { it.hasContent() }
        ?: map["clear"]?.takeIf { it.hasContent() }
        ?: map["en"]?.takeIf { it.hasContent() }
        ?: map.values.firstOrNull { it.hasContent() }
}

@Serializable
data class MyDramaEpisodeMeta(
    val number: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    @Serializable(with = FlexibleStringSerializer::class)
    val duration: String? = null,
    @SerialName("has_stream")
    val hasStream: Boolean = false,
    @SerialName("is_free")
    val isFree: Boolean = true,
    @Serializable(with = FlexibleStringSerializer::class)
    val price: String? = null,
    @SerialName("poster_url")
    val posterUrl: String = "",
    @SerialName("preview_url")
    val previewUrl: String = ""
) {
    fun displayTitle(): String =
        title.ifBlank { "Episode ${number.coerceAtLeast(1)}" }
}

@Serializable
data class MyDramaItem(
    val id: String = "",
    @SerialName("seriesId")
    val seriesIdCamel: String = "",
    @SerialName("series_id")
    val seriesId: String = "",
    val title: String = "",
    @SerialName("original_title")
    val originalTitle: String = "",
    @SerialName("cover_url")
    val coverUrl: String = "",
    val description: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val likes: Long = 0,
    val tags: List<String> = emptyList(),
    val status: String = "",
    @SerialName("is_exclusive")
    val isExclusive: Boolean = false,
    @SerialName("is_gold_exclusive")
    val isGoldExclusive: Boolean = false,
    @SerialName("is_pre_premiere")
    val isPrePremiere: Boolean = false,
    val localized: Map<String, MyDramaLocalized> = emptyMap(),
    @SerialName("first_episode")
    val firstEpisode: MyDramaEpisodeMeta? = null
) {
    fun stableId(): String =
        seriesId.ifBlank { seriesIdCamel }.ifBlank { id }

    fun displayTitle(): String =
        localized.pickLocalized()?.title?.takeIf { it.isNotBlank() }
            ?: title.ifBlank { originalTitle }

    fun displayCover(): String =
        coverUrl.ifBlank { localized.pickLocalized()?.coverUrl.orEmpty() }

    fun displayDescription(): String =
        description.ifBlank { localized.pickLocalized()?.description.orEmpty() }
}

@Serializable
data class MyDramaBrowseResponse(
    val success: Boolean = false,
    val lang: String? = null,
    @SerialName("has_more")
    val hasMore: Boolean = false,
    @SerialName("next_cursor")
    val nextCursor: String? = null,
    val items: List<MyDramaItem> = emptyList()
)

@Serializable
data class MyDramaDetailResponse(
    val success: Boolean = false,
    val id: String = "",
    @SerialName("seriesId")
    val seriesIdCamel: String = "",
    @SerialName("series_id")
    val seriesId: String = "",
    val title: String = "",
    @SerialName("original_title")
    val originalTitle: String = "",
    @SerialName("cover_url")
    val coverUrl: String = "",
    val description: String = "",
    @SerialName("total_episodes")
    val totalEpisodes: Int = 0,
    val likes: Long = 0,
    val tags: List<String> = emptyList(),
    val status: String = "",
    @SerialName("series_type")
    val seriesType: String = "",
    @SerialName("is_exclusive")
    val isExclusive: Boolean = false,
    @SerialName("is_gold_exclusive")
    val isGoldExclusive: Boolean = false,
    @SerialName("is_pre_premiere")
    val isPrePremiere: Boolean = false,
    val localized: Map<String, MyDramaLocalized> = emptyMap(),
    val episodes: List<MyDramaEpisodeMeta> = emptyList()
) {
    fun episodeList(): List<MyDramaEpisodeMeta> =
        episodes.sortedBy { it.number }

    fun displayTitle(): String =
        localized.pickLocalized()?.title?.takeIf { it.isNotBlank() }
            ?: title.ifBlank { originalTitle }

    fun displayCover(): String =
        coverUrl.ifBlank { localized.pickLocalized()?.coverUrl.orEmpty() }

    fun displayDescription(): String =
        description.ifBlank { localized.pickLocalized()?.description.orEmpty() }
}

@Serializable
data class MyDramaEpisodeResponse(
    val success: Boolean = false,
    @SerialName("series_id")
    val seriesId: String = "",
    val episode: Int = 1,
    @SerialName("episode_id")
    val episodeId: String = "",
    val title: String = "",
    @SerialName("has_stream")
    val hasStream: Boolean = false,
    @SerialName("is_free")
    val isFree: Boolean = true,
    @Serializable(with = FlexibleStringSerializer::class)
    val price: String? = null,
    val quality: String = "",
    @SerialName("play_url")
    val playUrl: String = "",
    @SerialName("stream_url")
    val streamUrlRaw: String = "",
    val qualities: Map<String, String> = emptyMap(),
    val subtitles: Map<String, String> = emptyMap(),
    @SerialName("poster_url")
    val posterUrl: String = "",
    @SerialName("preview_url")
    val previewUrl: String = ""
) {
    fun streamUrl(): String =
        streamUrlRaw.ifBlank { playUrl }.ifBlank {
            qualities["1080p"].orEmpty()
                .ifBlank { qualities["720p"].orEmpty() }
                .ifBlank { qualities["540p"].orEmpty() }
                .ifBlank { qualities.values.firstOrNull { it.isNotBlank() }.orEmpty() }
        }

    /** id -> en -> first available. */
    fun preferredSubtitle(): Pair<String, String>? {
        listOf("id", "en").forEach { lang ->
            subtitles[lang]?.takeIf { it.isNotBlank() }?.let { return lang to it }
        }
        return subtitles.entries.firstOrNull { it.value.isNotBlank() }?.let { it.key to it.value }
    }
}

@Serializable
data class MyDramaSearchResponse(
    val success: Boolean = false,
    val query: String = "",
    val page: Int = 1,
    @SerialName("page_size")
    val pageSize: Int = 20,
    val total: Int = 0,
    @SerialName("total_pages")
    val totalPages: Int = 0,
    @SerialName("has_more")
    val hasMore: Boolean = false,
    @SerialName("next_page")
    val nextPage: Int? = null,
    val items: List<MyDramaItem> = emptyList()
)
