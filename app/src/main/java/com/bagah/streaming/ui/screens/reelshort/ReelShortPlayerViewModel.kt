package com.bagah.streaming.ui.screens.reelshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.ReelShortChapter
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
            repository.getDetail(bookId).onSuccess { detail ->
                _uiState.update {
                    it.copy(
                        bookTitle = detail.title,
                        totalEpisodes = detail.totalEpisodes,
                        chapters = detail.chapters
                    )
                }
            }
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
        if (next <= _uiState.value.totalEpisodes) playEpisode(next)
    }

    fun playPrevious() {
        val prev = _uiState.value.currentEpisode - 1
        if (prev >= 1) playEpisode(prev)
    }

    private suspend fun loadEpisodeStream(bookId: String, episode: Int) {
        repository.getEpisode(bookId, episode)
            .onSuccess { response ->
                // H264 dipilih lebih dulu demi kompatibilitas decoder hardware;
                // HLS m3u8 dari ReelShort tidak terenkripsi, jadi tidak perlu dekripsi.
                val preferred = response.videoList.firstOrNull {
                    it.encode?.equals("H264", ignoreCase = true) == true && it.url.isNotBlank()
                } ?: response.videoList.firstOrNull { it.url.isNotBlank() }

                val url = preferred?.url ?: response.bestUrl
                if (url.isBlank()) {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            isLocked = response.locked,
                            errorMessage = "Video episode tidak tersedia atau terkunci."
                        )
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            isLocked = response.locked,
                            currentStreamUrl = url,
                            currentQuality = preferred?.quality ?: "Auto",
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
