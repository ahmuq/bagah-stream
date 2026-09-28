package com.bagah.streaming.ui.screens.goodshort

import android.net.Uri
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.OptIn
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.aspectRatio
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
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.FormatListNumbered
import androidx.compose.material.icons.rounded.Lock
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
import androidx.media3.ui.PlayerView
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

@OptIn(UnstableApi::class, ExperimentalMaterial3Api::class)
@Composable
fun GoodShortPlayerScreen(
    seriesId: String,
    initialEpisode: Int = 1,
    viewModel: GoodShortPlayerViewModel = viewModel(),
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsState()
    var showEpisodeSheet by remember { mutableStateOf(false) }

    LaunchedEffect(seriesId, initialEpisode) {
        viewModel.initPlayer(seriesId, initialEpisode)
    }

    val exoPlayer = remember {
        ExoPlayer.Builder(context).build().apply {
            playWhenReady = true
            repeatMode = Player.REPEAT_MODE_ONE
        }
    }

    DisposableEffect(Unit) {
        onDispose {
            exoPlayer.release()
        }
    }

    // Update MediaItem when stream URL changes
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
        // Video Surface
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

        // Loading Overlay
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

        // Error & Locked Overlay
        if (uiState.errorMessage != null && !uiState.isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(alpha = 0.88f)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(32.dp)
                ) {
                    if (uiState.isLocked || uiState.errorMessage?.contains("terkunci", ignoreCase = true) == true) {
                        Box(
                            modifier = Modifier
                                .size(56.dp)
                                .background(SurfaceDark, CircleShape)
                                .border(1.dp, BorderSubtle, CircleShape),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Lock,
                                contentDescription = "Terkunci",
                                tint = AccentWhite,
                                modifier = Modifier.size(28.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                    }

                    Text(
                        text = uiState.errorMessage ?: "",
                        color = TextPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Button(
                            onClick = { showEpisodeSheet = true },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = AccentWhite,
                                contentColor = AccentBlack
                            ),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(text = "Pilih Episode Lain", fontWeight = FontWeight.Bold)
                        }

                        Button(
                            onClick = { viewModel.playEpisode(uiState.currentEpisode) },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = SurfaceElevated,
                                contentColor = TextPrimary
                            ),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(text = "Coba Lagi", fontWeight = FontWeight.Medium)
                        }
                    }
                }
            }
        }

        // Top Gradient Scrim & Top Controls
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
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.weight(1f)
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
                    Column {
                        Text(
                            text = uiState.seriesTitle.ifBlank { "GoodShort Serial" },
                            color = TextPrimary,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                        Text(
                            text = "Episode ${uiState.currentEpisode} / ${uiState.totalEpisodes.coerceAtLeast(1)}",
                            color = TextSecondary,
                            fontSize = 12.sp
                        )
                    }
                }

                // Episode List Trigger Button
                IconButton(
                    onClick = { showEpisodeSheet = true },
                    modifier = Modifier
                        .size(38.dp)
                        .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                        .border(1.dp, CardBorderDark, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.FormatListNumbered,
                        contentDescription = "Daftar Episode",
                        tint = AccentWhite,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }

        // Bottom Gradient Scrim & Bottom Controls
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.85f))
                    )
                )
                .navigationBarsPadding()
                .padding(horizontal = 20.dp, vertical = 14.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Previous Episode Button
                IconButton(
                    onClick = { viewModel.playPrevious() },
                    enabled = uiState.currentEpisode > 1,
                    modifier = Modifier
                        .size(44.dp)
                        .background(
                            if (uiState.currentEpisode > 1) Color.Black.copy(alpha = 0.6f) else Color.Transparent,
                            CircleShape
                        )
                        .border(1.dp, CardBorderDark, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.SkipPrevious,
                        contentDescription = "Episode Sebelumnya",
                        tint = if (uiState.currentEpisode > 1) AccentWhite else TextMuted,
                        modifier = Modifier.size(24.dp)
                    )
                }

                // Middle Badge: Episode info
                Box(
                    modifier = Modifier
                        .background(Color.Black.copy(alpha = 0.6f), RoundedCornerShape(20.dp))
                        .border(1.dp, CardBorderDark, RoundedCornerShape(20.dp))
                        .clickable { showEpisodeSheet = true }
                        .padding(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = "Episode ${uiState.currentEpisode} dari ${uiState.totalEpisodes.coerceAtLeast(1)}",
                        color = AccentWhite,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium
                    )
                }

                // Next Episode Button
                IconButton(
                    onClick = { viewModel.playNext() },
                    enabled = uiState.currentEpisode < uiState.totalEpisodes,
                    modifier = Modifier
                        .size(44.dp)
                        .background(
                            if (uiState.currentEpisode < uiState.totalEpisodes) Color.Black.copy(alpha = 0.6f) else Color.Transparent,
                            CircleShape
                        )
                        .border(1.dp, CardBorderDark, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.SkipNext,
                        contentDescription = "Episode Selanjutnya",
                        tint = if (uiState.currentEpisode < uiState.totalEpisodes) AccentWhite else TextMuted,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }

    // Episodes Modal Bottom Sheet
    if (showEpisodeSheet) {
        val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
        ModalBottomSheet(
            onDismissRequest = { showEpisodeSheet = false },
            sheetState = sheetState,
            containerColor = SurfaceDark,
            contentColor = TextPrimary,
            dragHandle = { BottomSheetDefaults.DragHandle(color = BorderSubtle) }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Pilih Episode",
                        color = TextPrimary,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "${uiState.totalEpisodes.coerceAtLeast(1)} Episode",
                        color = TextMuted,
                        fontSize = 12.sp
                    )
                }

                val total = uiState.totalEpisodes.coerceAtLeast(1)
                LazyVerticalGrid(
                    columns = GridCells.Adaptive(minSize = 64.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                ) {
                    items(total) { idx ->
                        val epNum = idx + 1
                        val isSelected = epNum == uiState.currentEpisode
                        val episodeItem = uiState.episodes.firstOrNull { it.episodeNum == epNum }
                        val isLocked = episodeItem?.locked == true

                        Box(
                            modifier = Modifier
                                .aspectRatio(1f)
                                .clip(RoundedCornerShape(8.dp))
                                .background(
                                    when {
                                        isSelected -> AccentWhite
                                        isLocked -> Color.Black.copy(alpha = 0.5f)
                                        else -> SurfaceCard
                                    }
                                )
                                .border(
                                    1.dp,
                                    if (isSelected) AccentWhite else BorderSubtle,
                                    RoundedCornerShape(8.dp)
                                )
                                .clickable {
                                    showEpisodeSheet = false
                                    viewModel.playEpisode(epNum)
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            if (isLocked) {
                                Icon(
                                    imageVector = Icons.Rounded.Lock,
                                    contentDescription = "Terkunci",
                                    tint = TextMuted,
                                    modifier = Modifier.size(16.dp)
                                )
                            } else {
                                Text(
                                    text = "$epNum",
                                    color = if (isSelected) AccentBlack else TextPrimary,
                                    fontSize = 13.sp,
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
