package com.bagah.streaming.ui.screens.reelshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.ReelShortChapter
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.model.ReelShortVideoStream
import com.bagah.streaming.data.repository.reelshort.ReelShortRepository
import com.bagah.streaming.data.repository.reelshort.ReelShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ReelShortPlayerUiState(
    val bookId: String = "",
    val currentEpisode: Int = 1,
    val bookTitle: String = "",
    val totalEpisodes: Int = 0,
    val chapters: List<ReelShortChapter> = emptyList(),
    val currentStreamUrl: String? = null,
    val currentQuality: String? = null,
    val isLoading: Boolean = true,
    val isLocked: Boolean = false,
    val errorMessage: String? = null
)

class ReelShortPlayerViewModel(
    private val repository: ReelShortRepository = ReelShortRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(ReelShortPlayerUiState())
    val uiState: StateFlow<ReelShortPlayerUiState> = _uiState.asStateFlow()

    fun initPlayer(bookId: String, initialEpisode: Int = 1) {
        _uiState.update {
            it.copy(
                bookId = bookId,
                currentEpisode = initialEpisode.coerceAtLeast(1),
                isLoading = true,
                errorMessage = null
            )
        }

        viewModelScope.launch {
            // Load detail to get chapters & bookTitle
            repository.getDetail(bookId).onSuccess { detail ->
                _uiState.update {
                    it.copy(
                        bookTitle = detail.title,
                        totalEpisodes = detail.totalEpisodes,
                        chapters = detail.chapters
                    )
                }
            }

            // Load episode stream
            loadEpisodeStream(bookId, initialEpisode.coerceAtLeast(1))
        }
    }

    fun playEpisode(episode: Int) {
        val total = _uiState.value.totalEpisodes.coerceAtLeast(1)
        val target = episode.coerceIn(1, total)
        if (target == _uiState.value.currentEpisode && _uiState.value.currentStreamUrl != null) return

        _uiState.update { it.copy(currentEpisode = target, isLoading = true, errorMessage = null) }
        viewModelScope.launch {
            loadEpisodeStream(_uiState.value.bookId, target)
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

    private suspend fun loadEpisodeStream(bookId: String, episode: Int) {
        repository.getEpisode(bookId, episode)
            .onSuccess { streams ->
                if (streams.isEmpty()) {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = "Video episode tidak tersedia atau terkunci."
                        )
                    }
                    return@onSuccess
                }

                // Prefer H264 stream for universal hardware decoding compatibility
                val preferredStream = streams.firstOrNull { it.encode?.equals("H264", ignoreCase = true) == true }
                    ?: streams.firstOrNull { !it.url.isNullOrBlank() }

                val selectedUrl = preferredStream?.url
                if (selectedUrl.isNullOrBlank()) {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = "URL streaming tidak ditemukan."
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            currentStreamUrl = selectedUrl,
                            currentQuality = preferredStream.quality ?: "Auto",
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
