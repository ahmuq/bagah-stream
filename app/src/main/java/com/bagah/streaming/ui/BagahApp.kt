package com.bagah.streaming.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.bagah.streaming.data.session.SessionStore
import com.bagah.streaming.ui.components.BagahBottomNavBar
import com.bagah.streaming.ui.navigation.Screen
import com.bagah.streaming.ui.screens.anime.AnimeDetailScreen
import com.bagah.streaming.ui.screens.anime.AnimeHomeScreen
import com.bagah.streaming.ui.screens.anime.AnimePlayerScreen
import com.bagah.streaming.ui.screens.auth.LoginScreen
import com.bagah.streaming.ui.screens.drama.DramaDetailScreen
import com.bagah.streaming.ui.screens.drama.DramaHomeScreen
import com.bagah.streaming.ui.screens.drama.DramaReelsPlayerScreen
import com.bagah.streaming.ui.screens.flickreels.FlickReelsDetailScreen
import com.bagah.streaming.ui.screens.flickreels.FlickReelsHomeScreen
import com.bagah.streaming.ui.screens.flickreels.FlickReelsPlayerScreen
import com.bagah.streaming.ui.screens.freereels.FreeReelsDetailScreen
import com.bagah.streaming.ui.screens.freereels.FreeReelsHomeScreen
import com.bagah.streaming.ui.screens.freereels.FreeReelsPlayerScreen
import com.bagah.streaming.ui.screens.hub.PlatformHubScreen
import com.bagah.streaming.ui.screens.netshort.NetShortDetailScreen
import com.bagah.streaming.ui.screens.netshort.NetShortHomeScreen
import com.bagah.streaming.ui.screens.netshort.NetShortPlayerScreen
import com.bagah.streaming.ui.screens.pinedrama.PineDramaDetailScreen
import com.bagah.streaming.ui.screens.pinedrama.PineDramaHomeScreen
import com.bagah.streaming.ui.screens.pinedrama.PineDramaPlayerScreen
import com.bagah.streaming.ui.screens.profile.ProfileScreen
import com.bagah.streaming.ui.screens.reelshort.ReelShortDetailScreen
import com.bagah.streaming.ui.screens.reelshort.ReelShortHomeScreen
import com.bagah.streaming.ui.screens.reelshort.ReelShortPlayerScreen
import com.bagah.streaming.ui.screens.search.SearchScreen
import com.bagah.streaming.ui.screens.shortmax.ShortMaxDetailScreen
import com.bagah.streaming.ui.screens.shortmax.ShortMaxHomeScreen
import com.bagah.streaming.ui.screens.shortmax.ShortMaxPlayerScreen
import com.bagah.streaming.ui.screens.splash.SplashPopUpIntro
import com.bagah.streaming.ui.theme.BgBlack

