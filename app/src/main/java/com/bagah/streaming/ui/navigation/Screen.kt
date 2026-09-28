package com.bagah.streaming.ui.navigation

import java.net.URLEncoder
import java.nio.charset.StandardCharsets

sealed class Screen(val route: String) {
    object AnimeHome : Screen("anime_home")
    object DramaHome : Screen("drama_home")
    object Search : Screen("search")

    object AnimeDetail : Screen("anime_detail/{url}") {
        fun createRoute(url: String): String {
            val encoded = URLEncoder.encode(url, StandardCharsets.UTF_8.toString())
            return "anime_detail/$encoded"
        }
    }

    object AnimePlayer : Screen("anime_player/{episodeUrl}/{title}") {
        fun createRoute(episodeUrl: String, title: String): String {
            val encUrl = URLEncoder.encode(episodeUrl, StandardCharsets.UTF_8.toString())
            val encTitle = URLEncoder.encode(title, StandardCharsets.UTF_8.toString())
            return "anime_player/$encUrl/$encTitle"
        }
    }

    object DramaReelsPlayer : Screen("drama_reels/{bookId}/{initialIndex}") {
        fun createRoute(bookId: String, initialIndex: Int = 0): String {
            return "drama_reels/$bookId/$initialIndex"
        }
    }

    object ReelShortHome : Screen("reelshort_home")

    object ReelShortDetail : Screen("reelshort_detail/{bookId}") {
        fun createRoute(bookId: String): String = "reelshort_detail/$bookId"
    }

    object ReelShortPlayer : Screen("reelshort_player/{bookId}/{episodeIndex}") {
        fun createRoute(bookId: String, episodeIndex: Int = 1): String = "reelshort_player/$bookId/$episodeIndex"
    }

    object FreeReelsHome : Screen("freereels_home")

    object FreeReelsDetail : Screen("freereels_detail/{seriesId}") {
        fun createRoute(seriesId: String): String = "freereels_detail/$seriesId"
    }

    object FreeReelsPlayer : Screen("freereels_player/{seriesId}/{episodeNum}") {
        fun createRoute(seriesId: String, episodeNum: Int = 1): String = "freereels_player/$seriesId/$episodeNum"
    }

    object FlickReelsHome : Screen("flickreels_home")

    object FlickReelsDetail : Screen("flickreels_detail/{seriesId}") {
        fun createRoute(seriesId: String): String = "flickreels_detail/$seriesId"
    }

    object FlickReelsPlayer : Screen("flickreels_player/{seriesId}/{episodeNum}") {
        fun createRoute(seriesId: String, episodeNum: Int = 1): String = "flickreels_player/$seriesId/$episodeNum"
    }
}
