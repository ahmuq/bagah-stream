package com.bagah.streaming.ui.screens.drama

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.DramaDetailResponse
import com.bagah.streaming.data.model.DramaEpisode
import com.bagah.streaming.data.repository.drama.DramaRepository
import com.bagah.streaming.data.repository.drama.DramaRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class DramaDetailUiState(
    val isLoading: Boolean = true,
    val detail: DramaDetailResponse? = null,
    val episodes: List<DramaEpisode> = emptyList(),
    val errorMessage: String? = null
)

class DramaDetailViewModel(
    private val bookId: String,
    private val repository: DramaRepository = DramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DramaDetailUiState())
    val uiState: StateFlow<DramaDetailUiState> = _uiState.asStateFlow()

    init {
        loadDetail()
    }

    fun loadDetail() {
        if (bookId.isBlank()) {
            _uiState.update { it.copy(isLoading = false, errorMessage = "Drama tidak valid") }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val detail = repository.getDetail(bookId).getOrNull()
            val episodes = repository.getEpisodes(bookId).getOrDefault(emptyList())

            if (detail == null && episodes.isEmpty()) {
                _uiState.update {
                    it.copy(isLoading = false, errorMessage = "Gagal memuat detail drama")
                }
            } else {
                _uiState.update {
                    it.copy(isLoading = false, detail = detail, episodes = episodes, errorMessage = null)
                }
            }
        }
    }

    class Factory(private val bookId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return DramaDetailViewModel(bookId) as T
        }
    }
}
