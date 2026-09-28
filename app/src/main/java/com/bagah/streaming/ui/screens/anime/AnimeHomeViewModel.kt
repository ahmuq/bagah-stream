package com.bagah.streaming.ui.screens.anime

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.repository.anime.AnimeRepository
import com.bagah.streaming.data.repository.anime.AnimeRepositoryImpl
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class AnimeHomeUiState(
    val isLoading: Boolean = true,
    val latest: List<AnimeItem> = emptyList(),
    val ongoing: List<AnimeItem> = emptyList(),
    val movies: List<AnimeItem> = emptyList(),
    val recommendations: List<AnimeItem> = emptyList(),
    val errorMessage: String? = null
)

class AnimeHomeViewModel(
    private val repository: AnimeRepository = AnimeRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(AnimeHomeUiState())
    val uiState: StateFlow<AnimeHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val latestDeferred = async { repository.getLatest(1) }
            val ongoingDeferred = async { repository.getOngoing(1) }
            val moviesDeferred = async { repository.getMovies() }
            val recsDeferred = async { repository.getRecommendations() }

            val latestRes = latestDeferred.await()
            val ongoingRes = ongoingDeferred.await()
            val moviesRes = moviesDeferred.await()
            val recsRes = recsDeferred.await()

            val latest = latestRes.getOrDefault(emptyList())
            val ongoing = ongoingRes.getOrDefault(emptyList())
            val movies = moviesRes.getOrDefault(emptyList())
            val recs = recsRes.getOrDefault(emptyList())

            if (latest.isEmpty() && ongoing.isEmpty() && movies.isEmpty()) {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        errorMessage = "Gagal memuat data anime. Silakan periksa koneksi internet."
                    )
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        latest = latest,
                        ongoing = ongoing,
                        movies = movies,
                        recommendations = recs,
                        errorMessage = null
                    )
                }
            }
        }
    }
}
