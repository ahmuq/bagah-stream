package com.bagah.streaming.ui.screens.melolo

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
fun MeloloDetailScreen(
    seriesId: String,
    onBackClick: () -> Unit,
    onPlayEpisode: (String, Int) -> Unit,
    viewModel: MeloloDetailViewModel = viewModel(
        key = seriesId,
        factory = MeloloDetailViewModel.Factory(seriesId)
    )
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
                topLabel = "Detail Serial Melolo",
                title = detail.title,
                cover = detail.cover,
                episodeCount = if (detail.totalEpisodes > 0) detail.totalEpisodes else uiState.episodes.size,
                description = detail.description,
                episodes = uiState.episodes.map { episode ->
                    Triple(
                        episode.episodeNum.coerceAtLeast(1),
                        "Episode ${episode.episodeNum}",
                        if (episode.playable) null else "Tidak tersedia"
                    )
                },
                onBackClick = onBackClick,
                onPlayEpisode = { number -> onPlayEpisode(seriesId, number) }
            )
        }
    }
}
