package com.bagah.streaming.ui.screens.flickreels

import com.bagah.streaming.data.api.NetworkClient
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.FlickReelsItem
import com.bagah.streaming.data.repository.flickreels.FlickReelsRepository
import com.bagah.streaming.data.repository.flickreels.FlickReelsRepositoryImpl
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class FlickReelsHomeUiState(
    val isLoading: Boolean = true,
    val isLoadingMore: Boolean = false,
    val selectedTab: String = "POPULER",
    val tabs: List<String> = listOf("POPULER", "TERBARU", "UNTUK ANDA", "JELAJAH"),
    val spotlightItems: List<FlickReelsItem> = emptyList(),
    val trendingItems: List<FlickReelsItem> = emptyList(),
    val latestItems: List<FlickReelsItem> = emptyList(),
    val forYouItems: List<FlickReelsItem> = emptyList(),
    val exploreItems: List<FlickReelsItem> = emptyList(),
    val exploreCursor: String? = null,
    val exploreLoaded: Boolean = false,
    val loadingTab: Boolean = false,
    val selectedChannel: String = "All",
    val selectedRegion: String = "All",
    val selectedSort: String = "1",
    val selectedTag: String = "All",
    val errorMessage: String? = null
) {
    val currentDisplayList: List<FlickReelsItem>
        get() = when (selectedTab) {
            "UNTUK ANDA" -> forYouItems.ifEmpty { trendingItems }
            "TERBARU" -> latestItems.ifEmpty { trendingItems }
            "JELAJAH" -> exploreItems
            else -> trendingItems
        }.distinctBy { it.id }

    val canLoadMore: Boolean
        get() = selectedTab == "JELAJAH" && exploreCursor != null
}

class FlickReelsHomeViewModel(
    private val repository: FlickReelsRepository = FlickReelsRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(FlickReelsHomeUiState())
    val uiState: StateFlow<FlickReelsHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun selectTab(tab: String) {
        _uiState.update { it.copy(selectedTab = tab) }
        if (tab == "JELAJAH" && !_uiState.value.exploreLoaded) {
            loadExplore(reset = true)
        }
    }

    fun setChannel(value: String) = updateFilter { it.copy(selectedChannel = value) }
    fun setRegion(value: String) = updateFilter { it.copy(selectedRegion = value) }
    fun setSort(value: String) = updateFilter { it.copy(selectedSort = value) }
    fun setTag(value: String) = updateFilter { it.copy(selectedTag = value) }

    private fun updateFilter(transform: (FlickReelsHomeUiState) -> FlickReelsHomeUiState) {
        _uiState.update(transform)
        loadExplore(reset = true)
    }

    fun refresh() {
        NetworkClient.clearApiCache()
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val trendingDeferred = async { repository.getTrending() }
            val latestDeferred = async { repository.getLatest() }
            val forYouDeferred = async { repository.getForYou() }

            val trending = trendingDeferred.await().getOrDefault(emptyList())
            val latest = latestDeferred.await().getOrDefault(emptyList())
            val forYou = forYouDeferred.await().getOrDefault(emptyList())

            if (trending.isEmpty() && forYou.isEmpty()) {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = "Gagal memuat FlickReels. Silakan periksa koneksi."
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        spotlightItems = trending.take(6).ifEmpty { forYou.take(6) },
                        trendingItems = trending,
                        latestItems = latest,
                        forYouItems = forYou,
                        errorMessage = null
                    )
                }
            }
        }
    }

    private fun loadExplore(reset: Boolean) {
        val state = _uiState.value
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    loadingTab = true,
                    errorMessage = if (reset) null else it.errorMessage
                )
            }
            repository.getClassify(
                tag = state.selectedTag.takeIf { v -> v != "All" },
                channel = state.selectedChannel.takeIf { v -> v != "All" },
                region = state.selectedRegion.takeIf { v -> v != "All" },
                sort = state.selectedSort,
                cursor = if (reset) null else state.exploreCursor
            ).onSuccess { (items, cursor) ->
                _uiState.update {
                    it.copy(
                        loadingTab = false,
                        exploreLoaded = true,
                        exploreItems = if (reset) items else it.exploreItems + items,
                        exploreCursor = cursor
                    )
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        loadingTab = false,
                        exploreLoaded = true,
                        errorMessage = err.localizedMessage ?: "Gagal memuat FlickReels"
                    )
                }
            }
        }
    }

    fun loadMore() {
        val state = _uiState.value
        if (state.isLoading || state.isLoadingMore || state.loadingTab) return
        if (state.selectedTab != "JELAJAH" || state.exploreCursor == null) return
        _uiState.update { it.copy(isLoadingMore = true) }

        viewModelScope.launch {
            repository.getClassify(
                tag = state.selectedTag.takeIf { v -> v != "All" },
                channel = state.selectedChannel.takeIf { v -> v != "All" },
                region = state.selectedRegion.takeIf { v -> v != "All" },
                sort = state.selectedSort,
                cursor = state.exploreCursor
            ).onSuccess { (items, cursor) ->
                val existing = _uiState.value.exploreItems.map { it.id }.toSet()
                val fresh = items.filterNot { it.id in existing }
                _uiState.update {
                    it.copy(
                        isLoadingMore = false,
                        exploreItems = (it.exploreItems + fresh).distinctBy { f -> f.id },
                        exploreCursor = cursor
                    )
                }
            }.onFailure {
                _uiState.update { it.copy(isLoadingMore = false, exploreCursor = null) }
            }
        }
    }
}
