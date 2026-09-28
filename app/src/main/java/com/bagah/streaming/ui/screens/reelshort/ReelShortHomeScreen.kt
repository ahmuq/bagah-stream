package com.bagah.streaming.ui.screens.reelshort

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoAwesome
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.VideoLibrary
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.bagah.streaming.R
import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.ui.components.ReelShortCard
import com.bagah.streaming.ui.theme.AccentBlack
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

@Composable
fun ReelShortHomeScreen(
    viewModel: ReelShortHomeViewModel = viewModel(),
    onBookClick: (bookId: String) -> Unit,
    onSearchClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

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
                Text(text = "Memuat ReelShort Drama...", color = TextSecondary, fontSize = 13.sp)
            }
        } else if (uiState.errorMessage != null && uiState.allBooks.isEmpty()) {
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
                    onClick = { viewModel.loadData() },
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
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 90.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                // 1. Header Bar
                item(span = { GridItemSpan(maxLineSpan) }) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .statusBarsPadding()
                            .padding(vertical = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_logo),
                                contentDescription = "Logo Bagah",
                                modifier = Modifier.size(32.dp)
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Column {
                                Text(
                                    text = "BAGAH REELSHORT",
                                    color = TextPrimary,
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Black,
                                    letterSpacing = 0.5.sp
                                )
                                Text(
                                    text = "Platform Serial Pendek Vertikal",
                                    color = TextMuted,
                                    fontSize = 11.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }

                        IconButton(
                            onClick = onSearchClick,
                            modifier = Modifier
                                .size(38.dp)
                                .background(SurfaceDark, CircleShape)
                                .border(1.dp, BorderSubtle, CircleShape)
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Search,
                                contentDescription = "Pencarian",
                                tint = AccentWhite,
                                modifier = Modifier.size(19.dp)
                            )
                        }
                    }
                }

                // 2. Spotlight Hero Carousel (HorizontalPager)
                if (uiState.spotlightBooks.isNotEmpty()) {
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        val spotlight = uiState.spotlightBooks
                        val pagerState = rememberPagerState(pageCount = { spotlight.size })

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                        ) {
                            HorizontalPager(
                                state = pagerState,
                                pageSpacing = 12.dp,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(230.dp)
                            ) { page ->
                                val book = spotlight[page]
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .clip(RoundedCornerShape(16.dp))
                                        .background(SurfaceDark)
                                        .border(1.dp, BorderSubtle, RoundedCornerShape(16.dp))
                                        .clickable { onBookClick(book.id) }
                                ) {
                                    AsyncImage(
                                        model = book.cover,
                                        contentDescription = book.title,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier.fillMaxSize()
                                    )

                                    // Gradient scrim
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .background(
                                                Brush.verticalGradient(
                                                    colors = listOf(
                                                        Color.Transparent,
                                                        Color.Black.copy(alpha = 0.5f),
                                                        Color.Black.copy(alpha = 0.95f)
                                                    )
                                                )
                                            )
                                    )

                                    // Content overlay
                                    Column(
                                        modifier = Modifier
                                            .align(Alignment.BottomStart)
                                            .padding(14.dp)
                                    ) {
                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                                        ) {
                                            Box(
                                                modifier = Modifier
                                                    .background(
                                                        Color.Black.copy(alpha = 0.8f),
                                                        RoundedCornerShape(4.dp)
                                                    )
                                                    .border(0.5.dp, CardBorderDark, RoundedCornerShape(4.dp))
                                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                                            ) {
                                                Text(
                                                    text = "REELSHORT ${page + 1}/${spotlight.size}",
                                                    color = AccentWhite,
                                                    fontSize = 9.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            }
                                            if (book.chapterCount != null && book.chapterCount > 0) {
                                                Text(
                                                    text = "${book.chapterCount} Episode",
                                                    color = TextMuted,
                                                    fontSize = 11.sp,
                                                    fontWeight = FontWeight.Medium
                                                )
                                            }
                                        }

                                        Spacer(modifier = Modifier.height(4.dp))

                                        Text(
                                            text = book.title,
                                            color = TextPrimary,
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold,
                                            maxLines = 1,
                                            overflow = TextOverflow.Ellipsis
                                        )

                                        if (!book.description.isNullOrBlank()) {
                                            Text(
                                                text = book.description,
                                                color = TextSecondary,
                                                fontSize = 11.sp,
                                                maxLines = 2,
                                                overflow = TextOverflow.Ellipsis,
                                                modifier = Modifier.padding(top = 2.dp, bottom = 8.dp)
                                            )
                                        } else {
                                            Spacer(modifier = Modifier.height(8.dp))
                                        }

                                        Row(
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .background(AccentWhite, RoundedCornerShape(8.dp))
                                                .padding(horizontal = 14.dp, vertical = 7.dp)
                                        ) {
                                            Icon(
                                                imageVector = Icons.Rounded.PlayArrow,
                                                contentDescription = "Putar",
                                                tint = AccentBlack,
                                                modifier = Modifier.size(18.dp)
                                            )
                                            Spacer(modifier = Modifier.width(4.dp))
                                            Text(
                                                text = "Tonton Sekarang",
                                                color = AccentBlack,
                                                fontSize = 12.sp,
                                                fontWeight = FontWeight.Bold
                                            )
                                        }
                                    }
                                }
                            }

                            // Carousel dots
                            if (spotlight.size > 1) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 10.dp),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    repeat(spotlight.size) { index ->
                                        val isCurrent = pagerState.currentPage == index
                                        Box(
                                            modifier = Modifier
                                                .padding(horizontal = 3.dp)
                                                .height(4.dp)
                                                .width(if (isCurrent) 18.dp else 5.dp)
                                                .clip(RoundedCornerShape(2.dp))
                                                .background(
                                                    if (isCurrent) AccentWhite else TextMuted.copy(alpha = 0.35f)
                                                )
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                // 3. For You Section (Horizontal Row)
                if (uiState.forYouBooks.isNotEmpty()) {
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        Column(modifier = Modifier.padding(top = 10.dp, bottom = 4.dp)) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(bottom = 10.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Rounded.AutoAwesome,
                                    contentDescription = null,
                                    tint = AccentWhite,
                                    modifier = Modifier.size(18.dp)
                                )
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "Rekomendasi Untuk Anda",
                                    color = TextPrimary,
                                    fontSize = 15.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            LazyRow(
                                horizontalArrangement = Arrangement.spacedBy(10.dp)
                            ) {
                                items(uiState.forYouBooks) { book ->
                                    ReelShortCard(book = book, onClick = { onBookClick(book.id) })
                                }
                            }
                        }
                    }
                }

                // 4. Category Tabs
                item(span = { GridItemSpan(maxLineSpan) }) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .horizontalScroll(rememberScrollState())
                            .padding(vertical = 10.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        uiState.tabs.forEach { tab ->
                            val isSelected = uiState.selectedTab == tab
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(20.dp))
                                    .background(if (isSelected) AccentWhite else SurfaceDark)
                                    .border(
                                        1.dp,
                                        if (isSelected) AccentWhite else BorderSubtle,
                                        RoundedCornerShape(20.dp)
                                    )
                                    .clickable { viewModel.selectTab(tab) }
                                    .padding(horizontal = 14.dp, vertical = 7.dp)
                            ) {
                                Text(
                                    text = tab,
                                    color = if (isSelected) AccentBlack else TextSecondary,
                                    fontSize = 12.sp,
                                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                                )
                            }
                        }
                    }
                }

                // 5. Grid of Books
                val books = uiState.currentDisplayList
                items(books) { book ->
                    ReelShortCard(
                        book = book,
                        onClick = { onBookClick(book.id) },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}
