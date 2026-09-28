package com.bagah.streaming.ui.screens.reelshort

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.ReelShortBook
import com.bagah.streaming.data.model.ReelShortTab
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
    val tabs: List<String> = listOf("POPULER", "UNTUK ANDA", "TERBARU", "RANKING", "ASIA"),
    val spotlightBooks: List<ReelShortBook> = emptyList(),
    val popularBooks: List<ReelShortBook> = emptyList(),
    val forYouBooks: List<ReelShortBook> = emptyList(),
    val allBooks: List<ReelShortBook> = emptyList(),
    val errorMessage: String? = null
) {
    val currentDisplayList: List<ReelShortBook>
        get() = when (selectedTab) {
            "UNTUK ANDA" -> forYouBooks.ifEmpty { popularBooks }
            "POPULER" -> popularBooks
            "RANKING" -> popularBooks.sortedByDescending { it.collect_count ?: 0L }
            "TERBARU" -> allBooks.reversed().ifEmpty { popularBooks }
            "ASIA" -> allBooks.filter { it.theme.any { t -> t.contains("Asia", ignoreCase = true) } }
                .ifEmpty { popularBooks.takeLast(12) }
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
            val forYouDeferred = async { repository.getForYou(1) }

            val homepageRes = homepageDeferred.await()
            val forYouRes = forYouDeferred.await()

            val homepageData = homepageRes.getOrNull()
            val forYouBooks = forYouRes.getOrDefault(emptyList())

            val lists = homepageData?.lists ?: emptyList()
            val spotlight = lists.firstOrNull()?.books ?: emptyList()
            val popular = if (lists.size > 1) lists[1].books else spotlight
            val combined = (spotlight + popular + forYouBooks).distinctBy { it.book_id }

            val tabNames = if (!homepageData?.tab_list.isNullOrEmpty()) {
                val apiTabs = homepageData.tab_list.map { it.tab_name }
                (listOf("POPULER", "UNTUK ANDA") + apiTabs.filter { it != "POPULER" }).distinct()
            } else {
                listOf("POPULER", "UNTUK ANDA", "TERBARU", "RANKING", "ASIA")
            }

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
                        tabs = tabNames,
                        spotlightBooks = spotlight.take(6).ifEmpty { popular.take(6) },
                        popularBooks = popular,
                        forYouBooks = forYouBooks,
                        allBooks = combined,
                        errorMessage = null
                    )
                }
            }
        }
    }
}
