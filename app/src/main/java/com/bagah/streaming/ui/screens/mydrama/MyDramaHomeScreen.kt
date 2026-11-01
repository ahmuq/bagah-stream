package com.bagah.streaming.ui.screens.mydrama

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.ui.components.ErrorBlock
import com.bagah.streaming.ui.components.LoadingBlock
import com.bagah.streaming.ui.components.PlatformHeader
import com.bagah.streaming.ui.components.SimpleMediaCard
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyDramaHomeScreen(
    onSeriesClick: (String) -> Unit,
    onSearchClick: () -> Unit,
    viewModel: MyDramaHomeViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    var isRefreshing by remember { mutableStateOf(false) }
    LaunchedEffect(uiState.isLoading) {
        if (!uiState.isLoading) isRefreshing = false
    }

    PullToRefreshBox(
        isRefreshing = isRefreshing,
        onRefresh = {
            isRefreshing = true
            viewModel.refresh()
        },
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(BgBlack)
        ) {
            when {
                uiState.isLoading && !isRefreshing -> LoadingBlock("Memuat MyDrama...")

                uiState.errorMessage != null && uiState.items.isEmpty() ->
                    ErrorBlock(uiState.errorMessage ?: "Terjadi kesalahan", viewModel::loadFeed)

                else -> {
                    val gridState = rememberLazyGridState()

                    LaunchedEffect(gridState) {
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
                                badge = "BAGAH MYDRAMA",
                                subtitle = "Drama pendek pilihan",
                                onSearchClick = onSearchClick
                            )
                        }

                        items(uiState.items, key = { it.stableId() }) { item ->
                            SimpleMediaCard(
                                title = item.displayTitle(),
                                cover = item.displayCover(),
                                episodeCount = item.totalEpisodes,
                                badgeText = "MYDRAMA",
                                onClick = { onSeriesClick(item.stableId()) },
                                modifier = Modifier.fillMaxWidth()
                            )
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
