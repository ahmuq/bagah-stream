package com.bagah.streaming.ui.screens.freereels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.FreeReelsDetailResponse
import com.bagah.streaming.data.model.FreeReelsEpisode
import com.bagah.streaming.data.repository.freereels.FreeReelsRepository
import com.bagah.streaming.data.repository.freereels.FreeReelsRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class FreeReelsDetailUiState(
    val isLoading: Boolean = true,
    val detail: FreeReelsDetailResponse? = null,
    val episodes: List<FreeReelsEpisode> = emptyList(),
    val errorMessage: String? = null
)

class FreeReelsDetailViewModel(
    private val seriesId: String,
    private val repository: FreeReelsRepository = FreeReelsRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(FreeReelsDetailUiState())
    val uiState: StateFlow<FreeReelsDetailUiState> = _uiState.asStateFlow()

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

            val detailResult = repository.getDetail(seriesId)
            val episodesResult = repository.getEpisodes(seriesId)

            detailResult.onSuccess { detail ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        detail = detail,
                        episodes = episodesResult.getOrDefault(emptyList()),
                        errorMessage = null
                    )
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = err.localizedMessage ?: "Gagal memuat detail FreeReels"
                    )
                }
            }
        }
    }

    class Factory(private val seriesId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return FreeReelsDetailViewModel(seriesId) as T
        }
    }
}
