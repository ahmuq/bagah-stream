package com.bagah.streaming.ui.screens.melolo

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.ui.components.ErrorBlock
import com.bagah.streaming.ui.components.GenericDetailScreen
import com.bagah.streaming.ui.components.GenericPlayerScreen
import com.bagah.streaming.ui.components.LoadingBlock

@Composable
fun MeloloDetailScreen(
    seriesId: String,
    viewModel: MeloloDetailViewModel = viewModel(
        key = seriesId,
        factory = MeloloDetailViewModel.Factory(seriesId)
    ),
    onBackClick: () -> Unit,
    onPlayEpisode: (seriesId: String, episodeNum: Int) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    when {
        uiState.isLoading -> LoadingBlock("Memuat detail serial...")
        uiState.detail == null -> ErrorBlock(uiState.errorMessage ?: "Terjadi kesalahan") { viewModel.loadDetail() }
        else -> {
            val data = uiState.detail!!.data
            GenericDetailScreen(
                topLabel = "Detail Serial Melolo",
                title = data?.title.orEmpty(),
                cover = data?.cover.orEmpty(),
                episodeCount = data?.episodeCount() ?: uiState.episodes.size,
                description = data?.description.orEmpty(),
                episodes = uiState.episodes.map {
                    Triple(it.number(), it.title, it.duration?.let { d -> formatDuration(d) })
                },
                onBackClick = onBackClick,
                // Selalu pakai seriesId asli dari navigasi: ID Melolo melebihi presisi
                // 64-bit JSON, jadi ID dari response detail bisa terbulatkan dan ditolak API.
                onPlayEpisode = { epNum -> onPlayEpisode(seriesId, epNum) }
            )
        }
    }
}

@Composable
fun MeloloPlayerScreen(
    seriesId: String,
    initialEpisode: Int = 1,
    viewModel: MeloloPlayerViewModel = viewModel(),
    onBackClick: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(seriesId, initialEpisode) {
        viewModel.initPlayer(seriesId, initialEpisode)
    }

    GenericPlayerScreen(
        title = uiState.title,
        currentEpisode = uiState.currentEpisode,
        totalEpisodes = uiState.totalEpisodes,
        streamUrl = uiState.currentStreamUrl,
        isLoading = uiState.isLoading,
        errorMessage = uiState.errorMessage,
        onBackClick = onBackClick,
        onPlayEpisode = { viewModel.playEpisode(it) },
        onPlayNext = { viewModel.playNext() },
        onPlayPrevious = { viewModel.playPrevious() }
    )
}

private fun formatDuration(seconds: Int): String {
    val m = seconds / 60
    val s = seconds % 60
    return "%d:%02d".format(m, s)
}
