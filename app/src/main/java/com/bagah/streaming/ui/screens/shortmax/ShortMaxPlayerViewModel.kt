package com.bagah.streaming.ui.screens.shortmax

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.ShortMaxEpisode
import com.bagah.streaming.data.repository.shortmax.ShortMaxRepository
import com.bagah.streaming.data.repository.shortmax.ShortMaxRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

/** Resolusi yang diminta; fallback ke bestUrl bila tidak tersedia. */
private const val SHORTMAX_QUALITY = "720"

data class ShortMaxPlayerUiState(
    val seriesId: String = "",
    val currentEpisode: Int = 1,
    val title: String = "",
    val totalEpisodes: Int = 0,
    val episodes: List<ShortMaxEpisode> = emptyList(),
    val currentStreamUrl: String? = null,
    val isLoading: Boolean = true,
    val errorMessage: String? = null
)

class ShortMaxPlayerViewModel(
    private val repository: ShortMaxRepository = ShortMaxRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(ShortMaxPlayerUiState())
    val uiState: StateFlow<ShortMaxPlayerUiState> = _uiState.asStateFlow()

    fun initPlayer(seriesId: String, initialEpisode: Int = 1) {
        if (seriesId.isBlank()) {
            _uiState.update { it.copy(isLoading = false, errorMessage = "Serial tidak valid") }
            return
        }
        _uiState.update {
            it.copy(
                seriesId = seriesId,
                currentEpisode = initialEpisode.coerceAtLeast(1),
                isLoading = true,
                errorMessage = null
            )
        }

        viewModelScope.launch {
            repository.getDetail(seriesId).onSuccess { detail ->
                _uiState.update {
                    it.copy(title = detail.title, totalEpisodes = detail.episodeCount())
                }
            }
            repository.getEpisodes(seriesId).onSuccess { list ->
                _uiState.update {
                    it.copy(
                        episodes = list,
                        totalEpisodes = if (it.totalEpisodes > 0) it.totalEpisodes else list.size
                    )
                }
            }
            loadStream(seriesId, initialEpisode.coerceAtLeast(1))
        }
    }

    fun playEpisode(episode: Int) {
        val total = _uiState.value.totalEpisodes.coerceAtLeast(1)
        val target = episode.coerceIn(1, total)
        if (target == _uiState.value.currentEpisode && _uiState.value.currentStreamUrl != null) return

        _uiState.update { it.copy(currentEpisode = target, isLoading = true, errorMessage = null) }
        viewModelScope.launch { loadStream(_uiState.value.seriesId, target) }
    }

    fun playNext() {
        val next = _uiState.value.currentEpisode + 1
        if (next <= _uiState.value.totalEpisodes) playEpisode(next)
    }

    fun playPrevious() {
        val prev = _uiState.value.currentEpisode - 1
        if (prev >= 1) playEpisode(prev)
    }

    private suspend fun loadStream(seriesId: String, episode: Int) {
        repository.getEpisode(seriesId, episode)
            .onSuccess { response ->
                // URL HLS terenkripsi custom; segmennya didekripsi oleh
                // ShortMaxDecryptDataSource saat dibaca player.
                val url = response.streamUrl(SHORTMAX_QUALITY)
                if (url.isBlank()) {
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = "URL video tidak tersedia.")
                    }
                } else {
                    _uiState.update {
                        it.copy(isLoading = false, currentStreamUrl = url, errorMessage = null)
                    }
                }
            }
            .onFailure { err ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = err.localizedMessage ?: "Gagal memuat video episode $episode"
                    )
                }
            }
    }
}
