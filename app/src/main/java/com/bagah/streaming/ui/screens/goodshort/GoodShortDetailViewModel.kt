package com.bagah.streaming.ui.screens.goodshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.GoodShortDetailResponse
import com.bagah.streaming.data.model.GoodShortEpisode
import com.bagah.streaming.data.repository.goodshort.GoodShortRepository
import com.bagah.streaming.data.repository.goodshort.GoodShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class GoodShortDetailUiState(
    val isLoading: Boolean = true,
    val detail: GoodShortDetailResponse? = null,
    val episodes: List<GoodShortEpisode> = emptyList(),
    val errorMessage: String? = null
)

class GoodShortDetailViewModel(
    private val repository: GoodShortRepository = GoodShortRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(GoodShortDetailUiState())
    val uiState: StateFlow<GoodShortDetailUiState> = _uiState.asStateFlow()

    fun loadDetail(seriesId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val detailResult = repository.getDetail(seriesId)
            val episodesResult = repository.getEpisodes(seriesId)

            if (detailResult.isSuccess) {
                val detail = detailResult.getOrNull()
                val episodes = episodesResult.getOrDefault(emptyList())
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        detail = detail,
                        episodes = episodes,
                        errorMessage = null
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = detailResult.exceptionOrNull()?.localizedMessage
                            ?: "Gagal memuat detail GoodShort"
                    )
                }
            }
        }
    }
}
