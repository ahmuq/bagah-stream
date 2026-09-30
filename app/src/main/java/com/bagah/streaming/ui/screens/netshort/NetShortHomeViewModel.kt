package com.bagah.streaming.ui.screens.netshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.model.NetShortItem
import com.bagah.streaming.data.repository.netshort.NetShortRepository
import com.bagah.streaming.data.repository.netshort.NetShortRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

private data class NetShortTab(val label: String, val key: String, val isChannel: Boolean)

private val NETSHORT_TABS = listOf(
    NetShortTab("TRENDING", "mostTrending", false),
    NetShortTab("PENCARIAN", "topSearch", false),
    NetShortTab("BARU", "newRelease", false),
    NetShortTab("POPULER", "soaringHeat", false),
    NetShortTab("AKTOR", "actorRanking", false),
    NetShortTab("CH POPULER", "315", true),
    NetShortTab("KEPUASAN", "316", true),
    NetShortTab("JUARA", "317", true),
    NetShortTab("BANGKIT", "318", true),
    NetShortTab("HUKUM", "319", true),
    NetShortTab("WANITA", "320", true),
    NetShortTab("ROMANTIS", "321", true),
    NetShortTab("CH BARU", "323", true),
    NetShortTab("DUBBING", "131", true),
    NetShortTab("ANIME", "127", true)
)

data class NetShortHomeUiState(
    val isLoading: Boolean = true,
    val selectedTab: String = "TRENDING",
    val tabs: List<String> = NETSHORT_TABS.map { it.label },
    val spotlightItems: List<NetShortItem> = emptyList(),
    val itemsByTab: Map<String, List<NetShortItem>> = emptyMap(),
    val loadingTabs: Set<String> = emptySet(),
    val errorMessage: String? = null
) {
    val currentDisplayList: List<NetShortItem>
        get() = itemsByTab[selectedTab].orEmpty().distinctBy { it.stableId() }
}

class NetShortHomeViewModel(
    private val repository: NetShortRepository = NetShortRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(NetShortHomeUiState())
    val uiState: StateFlow<NetShortHomeUiState> = _uiState.asStateFlow()

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

    fun loadData() {
        loadTab(_uiState.value.selectedTab, initial = true)
    }

    fun refresh() {
        NetworkClient.clearApiCache()
        loadData()
    }

    private fun loadTab(label: String, initial: Boolean) {
        val spec = NETSHORT_TABS.firstOrNull { it.label == label } ?: return
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = initial,
                    loadingTabs = it.loadingTabs + label,
                    errorMessage = null
                )
            }
            val result = if (spec.isChannel) {
                repository.getChannel(spec.key)
            } else {
                repository.getRanking(spec.key)
            }
            result
                .onSuccess { items ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            loadingTabs = it.loadingTabs - label,
                            itemsByTab = it.itemsByTab + (label to items),
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
                            errorMessage = err.localizedMessage ?: "Gagal memuat NetShort"
                        )
                    }
                }
        }
    }
}
