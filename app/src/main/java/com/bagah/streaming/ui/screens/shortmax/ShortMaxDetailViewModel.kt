package com.bagah.streaming.ui.screens.shortmax

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.ShortMaxDetailResponse
import com.bagah.streaming.data.model.ShortMaxEpisode
import com.bagah.streaming.data.repository.shortmax.ShortMaxRepository
import com.bagah.streaming.data.repository.shortmax.ShortMaxRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ShortMaxDetailUiState(
    val isLoading: Boolean = true,
    val detail: ShortMaxDetailResponse? = null,
    val episodes: List<ShortMaxEpisode> = emptyList(),
    val errorMessage: String? = null
)

class ShortMaxDetailViewModel(
    private val seriesId: String,
    private val repository: ShortMaxRepository = ShortMaxRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(ShortMaxDetailUiState())
    val uiState: StateFlow<ShortMaxDetailUiState> = _uiState.asStateFlow()

    init {
        loadDetail()
    }

    fun loadDetail() {
        if (seriesId.isBlank()) {
            _uiState.update { it.copy(isLoading = false, errorMessage = "Serial tidak valid") }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            repository.getDetail(seriesId)
                .onSuccess { detail ->
                    val episodes = repository.getEpisodes(seriesId).getOrDefault(emptyList())
                    _uiState.update {
                        it.copy(isLoading = false, detail = detail, episodes = episodes, errorMessage = null)
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = err.localizedMessage ?: "Gagal memuat detail ShortMax"
                        )
                    }
                }
        }
    }

    class Factory(private val seriesId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return ShortMaxDetailViewModel(seriesId) as T
        }
    }
}
