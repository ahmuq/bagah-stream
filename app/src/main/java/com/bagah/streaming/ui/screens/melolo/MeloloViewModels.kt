package com.bagah.streaming.ui.screens.melolo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.MeloloDetailResponse
import com.bagah.streaming.data.model.MeloloEpisodeMeta
import com.bagah.streaming.data.model.MeloloItem
import com.bagah.streaming.data.repository.melolo.MeloloRepository
import com.bagah.streaming.data.repository.melolo.MeloloRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class MeloloHomeUiState(
    val isLoading: Boolean = true,
    val items: List<MeloloItem> = emptyList(),
    val errorMessage: String? = null
)

class MeloloHomeViewModel(
    private val repository: MeloloRepository = MeloloRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(MeloloHomeUiState())
    val uiState: StateFlow<MeloloHomeUiState> = _uiState.asStateFlow()

    init {
        load()
    }

    fun load() {
        viewModelScope.launch {
            val previous = _uiState.value.items
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            repository.getFeed().onSuccess { items ->
                _uiState.update { it.copy(isLoading = false, items = items, errorMessage = null) }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        items = previous,
                        errorMessage = err.localizedMessage ?: "Gagal memuat Melolo"
                    )
                }
            }
        }
    }

    fun refresh() = load()
}

data class MeloloDetailUiState(
    val isLoading: Boolean = true,
    val detail: MeloloDetailResponse? = null,
    val episodes: List<MeloloEpisodeMeta> = emptyList(),
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
            repository.getDetail(seriesId).onSuccess { detail ->
                _uiState.update {
                    it.copy(isLoading = false, detail = detail, episodes = detail.episodes.sortedBy { ep -> ep.episodeNum })
                }
            }.onFailure { err ->
                _uiState.update {
                    it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat detail serial")
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

data class MeloloPlayerUiState(
    val seriesId: String = "",
    val currentEpisode: Int = 1,
    val title: String = "",
    val totalEpisodes: Int = 0,
    val episodes: List<MeloloEpisodeMeta> = emptyList(),
    val currentStreamUrl: String? = null,
    val currentKeyHex: String? = null,
    val isLoading: Boolean = true,
    val errorMessage: String? = null
)

class MeloloPlayerViewModel(
    private val repository: MeloloRepository = MeloloRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(MeloloPlayerUiState())
    val uiState: StateFlow<MeloloPlayerUiState> = _uiState.asStateFlow()

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
                        totalEpisodes = if (detail.totalEpisodes > 0) {
                            detail.totalEpisodes
                        } else {
                            detail.episodes.size
                        },
                        episodes = detail.episodes.sortedBy { ep -> ep.episodeNum }
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
        _uiState.update { it.copy(currentStreamUrl = null, currentKeyHex = null) }
        repository.getEpisode(seriesId, episode).onSuccess { response ->
            val url = response.streamUrl()
            when {
                url.isBlank() -> _uiState.update {
                    it.copy(isLoading = false, errorMessage = "Episode $episode tidak tersedia")
                }
                response.key.isBlank() && response.encrypted -> _uiState.update {
                    it.copy(isLoading = false, errorMessage = "Kunci dekripsi tidak tersedia")
                }
                else -> _uiState.update {
                    it.copy(
                        isLoading = false,
                        currentEpisode = response.episodeNum.coerceAtLeast(episode),
                        currentStreamUrl = url,
                        currentKeyHex = response.key,
                        errorMessage = null
                    )
                }
            }
        }.onFailure { err ->
            _uiState.update {
                it.copy(
                    isLoading = false,
                    errorMessage = err.localizedMessage ?: "Episode $episode tidak tersedia"
                )
            }
        }
    }
}
