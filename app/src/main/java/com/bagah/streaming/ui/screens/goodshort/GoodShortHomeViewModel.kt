package com.bagah.streaming.ui.screens.goodshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.GoodShortHomeModule
import com.bagah.streaming.data.model.GoodShortItem
import com.bagah.streaming.data.repository.goodshort.GoodShortRepository
import com.bagah.streaming.data.repository.goodshort.GoodShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class GoodShortHomeUiState(
    val modules: List<GoodShortHomeModule> = emptyList(),
    val forYouItems: List<GoodShortItem> = emptyList(),
    val trendingItems: List<GoodShortItem> = emptyList(),
    val selectedModuleIndex: Int = 0,
    val isLoading: Boolean = true,
    val errorMessage: String? = null
)

class GoodShortHomeViewModel(
    private val repository: GoodShortRepository = GoodShortRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(GoodShortHomeUiState())
    val uiState: StateFlow<GoodShortHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val homeRes = repository.getHome()
            val forYouRes = repository.getForYou()
            val trendingRes = repository.getTrending(1)

            homeRes.onSuccess { mods ->
                _uiState.update { it.copy(modules = mods) }
            }.onFailure { err ->
                _uiState.update { it.copy(errorMessage = err.localizedMessage) }
            }

            forYouRes.onSuccess { items ->
                _uiState.update { it.copy(forYouItems = items) }
            }

            trendingRes.onSuccess { items ->
                _uiState.update { it.copy(trendingItems = items) }
            }

            _uiState.update { it.copy(isLoading = false) }
        }
    }

    fun selectModule(index: Int) {
        _uiState.update { it.copy(selectedModuleIndex = index) }
    }
}
