package com.bagah.streaming.ui.screens.drama

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.DramaItem
import com.bagah.streaming.data.repository.drama.DramaRepository
import com.bagah.streaming.data.repository.drama.DramaRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class DramaHomeUiState(
    val selectedCategoryIndex: Int = 0,
    val isLoading: Boolean = true,
    val dramaList: List<DramaItem> = emptyList(),
    val errorMessage: String? = null
)

class DramaHomeViewModel(
    private val repository: DramaRepository = DramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DramaHomeUiState())
    val uiState: StateFlow<DramaHomeUiState> = _uiState.asStateFlow()

    init {
        loadCategory(0)
    }

    fun selectCategory(index: Int) {
        _uiState.update { it.copy(selectedCategoryIndex = index) }
        loadCategory(index)
    }

    fun loadCategory(index: Int = _uiState.value.selectedCategoryIndex) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            val result = when (index) {
                0 -> repository.getPopular()
                1 -> repository.getLatest()
                2 -> repository.getDubbed()
                3 -> repository.getVip()
                else -> repository.getPopular()
            }
            result.onSuccess { list ->
                _uiState.update { it.copy(isLoading = false, dramaList = list, errorMessage = null) }
            }.onFailure { err ->
                _uiState.update { it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat drama") }
            }
        }
    }
}
