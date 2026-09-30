package com.bagah.streaming.ui.screens.drama

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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.FormatListNumbered
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.ui.PlayerView
import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.player.DramaBoxDecryptDataSource
import com.bagah.streaming.data.player.DramaBoxKeyHolder
import com.bagah.streaming.ui.components.KeepScreenOn
import com.bagah.streaming.ui.components.PlaybackTimeControls
import com.bagah.streaming.ui.theme.AccentBlack
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceCard
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

private const val DEFAULT_DRAMA_QUALITY = "720"

@OptIn(UnstableApi::class, ExperimentalMaterial3Api::class)
@Composable
fun DramaReelsPlayerScreen(
    bookId: String,
    initialIndex: Int = 0,
    title: String = "",
    viewModel: DramaReelsViewModel = viewModel(
        key = bookId,
        factory = DramaReelsViewModel.Factory(bookId)
    ),
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsState()
    var showEpisodeSheet by remember { mutableStateOf(false) }

    KeepScreenOn()

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
                    Icon(
                        imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                        contentDescription = "Kembali",
                        tint = TextPrimary
                    )
                }
            }
        }
        return
    }

    var currentIndex by remember {
        mutableStateOf(initialIndex.coerceIn(0, episodes.size - 1))
    }
    var currentStreamUrl by remember { mutableStateOf<String?>(null) }
    var isLoadingStream by remember { mutableStateOf(true) }
    var streamError by remember { mutableStateOf<String?>(null) }
    var reloadKey by remember { mutableStateOf(0) }

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

    DisposableEffect(exoPlayer) {
        val listener = object : Player.Listener {
            override fun onPlaybackStateChanged(state: Int) {
                if (state == Player.STATE_ENDED && currentIndex < episodes.size - 1) {
                    currentIndex += 1
                }
            }
        }
        exoPlayer.addListener(listener)
        onDispose {
            exoPlayer.removeListener(listener)
            exoPlayer.release()
        }
    }

    LaunchedEffect(episodes, currentIndex, reloadKey) {
        val episode = episodes.getOrNull(currentIndex) ?: return@LaunchedEffect
        isLoadingStream = true
        streamError = null
        currentStreamUrl = null
        viewModel.getStream(episode.episodeNum)
            .onSuccess { stream ->
                keyHolder.keyHex = stream.keyHex
                val url = stream.preferredUrl(DEFAULT_DRAMA_QUALITY)
                if (url.isNotBlank()) {
                    exoPlayer.setMediaItem(MediaItem.fromUri(Uri.parse(url)))
                    exoPlayer.prepare()
                    exoPlayer.play()
                    currentStreamUrl = url
                } else {
                    streamError = "URL video tidak tersedia"
                }
            }
            .onFailure { err ->
                streamError = err.localizedMessage ?: "Gagal memuat video"
            }
        isLoadingStream = false
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        if (!currentStreamUrl.isNullOrBlank()) {
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

        if (isLoadingStream) {
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
                    Text(text = "Memuat Episode ${currentIndex + 1}...", color = TextSecondary, fontSize = 13.sp)
                }
            }
        }

        if (streamError != null && !isLoadingStream) {
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
                    Text(text = streamError ?: "", color = TextSecondary, fontSize = 13.sp)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = { reloadKey += 1 },
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
                        text = title.ifBlank { "DramaBox Serial" },
                        color = TextPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = "Episode ${currentIndex + 1} / ${episodes.size}",
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
                    onClick = { if (currentIndex > 0) currentIndex -= 1 },
                    enabled = currentIndex > 0,
                    modifier = Modifier
                        .size(42.dp)
                        .background(Color.Black.copy(alpha = 0.6f), CircleShape)
                        .border(1.dp, CardBorderDark, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.SkipPrevious,
                        contentDescription = "Sebelumnya",
                        tint = if (currentIndex > 0) AccentWhite else TextMuted
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
                            text = "Episode ${currentIndex + 1}",
                            color = AccentBlack,
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.height(6.dp))
                    PlaybackTimeControls(player = exoPlayer)
                }

                IconButton(
                    onClick = { if (currentIndex < episodes.size - 1) currentIndex += 1 },
                    enabled = currentIndex < episodes.size - 1,
                    modifier = Modifier
                        .size(42.dp)
                        .background(Color.Black.copy(alpha = 0.6f), CircleShape)
                        .border(1.dp, CardBorderDark, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.SkipNext,
                        contentDescription = "Berikutnya",
                        tint = if (currentIndex < episodes.size - 1) AccentWhite else TextMuted
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

                    LazyVerticalGrid(
                        columns = GridCells.Fixed(5),
                        contentPadding = PaddingValues(bottom = 24.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.height(320.dp)
                    ) {
                        items((1..episodes.size).toList()) { epNum ->
                            val isCurrent = (epNum - 1) == currentIndex
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
                                        currentIndex = epNum - 1
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
