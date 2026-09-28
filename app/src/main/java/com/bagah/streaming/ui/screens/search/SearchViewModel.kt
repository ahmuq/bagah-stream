package com.bagah.streaming.ui.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.DramaItem
import com.bagah.streaming.data.model.FreeReelsItem
import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.data.repository.anime.AnimeRepository
import com.bagah.streaming.data.repository.anime.AnimeRepositoryImpl
import com.bagah.streaming.data.repository.drama.DramaRepository
import com.bagah.streaming.data.repository.drama.DramaRepositoryImpl
import com.bagah.streaming.data.repository.freereels.FreeReelsRepository
import com.bagah.streaming.data.repository.freereels.FreeReelsRepositoryImpl
import com.bagah.streaming.data.repository.reelshort.ReelShortRepository
import com.bagah.streaming.data.repository.reelshort.ReelShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class SearchUiState(
    val query: String = "",
    val selectedTab: Int = 0, // 0 = Anime, 1 = DramaBox, 2 = ReelShort, 3 = FreeReels
    val animeResults: List<AnimeItem> = emptyList(),
    val dramaResults: List<DramaItem> = emptyList(),
    val reelShortResults: List<ReelShortBook> = emptyList(),
    val freeReelsResults: List<FreeReelsItem> = emptyList(),
    val isSearching: Boolean = false,
    val isLoadingMore: Boolean = false,
    val hasSearched: Boolean = false,
    val page: Int = 1,
    val endReached: Boolean = false,
    val errorMessage: String? = null
) {
    /** Anime dan FreeReels search tidak punya param page di API. */
    val canLoadMore: Boolean
        get() = (selectedTab == 1 || selectedTab == 2) && !endReached
}

class SearchViewModel(
    private val animeRepo: AnimeRepository = AnimeRepositoryImpl(),
    private val dramaRepo: DramaRepository = DramaRepositoryImpl(),
    private val reelShortRepo: ReelShortRepository = ReelShortRepositoryImpl(),
    private val freeReelsRepo: FreeReelsRepository = FreeReelsRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState.asStateFlow()

    fun onQueryChange(newQuery: String) {
        _uiState.update { it.copy(query = newQuery) }
    }

    fun onTabSelect(tabIndex: Int) {
        _uiState.update { it.copy(selectedTab = tabIndex) }
        if (_uiState.value.query.isNotBlank()) {
            search()
        }
    }

    fun search() {
        val q = _uiState.value.query.trim()
        if (q.isBlank()) return

        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isSearching = true,
                    isLoadingMore = false,
                    hasSearched = true,
                    errorMessage = null,
                    page = 1,
                    endReached = false
                )
            }
            val tab = _uiState.value.selectedTab
            when (tab) {
                0 -> {
                    // Anime: satu request, tanpa pagination.
                    animeRepo.search(q)
                        .onSuccess { list ->
                            _uiState.update {
                                it.copy(isSearching = false, animeResults = list, endReached = true)
                            }
                        }
                        .onFailure { err ->
                            _uiState.update { it.copy(isSearching = false, errorMessage = err.localizedMessage) }
                        }
                }
                1 -> {
                    dramaRepo.search(q, 1)
                        .onSuccess { list ->
                            _uiState.update {
                                it.copy(isSearching = false, dramaResults = list, page = 1, endReached = list.isEmpty())
                            }
                        }
                        .onFailure { err ->
                            _uiState.update { it.copy(isSearching = false, errorMessage = err.localizedMessage) }
                        }
                }
                2 -> {
                    reelShortRepo.search(q, 1)
                        .onSuccess { list ->
                            _uiState.update {
                                it.copy(isSearching = false, reelShortResults = list, page = 1, endReached = list.isEmpty())
                            }
                        }
                        .onFailure { err ->
                            _uiState.update { it.copy(isSearching = false, errorMessage = err.localizedMessage) }
                        }
                }
                3 -> {
                    freeReelsRepo.search(q)
                        .onSuccess { list ->
                            _uiState.update {
                                it.copy(isSearching = false, freeReelsResults = list, endReached = true)
                            }
                        }
                        .onFailure { err ->
                            _uiState.update { it.copy(isSearching = false, errorMessage = err.localizedMessage) }
                        }
                }
            }
        }
    }

    /** Dipanggil saat hasil pencarian di-scroll mendekati bawah. */
    fun loadMore() {
        val state = _uiState.value
        if (state.isSearching || state.isLoadingMore || !state.canLoadMore) return
        val q = state.query.trim()
        if (q.isBlank()) return

        viewModelScope.launch {
            _uiState.update { it.copy(isLoadingMore = true) }
            val nextPage = state.page + 1
            when (state.selectedTab) {
                1 -> dramaRepo.search(q, nextPage).onSuccess { list ->
                    val existing = _uiState.value.dramaResults.map { it.bookId }.toSet()
                    val fresh = list.filterNot { it.bookId in existing }
                    _uiState.update {
                        it.copy(
                            isLoadingMore = false,
                            dramaResults = it.dramaResults + fresh,
                            page = nextPage,
                            endReached = list.isEmpty() || fresh.isEmpty()
                        )
                    }
                }.onFailure { _uiState.update { it.copy(isLoadingMore = false, endReached = true) } }

                2 -> reelShortRepo.search(q, nextPage).onSuccess { list ->
                    val existing = _uiState.value.reelShortResults.map { it.id }.toSet()
                    val fresh = list.filterNot { it.id in existing }
                    _uiState.update {
                        it.copy(
                            isLoadingMore = false,
                            reelShortResults = it.reelShortResults + fresh,
                            page = nextPage,
                            endReached = list.isEmpty() || fresh.isEmpty()
                        )
                    }
                }.onFailure { _uiState.update { it.copy(isLoadingMore = false, endReached = true) } }

                else -> _uiState.update { it.copy(isLoadingMore = false, endReached = true) }
            }
        }
    }
}
