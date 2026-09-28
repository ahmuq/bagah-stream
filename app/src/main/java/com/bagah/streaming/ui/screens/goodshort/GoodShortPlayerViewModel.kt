package com.bagah.streaming.ui.screens.goodshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.GoodShortEpisode
import com.bagah.streaming.data.repository.goodshort.GoodShortRepository
import com.bagah.streaming.data.repository.goodshort.GoodShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class GoodShortPlayerUiState(
    val seriesId: String = "",
    val currentEpisode: Int = 1,
    val seriesTitle: String = "",
    val totalEpisodes: Int = 0,
    val episodes: List<GoodShortEpisode> = emptyList(),
    val currentStreamUrl: String? = null,
    val isLoading: Boolean = true,
    val isLocked: Boolean = false,
    val errorMessage: String? = null
)

class GoodShortPlayerViewModel(
    private val repository: GoodShortRepository = GoodShortRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(GoodShortPlayerUiState())
    val uiState: StateFlow<GoodShortPlayerUiState> = _uiState.asStateFlow()

    fun initPlayer(seriesId: String, initialEpisode: Int = 1) {
        _uiState.update {
            it.copy(
                seriesId = seriesId,
                currentEpisode = initialEpisode.coerceAtLeast(1),
                isLoading = true,
                errorMessage = null
            )
        }

        viewModelScope.launch {
            // Load detail
            repository.getDetail(seriesId).onSuccess { detail ->
                _uiState.update {
                    it.copy(
                        seriesTitle = detail.title,
                        totalEpisodes = detail.totalEpisodes
                    )
                }
            }

            // Load all episodes
            val episodesRes = repository.getEpisodes(seriesId).getOrDefault(emptyList())
            _uiState.update {
                it.copy(
                    episodes = episodesRes,
                    totalEpisodes = if (it.totalEpisodes > 0) it.totalEpisodes else episodesRes.size
                )
            }

            // Load initial episode stream
            loadEpisodeStream(seriesId, initialEpisode.coerceAtLeast(1))
        }
    }

    fun playEpisode(episodeNum: Int) {
        val total = _uiState.value.totalEpisodes.coerceAtLeast(1)
        val target = episodeNum.coerceIn(1, total)
        if (target == _uiState.value.currentEpisode && _uiState.value.currentStreamUrl != null) return

        _uiState.update { it.copy(currentEpisode = target, isLoading = true, errorMessage = null) }
        viewModelScope.launch {
            loadEpisodeStream(_uiState.value.seriesId, target)
        }
    }

    fun playNext() {
        val next = _uiState.value.currentEpisode + 1
        if (next <= _uiState.value.totalEpisodes) {
            playEpisode(next)
        }
    }

    fun playPrevious() {
        val prev = _uiState.value.currentEpisode - 1
        if (prev >= 1) {
            playEpisode(prev)
        }
    }

    private suspend fun loadEpisodeStream(seriesId: String, episodeNum: Int) {
        // First check in-memory episodes list
        val cachedEp = _uiState.value.episodes.firstOrNull { it.episodeNum == episodeNum }
        if (cachedEp != null && cachedEp.bestUrl.isNotBlank()) {
            if (cachedEp.locked) {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        isLocked = true,
                        errorMessage = "Episode $episodeNum terkunci (Premium GoodShort)."
                    )
                }
                return
            }
            _uiState.update {
                it.copy(
                    isLoading = false,
                    isLocked = false,
                    currentStreamUrl = cachedEp.bestUrl,
                    errorMessage = null
                )
            }
            return
        }

        // Fetch single episode from API
        repository.getEpisode(seriesId, episodeNum)
            .onSuccess { ep ->
                if (ep.locked) {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            isLocked = true,
                            errorMessage = "Episode $episodeNum terkunci (Premium GoodShort)."
                        )
                    }
                    return@onSuccess
                }

                if (ep.bestUrl.isBlank()) {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = "URL streaming episode $episodeNum tidak ditemukan."
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            isLocked = false,
                            currentStreamUrl = ep.bestUrl,
                            errorMessage = null
                        )
                    }
                }
            }
            .onFailure { err ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = err.localizedMessage ?: "Gagal memuat video episode $episodeNum"
                    )
                }
            }
    }
}
