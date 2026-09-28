package com.bagah.streaming.ui.screens.anime

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.AnimeItem
import com.bagah.streaming.data.model.AnimeScheduleDay
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
    val schedule: List<AnimeScheduleDay> = emptyList(),
    val selectedDay: String = "Semua",
    val errorMessage: String? = null
) {
    val spotlightItems: List<AnimeItem>
        get() = recommendations.take(5).ifEmpty { latest.take(5) }

    val availableDays: List<String>
        get() = if (schedule.isEmpty()) {
            listOf("Semua", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")
        } else {
            listOf("Semua") + schedule.map { it.day }
        }

    val currentOngoingList: List<AnimeItem>
        get() {
            if (selectedDay == "Semua") return ongoing
            val dayData = schedule.firstOrNull { it.day.equals(selectedDay, ignoreCase = true) }
            return dayData?.animeList?.map { it.toAnimeItem() } ?: emptyList()
        }
}

class AnimeHomeViewModel(
    private val repository: AnimeRepository = AnimeRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(AnimeHomeUiState())
    val uiState: StateFlow<AnimeHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun selectDay(day: String) {
        _uiState.update { it.copy(selectedDay = day) }
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val latestDeferred = async { repository.getLatest(1) }
            val ongoingDeferred = async { repository.getOngoing(1) }
            val moviesDeferred = async { repository.getMovies() }
            val recsDeferred = async { repository.getRecommendations() }
            val scheduleDeferred = async { repository.getSchedule() }

            val latestRes = latestDeferred.await()
            val ongoingRes = ongoingDeferred.await()
            val moviesRes = moviesDeferred.await()
            val recsRes = recsDeferred.await()
            val scheduleRes = scheduleDeferred.await()

            val latest = latestRes.getOrDefault(emptyList())
            val ongoing = ongoingRes.getOrDefault(emptyList())
            val movies = moviesRes.getOrDefault(emptyList())
            val recs = recsRes.getOrDefault(emptyList())
            val schedule = scheduleRes.getOrDefault(emptyList())

            if (latest.isEmpty() && ongoing.isEmpty() && movies.isEmpty() && schedule.isEmpty()) {
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
                        schedule = schedule,
                        errorMessage = null
                    )
                }
            }
        }
    }
}
