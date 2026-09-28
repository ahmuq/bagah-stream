package com.bagah.streaming.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.PlayCircle
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import coil.compose.AsyncImage
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.DramaItem
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceCard
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.SurfaceElevated
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

@Composable
fun AnimeCard(
    anime: AnimeItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = SurfaceDark),
        modifier = modifier
            .width(138.dp)
            .clickable { onClick() }
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(0.7f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(SurfaceCard)
                    .border(1.dp, BorderSubtle, RoundedCornerShape(12.dp))
            ) {
                AsyncImage(
                    model = anime.cover,
                    contentDescription = anime.judul,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                // Top Badge (Score or Episode Tag)
                Box(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(6.dp)
                        .background(
                            color = Color.Black.copy(alpha = 0.85f),
                            shape = RoundedCornerShape(6.dp)
                        )
                        .border(0.5.dp, CardBorderDark, RoundedCornerShape(6.dp))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(3.dp)
                    ) {
                        if (!anime.score.isNullOrBlank()) {
                            Icon(
                                imageVector = Icons.Rounded.Star,
                                contentDescription = "Score",
                                tint = AccentWhite,
                                modifier = Modifier.size(11.dp)
                            )
                            Text(
                                text = anime.score,
                                color = TextPrimary,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )
                        } else if (!anime.lastch.isNullOrBlank()) {
                            Text(
                                text = anime.lastch,
                                color = TextSecondary,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        } else {
                            Text(
                                text = anime.type ?: "HD",
                                color = TextSecondary,
                                fontSize = 10.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }

                // Subtle Bottom Vignette for Poster
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(36.dp)
                        .align(Alignment.BottomCenter)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.75f))
                            )
                        )
                )
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = anime.judul,
                color = TextPrimary,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 16.sp,
                modifier = Modifier.padding(horizontal = 4.dp)
            )

            if (anime.genre.isNotEmpty()) {
                Text(
                    text = anime.genre.take(2).joinToString(" • "),
                    color = TextMuted,
                    fontSize = 10.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                )
            }
        }
    }
}

@Composable
fun DramaCard(
    drama: DramaItem,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = SurfaceDark),
        modifier = modifier
            .width(140.dp)
            .clickable { onClick() }
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(0.68f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(SurfaceCard)
                    .border(1.dp, BorderSubtle, RoundedCornerShape(12.dp))
            ) {
                AsyncImage(
                    model = drama.coverWap,
                    contentDescription = drama.bookName,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )

                // Monochrome Episode Count Badge
                Box(
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(6.dp)
                        .background(
                            color = Color.Black.copy(alpha = 0.85f),
                            shape = RoundedCornerShape(6.dp)
                        )
                        .border(0.5.dp, CardBorderDark, RoundedCornerShape(6.dp))
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                ) {
                    Text(
                        text = "${drama.chapterCount} EP",
                        color = AccentWhite,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                // Minimalist Play Icon Overlay
                Box(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(34.dp)
                        .background(Color.Black.copy(alpha = 0.6f), shape = RoundedCornerShape(17.dp))
                        .border(0.5.dp, CardBorderDark, RoundedCornerShape(17.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Rounded.PlayArrow,
                        contentDescription = "Tonton",
                        tint = AccentWhite,
                        modifier = Modifier.size(20.dp)
                    )
                }

                // Bottom Tag Gradient
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(35.dp)
                        .align(Alignment.BottomCenter)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.85f))
                            )
                        ),
                    contentAlignment = Alignment.BottomStart
                ) {
                    if (drama.tags.isNotEmpty()) {
                        Text(
                            text = drama.tags.first(),
                            color = TextSecondary,
                            fontSize = 9.sp,
                            fontWeight = FontWeight.SemiBold,
                            maxLines = 1,
                            modifier = Modifier.padding(horizontal = 6.dp, vertical = 4.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = drama.bookName,
                color = TextPrimary,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 16.sp,
                modifier = Modifier.padding(horizontal = 4.dp)
            )

            if (!drama.protagonist.isNullOrBlank()) {
                Text(
                    text = drama.protagonist,
                    color = TextMuted,
                    fontSize = 10.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                )
            }
        }
    }
}

@Composable
fun ReelShortCard(
    book: com.bagah.streaming.data.model.ReelShortBook,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = SurfaceDark),
        modifier = modifier
            .width(140.dp)
            .clickable { onClick() }
    ) {
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(0.68f)
                    .clip(RoundedCornerShape(12.dp))
                    .background(SurfaceCard)
                    .border(1.dp, BorderSubtle, RoundedCornerShape(12.dp))
            ) {
                if (book.book_pic.isNotBlank()) {
                    AsyncImage(
                        model = book.book_pic,
                        contentDescription = book.book_title,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                } else {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(
                                        SurfaceElevated,
                                        SurfaceDark
                                    )
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.padding(horizontal = 8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.PlayCircle,
                                contentDescription = null,
                                tint = AccentWhite.copy(alpha = 0.4f),
                                modifier = Modifier.size(36.dp)
                            )
                            Spacer(modifier = Modifier.height(6.dp))
                            Text(
                                text = "REELSHORT",
                                color = TextMuted,
                                fontSize = 9.sp,
                                fontWeight = FontWeight.Black,
                                letterSpacing = 1.sp
                            )
                        }
                    }
                }

                if (book.chapter_count != null && book.chapter_count > 0) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(6.dp)
                            .background(
                                color = Color.Black.copy(alpha = 0.85f),
                                shape = RoundedCornerShape(6.dp)
                            )
                            .border(0.5.dp, CardBorderDark, RoundedCornerShape(6.dp))
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = "${book.chapter_count} EP",
                            color = AccentWhite,
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                if (!book.rank_level.isNullOrBlank()) {
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopStart)
                            .padding(6.dp)
                            .background(
                                color = AccentWhite,
                                shape = RoundedCornerShape(6.dp)
                            )
                            .padding(horizontal = 6.dp, vertical = 2.dp)
                    ) {
                        Text(
                            text = book.rank_level,
                            color = Color.Black,
                            fontSize = 9.sp,
                            fontWeight = FontWeight.Black
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(34.dp)
                        .background(Color.Black.copy(alpha = 0.6f), shape = RoundedCornerShape(17.dp))
                        .border(0.5.dp, CardBorderDark, RoundedCornerShape(17.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Rounded.PlayArrow,
                        contentDescription = "Tonton",
                        tint = AccentWhite,
                        modifier = Modifier.size(20.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = book.book_title,
                color = TextPrimary,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                lineHeight = 16.sp,
                modifier = Modifier.padding(horizontal = 4.dp)
            )

            if (book.theme.isNotEmpty()) {
                Text(
                    text = book.theme.take(2).joinToString(" • "),
                    color = TextMuted,
                    fontSize = 10.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                )
            }
        }
    }
}

