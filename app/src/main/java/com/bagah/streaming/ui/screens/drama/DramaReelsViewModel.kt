package com.bagah.streaming.ui.screens.drama

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.DramaChapter
import com.bagah.streaming.data.repository.drama.DramaRepository
import com.bagah.streaming.data.repository.drama.DramaRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class DramaReelsUiState(
    val isLoading: Boolean = true,
    val chapters: List<DramaChapter> = emptyList(),
    val errorMessage: String? = null
)

class DramaReelsViewModel(
    private val bookId: String,
    private val repository: DramaRepository = DramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DramaReelsUiState())
    val uiState: StateFlow<DramaReelsUiState> = _uiState.asStateFlow()

    init {
        loadChapters()
    }

    fun loadChapters() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            val result = repository.getChapters(bookId)
            result.onSuccess { list ->
                _uiState.update { it.copy(isLoading = false, chapters = list, errorMessage = null) }
            }.onFailure { err ->
                _uiState.update { it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat chapter drama") }
            }
        }
    }

    class Factory(private val bookId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return DramaReelsViewModel(bookId) as T
        }
    }
}
