package com.bagah.streaming.ui.screens.reelshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.ReelShortDetailResponse
import com.bagah.streaming.data.repository.reelshort.ReelShortRepository
import com.bagah.streaming.data.repository.reelshort.ReelShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ReelShortDetailUiState(
    val isLoading: Boolean = true,
    val detail: ReelShortDetailResponse? = null,
    val errorMessage: String? = null
)

class ReelShortDetailViewModel(
    private val repository: ReelShortRepository = ReelShortRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(ReelShortDetailUiState())
    val uiState: StateFlow<ReelShortDetailUiState> = _uiState.asStateFlow()

    fun loadDetail(bookId: String) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            repository.getDetail(bookId)
                .onSuccess { response ->
                    _uiState.update { it.copy(isLoading = false, detail = response, errorMessage = null) }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = err.localizedMessage ?: "Gagal memuat detail ReelShort"
                        )
                    }
                }
        }
    }
}
