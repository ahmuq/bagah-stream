package com.bagah.streaming.ui.screens.netshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.NetShortDetailResponse
import com.bagah.streaming.data.model.NetShortEpisode
import com.bagah.streaming.data.repository.netshort.NetShortRepository
import com.bagah.streaming.data.repository.netshort.NetShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class NetShortDetailUiState(
    val isLoading: Boolean = true,
    val detail: NetShortDetailResponse? = null,
    val episodes: List<NetShortEpisode> = emptyList(),
    val errorMessage: String? = null
)

class NetShortDetailViewModel(
    private val seriesId: String,
    private val repository: NetShortRepository = NetShortRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(NetShortDetailUiState())
    val uiState: StateFlow<NetShortDetailUiState> = _uiState.asStateFlow()

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
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            detail = detail,
                            episodes = detail.episodeList(),
                            errorMessage = null
                        )
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = err.localizedMessage ?: "Gagal memuat detail NetShort"
                        )
                    }
                }
        }
    }

    class Factory(private val seriesId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return NetShortDetailViewModel(seriesId) as T
        }
    }
}
