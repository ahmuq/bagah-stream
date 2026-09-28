package com.bagah.streaming.ui.screens.goodshort

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.VideoLibrary
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.bagah.streaming.data.model.GoodShortEpisode
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

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun GoodShortDetailScreen(
    seriesId: String,
    viewModel: GoodShortDetailViewModel = viewModel(),
    onBackClick: () -> Unit,
    onPlayEpisode: (seriesId: String, episodeNum: Int) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(seriesId) {
        viewModel.loadDetail(seriesId)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack)
    ) {
        if (uiState.isLoading) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CircularProgressIndicator(
                    color = AccentWhite,
                    strokeWidth = 2.dp,
                    modifier = Modifier.size(36.dp)
                )
                Spacer(modifier = Modifier.height(14.dp))
                Text(text = "Memuat detail serial...", color = TextSecondary, fontSize = 13.sp)
            }
        } else if (uiState.errorMessage != null && uiState.detail == null) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = uiState.errorMessage ?: "", color = TextSecondary, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(16.dp))
                Button(
                    onClick = { viewModel.loadDetail(seriesId) },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AccentWhite,
                        contentColor = AccentBlack
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(text = "Coba Lagi", fontWeight = FontWeight.SemiBold)
                }
            }
        } else {
            val detail = uiState.detail
            if (detail != null) {
                val effectiveSeriesId = detail.seriesId.ifBlank { seriesId }
                val episodes = uiState.episodes

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(bottom = 90.dp)
                ) {
                    // Header Bar
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
                                text = "Detail Serial GoodShort",
                                color = TextPrimary,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    // Drama Info Banner
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
                                } else {
                                    Box(
                                        modifier = Modifier
                                            .width(90.dp)
                                            .height(125.dp)
                                            .clip(RoundedCornerShape(10.dp))
                                            .background(SurfaceCard),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(
                                            imageVector = Icons.Rounded.VideoLibrary,
                                            contentDescription = null,
                                            tint = TextMuted,
                                            modifier = Modifier.size(32.dp)
                                        )
                                    }
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

                                    val epCount = if (detail.totalEpisodes > 0) detail.totalEpisodes else episodes.size
                                    Box(
                                        modifier = Modifier
                                            .background(
                                                color = Color.Black.copy(alpha = 0.7f),
                                                shape = RoundedCornerShape(4.dp)
                                            )
                                            .border(0.5.dp, CardBorderDark, RoundedCornerShape(4.dp))
                                            .padding(horizontal = 7.dp, vertical = 3.dp)
                                    ) {
                                        Text(
                                            text = "$epCount Episode",
                                            color = AccentWhite,
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }

                                    if (!detail.author.isNullOrBlank()) {
                                        Spacer(modifier = Modifier.height(4.dp))
                                        Text(
                                            text = "Penulis: ${detail.author}",
                                            color = TextMuted,
                                            fontSize = 11.sp
                                        )
                                    }

                                    if (detail.category.isNotEmpty()) {
                                        Spacer(modifier = Modifier.height(6.dp))
                                        FlowRow(
                                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                                            verticalArrangement = Arrangement.spacedBy(4.dp)
                                        ) {
                                            detail.category.take(3).forEach { cat ->
                                                Box(
                                                    modifier = Modifier
                                                        .background(
                                                            Color.White.copy(alpha = 0.08f),
                                                            RoundedCornerShape(4.dp)
                                                        )
                                                        .padding(horizontal = 6.dp, vertical = 2.dp)
                                                ) {
                                                    Text(
                                                        text = cat,
                                                        color = TextSecondary,
                                                        fontSize = 10.sp
                                                    )
                                                }
                                            }
                                        }
                                    }

                                    if (detail.description.isNotBlank()) {
                                        Spacer(modifier = Modifier.height(8.dp))
                                        Text(
                                            text = detail.description,
                                            color = TextSecondary,
                                            fontSize = 11.sp,
                                            maxLines = 3,
                                            overflow = TextOverflow.Ellipsis,
                                            lineHeight = 15.sp
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.height(14.dp))

                            // Play Button
                            Button(
                                onClick = { onPlayEpisode(effectiveSeriesId, 1) },
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
                                Spacer(modifier = Modifier.width(6.dp))
                                Text(
                                    text = "Mulai Nonton Episode 1",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }

                    // Episodes Section Header
                    item {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 12.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Daftar Episode (${if (episodes.isNotEmpty()) episodes.size else detail.totalEpisodes})",
                                color = TextPrimary,
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Pilih untuk Memutar",
                                color = TextMuted,
                                fontSize = 11.sp
                            )
                        }
                    }

                    // If episodes list is loaded from getEpisodes
                    if (episodes.isNotEmpty()) {
                        items(episodes) { ep ->
                            GoodShortEpisodeRow(
                                episode = ep,
                                onClick = { onPlayEpisode(effectiveSeriesId, ep.episodeNum) }
                            )
                        }
                    } else {
                        // Fallback to generated episode list if getEpisodes returned empty
                        val total = detail.totalEpisodes.coerceAtLeast(1)
                        items(total) { idx ->
                            val epNum = idx + 1
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp, vertical = 4.dp)
                                    .clip(RoundedCornerShape(10.dp))
                                    .background(SurfaceDark)
                                    .border(1.dp, BorderSubtle, RoundedCornerShape(10.dp))
                                    .clickable { onPlayEpisode(effectiveSeriesId, epNum) }
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
                                            .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                                            .border(0.5.dp, CardBorderDark, CircleShape),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Text(
                                            text = "$epNum",
                                            color = AccentWhite,
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    }
                                    Text(
                                        text = "Episode $epNum",
                                        color = TextPrimary,
                                        fontSize = 13.sp,
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                                Icon(
                                    imageVector = Icons.Rounded.PlayArrow,
                                    contentDescription = "Putar",
                                    tint = TextSecondary,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun GoodShortEpisodeRow(
    episode: GoodShortEpisode,
    onClick: () -> Unit
) {
    val durationText = if (episode.duration > 0) {
        val m = episode.duration / 60
        val s = episode.duration % 60
        "%d:%02d".format(m, s)
    } else null

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceDark)
            .border(1.dp, BorderSubtle, RoundedCornerShape(10.dp))
            .clickable(onClick = onClick)
            .padding(horizontal = 14.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .size(34.dp)
                    .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                    .border(0.5.dp, CardBorderDark, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "${episode.episodeNum}",
                    color = AccentWhite,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column {
                Text(
                    text = if (episode.title.isNotBlank()) "Episode ${episode.title}" else "Episode ${episode.episodeNum}",
                    color = TextPrimary,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                if (durationText != null) {
                    Text(
                        text = "Durasi: $durationText",
                        color = TextMuted,
                        fontSize = 10.sp
                    )
                }
            }
        }

        if (episode.locked) {
            Icon(
                imageVector = Icons.Rounded.Lock,
                contentDescription = "Terkunci",
                tint = TextMuted,
                modifier = Modifier.size(18.dp)
            )
        } else {
            Icon(
                imageVector = Icons.Rounded.PlayArrow,
                contentDescription = "Putar",
                tint = TextSecondary,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}
