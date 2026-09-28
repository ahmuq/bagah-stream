package com.bagah.streaming.ui.screens.anime

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.AnimeDetailItem
import com.bagah.streaming.data.repository.anime.AnimeRepository
import com.bagah.streaming.data.repository.anime.AnimeRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class AnimeDetailUiState(
    val isLoading: Boolean = true,
    val detail: AnimeDetailItem? = null,
    val errorMessage: String? = null
)

class AnimeDetailViewModel(
    private val animeUrl: String,
    private val repository: AnimeRepository = AnimeRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(AnimeDetailUiState())
    val uiState: StateFlow<AnimeDetailUiState> = _uiState.asStateFlow()

    init {
        loadDetail()
    }

    fun loadDetail() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            val result = repository.getDetail(animeUrl)
            result.onSuccess { item ->
                _uiState.update { it.copy(isLoading = false, detail = item, errorMessage = null) }
            }.onFailure { err ->
                _uiState.update { it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat detail anime") }
            }
        }
    }

    class Factory(private val animeUrl: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return AnimeDetailViewModel(animeUrl) as T
        }
    }
}
