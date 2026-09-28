package com.bagah.streaming.ui.screens.dramanova

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.DramaNovaDetailResponse
import com.bagah.streaming.data.model.DramaNovaEpisode
import com.bagah.streaming.data.model.DramaNovaItem
import com.bagah.streaming.data.repository.dramanova.DramaNovaRepository
import com.bagah.streaming.data.repository.dramanova.DramaNovaRepositoryImpl
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class DramaNovaHomeUiState(
    val isLoading: Boolean = true,
    val selectedTab: String = "POPULER",
    val tabs: List<String> = listOf("POPULER", "TERBARU", "RANKING"),
    val spotlightItems: List<DramaNovaItem> = emptyList(),
    val trendingItems: List<DramaNovaItem> = emptyList(),
    val latestItems: List<DramaNovaItem> = emptyList(),
    val rankingItems: List<DramaNovaItem> = emptyList(),
    val errorMessage: String? = null
) {
    val currentDisplayList: List<DramaNovaItem>
        get() = when (selectedTab) {
            "TERBARU" -> latestItems
            "RANKING" -> rankingItems
            else -> trendingItems
        }
}

class DramaNovaHomeViewModel(
    private val repository: DramaNovaRepository = DramaNovaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DramaNovaHomeUiState())
    val uiState: StateFlow<DramaNovaHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun selectTab(tab: String) {
        _uiState.update { it.copy(selectedTab = tab) }
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val homeDeferred = async { repository.getHome() }
            val trendingDeferred = async { repository.getTrending() }
            val latestDeferred = async { repository.getLatest() }
            val rankingDeferred = async { repository.getRankings() }

            val home = homeDeferred.await().getOrDefault(emptyList())
            val trending = trendingDeferred.await().getOrDefault(emptyList())
            val latest = latestDeferred.await().getOrDefault(emptyList())
            val ranking = rankingDeferred.await().getOrDefault(emptyList())

            val popular = home.ifEmpty { trending }
            if (popular.isEmpty() && latest.isEmpty()) {
                _uiState.update {
                    it.copy(isLoading = false, errorMessage = "Gagal memuat DramaNova. Silakan periksa koneksi.")
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        spotlightItems = popular.take(6),
                        trendingItems = popular,
                        latestItems = latest.ifEmpty { popular },
                        rankingItems = ranking.ifEmpty { popular },
                        errorMessage = null
                    )
                }
            }
        }
    }
}

data class DramaNovaDetailUiState(
    val isLoading: Boolean = true,
    val detail: DramaNovaDetailResponse? = null,
    val episodes: List<DramaNovaEpisode> = emptyList(),
    val errorMessage: String? = null
)

class DramaNovaDetailViewModel(
    private val seriesId: String,
    private val repository: DramaNovaRepository = DramaNovaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DramaNovaDetailUiState())
    val uiState: StateFlow<DramaNovaDetailUiState> = _uiState.asStateFlow()

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
                    val episodes = repository.getEpisodes(seriesId).getOrDefault(emptyList())
                    _uiState.update {
                        it.copy(isLoading = false, detail = detail, episodes = episodes, errorMessage = null)
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat detail DramaNova")
                    }
                }
        }
    }

    class Factory(private val seriesId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return DramaNovaDetailViewModel(seriesId) as T
        }
    }
}

data class DramaNovaPlayerUiState(
    val seriesId: String = "",
    val currentEpisode: Int = 1,
    val title: String = "",
    val totalEpisodes: Int = 0,
    val currentStreamUrl: String? = null,
    val isLoading: Boolean = true,
    val errorMessage: String? = null
)

class DramaNovaPlayerViewModel(
    private val repository: DramaNovaRepository = DramaNovaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(DramaNovaPlayerUiState())
    val uiState: StateFlow<DramaNovaPlayerUiState> = _uiState.asStateFlow()

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
                    it.copy(title = detail.title, totalEpisodes = detail.episodeCount())
                }
            }
            repository.getEpisodes(seriesId).onSuccess { list ->
                _uiState.update {
                    it.copy(totalEpisodes = if (it.totalEpisodes > 0) it.totalEpisodes else list.size)
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
                // DramaNova mengirim MP4 langsung di bestUrl; tidak ada enkripsi.
                val url = response.streamUrl()
                if (url.isBlank()) {
                    _uiState.update { it.copy(isLoading = false, errorMessage = "URL video tidak tersedia.") }
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
