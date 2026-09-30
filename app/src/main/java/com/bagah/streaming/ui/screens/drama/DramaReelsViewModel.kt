package com.bagah.streaming.ui.screens.drama

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.DramaEpisode
import com.bagah.streaming.data.repository.drama.DramaRepository
import com.bagah.streaming.data.repository.drama.DramaRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class DramaReelsUiState(
    val isLoading: Boolean = true,
    val episodes: List<DramaEpisode> = emptyList(),
    val errorMessage: String? = null
)

class DramaReelsViewModel(
    private val bookId: String,
    private val repository: DramaRepository = DramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DramaReelsUiState())
    val uiState: StateFlow<DramaReelsUiState> = _uiState.asStateFlow()

    init {
        loadEpisodes()
    }

    fun loadEpisodes() {
        if (bookId.isBlank()) {
            _uiState.update {
                it.copy(isLoading = false, errorMessage = "Drama tidak valid")
            }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            val result = repository.getEpisodes(bookId)
            result.onSuccess { list ->
                _uiState.update { it.copy(isLoading = false, episodes = list, errorMessage = null) }
            }.onFailure { err ->
                _uiState.update { it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat episode drama") }
            }
        }
    }

    suspend fun getStream(episode: Int): Result<com.bagah.streaming.data.model.DramaEpisodeResponse> {
        if (bookId.isBlank()) {
            return Result.failure(IllegalStateException("Drama tidak valid"))
        }
        return repository.getEpisodeStream(bookId, episode)
    }

    class Factory(private val bookId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return DramaReelsViewModel(bookId) as T
        }
    }
}
