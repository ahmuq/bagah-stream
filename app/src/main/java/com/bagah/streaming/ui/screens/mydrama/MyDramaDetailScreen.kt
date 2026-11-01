package com.bagah.streaming.ui.screens.mydrama

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.ui.components.ErrorBlock
import com.bagah.streaming.ui.components.GenericDetailScreen
import com.bagah.streaming.ui.components.LoadingBlock
import com.bagah.streaming.ui.theme.BgBlack

@Composable
fun MyDramaDetailScreen(
    seriesId: String,
    viewModel: MyDramaDetailViewModel = viewModel(
        key = seriesId,
        factory = MyDramaDetailViewModel.Factory(seriesId)
    ),
    onBackClick: () -> Unit,
    onPlayEpisode: (String, Int) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack)
    ) {
        val detail = uiState.detail
        when {
            uiState.isLoading -> LoadingBlock("Memuat detail serial...")

            detail == null -> ErrorBlock(
                uiState.errorMessage ?: "Terjadi kesalahan",
                viewModel::loadDetail
            )

            else -> GenericDetailScreen(
                topLabel = "Detail Serial MyDrama",
                title = detail.displayTitle(),
                cover = detail.displayCover(),
                episodeCount = if (detail.totalEpisodes > 0) {
                    detail.totalEpisodes
                } else {
                    uiState.episodes.size
                },
                description = detail.displayDescription(),
                episodes = uiState.episodes.map { episode ->
                    Triple(
                        episode.number,
                        episode.displayTitle(),
                        if (episode.isFree) "Gratis" else "Berbayar"
                    )
                },
                onBackClick = onBackClick,
                onPlayEpisode = { number -> onPlayEpisode(seriesId, number) }
            )
        }
    }
}