@Composable
fun BagahApp() {
    val session by SessionStore.state.collectAsState()

    if (!session.isLoggedIn) {
        LoginScreen()
        return
    }

    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    var showSplash by rememberSaveable { mutableStateOf(true) }

    val showBottomBar = currentRoute in listOf(
        Screen.AnimeHome.route,
        Screen.PlatformHub.route,
        Screen.DramaHome.route,
        Screen.ReelShortHome.route,
        Screen.FreeReelsHome.route,
        Screen.FlickReelsHome.route,
        Screen.ShortMaxHome.route,
        Screen.PineDramaHome.route,
        Screen.NetShortHome.route,
        Screen.Search.route,
        Screen.Profile.route
    )

    Box(modifier = Modifier.fillMaxSize()) {
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

                composable(Screen.DramaHome.route) {
                    DramaHomeScreen(
                        onDramaClick = { bookId, _ ->
                            navController.navigate(Screen.DramaDetail.createRoute(bookId))
                        },
                        onSearchClick = {
                            navController.navigate(Screen.Search.route)
                        }
                    )
                }

                composable(
                    route = Screen.DramaDetail.route,
                    arguments = listOf(navArgument("bookId") { type = NavType.StringType })
                ) { backStack ->
                    val bookId = backStack.arguments?.getString("bookId") ?: ""
                    DramaDetailScreen(
                        bookId = bookId,
                        onBackClick = { navController.popBackStack() },
                        onPlayEpisode = { sId, episodeNum, title ->
                            navController.navigate(
                                Screen.DramaReelsPlayer.createRoute(sId, episodeNum - 1, title)
                            )
                        }
                    )
                }

                composable(
                    route = Screen.DramaReelsPlayer.route,
                    arguments = listOf(
                        navArgument("bookId") { type = NavType.StringType },
                        navArgument("initialIndex") { type = NavType.IntType; defaultValue = 0 },
                        navArgument("title") { type = NavType.StringType; defaultValue = "" }
                    )
                ) { backStack ->
                    val bookId = backStack.arguments?.getString("bookId") ?: ""
                    val initialIndex = backStack.arguments?.getInt("initialIndex") ?: 0
                    val title = backStack.arguments?.getString("title") ?: ""
                    DramaReelsPlayerScreen(
                        bookId = bookId,
                        initialIndex = initialIndex,
                        title = title,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable(Screen.ReelShortHome.route) {
                    ReelShortHomeScreen(
                        onBookClick = { bookId ->
                            navController.navigate(Screen.ReelShortDetail.createRoute(bookId))
                        },
                        onSearchClick = {
                            navController.navigate(Screen.Search.route)
                        }
                    )
                }

                composable(
                    route = Screen.ReelShortDetail.route,
                    arguments = listOf(navArgument("bookId") { type = NavType.StringType })
                ) { backStack ->
                    val bookId = backStack.arguments?.getString("bookId") ?: ""
                    ReelShortDetailScreen(
                        bookId = bookId,
                        onBackClick = { navController.popBackStack() },
                        onPlayEpisode = { bId, epIndex ->
                            navController.navigate(Screen.ReelShortPlayer.createRoute(bId, epIndex))
                        }
                    )
                }

                composable(
                    route = Screen.ReelShortPlayer.route,
                    arguments = listOf(
                        navArgument("bookId") { type = NavType.StringType },
                        navArgument("episodeIndex") { type = NavType.IntType; defaultValue = 1 }
                    )
                ) { backStack ->
                    val bookId = backStack.arguments?.getString("bookId") ?: ""
                    val episodeIndex = backStack.arguments?.getInt("episodeIndex") ?: 1
                    ReelShortPlayerScreen(
                        bookId = bookId,
                        initialEpisode = episodeIndex,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable(Screen.FreeReelsHome.route) {
                    FreeReelsHomeScreen(
                        onSeriesClick = { seriesId ->
                            navController.navigate(Screen.FreeReelsDetail.createRoute(seriesId))
                        },
                        onSearchClick = {
                            navController.navigate(Screen.Search.route)
                        }
                    )
                }

                composable(
                    route = Screen.FreeReelsDetail.route,
                    arguments = listOf(navArgument("seriesId") { type = NavType.StringType })
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    FreeReelsDetailScreen(
                        seriesId = seriesId,
                        onBackClick = { navController.popBackStack() },
                        onPlayEpisode = { sId, epNum ->
                            navController.navigate(Screen.FreeReelsPlayer.createRoute(sId, epNum))
                        }
                    )
                }

                composable(
                    route = Screen.FreeReelsPlayer.route,
                    arguments = listOf(
                        navArgument("seriesId") { type = NavType.StringType },
                        navArgument("episodeNum") { type = NavType.IntType; defaultValue = 1 }
                    )
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    val episodeNum = backStack.arguments?.getInt("episodeNum") ?: 1
                    FreeReelsPlayerScreen(
                        seriesId = seriesId,
                        initialEpisode = episodeNum,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable(Screen.FlickReelsHome.route) {
                    FlickReelsHomeScreen(
                        onSeriesClick = { seriesId ->
                            navController.navigate(Screen.FlickReelsDetail.createRoute(seriesId))
                        },
                        onSearchClick = {
                            navController.navigate(Screen.Search.route)
                        }
                    )
                }

                composable(
                    route = Screen.FlickReelsDetail.route,
                    arguments = listOf(navArgument("seriesId") { type = NavType.StringType })
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    FlickReelsDetailScreen(
                        seriesId = seriesId,
                        onBackClick = { navController.popBackStack() },
                        onPlayEpisode = { sId, epNum ->
                            navController.navigate(Screen.FlickReelsPlayer.createRoute(sId, epNum))
                        }
                    )
                }

                composable(
                    route = Screen.FlickReelsPlayer.route,
                    arguments = listOf(
                        navArgument("seriesId") { type = NavType.StringType },
                        navArgument("episodeNum") { type = NavType.IntType; defaultValue = 1 }
                    )
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    val episodeNum = backStack.arguments?.getInt("episodeNum") ?: 1
                    FlickReelsPlayerScreen(
                        seriesId = seriesId,
                        initialEpisode = episodeNum,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable(Screen.ShortMaxHome.route) {
                    ShortMaxHomeScreen(
                        onSeriesClick = { seriesId ->
                            navController.navigate(Screen.ShortMaxDetail.createRoute(seriesId))
                        },
                        onSearchClick = {
                            navController.navigate(Screen.Search.route)
                        }
                    )
                }

                composable(
                    route = Screen.ShortMaxDetail.route,
                    arguments = listOf(navArgument("seriesId") { type = NavType.StringType })
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    ShortMaxDetailScreen(
                        seriesId = seriesId,
                        onBackClick = { navController.popBackStack() },
                        onPlayEpisode = { sId, epNum ->
                            navController.navigate(Screen.ShortMaxPlayer.createRoute(sId, epNum))
                        }
                    )
                }

                composable(
                    route = Screen.ShortMaxPlayer.route,
                    arguments = listOf(
                        navArgument("seriesId") { type = NavType.StringType },
                        navArgument("episodeNum") { type = NavType.IntType; defaultValue = 1 }
                    )
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    val episodeNum = backStack.arguments?.getInt("episodeNum") ?: 1
                    ShortMaxPlayerScreen(
                        seriesId = seriesId,
                        initialEpisode = episodeNum,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable(Screen.PlatformHub.route) {
                    PlatformHubScreen(
                        onPlatformClick = { route -> navController.navigate(route) }
                    )
                }

                composable(Screen.PineDramaHome.route) {
                    PineDramaHomeScreen(
                        onSeriesClick = { seriesId ->
                            navController.navigate(Screen.PineDramaDetail.createRoute(seriesId))
                        },
                        onSearchClick = { navController.navigate(Screen.Search.route) }
                    )
                }
                composable(
                    route = Screen.PineDramaDetail.route,
                    arguments = listOf(navArgument("seriesId") { type = NavType.StringType })
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    PineDramaDetailScreen(
                        seriesId = seriesId,
                        onBackClick = { navController.popBackStack() },
                        onPlayEpisode = { sId, epNum ->
                            navController.navigate(Screen.PineDramaPlayer.createRoute(sId, epNum))
                        }
                    )
                }
                composable(
                    route = Screen.PineDramaPlayer.route,
                    arguments = listOf(
                        navArgument("seriesId") { type = NavType.StringType },
                        navArgument("episodeNum") { type = NavType.IntType; defaultValue = 1 }
                    )
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    val episodeNum = backStack.arguments?.getInt("episodeNum") ?: 1
                    PineDramaPlayerScreen(
                        seriesId = seriesId,
                        initialEpisode = episodeNum,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable(Screen.NetShortHome.route) {
                    NetShortHomeScreen(
                        onSeriesClick = { seriesId ->
                            navController.navigate(Screen.NetShortDetail.createRoute(seriesId))
                        },
                        onSearchClick = { navController.navigate(Screen.Search.route) }
                    )
                }
                composable(
                    route = Screen.NetShortDetail.route,
                    arguments = listOf(navArgument("seriesId") { type = NavType.StringType })
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    NetShortDetailScreen(
                        seriesId = seriesId,
                        onBackClick = { navController.popBackStack() },
                        onPlayEpisode = { sId, epNum ->
                            navController.navigate(Screen.NetShortPlayer.createRoute(sId, epNum))
                        }
                    )
                }
                composable(
                    route = Screen.NetShortPlayer.route,
                    arguments = listOf(
                        navArgument("seriesId") { type = NavType.StringType },
                        navArgument("episodeNum") { type = NavType.IntType; defaultValue = 1 }
                    )
                ) { backStack ->
                    val seriesId = backStack.arguments?.getString("seriesId") ?: ""
                    val episodeNum = backStack.arguments?.getInt("episodeNum") ?: 1
                    NetShortPlayerScreen(
                        seriesId = seriesId,
                        initialEpisode = episodeNum,
                        onBackClick = { navController.popBackStack() }
                    )
                }

                composable(Screen.Search.route) {
                    SearchScreen(
                        onAnimeClick = { url ->
                            navController.navigate(Screen.AnimeDetail.createRoute(url))
                        },
                        onDramaClick = { bookId, _ ->
                            navController.navigate(Screen.DramaDetail.createRoute(bookId))
                        },
                        onReelShortClick = { bookId ->
                            navController.navigate(Screen.ReelShortDetail.createRoute(bookId))
                        },
                        onFreeReelsClick = { seriesId ->
                            navController.navigate(Screen.FreeReelsDetail.createRoute(seriesId))
                        },
                        onFlickReelsClick = { seriesId ->
                            navController.navigate(Screen.FlickReelsDetail.createRoute(seriesId))
                        },
                        onShortMaxClick = { seriesId ->
                            navController.navigate(Screen.ShortMaxDetail.createRoute(seriesId))
                        },
                        onNetShortClick = { seriesId ->
                            navController.navigate(Screen.NetShortDetail.createRoute(seriesId))
                        },
                        onPineDramaClick = { seriesId ->
                            navController.navigate(Screen.PineDramaDetail.createRoute(seriesId))
                        }
                    )
                }

                composable(Screen.Profile.route) {
                    ProfileScreen()
                }
            }
        }
    }

    AnimatedVisibility(
        visible = showSplash,
        enter = fadeIn(animationSpec = tween(150)),
        exit = fadeOut(animationSpec = tween(400))
    ) {
        SplashPopUpIntro(
            onAnimationFinished = { showSplash = false }
        )
    }
}
}
