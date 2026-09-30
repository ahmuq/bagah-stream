package com.bagah.streaming.ui.screens.pinedrama

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.PineDramaChapter
import com.bagah.streaming.data.model.PineDramaDetailResponse
import com.bagah.streaming.data.model.PineDramaItem
import com.bagah.streaming.data.repository.pinedrama.PineDramaRepository
import com.bagah.streaming.data.repository.pinedrama.PineDramaRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class PineTab(val label: String, val key: String, val isCategory: Boolean)

private val PINEDRAMA_FOR_YOU = PineTab("UNTUK ANDA", "foryou", false)

data class PineDramaHomeUiState(
    val isLoading: Boolean = true,
    val selectedTab: String = "UNTUK ANDA",
    val tabSpecs: List<PineTab> = listOf(PINEDRAMA_FOR_YOU),
    val spotlightItems: List<PineDramaItem> = emptyList(),
    val itemsByTab: Map<String, List<PineDramaItem>> = emptyMap(),
    val cursorByTab: Map<String, String?> = emptyMap(),
    val pageByTab: Map<String, Int?> = emptyMap(),
    val loadingTabs: Set<String> = emptySet(),
    val isLoadingMore: Boolean = false,
    val errorMessage: String? = null
) {
    val tabs: List<String>
        get() = tabSpecs.map { it.label }

    val currentDisplayList: List<PineDramaItem>
        get() = itemsByTab[selectedTab].orEmpty().distinctBy { it.stableId() }

    /** Tab "UNTUK ANDA" memakai `page`; tab kategori memakai `cursor`. */
    val canLoadMore: Boolean
        get() {
            val spec = tabSpecs.firstOrNull { it.label == selectedTab } ?: return false
            return if (spec.isCategory) cursorByTab[selectedTab] != null else pageByTab[selectedTab] != null
        }
}

class PineDramaHomeViewModel(
    private val repository: PineDramaRepository = PineDramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(PineDramaHomeUiState())
    val uiState: StateFlow<PineDramaHomeUiState> = _uiState.asStateFlow()

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
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            // Kategori membentuk sebagian besar tab.
            val categories = repository.getCategories().getOrDefault(emptyList())
            if (categories.isNotEmpty()) {
                val categoryTabs = categories
                    .filter { it.categoryId.isNotBlank() && it.categoryId != "0" }
                    .map { PineTab(it.name.uppercase(), it.categoryId, true) }
                _uiState.update {
                    it.copy(tabSpecs = listOf(PINEDRAMA_FOR_YOU) + categoryTabs)
                }
            }

            loadTab(_uiState.value.selectedTab, initial = true)
        }
    }

    private fun loadTab(label: String, initial: Boolean) {
        val spec = _uiState.value.tabSpecs.firstOrNull { it.label == label } ?: return
        viewModelScope.launch {
            _uiState.update {
                it.copy(
                    isLoading = initial,
                    loadingTabs = it.loadingTabs + label,
                    errorMessage = null
                )
            }
            val result = if (spec.isCategory) {
                repository.getCategory(spec.key)
            } else {
                repository.getForYou(page = 1).map { items -> items to null }
            }

            result
                .onSuccess { (items, cursor) ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            loadingTabs = it.loadingTabs - label,
                            itemsByTab = it.itemsByTab + (label to items),
                            cursorByTab = it.cursorByTab + (label to cursor),
                            pageByTab = it.pageByTab + (label to 1),
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
                            errorMessage = err.localizedMessage ?: "Gagal memuat PineDrama"
                        )
                    }
                }
        }
    }

    fun loadMore() {
        val state = _uiState.value
        if (state.isLoading || state.isLoadingMore || state.loadingTabs.contains(state.selectedTab)) return
        val spec = state.tabSpecs.firstOrNull { it.label == state.selectedTab } ?: return
        if (!state.canLoadMore) return
        // Tandai sinkron agar tidak ada dua loadMore paralel.
        _uiState.update { it.copy(isLoadingMore = true) }

        viewModelScope.launch {
            val label = state.selectedTab
            val existing = state.itemsByTab[label].orEmpty()
            if (spec.isCategory) {
                val cursor = state.cursorByTab[label] ?: run {
                    _uiState.update { it.copy(isLoadingMore = false) }
                    return@launch
                }
                repository.getCategory(spec.key, cursor = cursor)
                    .onSuccess { (items, next) ->
                        val known = existing.map { it.stableId() }.toSet()
                        val fresh = items.filterNot { it.stableId() in known }
                        _uiState.update {
                            it.copy(
                                isLoadingMore = false,
                                itemsByTab = it.itemsByTab + (label to (existing + fresh).distinctBy { f -> f.stableId() }),
                                cursorByTab = it.cursorByTab + (label to next)
                            )
                        }
                    }
                    .onFailure {
                        _uiState.update {
                            it.copy(isLoadingMore = false, cursorByTab = it.cursorByTab + (label to null))
                        }
                    }
            } else {
                val nextPage = (state.pageByTab[label] ?: 1) + 1
                repository.getForYou(page = nextPage)
                    .onSuccess { items ->
                        val known = existing.map { it.stableId() }.toSet()
                        val fresh = items.filterNot { it.stableId() in known }
                        _uiState.update {
                            it.copy(
                                isLoadingMore = false,
                                itemsByTab = it.itemsByTab + (label to (existing + fresh).distinctBy { f -> f.stableId() }),
                                pageByTab = it.pageByTab + (label to if (fresh.isEmpty()) null else nextPage)
                            )
                        }
                    }
                    .onFailure {
                        _uiState.update {
                            it.copy(isLoadingMore = false, pageByTab = it.pageByTab + (label to null))
                        }
                    }
            }
        }
    }
}

