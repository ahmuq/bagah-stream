package com.bagah.streaming.ui.screens.melolo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.ui.components.ErrorBlock
import com.bagah.streaming.ui.components.LoadingBlock
import com.bagah.streaming.ui.components.PlatformHeader
import com.bagah.streaming.ui.components.SimpleMediaCard
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.TextMuted

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MeloloHomeScreen(
    onSeriesClick: (String) -> Unit,
    onSearchClick: () -> Unit,
    viewModel: MeloloHomeViewModel = viewModel()
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
                uiState.isLoading && !isRefreshing -> LoadingBlock("Memuat Melolo...")

                uiState.errorMessage != null && uiState.items.isEmpty() ->
                    ErrorBlock(uiState.errorMessage ?: "Terjadi kesalahan", viewModel::load)

                else -> LazyVerticalGrid(
                    columns = GridCells.Fixed(3),
                    contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 90.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    item(span = { GridItemSpan(maxLineSpan) }) {
                        PlatformHeader(
                            badge = "BAGAH MELOLO",
                            subtitle = "Serial pendek viral",
                            onSearchClick = onSearchClick
                        )
                    }

                    if (uiState.items.isEmpty()) {
                        item(span = { GridItemSpan(maxLineSpan) }) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 24.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "Belum ada serial Melolo",
                                    color = TextMuted,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }

                    items(uiState.items, key = { it.stableId() }) { item ->
                        SimpleMediaCard(
                            title = item.title,
                            cover = item.cover,
                            episodeCount = item.totalEpisodes,
                            badgeText = "MELOLO",
                            subtitle = item.tags.take(2).joinToString(" • ").ifBlank { null },
                            onClick = { onSeriesClick(item.stableId()) },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
    }
}
