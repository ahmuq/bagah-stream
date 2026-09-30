package com.bagah.streaming.ui.screens.freereels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.FreeReelsEpisode
import com.bagah.streaming.data.repository.freereels.FreeReelsRepository
import com.bagah.streaming.data.repository.freereels.FreeReelsRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class FreeReelsPlayerUiState(
    val seriesId: String = "",
    val currentEpisode: Int = 1,
    val title: String = "",
    val totalEpisodes: Int = 0,
    val episodes: List<FreeReelsEpisode> = emptyList(),
    val currentStreamUrl: String? = null,
    val currentSubtitleUrl: String? = null,
    val currentSubtitleLanguage: String = "id",
    val isLoading: Boolean = true,
    val errorMessage: String? = null
)

class FreeReelsPlayerViewModel(
    private val repository: FreeReelsRepository = FreeReelsRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(FreeReelsPlayerUiState())
    val uiState: StateFlow<FreeReelsPlayerUiState> = _uiState.asStateFlow()

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
                    it.copy(title = detail.title, totalEpisodes = detail.totalEpisodes)
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
                // FreeReels mengirim HLS .m3u8 langsung di bestUrl; tidak perlu dekripsi.
                // Subtitle (VTT) dipilih dari response, fallback ke daftar episode.
                val subtitle = response.preferredSubtitle()
                    ?: _uiState.value.episodes
                        .firstOrNull { it.episodeNum == episode }
                        ?.let { ep ->
                            val withVtt = ep.subtitles.filter { it.vtt.isNotBlank() }
                            withVtt.firstOrNull { it.language.equals("id-ID", true) }
                                ?: withVtt.firstOrNull()
                        }

                val url = response.streamUrl().ifBlank {
                    _uiState.value.episodes.firstOrNull { it.episodeNum == episode }?.streamUrl().orEmpty()
                }

                if (url.isBlank()) {
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = "URL video tidak tersedia.")
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            currentStreamUrl = url,
                            currentSubtitleUrl = subtitle?.vtt?.takeIf { v -> v.isNotBlank() },
                            currentSubtitleLanguage = subtitle?.language?.substringBefore('-')?.lowercase() ?: "id",
                            errorMessage = null
                        )
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
