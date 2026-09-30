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
    val isLoadingMore: Boolean = false,
    val dramaList: List<DramaItem> = emptyList(),
    val page: Int = 1,
    val endReached: Boolean = false,
    val statusFilter: String = "All",
    val rankType: Int = 1,
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
        if (index == _uiState.value.selectedCategoryIndex && _uiState.value.dramaList.isNotEmpty()) return
        _uiState.update { it.copy(selectedCategoryIndex = index) }
        loadCategory(index)
    }

    /** Filter status untuk tab Beranda: All / 1 (Tamat) / 2 (Berjalan). */
    fun setStatusFilter(value: String) {
        if (value == _uiState.value.statusFilter) return
        _uiState.update { it.copy(statusFilter = value) }
        loadCategory(0)
    }

    /** Tipe peringkat untuk tab Peringkat: 1 Trending, 2 Populer, 3 Terbaru. */
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
                    dramaList = emptyList()
                )
            }
            val result = fetch(index, 1)
            result.onSuccess { list ->
                _uiState.update {
                    it.copy(isLoading = false, dramaList = list, page = 1, endReached = list.isEmpty())
                }
            }.onFailure { err ->
                _uiState.update { it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat drama") }
            }
        }
    }

    /** Dipanggil saat daftar di-scroll mendekati bawah. */
    fun loadMore() {
        val state = _uiState.value
        if (state.isLoading || state.isLoadingMore || state.endReached) return
        // Kategori (theater) dan Peringkat (ranking) tidak mendukung pagination.
        if (state.selectedCategoryIndex == 2 || state.selectedCategoryIndex == 3) {
            _uiState.update { it.copy(endReached = true) }
            return
        }

        viewModelScope.launch {
            _uiState.update { it.copy(isLoadingMore = true) }
            val nextPage = state.page + 1
            fetch(state.selectedCategoryIndex, nextPage)
                .onSuccess { list ->
                    val existing = _uiState.value.dramaList.map { it.bookId }.toSet()
                    val fresh = list.filterNot { it.bookId in existing }
                    _uiState.update {
                        it.copy(
                            isLoadingMore = false,
                            dramaList = it.dramaList + fresh,
                            page = nextPage,
                            // Berhenti jika halaman kosong atau tidak ada item baru
                            // (sebagian endpoint mengulang halaman terakhir).
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
        0 -> repository.getHome(page, _uiState.value.statusFilter.takeIf { it != "All" })
        1 -> repository.getForYou(page)
        2 -> repository.getCategories()
        3 -> repository.getRanking(_uiState.value.rankType)
        else -> repository.getHome(page, null)
    }
}
