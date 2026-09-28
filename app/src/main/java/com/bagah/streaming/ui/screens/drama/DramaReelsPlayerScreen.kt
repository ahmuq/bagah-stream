package com.bagah.streaming.ui.screens.drama

import android.net.Uri
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.OptIn
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.FormatListNumbered
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.BottomSheetDefaults
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.media3.common.MediaItem
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.ui.PlayerView
import androidx.compose.foundation.border
import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.player.DramaBoxDecryptDataSource
import com.bagah.streaming.data.player.DramaBoxKeyHolder
import com.bagah.streaming.ui.theme.AccentBlack
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceCard
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.SurfaceElevated
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

import kotlinx.coroutines.launch

@OptIn(UnstableApi::class, ExperimentalMaterial3Api::class)
/** Kualitas default DramaBox yang diminta; fallback ke best_url bila tidak ada. */
private const val DEFAULT_DRAMA_QUALITY = "720"

@Composable
fun DramaReelsPlayerScreen(
    bookId: String,
    initialIndex: Int = 0,
    viewModel: DramaReelsViewModel = viewModel(
        key = bookId,
        factory = DramaReelsViewModel.Factory(bookId)
    ),
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val uiState by viewModel.uiState.collectAsState()

    var showEpisodeSheet by remember { mutableStateOf(false) }

    if (uiState.isLoading) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                CircularProgressIndicator(
                    color = AccentWhite,
                    strokeWidth = 2.dp,
                    modifier = Modifier.size(36.dp)
                )
                Spacer(modifier = Modifier.height(14.dp))
                Text(text = "Memuat episode drama...", color = TextSecondary, fontSize = 13.sp)
            }

        }
        return
    }

    val episodes = uiState.episodes
    if (episodes.isEmpty()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = uiState.errorMessage ?: "Episode tidak ditemukan", color = TextPrimary, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(16.dp))
                IconButton(onClick = onBackClick) {
                    Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "Kembali", tint = TextPrimary)
                }
            }
        }
        return
    }

    val pagerState = rememberPagerState(
        initialPage = initialIndex.coerceIn(0, episodes.size - 1),
        pageCount = { episodes.size }
    )

    // ExoPlayer with DramaBox decrypting data source. The AES key arrives per
    // episode, so the data source reads it from a holder that the effect updates.
    val keyHolder = remember { DramaBoxKeyHolder() }
    val exoPlayer = remember {
        val decryptFactory = DramaBoxDecryptDataSource.Factory(NetworkClient.okHttpClient, keyHolder)
        ExoPlayer.Builder(context)
            .setMediaSourceFactory(
                DefaultMediaSourceFactory(context).setDataSourceFactory(decryptFactory)
            )
            .build()
            .apply {
                repeatMode = Player.REPEAT_MODE_OFF
                playWhenReady = true
            }
    }

    var isPlaying by remember { mutableStateOf(true) }
    var isLiked by remember { mutableStateOf(false) }
    var playbackError by remember { mutableStateOf<String?>(null) }

    // Auto-advance when video ends
    DisposableEffect(exoPlayer) {
        val listener = object : Player.Listener {
            override fun onPlaybackStateChanged(state: Int) {
                if (state == Player.STATE_ENDED) {
                    if (pagerState.currentPage < episodes.size - 1) {
                        scope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    }
                }
            }

            override fun onIsPlayingChanged(playing: Boolean) {
                isPlaying = playing
            }

            override fun onPlayerError(error: PlaybackException) {
                playbackError = error.localizedMessage ?: "Gagal memutar video"
            }
        }
        exoPlayer.addListener(listener)
        onDispose {
            exoPlayer.removeListener(listener)
            exoPlayer.release()
        }
    }

    // Fetch the stream URL + key for the active episode, then hand it to the player.
    LaunchedEffect(pagerState.currentPage, episodes) {
        val episode = episodes.getOrNull(pagerState.currentPage) ?: return@LaunchedEffect
        playbackError = null
        val result = viewModel.getStream(episode.episodeNum)
        result.onSuccess { stream ->
            keyHolder.keyHex = stream.keyHex
            val url = stream.preferredUrl(DEFAULT_DRAMA_QUALITY)
            if (url.isNotBlank()) {
                exoPlayer.setMediaItem(MediaItem.fromUri(Uri.parse(url)))
                exoPlayer.prepare()
                exoPlayer.play()
            } else {
                playbackError = "URL video tidak tersedia"
            }
        }.onFailure { err ->
            playbackError = err.localizedMessage ?: "Gagal memuat video"
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Vertical Reels Pager
        VerticalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) { page ->
            val isCurrentPage = pagerState.currentPage == page
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        if (exoPlayer.isPlaying) {
                            exoPlayer.pause()
                        } else {
                            exoPlayer.play()
                        }
                    }
            ) {
                if (isCurrentPage) {
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
                        modifier = Modifier.fillMaxSize()
                    )
                }

                // Pause indicator
                if (isCurrentPage && !isPlaying) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(72.dp)
                            .background(Color.Black.copy(alpha = 0.5f), CircleShape),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Rounded.PlayArrow,
                            contentDescription = "Putar",
                            tint = TextPrimary,
                            modifier = Modifier.size(42.dp)
                        )
                    }
                }
            }
        }

        // Top Back Button & Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .statusBarsPadding()
                .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = onBackClick,
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Black.copy(alpha = 0.5f), CircleShape)
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                    contentDescription = "Kembali",
                    tint = TextPrimary
                )
            }
            Spacer(modifier = Modifier.width(12.dp))
            val currentEpisode = episodes.getOrNull(pagerState.currentPage)
            Text(
                text = "${currentEpisode?.title ?: "Episode"} • ${pagerState.currentPage + 1}/${episodes.size}",
                color = TextPrimary,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold
            )
        }

        // Right Side Actions (Like, Episode Drawer)
        Column(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 120.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Like Button
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(
                    onClick = { isLiked = !isLiked },
                    modifier = Modifier
                        .size(46.dp)
                        .background(Color.Black.copy(alpha = 0.6f), CircleShape)
                        .border(1.dp, BorderSubtle, CircleShape)
                ) {
                    Icon(
                        imageVector = if (isLiked) Icons.Rounded.Favorite else Icons.Rounded.FavoriteBorder,
                        contentDescription = "Suka",
                        tint = AccentWhite,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = if (isLiked) "Disukai" else "Suka", color = TextPrimary, fontSize = 11.sp)
            }

            // Episode List Button
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(
                    onClick = { showEpisodeSheet = true },
                    modifier = Modifier
                        .size(46.dp)
                        .background(AccentWhite, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.FormatListNumbered,
                        contentDescription = "Daftar Episode",
                        tint = AccentBlack,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = "Episode", color = TextPrimary, fontSize = 11.sp)
            }
        }

        // Bottom Info Bar
        val activeEpisode = episodes.getOrNull(pagerState.currentPage)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black.copy(alpha = 0.7f),
                            Color.Black.copy(alpha = 0.95f)
                        )
                    )
                )
                .navigationBarsPadding()
                .padding(horizontal = 20.dp, vertical = 16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = activeEpisode?.title ?: "Episode",
                        color = TextPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(
                        text = "Geser ke atas untuk episode berikutnya",
                        color = TextMuted,
                        fontSize = 11.sp
                    )
                }

                // Quick Episode Sheet trigger
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .background(SurfaceDark)
                        .border(1.dp, BorderSubtle, RoundedCornerShape(8.dp))
                        .clickable { showEpisodeSheet = true }
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = "${pagerState.currentPage + 1} / ${episodes.size} EP",
                        color = TextPrimary,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        // Episode Modal Bottom Sheet
        if (showEpisodeSheet) {
            val sheetState = rememberModalBottomSheetState()
            ModalBottomSheet(
                onDismissRequest = { showEpisodeSheet = false },
                sheetState = sheetState,
                containerColor = SurfaceDark,
                dragHandle = { BottomSheetDefaults.DragHandle() }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = "Pilih Episode Drama",
                        color = TextPrimary,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "Total ${episodes.size} Episode Tersedia",
                        color = TextMuted,
                        fontSize = 12.sp
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(5),
                        contentPadding = PaddingValues(bottom = 32.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.height(350.dp)
                    ) {
                        itemsIndexed(episodes) { index, _ ->
                            val isSelected = pagerState.currentPage == index
                            Box(
                                modifier = Modifier
                                    .size(54.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(
                                        if (isSelected) AccentWhite else SurfaceCard
                                    )
                                    .border(
                                        width = 1.dp,
                                        color = if (isSelected) AccentWhite else BorderSubtle,
                                        shape = RoundedCornerShape(10.dp)
                                    )
                                    .clickable {
                                        scope.launch {
                                            showEpisodeSheet = false
                                            pagerState.scrollToPage(index)
                                        }
                                    },
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "${index + 1}",
                                    color = if (isSelected) AccentBlack else TextSecondary,
                                    fontSize = 14.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

