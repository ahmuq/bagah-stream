package com.bagah.streaming.ui.screens.dramanova

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.bagah.streaming.ui.components.CarouselDots
import com.bagah.streaming.ui.components.ErrorBlock
import com.bagah.streaming.ui.components.GenericDetailScreen
import com.bagah.streaming.ui.components.GenericPlayerScreen
import com.bagah.streaming.ui.components.LoadingBlock
import com.bagah.streaming.ui.components.PlatformHeader
import com.bagah.streaming.ui.components.PlatformTabRow
import com.bagah.streaming.ui.components.SimpleMediaCard
import com.bagah.streaming.ui.components.SpotlightBadge
import com.bagah.streaming.ui.components.WatchNowCta
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

@Composable
fun DramaNovaHomeScreen(
    viewModel: DramaNovaHomeViewModel = viewModel(),
    onSeriesClick: (seriesId: String) -> Unit,
    onSearchClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack)
    ) {
        if (uiState.isLoading) {
            LoadingBlock("Memuat DramaNova...")
        } else if (uiState.errorMessage != null && uiState.trendingItems.isEmpty()) {
            ErrorBlock(uiState.errorMessage!!) { viewModel.loadData() }
        } else {
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 90.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                item(span = { GridItemSpan(maxLineSpan) }) {
                    PlatformHeader(
                        badge = "BAGAH DRAMANOVA",
                        subtitle = "Serial Pendek Trending",
                        onSearchClick = onSearchClick
                    )
                }

                if (uiState.spotlightItems.isNotEmpty()) {
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        val spotlight = uiState.spotlightItems
                        val pagerState = rememberPagerState(pageCount = { spotlight.size })
                        Column(modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                            HorizontalPager(
                                state = pagerState,
                                pageSpacing = 12.dp,
                                modifier = Modifier.fillMaxWidth().height(230.dp)
                            ) { page ->
                                val item = spotlight[page]
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(SurfaceDark)
                                        .border(1.dp, BorderSubtle, RoundedCornerShape(16.dp))
                                        .clickable { onSeriesClick(item.stableId()) }
                                ) {
                                    AsyncImage(
                                        model = item.cover,
                                        contentDescription = item.title,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier.fillMaxSize()
                                    )
                                    Box(
                                        modifier = Modifier.fillMaxSize().background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black.copy(alpha = 0.5f),
                                                    Color.Black.copy(alpha = 0.95f)
                                                )
                                            )
                                        )
                                    )
                                    Column(
                                        modifier = Modifier.align(Alignment.BottomStart).padding(14.dp)
                                    ) {
                                        SpotlightBadge("DRAMANOVA ${page + 1}/${spotlight.size}", item.episodeCount())
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = item.title,
                                            color = TextPrimary,
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis
                                        )
                                        if (!item.description.isNullOrBlank()) {
                                            Text(
                                                text = item.description,
                                                color = TextSecondary,
                                                fontSize = 11.sp,
                                                maxLines = 2,
                                                overflow = TextOverflow.Ellipsis,
                                                modifier = Modifier.padding(top = 2.dp, bottom = 8.dp)
                                            )
                                        } else {
                                            Spacer(modifier = Modifier.height(8.dp))
                                        }
                                        WatchNowCta()
                                    }
                                }
                            }
                            CarouselDots(spotlight.size, pagerState.currentPage)
                        }
                    }
                }

                item(span = { GridItemSpan(maxLineSpan) }) {
                    PlatformTabRow(
                        tabs = uiState.tabs,
                        selected = uiState.selectedTab,
                        onSelect = { viewModel.selectTab(it) }
                    )
                }

                items(uiState.currentDisplayList, key = { it.stableId() }) { item ->
                    SimpleMediaCard(
                        title = item.title,
                        cover = item.cover,
                        episodeCount = item.episodeCount(),
                        badgeText = "DRAMANOVA",
                        subtitle = item.category,
                        onClick = { onSeriesClick(item.stableId()) },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Composable
fun DramaNovaDetailScreen(
    seriesId: String,
    viewModel: DramaNovaDetailViewModel = viewModel(
        key = seriesId,
        factory = DramaNovaDetailViewModel.Factory(seriesId)
    ),
    onBackClick: () -> Unit,
    onPlayEpisode: (seriesId: String, episodeNum: Int) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    when {
        uiState.isLoading -> LoadingBlock("Memuat detail serial...")
        uiState.detail == null -> ErrorBlock(uiState.errorMessage ?: "Terjadi kesalahan") { viewModel.loadDetail() }
        else -> {
            val detail = uiState.detail!!
            GenericDetailScreen(
                topLabel = "Detail Serial DramaNova",
                title = detail.title,
                cover = detail.cover,
                episodeCount = detail.episodeCount().coerceAtLeast(uiState.episodes.size),
                description = detail.description,
                episodes = uiState.episodes.map {
                    Triple(it.number(), it.title, it.duration?.takeIf { d -> d > 0 }?.let { d -> "${d / 60}:${"%02d".format(d % 60)}" })
                },
                onBackClick = onBackClick,
                // Pakai seriesId asli dari navigasi: ID bisa melebihi presisi 64-bit JSON
                // sehingga ID dari response detail berpotensi terbulatkan.
                onPlayEpisode = { epNum -> onPlayEpisode(seriesId, epNum) }
            )
        }
    }
}

@Composable
fun DramaNovaPlayerScreen(
    seriesId: String,
    initialEpisode: Int = 1,
    viewModel: DramaNovaPlayerViewModel = viewModel(),
    onBackClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(seriesId, initialEpisode) {
        viewModel.initPlayer(seriesId, initialEpisode)
    }

    GenericPlayerScreen(
        title = uiState.title,
        currentEpisode = uiState.currentEpisode,
        totalEpisodes = uiState.totalEpisodes,
        streamUrl = uiState.currentStreamUrl,
        isLoading = uiState.isLoading,
        errorMessage = uiState.errorMessage,
        onBackClick = onBackClick,
        onPlayEpisode = { viewModel.playEpisode(it) },
        onPlayNext = { viewModel.playNext() },
        onPlayPrevious = { viewModel.playPrevious() }
    )
}
