package com.bagah.streaming.ui.screens.shortmax

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.ShortMaxItem
import com.bagah.streaming.data.repository.shortmax.ShortMaxRepository
import com.bagah.streaming.data.repository.shortmax.ShortMaxRepositoryImpl
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ShortMaxHomeUiState(
    val isLoading: Boolean = true,
    val selectedTab: String = "POPULER",
    val tabs: List<String> = listOf("POPULER", "TERBARU", "RANKING", "UNTUK ANDA"),
    val spotlightItems: List<ShortMaxItem> = emptyList(),
    val trendingItems: List<ShortMaxItem> = emptyList(),
    val latestItems: List<ShortMaxItem> = emptyList(),
    val rankingItems: List<ShortMaxItem> = emptyList(),
    val forYouItems: List<ShortMaxItem> = emptyList(),
    val errorMessage: String? = null
) {
    val currentDisplayList: List<ShortMaxItem>
        get() = when (selectedTab) {
            "TERBARU" -> latestItems
            "RANKING" -> rankingItems
            "UNTUK ANDA" -> forYouItems.ifEmpty { trendingItems }
            else -> trendingItems
        }
}

class ShortMaxHomeViewModel(
    private val repository: ShortMaxRepository = ShortMaxRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(ShortMaxHomeUiState())
    val uiState: StateFlow<ShortMaxHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun selectTab(tab: String) {
        _uiState.update { it.copy(selectedTab = tab) }
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val trendingDeferred = async { repository.getTrending() }
            val latestDeferred = async { repository.getLatest() }
            val rankingDeferred = async { repository.getRankings() }
            val forYouDeferred = async { repository.getForYou() }

            val trending = trendingDeferred.await().getOrDefault(emptyList())
            val latest = latestDeferred.await().getOrDefault(emptyList())
            val ranking = rankingDeferred.await().getOrDefault(emptyList())
            val forYou = forYouDeferred.await().getOrDefault(emptyList())

            if (trending.isEmpty() && latest.isEmpty() && forYou.isEmpty()) {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = "Gagal memuat ShortMax. Silakan periksa koneksi."
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        spotlightItems = trending.take(6).ifEmpty { latest.take(6) },
                        trendingItems = trending,
                        latestItems = latest,
                        rankingItems = ranking,
                        forYouItems = forYou,
                        errorMessage = null
                    )
                }
            }
        }
    }
}
