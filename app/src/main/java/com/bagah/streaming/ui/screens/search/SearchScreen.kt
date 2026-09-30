package com.bagah.streaming.ui.screens.search

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.ui.components.AnimeCard
import com.bagah.streaming.ui.components.DramaCard
import com.bagah.streaming.ui.components.FlickReelsCard
import com.bagah.streaming.ui.components.FreeReelsCard
import com.bagah.streaming.ui.components.NetShortCard
import com.bagah.streaming.ui.components.ShortMaxCard
import com.bagah.streaming.ui.components.ReelShortCard
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.SurfaceElevated
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

@Composable
fun SearchScreen(
    viewModel: SearchViewModel = viewModel(),
    onAnimeClick: (url: String) -> Unit,
    onDramaClick: (bookId: String) -> Unit,
    onReelShortClick: (bookId: String) -> Unit = {},
    onFreeReelsClick: (seriesId: String) -> Unit = {},
    onFlickReelsClick: (seriesId: String) -> Unit = {},
    onShortMaxClick: (seriesId: String) -> Unit = {},
    onNetShortClick: (seriesId: String) -> Unit = {}
) {
    val uiState by viewModel.uiState.collectAsState()
    val focusManager = LocalFocusManager.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            // Search Input Field
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 16.dp, vertical = 12.dp)
            ) {
                TextField(
                    value = uiState.query,
                    onValueChange = { viewModel.onQueryChange(it) },
                    placeholder = {
                        Text(
                            text = when (uiState.selectedTab) {
                                0 -> "Cari anime..."
                                1 -> "Cari short drama..."
                                2 -> "Cari ReelShort..."
                                3 -> "Cari FreeReels..."
                                4 -> "Cari FlickReels..."
                                5 -> "Cari ShortMax..."
                                6 -> "Cari NetShort..."
                                else -> "Cari short drama..."
                            },
                            color = TextMuted,
                            fontSize = 14.sp
                        )
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Search,
                            contentDescription = "Search",
                            tint = AccentWhite
                        )
                    },
                    trailingIcon = {
                        if (uiState.query.isNotBlank()) {
                            IconButton(onClick = { viewModel.onQueryChange("") }) {
                                Icon(
                                    imageVector = Icons.Rounded.Clear,
                                    contentDescription = "Hapus",
                                    tint = TextMuted
                                )
                            }
                        }
                    },
                    singleLine = true,
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
                    keyboardActions = KeyboardActions(onSearch = {
                        focusManager.clearFocus()
                        viewModel.search()
                    }),
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = SurfaceDark,
                        unfocusedContainerColor = SurfaceDark,
                        focusedTextColor = TextPrimary,
                        unfocusedTextColor = TextPrimary,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        cursorColor = AccentWhite
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, BorderSubtle, RoundedCornerShape(12.dp))
                )
            }

            // Platform Filter Tabs
            ScrollableTabRow(
                selectedTabIndex = uiState.selectedTab,
                containerColor = BgBlack,
                contentColor = AccentWhite,
                edgePadding = 16.dp,
                indicator = { tabPositions ->
                    TabRowDefaults.SecondaryIndicator(
                        Modifier.tabIndicatorOffset(tabPositions[uiState.selectedTab]),
                        color = AccentWhite
                    )
                },
                divider = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(1.dp)
                            .background(BorderSubtle)
                    )
                }
            ) {
                Tab(
                    selected = uiState.selectedTab == 0,
                    onClick = { viewModel.onTabSelect(0) },
                    text = {
                        Text(
                            text = "Anime Play",
                            color = if (uiState.selectedTab == 0) TextPrimary else TextMuted,
                            fontWeight = if (uiState.selectedTab == 0) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
                Tab(
                    selected = uiState.selectedTab == 1,
                    onClick = { viewModel.onTabSelect(1) },
                    text = {
                        Text(
                            text = "Drama Box",
                            color = if (uiState.selectedTab == 1) TextPrimary else TextMuted,
                            fontWeight = if (uiState.selectedTab == 1) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
                Tab(
                    selected = uiState.selectedTab == 2,
                    onClick = { viewModel.onTabSelect(2) },
                    text = {
                        Text(
                            text = "ReelShort",
                            color = if (uiState.selectedTab == 2) TextPrimary else TextMuted,
                            fontWeight = if (uiState.selectedTab == 2) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
                Tab(
                    selected = uiState.selectedTab == 3,
                    onClick = { viewModel.onTabSelect(3) },
                    text = {
                        Text(
                            text = "FreeReels",
                            color = if (uiState.selectedTab == 3) TextPrimary else TextMuted,
                            fontWeight = if (uiState.selectedTab == 3) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
                Tab(
                    selected = uiState.selectedTab == 4,
                    onClick = { viewModel.onTabSelect(4) },
                    text = {
                        Text(
                            text = "FlickReels",
                            color = if (uiState.selectedTab == 4) TextPrimary else TextMuted,
                            fontWeight = if (uiState.selectedTab == 4) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
                Tab(
                    selected = uiState.selectedTab == 5,
                    onClick = { viewModel.onTabSelect(5) },
                    text = {
                        Text(
                            text = "ShortMax",
                            color = if (uiState.selectedTab == 5) TextPrimary else TextMuted,
                            fontWeight = if (uiState.selectedTab == 5) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
                Tab(
                    selected = uiState.selectedTab == 6,
                    onClick = { viewModel.onTabSelect(6) },
                    text = {
                        Text(
                            text = "NetShort",
                            color = if (uiState.selectedTab == 6) TextPrimary else TextMuted,
                            fontWeight = if (uiState.selectedTab == 6) FontWeight.Bold else FontWeight.Medium
                        )
                    }
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Search Results
            if (uiState.isSearching) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    CircularProgressIndicator(
                        color = AccentWhite,
                        strokeWidth = 2.dp,
                        modifier = Modifier.size(36.dp)
                    )
                }
            } else if (uiState.hasSearched) {
                val gridState = rememberLazyGridState()
                LaunchedEffect(gridState, uiState.selectedTab, uiState.page) {
                    snapshotFlow {
                        gridState.layoutInfo.visibleItemsInfo.lastOrNull()?.index ?: 0
                    }.collect { lastVisible ->
                        val total = gridState.layoutInfo.totalItemsCount
                        if (total > 0 && lastVisible >= total - 4) {
                            viewModel.loadMore()
                        }
                    }
                }
                val loadMoreFooter: @Composable () -> Unit = {
                    if (uiState.isLoadingMore) {
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

                when (uiState.selectedTab) {
                    0 -> {
                        if (uiState.animeResults.isEmpty()) {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(text = "Tidak ada anime yang cocok dengan \"${uiState.query}\"", color = TextMuted, fontSize = 13.sp)
                            }
                        } else {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(3),
                                state = gridState,
                                contentPadding = PaddingValues(start = 14.dp, end = 14.dp, bottom = 90.dp),
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                                verticalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                items(uiState.animeResults, key = { it.url }) { anime ->
                                    AnimeCard(anime = anime, onClick = { onAnimeClick(anime.url) })
                                }
                            }
                        }
                    }
                    1 -> {
                        if (uiState.dramaResults.isEmpty()) {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(text = "Tidak ada drama yang cocok dengan \"${uiState.query}\"", color = TextMuted, fontSize = 13.sp)
                            }
                        } else {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(2),
                                state = gridState,
                                contentPadding = PaddingValues(start = 14.dp, end = 14.dp, bottom = 90.dp),
                                horizontalArrangement = Arrangement.spacedBy(12.dp),
                                verticalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                items(uiState.dramaResults, key = { it.bookId }) { drama ->
                                    DramaCard(drama = drama, onClick = { onDramaClick(drama.bookId) })
                                }
                                item(span = { GridItemSpan(maxLineSpan) }) { loadMoreFooter() }
                            }
                        }
                    }
                    2 -> {
                        if (uiState.reelShortResults.isEmpty()) {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(text = "Tidak ada ReelShort yang cocok dengan \"${uiState.query}\"", color = TextMuted, fontSize = 13.sp)
                            }
                        } else {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(3),
                                state = gridState,
                                contentPadding = PaddingValues(start = 14.dp, end = 14.dp, bottom = 90.dp),
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                                verticalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                items(uiState.reelShortResults, key = { it.id }) { book ->
                                    ReelShortCard(book = book, onClick = { onReelShortClick(book.id) })
                                }
                                item(span = { GridItemSpan(maxLineSpan) }) { loadMoreFooter() }
                            }
                        }
                    }
                    3 -> {
                        if (uiState.freeReelsResults.isEmpty()) {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(text = "Tidak ada FreeReels yang cocok dengan \"${uiState.query}\"", color = TextMuted, fontSize = 13.sp)
                            }
                        } else {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(3),
                                state = gridState,
                                contentPadding = PaddingValues(start = 14.dp, end = 14.dp, bottom = 90.dp),
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                                verticalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                items(uiState.freeReelsResults, key = { it.stableId() }) { item ->
                                    FreeReelsCard(item = item, onClick = { onFreeReelsClick(item.seriesId) })
                                }
                            }
                        }
                    }
                    4 -> {
                        if (uiState.flickReelsResults.isEmpty()) {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(text = "Tidak ada FlickReels yang cocok dengan \"${uiState.query}\"", color = TextMuted, fontSize = 13.sp)
                            }
                        } else {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(3),
                                state = gridState,
                                contentPadding = PaddingValues(start = 14.dp, end = 14.dp, bottom = 90.dp),
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                                verticalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                items(uiState.flickReelsResults, key = { it.id }) { item ->
                                    FlickReelsCard(item = item, onClick = { onFlickReelsClick(item.id) })
                                }
                            }
                        }
                    }
                    5 -> {
                        if (uiState.shortMaxResults.isEmpty()) {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(text = "Tidak ada ShortMax yang cocok dengan \"${uiState.query}\"", color = TextMuted, fontSize = 13.sp)
                            }
                        } else {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(3),
                                state = gridState,
                                contentPadding = PaddingValues(start = 14.dp, end = 14.dp, bottom = 90.dp),
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                                verticalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                items(uiState.shortMaxResults, key = { it.stableId() }) { item ->
                                    ShortMaxCard(item = item, onClick = { onShortMaxClick(item.stableId()) })
                                }
                                item(span = { GridItemSpan(maxLineSpan) }) { loadMoreFooter() }
                            }
                        }
                    }
                    6 -> {
                        if (uiState.netShortResults.isEmpty()) {
                            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                                Text(text = "Tidak ada NetShort yang cocok dengan \"${uiState.query}\"", color = TextMuted, fontSize = 13.sp)
                            }
                        } else {
                            LazyVerticalGrid(
                                columns = GridCells.Fixed(3),
                                state = gridState,
                                contentPadding = PaddingValues(start = 14.dp, end = 14.dp, bottom = 90.dp),
                                horizontalArrangement = Arrangement.spacedBy(10.dp),
                                verticalArrangement = Arrangement.spacedBy(14.dp)
                            ) {
                                items(uiState.netShortResults, key = { it.stableId() }) { item ->
                                    NetShortCard(item = item, onClick = { onNetShortClick(item.stableId()) })
                                }
                                item(span = { GridItemSpan(maxLineSpan) }) { loadMoreFooter() }
                            }
                        }
                    }
                }
            } else {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(text = "Ketik kata kunci untuk mencari", color = TextMuted, fontSize = 13.sp)
                }
            }
        }
    }
}

