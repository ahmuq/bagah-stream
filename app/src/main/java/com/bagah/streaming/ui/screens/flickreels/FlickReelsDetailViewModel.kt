package com.bagah.streaming.ui.screens.flickreels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.FlickReelsDetailResponse
import com.bagah.streaming.data.model.FlickReelsEpisode
import com.bagah.streaming.data.repository.flickreels.FlickReelsRepository
import com.bagah.streaming.data.repository.flickreels.FlickReelsRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class FlickReelsDetailUiState(
    val isLoading: Boolean = true,
    val detail: FlickReelsDetailResponse? = null,
    val episodes: List<FlickReelsEpisode> = emptyList(),
    val errorMessage: String? = null
)

class FlickReelsDetailViewModel(
    private val seriesId: String,
    private val repository: FlickReelsRepository = FlickReelsRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(FlickReelsDetailUiState())
    val uiState: StateFlow<FlickReelsDetailUiState> = _uiState.asStateFlow()

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
                    val episodes = detail.chapters.ifEmpty {
                        repository.getEpisodes(seriesId).getOrDefault(emptyList())
                    }
                    _uiState.update {
                        it.copy(isLoading = false, detail = detail, episodes = episodes, errorMessage = null)
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = err.localizedMessage ?: "Gagal memuat detail FlickReels"
                        )
                    }
                }
        }
    }

    class Factory(private val seriesId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return FlickReelsDetailViewModel(seriesId) as T
        }
    }
}
