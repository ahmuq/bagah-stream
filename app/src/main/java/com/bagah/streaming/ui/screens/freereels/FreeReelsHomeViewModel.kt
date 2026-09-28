package com.bagah.streaming.ui.screens.freereels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.FreeReelsItem
import com.bagah.streaming.data.repository.freereels.FreeReelsRepository
import com.bagah.streaming.data.repository.freereels.FreeReelsRepositoryImpl
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class FreeReelsHomeUiState(
    val isLoading: Boolean = true,
    val isLoadingMore: Boolean = false,
    val selectedTab: String = "POPULER",
    val tabs: List<String> = listOf("POPULER", "TERBARU", "ANIME", "UNTUK ANDA"),
    val spotlightItems: List<FreeReelsItem> = emptyList(),
    val popularItems: List<FreeReelsItem> = emptyList(),
    val latestItems: List<FreeReelsItem> = emptyList(),
    val animeItems: List<FreeReelsItem> = emptyList(),
    val forYouItems: List<FreeReelsItem> = emptyList(),
    val nextCursor: String? = null,
    val endReached: Boolean = false,
    val errorMessage: String? = null
) {
    val currentDisplayList: List<FreeReelsItem>
        get() = when (selectedTab) {
            "TERBARU" -> latestItems
            "ANIME" -> animeItems
            "UNTUK ANDA" -> forYouItems.ifEmpty { popularItems }
            else -> popularItems
        }

    /** Hanya feed "UNTUK ANDA" yang punya cursor untuk halaman berikutnya. */
    val canLoadMore: Boolean
        get() = selectedTab == "UNTUK ANDA" && !endReached
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
        _uiState.update { it.copy(selectedTab = tab) }
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update {
                it.copy(isLoading = true, isLoadingMore = false, errorMessage = null, endReached = false)
            }

            val forYouDeferred = async { repository.getForYou() }
            val trendingDeferred = async { repository.getTrending() }
            val latestDeferred = async { repository.getLatest() }
            val animeDeferred = async { repository.getAnime() }

            val forYouResult = forYouDeferred.await()
            val trending = trendingDeferred.await().getOrDefault(emptyList())
            val latest = latestDeferred.await().getOrDefault(emptyList())
            val anime = animeDeferred.await().getOrDefault(emptyList())
            val forYou = forYouResult.getOrNull()?.first ?: emptyList()
            val next = forYouResult.getOrNull()?.second

            val popular = trending.ifEmpty { forYou }
            if (popular.isEmpty() && latest.isEmpty() && anime.isEmpty()) {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = "Gagal memuat FreeReels. Silakan periksa koneksi."
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        spotlightItems = popular.take(6),
                        popularItems = popular,
                        latestItems = latest,
                        animeItems = anime,
                        forYouItems = forYou,
                        nextCursor = next,
                        endReached = next.isNullOrBlank()
                    )
                }
            }
        }
    }

    fun loadMore() {
        val state = _uiState.value
        if (state.isLoading || state.isLoadingMore || !state.canLoadMore) return
        val cursor = state.nextCursor ?: return

        viewModelScope.launch {
            _uiState.update { it.copy(isLoadingMore = true) }
            repository.getForYou(cursor)
                .onSuccess { (list, next) ->
                    val existing = _uiState.value.forYouItems.map { it.stableId() }.toSet()
                    val fresh = list.filterNot { it.stableId() in existing }
                    _uiState.update {
                        it.copy(
                            isLoadingMore = false,
                            forYouItems = it.forYouItems + fresh,
                            nextCursor = next,
                            endReached = fresh.isEmpty() || next.isNullOrBlank()
                        )
                    }
                }
                .onFailure {
                    _uiState.update { it.copy(isLoadingMore = false, endReached = true) }
                }
        }
    }
}
