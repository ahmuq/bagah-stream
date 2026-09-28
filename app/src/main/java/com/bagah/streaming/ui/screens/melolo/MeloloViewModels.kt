package com.bagah.streaming.ui.screens.melolo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.MeloloDetailResponse
import com.bagah.streaming.data.model.MeloloEpisode
import com.bagah.streaming.data.model.MeloloItem
import com.bagah.streaming.data.repository.melolo.MeloloRepository
import com.bagah.streaming.data.repository.melolo.MeloloRepositoryImpl
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class MeloloHomeUiState(
    val isLoading: Boolean = true,
    val selectedTab: String = "POPULER",
    val tabs: List<String> = listOf("POPULER", "TERBARU", "RANKING", "UNTUK ANDA"),
    val spotlightItems: List<MeloloItem> = emptyList(),
    val trendingItems: List<MeloloItem> = emptyList(),
    val latestItems: List<MeloloItem> = emptyList(),
    val rankingItems: List<MeloloItem> = emptyList(),
    val forYouItems: List<MeloloItem> = emptyList(),
    val errorMessage: String? = null
) {
    val currentDisplayList: List<MeloloItem>
        get() = when (selectedTab) {
            "TERBARU" -> latestItems
            "RANKING" -> rankingItems
            "UNTUK ANDA" -> forYouItems.ifEmpty { trendingItems }
            else -> trendingItems
        }
}

class MeloloHomeViewModel(
    private val repository: MeloloRepository = MeloloRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(MeloloHomeUiState())
    val uiState: StateFlow<MeloloHomeUiState> = _uiState.asStateFlow()

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
                    it.copy(isLoading = false, errorMessage = "Gagal memuat Melolo. Silakan periksa koneksi.")
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

data class MeloloDetailUiState(
    val isLoading: Boolean = true,
    val detail: MeloloDetailResponse? = null,
    val episodes: List<MeloloEpisode> = emptyList(),
    val errorMessage: String? = null
)

class MeloloDetailViewModel(
    private val seriesId: String,
    private val repository: MeloloRepository = MeloloRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(MeloloDetailUiState())
    val uiState: StateFlow<MeloloDetailUiState> = _uiState.asStateFlow()

    init {
        loadDetail()
    }

    fun loadDetail() {
        if (seriesId.isBlank()) {
            _uiState.update { it.copy(isLoading = false, errorMessage = "Serial tidak valid") }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            repository.getDetail(seriesId)
                .onSuccess { detail ->
                    val episodes = detail.data?.episodes
                        ?.takeIf { it.isNotEmpty() }
                        ?: repository.getEpisodes(seriesId).getOrDefault(emptyList())
                    _uiState.update {
                        it.copy(isLoading = false, detail = detail, episodes = episodes, errorMessage = null)
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat detail Melolo")
                    }
                }
        }
    }

    class Factory(private val seriesId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MeloloDetailViewModel(seriesId) as T
        }
    }
}
