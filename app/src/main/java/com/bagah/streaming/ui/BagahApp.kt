package com.bagah.streaming.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bagah.streaming.ui.components.BagahBottomNavBar
import com.bagah.streaming.ui.navigation.Screen
import com.bagah.streaming.ui.screens.anime.AnimeDetailScreen
import com.bagah.streaming.ui.screens.anime.AnimeHomeScreen
import com.bagah.streaming.ui.screens.anime.AnimePlayerScreen
import com.bagah.streaming.ui.screens.drama.DramaHomeScreen
import com.bagah.streaming.ui.screens.drama.DramaReelsPlayerScreen
import com.bagah.streaming.ui.screens.search.SearchScreen
import com.bagah.streaming.ui.theme.BgBlack

@Composable
fun BagahApp() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    // Show BottomBar only on top-level tabs
    val showBottomBar = currentRoute in listOf(
        Screen.AnimeHome.route,
        Screen.DramaHome.route,
        Screen.Search.route
    )

    Scaffold(
        containerColor = BgBlack,

        bottomBar = {
            if (showBottomBar) {
                BagahBottomNavBar(
                    currentRoute = currentRoute,
                    onNavigate = { route ->
                        navController.navigate(route) {
                            popUpTo(Screen.AnimeHome.route) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            NavHost(
                navController = navController,
                startDestination = Screen.AnimeHome.route
            ) {
                // 1. Anime Home
                composable(Screen.AnimeHome.route) {
                    AnimeHomeScreen(
                        onAnimeClick = { url ->
                            navController.navigate(Screen.AnimeDetail.createRoute(url))
                        },
                        onSearchClick = {
                            navController.navigate(Screen.Search.route)
                        }
                    )
                }

                // 2. Anime Detail
                composable(
                    route = Screen.AnimeDetail.route,
                    arguments = listOf(navArgument("url") { type = NavType.StringType })
                ) { backStack ->
                    val url = backStack.arguments?.getString("url") ?: ""
                    AnimeDetailScreen(
                        animeUrl = url,
                        onBackClick = { navController.popBackStack() },
                        onPlayEpisode = { epUrl, title ->
                            navController.navigate(Screen.AnimePlayer.createRoute(epUrl, title))
                        }
                    )
                }

                // 3. Anime Player
                composable(
                    route = Screen.AnimePlayer.route,
                    arguments = listOf(
                        navArgument("episodeUrl") { type = NavType.StringType },
                        navArgument("title") { type = NavType.StringType }
                    )
                ) { backStack ->
                    val epUrl = backStack.arguments?.getString("episodeUrl") ?: ""
                    val title = backStack.arguments?.getString("title") ?: ""
                    AnimePlayerScreen(
                        episodeUrlEncoded = epUrl,
                        titleEncoded = title,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                // 4. Drama Home
                composable(Screen.DramaHome.route) {
                    DramaHomeScreen(
                        onDramaClick = { bookId ->
                            navController.navigate(Screen.DramaReelsPlayer.createRoute(bookId, 0))
                        },
                        onSearchClick = {
                            navController.navigate(Screen.Search.route)
                        }
                    )
                }

                // 5. Drama Reels Player (Vertical TikTok style)
                composable(
                    route = Screen.DramaReelsPlayer.route,
                    arguments = listOf(
                        navArgument("bookId") { type = NavType.StringType },
                        navArgument("initialIndex") { type = NavType.IntType; defaultValue = 0 }
                    )
                ) { backStack ->
                    val bookId = backStack.arguments?.getString("bookId") ?: ""
                    val initialIndex = backStack.arguments?.getInt("initialIndex") ?: 0
                    DramaReelsPlayerScreen(
                        bookId = bookId,
                        initialIndex = initialIndex,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                // 6. Search
                composable(Screen.Search.route) {
                    SearchScreen(
                        onAnimeClick = { url ->
                            navController.navigate(Screen.AnimeDetail.createRoute(url))
                        },
                        onDramaClick = { bookId ->
                            navController.navigate(Screen.DramaReelsPlayer.createRoute(bookId, 0))
                        }
                    )
                }
            }
        }
    }
}
