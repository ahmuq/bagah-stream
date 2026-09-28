package com.bagah.streaming.ui.screens.flickreels

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
    val selectedTab: String = "POPULER",
    val tabs: List<String> = listOf("POPULER", "UNTUK ANDA"),
    val spotlightItems: List<FlickReelsItem> = emptyList(),
    val trendingItems: List<FlickReelsItem> = emptyList(),
    val forYouItems: List<FlickReelsItem> = emptyList(),
    val errorMessage: String? = null
) {
    val currentDisplayList: List<FlickReelsItem>
        get() = when (selectedTab) {
            "UNTUK ANDA" -> forYouItems.ifEmpty { trendingItems }
            else -> trendingItems
        }
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
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val trendingDeferred = async { repository.getTrending() }
            val forYouDeferred = async { repository.getForYou() }

            val trending = trendingDeferred.await().getOrDefault(emptyList())
            val forYou = forYouDeferred.await().getOrDefault(emptyList())
            val popular = trending.ifEmpty { forYou }

            if (popular.isEmpty()) {
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
                        spotlightItems = popular.take(6),
                        trendingItems = popular,
                        forYouItems = forYou,
                        errorMessage = null
                    )
                }
            }
        }
    }
}
