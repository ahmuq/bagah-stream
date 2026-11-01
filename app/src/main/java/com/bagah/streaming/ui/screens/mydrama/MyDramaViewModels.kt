package com.bagah.streaming.ui.screens.mydrama

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.model.MyDramaDetailResponse
import com.bagah.streaming.data.model.MyDramaEpisodeMeta
import com.bagah.streaming.data.model.MyDramaItem
import com.bagah.streaming.data.repository.mydrama.MyDramaRepository
import com.bagah.streaming.data.repository.mydrama.MyDramaRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class MyDramaHomeUiState(
    val isLoading: Boolean = true,
    val items: List<MyDramaItem> = emptyList(),
    val nextCursor: String? = null,
    val isLoadingMore: Boolean = false,
    val errorMessage: String? = null
)

class MyDramaHomeViewModel(
    private val repository: MyDramaRepository = MyDramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(MyDramaHomeUiState())
    val uiState: StateFlow<MyDramaHomeUiState> = _uiState.asStateFlow()

    init {
        loadFeed()
    }

    fun loadFeed() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            repository.getFeed()
                .onSuccess { (items, nextCursor) ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            items = items,
                            nextCursor = nextCursor
                        )
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = err.localizedMessage ?: "Gagal memuat MyDrama"
                        )
                    }
                }
        }
    }

    fun refresh() {
        NetworkClient.clearApiCache()
        _uiState.update { it.copy(items = emptyList(), nextCursor = null) }
        loadFeed()
    }

    fun loadMore() {
        val state = _uiState.value
        val cursor = state.nextCursor ?: return
        if (state.isLoading || state.isLoadingMore) return

        _uiState.update { it.copy(isLoadingMore = true) }
        viewModelScope.launch {
            repository.getFeed(cursor)
                .onSuccess { (items, nextCursor) ->
                    _uiState.update {
                        it.copy(
                            isLoadingMore = false,
                            items = (it.items + items).distinctBy { item -> item.stableId() },
                            nextCursor = nextCursor
                        )
                    }
                }
                .onFailure {
                    _uiState.update { it.copy(isLoadingMore = false, nextCursor = null) }
                }
        }
    }
}

data class MyDramaDetailUiState(
    val isLoading: Boolean = true,
    val detail: MyDramaDetailResponse? = null,
    val episodes: List<MyDramaEpisodeMeta> = emptyList(),
    val errorMessage: String? = null
)

class MyDramaDetailViewModel(
    private val seriesId: String,
    private val repository: MyDramaRepository = MyDramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(MyDramaDetailUiState())
    val uiState: StateFlow<MyDramaDetailUiState> = _uiState.asStateFlow()

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
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            detail = detail,
                            episodes = detail.episodeList(),
                            errorMessage = null
                        )
                    }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = err.localizedMessage ?: "Gagal memuat detail serial"
                        )
                    }
                }
        }
    }

    class Factory(private val seriesId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return MyDramaDetailViewModel(seriesId) as T
        }
    }
}

data class MyDramaPlayerUiState(
    val seriesId: String = "",
    val currentEpisode: Int = 1,
    val title: String = "",
    val totalEpisodes: Int = 0,
    val episodes: List<MyDramaEpisodeMeta> = emptyList(),
    val currentStreamUrl: String? = null,
    val currentSubtitleUrl: String? = null,
    val currentSubtitleLanguage: String = "id",
    val isLoading: Boolean = true,
    val errorMessage: String? = null
)

class MyDramaPlayerViewModel(
    private val repository: MyDramaRepository = MyDramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(MyDramaPlayerUiState())
    val uiState: StateFlow<MyDramaPlayerUiState> = _uiState.asStateFlow()

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
                val episodes = detail.episodeList()
                _uiState.update {
                    it.copy(
                        title = detail.displayTitle(),
                        totalEpisodes = if (detail.totalEpisodes > 0) {
                            detail.totalEpisodes
                        } else {
                            episodes.size
                        },
                        episodes = episodes
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
        _uiState.update { it.copy(currentStreamUrl = null, currentSubtitleUrl = null) }
        repository.getEpisode(seriesId, episode)
            .onSuccess { response ->
                val url = response.streamUrl()
                val subtitle = response.preferredSubtitle()
                if (url.isBlank()) {
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = "URL video tidak tersedia.")
                    }
                } else {
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            currentStreamUrl = url,
                            currentSubtitleUrl = subtitle?.second,
                            currentSubtitleLanguage = subtitle?.first ?: "id",
                            errorMessage = null
                        )
                    }
                }
            }
            .onFailure { err ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = err.localizedMessage ?: "Gagal memuat episode $episode"
                    )
                }
            }
    }
}
