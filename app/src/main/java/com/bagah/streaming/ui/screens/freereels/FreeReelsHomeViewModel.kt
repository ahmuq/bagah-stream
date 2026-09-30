package com.bagah.streaming.ui.screens.freereels

import com.bagah.streaming.data.api.NetworkClient
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.FreeReelsItem
import com.bagah.streaming.data.repository.freereels.FreeReelsRepository
import com.bagah.streaming.data.repository.freereels.FreeReelsRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

private data class FreeReelsTab(val label: String, val key: String)

private val FREE_REELS_TABS = listOf(
    FreeReelsTab("POPULER", "503"),
    FreeReelsTab("NEW", "505"),
    FreeReelsTab("SEGERA HADIR", "622"),
    FreeReelsTab("DUBBING", "516"),
    FreeReelsTab("PEREMPUAN", "504"),
    FreeReelsTab("LAKI-LAKI", "506"),
    FreeReelsTab("ANIME", "547"),
    FreeReelsTab("UNTUK ANDA", "foryou")
)

data class FreeReelsHomeUiState(
    val isLoading: Boolean = true,
    val isLoadingMore: Boolean = false,
    val selectedTab: String = "POPULER",
    val tabs: List<String> = FREE_REELS_TABS.map { it.label },
    val spotlightItems: List<FreeReelsItem> = emptyList(),
    val popularItems: List<FreeReelsItem> = emptyList(),
    val itemsByTab: Map<String, List<FreeReelsItem>> = emptyMap(),
    val cursorByTab: Map<String, String?> = emptyMap(),
    val loadingTabs: Set<String> = emptySet(),
    val errorMessage: String? = null
) {
    val currentDisplayList: List<FreeReelsItem>
        get() = itemsByTab[selectedTab].orEmpty().distinctBy { it.stableId() }

    val canLoadMore: Boolean
        get() = cursorByTab[selectedTab] != null
}

class FreeReelsHomeViewModel(
    private val repository: FreeReelsRepository = FreeReelsRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(FreeReelsHomeUiState())
    val uiState: StateFlow<FreeReelsHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun selectTab(tab: String) {
        if (tab == _uiState.value.selectedTab) return
        _uiState.update { it.copy(selectedTab = tab) }
        if (_uiState.value.itemsByTab[tab] == null) {
            loadTab(tab, initial = false)
        }
    }

    fun refresh() {
        NetworkClient.clearApiCache()
        loadData()
    }

    fun loadData() {
        loadTab(_uiState.value.selectedTab, initial = true)
    }

    private fun loadTab(label: String, initial: Boolean) {
        val spec = FREE_REELS_TABS.firstOrNull { it.label == label } ?: return
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = initial,
                    loadingTabs = it.loadingTabs + label,
                    errorMessage = null
                )
            }
            repository.getBrowse(spec.key, cursor = null)
                .onSuccess { (items, cursor) ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            loadingTabs = it.loadingTabs - label,
                            itemsByTab = it.itemsByTab + (label to items),
                            cursorByTab = it.cursorByTab + (label to cursor),
                            popularItems = if (label == "POPULER") items else it.popularItems,
                            spotlightItems = if (it.spotlightItems.isEmpty()) items.take(6) else it.spotlightItems
                        )
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            loadingTabs = it.loadingTabs - label,
                            itemsByTab = it.itemsByTab + (label to emptyList()),
                            errorMessage = err.localizedMessage ?: "Gagal memuat FreeReels"
                        )
                    }
                }
        }
    }

    fun loadMore() {
        val state = _uiState.value
        if (state.isLoading || state.isLoadingMore) return
        val label = state.selectedTab
        val spec = FREE_REELS_TABS.firstOrNull { it.label == label } ?: return
        val cursor = state.cursorByTab[label] ?: return
        _uiState.update { it.copy(isLoadingMore = true) }

        viewModelScope.launch {
            repository.getBrowse(spec.key, cursor)
                .onSuccess { (list, next) ->
                    val existing = _uiState.value.itemsByTab[label].orEmpty().map { it.stableId() }.toSet()
                    val fresh = list.filterNot { it.stableId() in existing }
                    _uiState.update {
                        it.copy(
                            isLoadingMore = false,
                            itemsByTab = it.itemsByTab + (label to (it.itemsByTab[label].orEmpty() + fresh).distinctBy { f -> f.stableId() }),
                            cursorByTab = it.cursorByTab + (label to next)
                        )
                    }
                }
                .onFailure {
                    _uiState.update {
                        it.copy(isLoadingMore = false, cursorByTab = it.cursorByTab + (label to null))
                    }
                }
        }
    }
}
