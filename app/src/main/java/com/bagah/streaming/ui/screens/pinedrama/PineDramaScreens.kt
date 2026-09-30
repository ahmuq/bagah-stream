package com.bagah.streaming.ui.screens.pinedrama

import android.net.Uri
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.OptIn
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.FormatListNumbered
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.SkipNext
import androidx.compose.material.icons.rounded.SkipPrevious
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView
import coil.compose.AsyncImage
import com.bagah.streaming.data.model.PineDramaChapter
import com.bagah.streaming.ui.components.CarouselDots
import com.bagah.streaming.ui.components.ErrorBlock
import com.bagah.streaming.ui.components.LoadingBlock
import com.bagah.streaming.ui.components.PlatformHeader
import com.bagah.streaming.ui.components.PlatformTabRow
import com.bagah.streaming.ui.components.SimpleMediaCard
import com.bagah.streaming.ui.components.SpotlightBadge
import com.bagah.streaming.ui.components.KeepScreenOn
import com.bagah.streaming.ui.components.PlaybackTimeControls
import com.bagah.streaming.ui.theme.AccentBlack
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceCard
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

@Composable
fun PineDramaHomeScreen(
    viewModel: PineDramaHomeViewModel = viewModel(),
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
            LoadingBlock("Memuat PineDrama...")
        } else if (uiState.errorMessage != null && uiState.currentDisplayList.isEmpty()) {
            ErrorBlock(uiState.errorMessage!!) { viewModel.loadData() }
        } else {
            val gridState = rememberLazyGridState()

            LaunchedEffect(gridState, uiState.selectedTab) {
                snapshotFlow {
                    gridState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
                }.collect { lastVisible ->
                    val total = gridState.layoutInfo.totalItemsCount
                    if (total > 0 && lastVisible >= total - 4) {
                        viewModel.loadMore()
                    }
                }
            }

            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                state = gridState,
                contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 90.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                item(span = { GridItemSpan(maxLineSpan) }) {
                    PlatformHeader(
                        badge = "BAGAH PINEDRAMA",
                        subtitle = "Katalog Mini Drama",
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
                                        SpotlightBadge("PINEDRAMA ${page + 1}/${spotlight.size}", item.totalEpisodes)
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = item.title,
                                            color = TextPrimary,
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold,
                                            maxLines = 2,
                                            overflow = TextOverflow.Ellipsis
                                        )
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
                        onSelect = viewModel::selectTab
                    )
                }

                if (uiState.loadingTabs.contains(uiState.selectedTab)) {
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 16.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(
                                color = AccentWhite,
                                strokeWidth = 2.dp,
                                modifier = Modifier.size(26.dp)
                            )
                        }
                    }
                }

                items(uiState.currentDisplayList, key = { it.stableId() }) { item ->
                    SimpleMediaCard(
                        title = item.title,
                        cover = item.cover,
                        episodeCount = item.totalEpisodes,
                        badgeText = "PINEDRAMA",
                        subtitle = item.tags.take(2).joinToString(" • ").ifBlank { null },
                        onClick = { onSeriesClick(item.stableId()) },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Composable
fun PineDramaDetailScreen(
    seriesId: String,
    viewModel: PineDramaDetailViewModel = viewModel(
        key = seriesId,
        factory = PineDramaDetailViewModel.Factory(seriesId)
    ),
    onBackClick: () -> Unit,
    onPlayEpisode: (seriesId: String, episodeNum: Int) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack)
    ) {
        if (uiState.isLoading) {
            LoadingBlock("Memuat detail serial...")
        } else if (uiState.detail == null) {
            ErrorBlock(uiState.errorMessage ?: "Terjadi kesalahan") { viewModel.loadDetail() }
        } else {
            val detail = uiState.detail!!

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(bottom = 40.dp)
            ) {
                item {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .statusBarsPadding()
                            .padding(horizontal = 16.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = onBackClick,
                            modifier = Modifier
                                .size(38.dp)
                                .background(SurfaceDark, CircleShape)
                                .border(1.dp, BorderSubtle, CircleShape)
                        ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                                contentDescription = "Kembali",
                                tint = AccentWhite,
                                modifier = Modifier.size(20.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Detail Serial PineDrama",
                            color = TextPrimary,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                item {
                    Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(SurfaceDark, RoundedCornerShape(16.dp))
                                .border(1.dp, BorderSubtle, RoundedCornerShape(16.dp))
                                .padding(14.dp),
                            horizontalArrangement = Arrangement.spacedBy(14.dp)
                        ) {
                            if (detail.cover.isNotBlank()) {
                                AsyncImage(
                                    model = detail.cover,
                                    contentDescription = detail.title,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .width(90.dp)
                                        .height(125.dp)
                                        .clip(RoundedCornerShape(10.dp))
                                        .background(SurfaceCard)
                                )
                            }
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = detail.title,
                                    color = TextPrimary,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 2,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Spacer(modifier = Modifier.height(6.dp))
                                Text(
                                    text = "${detail.totalEpisodes.coerceAtLeast(uiState.episodes.size)} Episode",
                                    color = TextMuted,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium
                                )
                                if (detail.description.isNotBlank()) {
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(
                                        text = detail.description,
                                        color = TextSecondary,
                                        fontSize = 11.sp,
                                        maxLines = 4,
                                        overflow = TextOverflow.Ellipsis,
                                        lineHeight = 15.sp
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(14.dp))

                        Button(
                            onClick = { onPlayEpisode(detail.seriesId.ifBlank { seriesId }, 1) },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(48.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = AccentWhite,
                                contentColor = AccentBlack
                            ),
                            shape = RoundedCornerShape(10.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.PlayArrow,
                                contentDescription = null,
                                tint = AccentBlack,
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(text = "Mulai Nonton Episode 1", fontWeight = FontWeight.Bold)
                        }

                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = "Daftar Episode (${uiState.episodes.size})",
                            color = TextPrimary,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(text = "Pilih untuk Memutar", color = TextMuted, fontSize = 11.sp)
                        Spacer(modifier = Modifier.height(10.dp))
                    }
                }

                items(uiState.episodes, key = { it.episodeId.ifBlank { it.episodeNum.toString() } }) { episode ->
                    PineDramaEpisodeRow(
                        episode = episode,
                        onClick = { onPlayEpisode(detail.seriesId.ifBlank { seriesId }, episode.episodeNum) }
                    )
                }
            }
        }
    }
}

@Composable
private fun PineDramaEpisodeRow(
    episode: PineDramaChapter,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceDark)
            .border(1.dp, BorderSubtle, RoundedCornerShape(10.dp))
            .clickable { onClick() }
            .padding(horizontal = 14.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(34.dp)
                    .background(AccentWhite.copy(alpha = 0.12f), CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "${episode.episodeNum}",
                    color = AccentWhite,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Text(
                text = episode.title.ifBlank { "Episode ${episode.episodeNum}" },
                color = TextPrimary,
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(8.dp))
                .background(AccentWhite, RoundedCornerShape(8.dp))
                .padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Text(text = "Putar", color = AccentBlack, fontSize = 11.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@OptIn(UnstableApi::class, ExperimentalMaterial3Api::class)
@Composable
fun PineDramaPlayerScreen(
    seriesId: String,
    initialEpisode: Int = 1,
    viewModel: PineDramaPlayerViewModel = viewModel(),
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsState()
    var showEpisodeSheet by remember { mutableStateOf(false) }

    LaunchedEffect(seriesId, initialEpisode) {
        viewModel.initPlayer(seriesId, initialEpisode)
    }

    // MP4 langsung dari PineDrama; ExoPlayer memutar tanpa dekripsi.
    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            playWhenReady = true
            repeatMode = Player.REPEAT_MODE_OFF
        }
    }

    KeepScreenOn()

    // Auto lanjut ke episode berikutnya saat video habis.
    DisposableEffect(exoPlayer) {
        val listener = object : Player.Listener {
            override fun onPlaybackStateChanged(state: Int) {
                if (state == Player.STATE_ENDED) viewModel.playNext()
            }
        }
        exoPlayer.addListener(listener)
        onDispose {
            exoPlayer.removeListener(listener)
            exoPlayer.release()
        }
    }

    LaunchedEffect(uiState.currentStreamUrl) {
        val streamUrl = uiState.currentStreamUrl
        if (!streamUrl.isNullOrBlank()) {
            exoPlayer.setMediaItem(MediaItem.fromUri(Uri.parse(streamUrl)))
            exoPlayer.prepare()
            exoPlayer.play()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        if (!uiState.currentStreamUrl.isNullOrBlank()) {
            AndroidView(
                factory = { ctx ->
                    PlayerView(ctx).apply {
                        player = exoPlayer
                        useController = false
                        layoutParams = FrameLayout.LayoutParams(
                            ViewGroup.LayoutParams.MATCH_PARENT,
                            ViewGroup.LayoutParams.MATCH_PARENT
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        if (exoPlayer.isPlaying) exoPlayer.pause() else exoPlayer.play()
                    }
            )
        }

        if (uiState.isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.7f)),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    CircularProgressIndicator(
                        color = AccentWhite,
                        strokeWidth = 2.dp,
                        modifier = Modifier.size(36.dp)
                    )
                    Spacer(modifier = Modifier.height(14.dp))
                    Text(
                        text = "Memuat Episode ${uiState.currentEpisode}...",
                        color = TextSecondary,
                        fontSize = 13.sp
                    )
                }
            }
        }

        if (uiState.errorMessage != null && !uiState.isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.85f)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(text = uiState.errorMessage ?: "", color = TextSecondary, fontSize = 13.sp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = { viewModel.playEpisode(uiState.currentEpisode) },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = AccentWhite,
                            contentColor = AccentBlack
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(text = "Coba Lagi", fontWeight = FontWeight.Bold)
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Black.copy(alpha = 0.85f), Color.Transparent)
                    )
                )
                .statusBarsPadding()
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier
                        .size(38.dp)
                        .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                        .border(1.dp, CardBorderDark, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                        contentDescription = "Kembali",
                        tint = AccentWhite,
                        modifier = Modifier.size(20.dp)
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = uiState.title.ifBlank { "PineDrama Serial" },
                        color = TextPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "Episode ${uiState.currentEpisode} / ${uiState.totalEpisodes.coerceAtLeast(1)}",
                        color = TextSecondary,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.9f))
                    )
                )
                .navigationBarsPadding()
                .padding(horizontal = 16.dp, vertical = 14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = { viewModel.playPrevious() },
                    enabled = uiState.currentEpisode > 1,
                    modifier = Modifier
                        .size(42.dp)
                        .background(Color.Black.copy(alpha = 0.6f), CircleShape)
                        .border(1.dp, CardBorderDark, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.SkipPrevious,
                        contentDescription = "Sebelumnya",
                        tint = if (uiState.currentEpisode > 1) AccentWhite else TextMuted
                    )
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Row(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(AccentWhite)
                            .clickable { showEpisodeSheet = true }
                            .padding(horizontal = 18.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.FormatListNumbered,
                            contentDescription = "Pilih Episode",
                            tint = AccentBlack,
                            modifier = Modifier.size(18.dp)
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Text(
                            text = "Episode ${uiState.currentEpisode}",
                            color = AccentBlack,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    PlaybackTimeControls(player = exoPlayer)
                }

                IconButton(
                    onClick = { viewModel.playNext() },
                    enabled = uiState.currentEpisode < uiState.totalEpisodes,
                    modifier = Modifier
                        .size(42.dp)
                        .background(Color.Black.copy(alpha = 0.6f), CircleShape)
                        .border(1.dp, CardBorderDark, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.SkipNext,
                        contentDescription = "Berikutnya",
                        tint = if (uiState.currentEpisode < uiState.totalEpisodes) AccentWhite else TextMuted
                    )
                }
            }
        }

        if (showEpisodeSheet) {
            val sheetState = rememberModalBottomSheetState()
            ModalBottomSheet(
                onDismissRequest = { showEpisodeSheet = false },
                sheetState = sheetState,
                containerColor = SurfaceDark,
                dragHandle = { BottomSheetDefaults.DragHandle(color = BorderSubtle) }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = "Pilih Episode",
                        color = TextPrimary,
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 12.dp)
                    )

                    val episodesCount = uiState.totalEpisodes.coerceAtLeast(uiState.episodes.size).coerceAtLeast(1)
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(5),
                        contentPadding = PaddingValues(bottom = 24.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.height(320.dp)
                    ) {
                        items((1..episodesCount).toList()) { epNum ->
                            val isCurrent = epNum == uiState.currentEpisode

                            Box(
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(if (isCurrent) AccentWhite else SurfaceCard)
                                    .border(
                                        1.dp,
                                        if (isCurrent) AccentWhite else BorderSubtle,
                                        RoundedCornerShape(10.dp)
                                    )
                                    .clickable {
                                        viewModel.playEpisode(epNum)
                                        showEpisodeSheet = false
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "$epNum",
                                    color = if (isCurrent) AccentBlack else TextPrimary,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
