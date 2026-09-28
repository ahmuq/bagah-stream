package com.bagah.streaming.ui.screens.reelshort

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
    val selectedTab: String = "POPULER",
    val tabs: List<String> = listOf("POPULER", "UNTUK ANDA", "TERBARU", "RANKING"),
    val spotlightBooks: List<ReelShortBook> = emptyList(),
    val popularBooks: List<ReelShortBook> = emptyList(),
    val latestBooks: List<ReelShortBook> = emptyList(),
    val rankingBooks: List<ReelShortBook> = emptyList(),
    val forYouBooks: List<ReelShortBook> = emptyList(),
    val allBooks: List<ReelShortBook> = emptyList(),
    val errorMessage: String? = null
) {
    val currentDisplayList: List<ReelShortBook>
        get() = when (selectedTab) {
            "UNTUK ANDA" -> forYouBooks.ifEmpty { popularBooks }
            "POPULER" -> popularBooks
            "RANKING" -> rankingBooks
            "TERBARU" -> latestBooks
            else -> popularBooks
        }
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
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val homepageDeferred = async { repository.getHomepage(1) }
            val trendingDeferred = async { repository.getTrending() }
            val latestDeferred = async { repository.getLatest() }
            val forYouDeferred = async { repository.getForYou(1) }

            val homepageData = homepageDeferred.await().getOrNull()
            val trending = trendingDeferred.await().getOrDefault(emptyList())
            val latest = latestDeferred.await().getOrDefault(emptyList())
            val forYou = forYouDeferred.await().getOrDefault(emptyList())

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
                        rankingBooks = popular.sortedByDescending { b -> b.chapterCount ?: 0 },
                        forYouBooks = forYou,
                        allBooks = combined,
                        errorMessage = null
                    )
                }
            }
        }
    }
}
