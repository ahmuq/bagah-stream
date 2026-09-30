package com.bagah.streaming.ui.screens.flickreels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.FlickReelsEpisode
import com.bagah.streaming.data.repository.flickreels.FlickReelsRepository
import com.bagah.streaming.data.repository.flickreels.FlickReelsRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class FlickReelsPlayerUiState(
    val seriesId: String = "",
    val currentEpisode: Int = 1,
    val title: String = "",
    val totalEpisodes: Int = 0,
    val episodes: List<FlickReelsEpisode> = emptyList(),
    val currentStreamUrl: String? = null,
    val isLoading: Boolean = true,
    val errorMessage: String? = null
)

class FlickReelsPlayerViewModel(
    private val repository: FlickReelsRepository = FlickReelsRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(FlickReelsPlayerUiState())
    val uiState: StateFlow<FlickReelsPlayerUiState> = _uiState.asStateFlow()

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
                    it.copy(
                        title = detail.title,
                        totalEpisodes = detail.totalEpisodes,
                        episodes = detail.chapters
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
                val fallback = _uiState.value.episodes
                    .firstOrNull { it.episodeNum == episode }?.bestUrl
                val url = response.bestUrl.ifBlank { fallback.orEmpty() }
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
                val locked = _uiState.value.episodes
                    .firstOrNull { it.episodeNum == episode }?.locked == true
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = if (locked) {
                            "Episode $episode terkunci dan belum bisa dibuka dari sumber. Pilih episode lain."
                        } else {
                            err.localizedMessage ?: "Gagal memuat video episode $episode"
                        }
                    )
                }
            }
    }
}
