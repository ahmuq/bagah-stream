package com.bagah.streaming.ui.screens.netshort

import androidx.compose.material3.pulltorefresh.PullToRefreshBox
import androidx.compose.runtime.LaunchedEffect
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
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.ui.components.ErrorBlock
import com.bagah.streaming.ui.components.LoadingBlock
import com.bagah.streaming.ui.components.NetShortCard
import com.bagah.streaming.ui.components.PlatformHeader
import com.bagah.streaming.ui.components.PlatformTabRow
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NetShortHomeScreen(
    viewModel: NetShortHomeViewModel = viewModel(),
    onSeriesClick: (seriesId: String) -> Unit,
    onSearchClick: () -> Unit
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
            uiState.isLoading && !isRefreshing -> LoadingBlock("Memuat NetShort...")

            uiState.errorMessage != null && uiState.currentDisplayList.isEmpty() ->
                ErrorBlock(uiState.errorMessage ?: "Terjadi kesalahan", viewModel::loadData)

            else -> LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 90.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                item(span = { GridItemSpan(maxLineSpan) }) {
                    PlatformHeader(
                        badge = "BAGAH NETSHORT",
                        subtitle = "Drama pendek NetShort",
                        onSearchClick = onSearchClick
                    )
                }

                item(span = { GridItemSpan(maxLineSpan) }) {
                    PlatformTabRow(
                        tabs = uiState.tabs,
                        selected = uiState.selectedTab,
                        onSelect = viewModel::selectTab
                    )
                }

                if (uiState.loadingTabs.contains(uiState.selectedTab)) {
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

                items(uiState.currentDisplayList, key = { it.stableId() }) { item ->
                    NetShortCard(
                        item = item,
                        onClick = { onSeriesClick(item.stableId()) },
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}
        }
