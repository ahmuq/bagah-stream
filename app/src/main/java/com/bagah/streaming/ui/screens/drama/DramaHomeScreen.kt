package com.bagah.streaming.ui.screens.drama

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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.R
import com.bagah.streaming.ui.components.DramaCard
import com.bagah.streaming.ui.components.FilterChip
import com.bagah.streaming.ui.components.FilterChipRow
import com.bagah.streaming.ui.theme.AccentBlack
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.SurfaceElevated
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DramaHomeScreen(
    viewModel: DramaHomeViewModel = viewModel(),
    onDramaClick: (bookId: String, title: String) -> Unit,
    onSearchClick: () -> Unit
) {
    val categories = listOf("Beranda", "Untukmu", "Kategori", "Peringkat")
    val uiState by viewModel.uiState.collectAsState()
    var isRefreshing by remember { mutableStateOf(false) }

    LaunchedEffect(uiState.isLoading) {
        if (!uiState.isLoading) isRefreshing = false
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
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
                            text = "BAGAH DRAMA",
                            color = TextPrimary,
                            fontSize = 17.sp,
                            fontWeight = FontWeight.Black,
                            letterSpacing = 0.5.sp
                        )
                        Text(
                            text = "Serial Pendek Vertikal Terlengkap",
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

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState())
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                categories.forEachIndexed { index, title ->
                    val isSelected = uiState.selectedCategoryIndex == index
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .clickable { viewModel.selectCategory(index) }
                            .background(
                                color = if (isSelected) AccentWhite else SurfaceDark
                            )
                            .border(
                                width = 1.dp,
                                color = if (isSelected) AccentWhite else BorderSubtle,
                                shape = RoundedCornerShape(20.dp)
                            )
                            .padding(horizontal = 16.dp, vertical = 7.dp)
                    ) {
                        Text(
                            text = title,
                            color = if (isSelected) AccentBlack else TextSecondary,
                            fontSize = 12.sp,
                            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(4.dp))

            when (uiState.selectedCategoryIndex) {
                0 -> Column {
                    FilterChipRow(
                        options = DRAMA_STATUS,
                        selectedValue = uiState.statusFilter,
                        onSelect = { viewModel.setStatusFilter(it) },
                        leadingLabel = "Status",
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )
                    if (uiState.genres.isNotEmpty()) {
                        val genreChips = listOf(FilterChip("Semua", "All")) +
                            uiState.genres.map { FilterChip(it.display, it.value) }
                        FilterChipRow(
                            options = genreChips,
                            selectedValue = uiState.selectedGenre,
                            onSelect = { viewModel.setGenre(it) },
                            leadingLabel = "Genre",
                            modifier = Modifier.padding(horizontal = 16.dp)
                        )
                    }
                }
                3 -> FilterChipRow(
                    options = DRAMA_RANK_TYPES,
                    selectedValue = uiState.rankType.toString(),
                    onSelect = { viewModel.setRankType(it.toIntOrNull() ?: 1) },
                    leadingLabel = "Urutan",
                    modifier = Modifier.padding(horizontal = 16.dp)
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            if (uiState.isLoading && !isRefreshing) {
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
                    Text(text = "Memuat daftar drama...", color = TextSecondary, fontSize = 13.sp)
                }
            } else if (uiState.errorMessage != null && uiState.dramaList.isEmpty()) {
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
                        onClick = { viewModel.selectCategory(uiState.selectedCategoryIndex) },
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
                val gridState = rememberLazyGridState()

                LaunchedEffect(uiState.selectedCategoryIndex) {
                    gridState.scrollToItem(0)
                }

                LaunchedEffect(gridState, uiState.dramaList.size) {
                    snapshotFlow {
                        gridState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
                    }.collect { lastVisible ->
                        val total = gridState.layoutInfo.totalItemsCount
                        if (total > 0 && lastVisible >= total - 4) {
                            viewModel.loadMore()
                        }
                    }
                }

                PullToRefreshBox(
                    isRefreshing = isRefreshing,
                    onRefresh = {
                        isRefreshing = true
                        viewModel.refresh()
                    },
                    modifier = Modifier.fillMaxSize()
                ) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    state = gridState,
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 90.dp),
                    horizontalArrangement = Arrangement.spacedBy(14.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    if (uiState.sections.isNotEmpty()) {
                        uiState.sections.forEachIndexed { sectionIndex, section ->
                            item(
                                span = { GridItemSpan(maxLineSpan) },
                                key = "section-$sectionIndex"
                            ) {
                                Column(modifier = Modifier.padding(top = 6.dp, bottom = 2.dp)) {
                                    Text(
                                        text = section.title.ifBlank { "Kategori" },
                                        color = TextPrimary,
                                        fontSize = 15.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    if (section.subtitle.isNotBlank()) {
                                        Text(
                                            text = section.subtitle,
                                            color = TextMuted,
                                            fontSize = 11.sp
                                        )
                                    }
                                }
                            }
                            items(section.items, key = { "s$sectionIndex-${it.bookId}" }) { drama ->
                                DramaCard(
                                    drama = drama,
                                    onClick = { if (drama.bookId.isNotBlank()) onDramaClick(drama.bookId, drama.title) },
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }
                        }
                    } else {
                        items(uiState.dramaList, key = { it.bookId }) { drama ->
                            DramaCard(
                                drama = drama,
                                onClick = { if (drama.bookId.isNotBlank()) onDramaClick(drama.bookId, drama.title) },
                                modifier = Modifier.fillMaxWidth()
                            )
                        }
                    }

                    if (uiState.isLoadingMore) {
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
                }
                }
            }
        }
    }
}

private val DRAMA_STATUS = listOf(
    FilterChip("Semua", "All"),
    FilterChip("Tamat", "1"),
    FilterChip("Berjalan", "2")
)

private val DRAMA_RANK_TYPES = listOf(
    FilterChip("Trending", "1"),
    FilterChip("Populer", "2"),
    FilterChip("Terbaru", "3")
)
