package com.bagah.streaming.ui.screens.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.repository.auth.AuthRepository
import com.bagah.streaming.data.repository.auth.AuthRepositoryImpl
import com.bagah.streaming.data.session.SessionStore
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

data class ProfileUiState(
    val isRefreshing: Boolean = false,
    val message: String? = null
)

class ProfileViewModel(
    private val repository: AuthRepository = AuthRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState: StateFlow<ProfileUiState> = _uiState.asStateFlow()

    /** Cek ulang API key untuk memperbarui info kuota/tier. */
    fun refresh() {
        val key = SessionStore.apiKey ?: return
        viewModelScope.launch {
            _uiState.update { it.copy(isRefreshing = true, message = null) }
            repository.checkKey(key)
                .onSuccess { user ->
                    SessionStore.updateUser(user)
                    _uiState.update { it.copy(isRefreshing = false, message = "Profil diperbarui") }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(isRefreshing = false, message = err.localizedMessage ?: "Gagal memperbarui profil")
                    }
                }
        }
    }

    fun clearCache() {
        NetworkClient.clearApiCache()
        _uiState.update { it.copy(message = "Cache dibersihkan") }
    }

    fun logout() {
        NetworkClient.setApiKey(null)
        SessionStore.clear()
    }

    fun clearMessage() {
        _uiState.update { it.copy(message = null) }
    }
}
