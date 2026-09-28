package com.bagah.streaming.ui.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.DramaItem
import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.data.repository.anime.AnimeRepository
import com.bagah.streaming.data.repository.anime.AnimeRepositoryImpl
import com.bagah.streaming.data.repository.drama.DramaRepository
import com.bagah.streaming.data.repository.drama.DramaRepositoryImpl
import com.bagah.streaming.data.repository.reelshort.ReelShortRepository
import com.bagah.streaming.data.repository.reelshort.ReelShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class SearchUiState(
    val query: String = "",
    val selectedTab: Int = 0, // 0 = Anime, 1 = DramaBox, 2 = ReelShort
    val animeResults: List<AnimeItem> = emptyList(),
    val dramaResults: List<DramaItem> = emptyList(),
    val reelShortResults: List<ReelShortBook> = emptyList(),
    val isSearching: Boolean = false,
    val hasSearched: Boolean = false,
    val errorMessage: String? = null
)

class SearchViewModel(
    private val animeRepo: AnimeRepository = AnimeRepositoryImpl(),
    private val dramaRepo: DramaRepository = DramaRepositoryImpl(),
    private val reelShortRepo: ReelShortRepository = ReelShortRepositoryImpl()
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
            _uiState.update { it.copy(isSearching = true, hasSearched = true, errorMessage = null) }
            when (_uiState.value.selectedTab) {
                0 -> {
                    val res = animeRepo.search(q)
                    res.onSuccess { list ->
                        _uiState.update { it.copy(isSearching = false, animeResults = list) }
                    }.onFailure { err ->
                        _uiState.update { it.copy(isSearching = false, errorMessage = err.localizedMessage) }
                    }
                }
                1 -> {
                    val res = dramaRepo.search(q)
                    res.onSuccess { list ->
                        _uiState.update { it.copy(isSearching = false, dramaResults = list) }
                    }.onFailure { err ->
                        _uiState.update { it.copy(isSearching = false, errorMessage = err.localizedMessage) }
                    }
                }
                2 -> {
                    val res = reelShortRepo.search(q)
                    res.onSuccess { list ->
                        _uiState.update { it.copy(isSearching = false, reelShortResults = list) }
                    }.onFailure { err ->
                        _uiState.update { it.copy(isSearching = false, errorMessage = err.localizedMessage) }
                    }
                }
            }
        }
    }
}
