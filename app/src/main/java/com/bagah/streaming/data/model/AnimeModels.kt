package com.bagah.streaming.data.model

import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.JsonPrimitive

object FlexibleStringSerializer : KSerializer<String> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("FlexibleString", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): String {
        return if (decoder is JsonDecoder) {
            val element = decoder.decodeJsonElement()
            if (element is JsonPrimitive) {
                element.content
            } else {
                element.toString()
            }
        } else {
            decoder.decodeString()
        }
    }

    override fun serialize(encoder: Encoder, value: String) {
        encoder.encodeString(value)
    }
}

@Serializable
data class AnimeApiResponse<T>(
    val success: Boolean = false,
    val message: String? = null,
    val data: T? = null
)

@Serializable
data class AnimeItem(
    @Serializable(with = FlexibleStringSerializer::class)
    val id: String = "",
    val url: String = "",
    val judul: String = "",
    val cover: String = "",
    val lastch: String? = null,
    val lastup: String? = null,
    val genre: List<String> = emptyList(),
    val sinopsis: String? = null,
    val studio: String? = null,
    val score: String? = null,
    val status: String? = null,
    val rilis: String? = null,
    val total_episode: Int? = null,
    val type: String? = null
)

@Serializable
data class AnimeDetailWrapper(
    val data: List<AnimeDetailItem> = emptyList()
)

@Serializable
data class AnimeDetailItem(
    val id: Long? = null,
    val series_id: String? = null,
    val cover: String = "",
    val judul: String = "",
    val type: String? = null,
    val status: String? = null,
    val rating: String? = null,
    val published: String? = null,
    val author: String? = null,
    val genre: List<String> = emptyList(),
    val sinopsis: String? = null,
    val chapter: List<AnimeChapter> = emptyList()
)

@Serializable
data class AnimeChapter(
    val id: Long? = null,
    val ch: String = "",
    val url: String = "",
    val date: String? = null,
    val views: Long? = null
)

@Serializable
data class AnimeEpisodeData(
    val episode_id: Long? = null,
    val quality: String? = null,
    val available: List<String> = emptyList(),
    val links: List<AnimeStreamLink> = emptyList()
)

@Serializable
data class AnimeStreamLink(
    val link: String = "",
    val reso: String? = null,
    val size_kb: Long? = null
)

@Serializable
data class AnimeScheduleDataWrapper(
    val generatedAt: Long? = null,
    val data: List<AnimeScheduleDay> = emptyList()
)

@Serializable
data class AnimeScheduleDay(
    val day: String = "",
    val date: String? = null,
    val date_ts: Long? = null,
    val animeList: List<AnimeScheduleItem> = emptyList()
)

@Serializable
data class AnimeScheduleItem(
    val anime_name: String = "",
    @Serializable(with = FlexibleStringSerializer::class)
    val id: String = "",
    val link: String = "",
    val cover: String = "",
    val updated: Long? = null
) {
    fun toAnimeItem(): AnimeItem = AnimeItem(
        id = id,
        url = link,
        judul = anime_name,
        cover = cover,
        lastch = "Jadwal Tayang",
        lastup = null
    )
}
