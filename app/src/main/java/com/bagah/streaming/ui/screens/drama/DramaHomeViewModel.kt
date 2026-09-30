package com.bagah.streaming.ui.screens.drama

import com.bagah.streaming.data.api.NetworkClient
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.DramaFilterOption
import com.bagah.streaming.data.model.DramaItem
import com.bagah.streaming.data.model.DramaSection
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
    val isLoadingMore: Boolean = false,
    val dramaList: List<DramaItem> = emptyList(),
    val sections: List<DramaSection> = emptyList(),
    val page: Int = 1,
    val endReached: Boolean = false,
    val statusFilter: String = "All",
    val genres: List<DramaFilterOption> = emptyList(),
    val selectedGenre: String = "All",
    val rankType: Int = 1,
    val errorMessage: String? = null
)

class DramaHomeViewModel(
    private val repository: DramaRepository = DramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DramaHomeUiState())
    val uiState: StateFlow<DramaHomeUiState> = _uiState.asStateFlow()

    init {
        loadFiltersAndHome()
    }

    fun refresh() {
        NetworkClient.clearApiCache()
        loadFiltersAndHome()
    }

    private fun loadFiltersAndHome() {
        viewModelScope.launch {
            val filters = repository.getFilters().getOrDefault(emptyList())
            val options = filters.firstOrNull { it.categoryName.contains("Genre", ignoreCase = true) }?.options
                ?: filters.firstOrNull()?.options
                ?: emptyList()
            _uiState.update { it.copy(genres = options) }
            loadCategory(0)
        }
    }

    fun setGenre(value: String) {
        if (value == _uiState.value.selectedGenre) return
        _uiState.update { it.copy(selectedGenre = value) }
        loadCategory(0)
    }

    fun selectCategory(index: Int) {
        if (index == _uiState.value.selectedCategoryIndex && _uiState.value.dramaList.isNotEmpty()) return
        _uiState.update { it.copy(selectedCategoryIndex = index) }
        loadCategory(index)
    }

    fun setStatusFilter(value: String) {
        if (value == _uiState.value.statusFilter) return
        _uiState.update { it.copy(statusFilter = value) }
        loadCategory(0)
    }

    fun setRankType(value: Int) {
        if (value == _uiState.value.rankType) return
        _uiState.update { it.copy(rankType = value) }
        loadCategory(3)
    }

    fun loadCategory(index: Int = _uiState.value.selectedCategoryIndex) {
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = true,
                    isLoadingMore = false,
                    errorMessage = null,
                    page = 1,
                    endReached = false,
                    dramaList = emptyList(),
                    sections = emptyList()
                )
            }

            if (index == 2) {
                repository.getTheater()
                    .onSuccess { sections ->
                        _uiState.update {
                            it.copy(isLoading = false, sections = sections, endReached = true)
                        }
                    }
                    .onFailure { err ->
                        _uiState.update {
                            it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat kategori")
                        }
                    }
                return@launch
            }

            fetch(index, 1)
                .onSuccess { list ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            dramaList = list.distinctBy { d -> d.bookId },
                            page = 1,
                            endReached = list.isEmpty()
                        )
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat drama")
                    }
                }
        }
    }

    fun loadMore() {
        val state = _uiState.value
        if (state.isLoading || state.isLoadingMore || state.endReached) return
        if (state.selectedCategoryIndex == 2 || state.selectedCategoryIndex == 3) {
            _uiState.update { it.copy(endReached = true) }
            return
        }
        _uiState.update { it.copy(isLoadingMore = true) }

        viewModelScope.launch {
            val nextPage = state.page + 1
            fetch(state.selectedCategoryIndex, nextPage)
                .onSuccess { list ->
                    val existing = _uiState.value.dramaList.map { it.bookId }.toSet()
                    val fresh = list.filterNot { it.bookId in existing }
                    _uiState.update {
                        it.copy(
                            isLoadingMore = false,
                            dramaList = (it.dramaList + fresh).distinctBy { d -> d.bookId },
                            page = nextPage,
                            endReached = list.isEmpty() || fresh.isEmpty()
                        )
                    }
                }
                .onFailure {
                    _uiState.update { it.copy(isLoadingMore = false, endReached = true) }
                }
        }
    }

    private suspend fun fetch(index: Int, page: Int): Result<List<DramaItem>> = when (index) {
        0 -> repository.getHome(
            page,
            _uiState.value.statusFilter.takeIf { it != "All" },
            _uiState.value.selectedGenre.takeIf { it != "All" }
        )
        1 -> repository.getForYou(page)
        2 -> repository.getCategories()
        3 -> repository.getRanking(_uiState.value.rankType)
        else -> repository.getHome(page, null, null)
    }
}
