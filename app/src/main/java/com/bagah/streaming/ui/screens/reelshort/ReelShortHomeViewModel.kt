package com.bagah.streaming.ui.screens.reelshort

import com.bagah.streaming.data.api.NetworkClient
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.data.repository.reelshort.ReelShortRepository
import com.bagah.streaming.data.repository.reelshort.ReelShortRepositoryImpl
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ReelShortHomeUiState(
    val isLoading: Boolean = true,
    val isLoadingMore: Boolean = false,
    val selectedTab: String = "POPULER",
    val tabs: List<String> = listOf("POPULER", "UNTUK ANDA", "TERBARU", "RANKING", "JELAJAH"),
    val spotlightBooks: List<ReelShortBook> = emptyList(),
    val popularBooks: List<ReelShortBook> = emptyList(),
    val latestBooks: List<ReelShortBook> = emptyList(),
    val rankingBooks: List<ReelShortBook> = emptyList(),
    val forYouBooks: List<ReelShortBook> = emptyList(),
    val exploreBooks: List<ReelShortBook> = emptyList(),
    val selectedGenre: String = "All",
    val selectedRegion: String = "All",
    val exploreLoaded: Boolean = false,
    val loadingExplore: Boolean = false,
    val allBooks: List<ReelShortBook> = emptyList(),
    val forYouPage: Int = 1,
    val rankingPeriod: Int = 1,
    val isLoadingRanking: Boolean = false,
    val endReached: Boolean = false,
    val errorMessage: String? = null
) {
    val currentDisplayList: List<ReelShortBook>
        get() = when (selectedTab) {
            "UNTUK ANDA" -> forYouBooks.ifEmpty { popularBooks }
            "POPULER" -> popularBooks
            "RANKING" -> rankingBooks
            "TERBARU" -> latestBooks
            "JELAJAH" -> exploreBooks
            else -> popularBooks
        }.distinctBy { it.id }

    val canLoadMore: Boolean
        get() = selectedTab == "UNTUK ANDA" && !endReached
}

class ReelShortHomeViewModel(
    private val repository: ReelShortRepository = ReelShortRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(ReelShortHomeUiState())
    val uiState: StateFlow<ReelShortHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun selectTab(tab: String) {
        _uiState.update { it.copy(selectedTab = tab) }
        if (tab == "UNTUK ANDA") {
            _uiState.update { it.copy(endReached = false, forYouPage = 1) }
        }
        if (tab == "JELAJAH" && !_uiState.value.exploreLoaded) {
            loadExplore()
        }
    }

    fun setGenre(value: String) {
        if (value == _uiState.value.selectedGenre) return
        _uiState.update { it.copy(selectedGenre = value) }
        loadExplore()
    }

    fun setRegion(value: String) {
        if (value == _uiState.value.selectedRegion) return
        _uiState.update { it.copy(selectedRegion = value) }
        loadExplore()
    }

    private fun loadExplore() {
        val state = _uiState.value
        viewModelScope.launch {
            _uiState.update { it.copy(loadingExplore = true) }
            repository.getClassify(
                genre = state.selectedGenre.takeIf { v -> v != "All" },
                region = state.selectedRegion.takeIf { v -> v != "All" }
            ).onSuccess { list ->
                _uiState.update {
                    it.copy(loadingExplore = false, exploreLoaded = true, exploreBooks = list.distinctBy { b -> b.id })
                }
            }.onFailure {
                _uiState.update {
                    it.copy(loadingExplore = false, exploreLoaded = true, exploreBooks = emptyList())
                }
            }
        }
    }

    fun setRankingPeriod(period: Int) {
        if (period == _uiState.value.rankingPeriod) return
        _uiState.update { it.copy(rankingPeriod = period) }
        loadRanking(period)
    }

    private fun loadRanking(period: Int) {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoadingRanking = true) }
            repository.getRanking(period)
                .onSuccess { list ->
                    _uiState.update {
                        it.copy(isLoadingRanking = false, rankingBooks = list)
                    }
                }
                .onFailure {
                    _uiState.update {
                        it.copy(isLoadingRanking = false, rankingBooks = emptyList())
                    }
                }
        }
    }

    fun loadMore() {
        val state = _uiState.value
        if (state.isLoading || state.isLoadingMore || !state.canLoadMore) return
        _uiState.update { it.copy(isLoadingMore = true) }

        viewModelScope.launch {
            val nextPage = state.forYouPage + 1
            repository.getForYou(nextPage)
                .onSuccess { list ->
                    val existing = _uiState.value.forYouBooks.map { it.id }.toSet()
                    val fresh = list.filterNot { it.id in existing }
                    _uiState.update {
                        it.copy(
                            isLoadingMore = false,
                            forYouBooks = (it.forYouBooks + fresh).distinctBy { b -> b.id },
                            allBooks = (it.allBooks + fresh).distinctBy { b -> b.id },
                            forYouPage = nextPage,
                            endReached = list.isEmpty() || fresh.isEmpty()
                        )
                    }
                }
                .onFailure {
                    _uiState.update { it.copy(isLoadingMore = false, endReached = true) }
                }
        }
    }

    fun refresh() {
        NetworkClient.clearApiCache()
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val homepageDeferred = async { repository.getHomepage(1) }
            val trendingDeferred = async { repository.getTrending() }
            val latestDeferred = async { repository.getLatest() }
            val forYouDeferred = async { repository.getForYou(1) }
            val rankingDeferred = async { repository.getRanking(_uiState.value.rankingPeriod) }

            val homepageData = homepageDeferred.await().getOrNull()
            val trending = trendingDeferred.await().getOrDefault(emptyList())
            val latest = latestDeferred.await().getOrDefault(emptyList())
            val forYou = forYouDeferred.await().getOrDefault(emptyList())
            val ranking = rankingDeferred.await().getOrDefault(emptyList())

            val popular = if (trending.isNotEmpty()) trending else homepageData?.items.orEmpty()
            val combined = (popular + latest + forYou).distinctBy { it.id }

            if (combined.isEmpty()) {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = "Gagal memuat drama ReelShort. Silakan periksa koneksi."
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        spotlightBooks = popular.take(6),
                        popularBooks = popular,
                        latestBooks = latest.ifEmpty { popular.reversed() },
                        rankingBooks = ranking,
                        forYouBooks = forYou,
                        allBooks = combined,
                        errorMessage = null
                    )
                }
            }
        }
    }
}
