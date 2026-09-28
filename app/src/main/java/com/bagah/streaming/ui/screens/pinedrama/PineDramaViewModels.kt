package com.bagah.streaming.ui.screens.pinedrama

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.model.PineDramaDetailResponse
import com.bagah.streaming.data.model.PineDramaItem
import com.bagah.streaming.data.repository.pinedrama.PineDramaRepository
import com.bagah.streaming.data.repository.pinedrama.PineDramaRepositoryImpl
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class PineDramaHomeUiState(
    val isLoading: Boolean = true,
    val spotlightItems: List<PineDramaItem> = emptyList(),
    val items: List<PineDramaItem> = emptyList(),
    val errorMessage: String? = null
)

class PineDramaHomeViewModel(
    private val repository: PineDramaRepository = PineDramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(PineDramaHomeUiState())
    val uiState: StateFlow<PineDramaHomeUiState> = _uiState.asStateFlow()

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }

            val trendingDeferred = async { repository.getTrending() }
            val forYouDeferred = async { repository.getForYou() }

            val trending = trendingDeferred.await().getOrDefault(emptyList())
            val forYou = forYouDeferred.await().getOrDefault(emptyList())
            val combined = (trending + forYou).distinctBy { it.collectionId }

            if (combined.isEmpty()) {
                _uiState.update {
                    it.copy(isLoading = false, errorMessage = "Gagal memuat PineDrama. Silakan periksa koneksi.")
                }
            } else {
                _uiState.update {
                    it.copy(
                        isLoading = false,
                        spotlightItems = combined.take(6),
                        items = combined,
                        errorMessage = null
                    )
                }
            }
        }
    }
}

data class PineDramaDetailUiState(
    val isLoading: Boolean = true,
    val detail: PineDramaDetailResponse? = null,
    val errorMessage: String? = null
)

class PineDramaDetailViewModel(
    private val collectionId: String,
    private val repository: PineDramaRepository = PineDramaRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(PineDramaDetailUiState())
    val uiState: StateFlow<PineDramaDetailUiState> = _uiState.asStateFlow()

    init {
        loadDetail()
    }

    fun loadDetail() {
        if (collectionId.isBlank()) {
            _uiState.update { it.copy(isLoading = false, errorMessage = "Serial tidak valid") }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            repository.getDetail(collectionId)
                .onSuccess { detail ->
                    _uiState.update { it.copy(isLoading = false, detail = detail, errorMessage = null) }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(isLoading = false, errorMessage = err.localizedMessage ?: "Gagal memuat detail PineDrama")
                    }
                }
        }
    }

    class Factory(private val collectionId: String) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return PineDramaDetailViewModel(collectionId) as T
        }
    }
}