data class PineDramaDetailUiState(
    val isLoading: Boolean = true,
    val detail: PineDramaDetailResponse? = null,
    val episodes: List<PineDramaChapter> = emptyList(),
    val errorMessage: String? = null
)

class PineDramaDetailViewModel(
    private val seriesId: String,
    private val repository: PineDramaRepository = PineDramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(PineDramaDetailUiState())
    val uiState: StateFlow<PineDramaDetailUiState> = _uiState.asStateFlow()

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
                    // `chapters` sudah memuat daftar episode; URL stream dari endpoint episode.
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            detail = detail,
                            episodes = detail.chapters,
                            errorMessage = null
                        )
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = err.localizedMessage ?: "Gagal memuat detail PineDrama"
                        )
                    }
                }
        }
    }

    class Factory(private val seriesId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return PineDramaDetailViewModel(seriesId) as T
        }
    }
}

data class PineDramaPlayerUiState(
    val seriesId: String = "",
    val currentEpisode: Int = 1,
    val title: String = "",
    val totalEpisodes: Int = 0,
    val episodes: List<PineDramaChapter> = emptyList(),
    val currentStreamUrl: String? = null,
    val isLoading: Boolean = true,
    val errorMessage: String? = null
)

class PineDramaPlayerViewModel(
    private val repository: PineDramaRepository = PineDramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(PineDramaPlayerUiState())
    val uiState: StateFlow<PineDramaPlayerUiState> = _uiState.asStateFlow()

    fun initPlayer(seriesId: String, initialEpisode: Int = 1) {
        if (seriesId.isBlank()) {
            _uiState.update { it.copy(isLoading = false, errorMessage = "Serial tidak valid") }
            return
        }
        _uiState.update {
            it.copy(
                seriesId = seriesId,
                currentEpisode = initialEpisode.coerceAtLeast(1),
                isLoading = true,
                errorMessage = null
            )
        }

        viewModelScope.launch {
            repository.getDetail(seriesId).onSuccess { detail ->
                _uiState.update {
                    it.copy(
                        title = detail.title,
                        totalEpisodes = if (detail.totalEpisodes > 0) detail.totalEpisodes else detail.chapters.size,
                        episodes = detail.chapters
                    )
                }
            }
            loadStream(seriesId, initialEpisode.coerceAtLeast(1))
        }
    }

    fun playEpisode(episode: Int) {
        val total = _uiState.value.totalEpisodes.coerceAtLeast(1)
        val target = episode.coerceIn(1, total)
        if (target == _uiState.value.currentEpisode && _uiState.value.currentStreamUrl != null) return

        _uiState.update { it.copy(currentEpisode = target, isLoading = true, errorMessage = null) }
        viewModelScope.launch { loadStream(_uiState.value.seriesId, target) }
    }

    fun playNext() {
        val next = _uiState.value.currentEpisode + 1
        if (next <= _uiState.value.totalEpisodes) playEpisode(next)
    }

    fun playPrevious() {
        val prev = _uiState.value.currentEpisode - 1
        if (prev >= 1) playEpisode(prev)
    }

    private suspend fun loadStream(seriesId: String, episode: Int) {
        repository.getEpisode(seriesId, episode)
            .onSuccess { response ->
                // PineDrama mengirim MP4 langsung; tidak perlu dekripsi.
                val fallback = _uiState.value.episodes
                    .firstOrNull { it.episodeNum == episode }?.bestUrl
                val url = response.streamUrl().ifBlank { fallback.orEmpty() }
                if (url.isBlank()) {
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = "URL video tidak tersedia.")
                    }
                } else {
                    _uiState.update {
                        it.copy(isLoading = false, currentStreamUrl = url, errorMessage = null)
                    }
                }
            }
            .onFailure { err ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = err.localizedMessage ?: "Gagal memuat video episode $episode"
                    )
                }
            }
    }
}
