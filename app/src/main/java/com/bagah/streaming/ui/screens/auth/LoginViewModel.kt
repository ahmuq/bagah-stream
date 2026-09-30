package com.bagah.streaming.ui.screens.auth

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

data class LoginUiState(
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)

class LoginViewModel(
    private val repository: AuthRepository = AuthRepositoryImpl()
) : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState: StateFlow<LoginUiState> = _uiState.asStateFlow()

    fun login(apiKey: String) {
        val key = apiKey.trim()
        if (key.isBlank()) {
            _uiState.update { it.copy(errorMessage = "Masukkan API key terlebih dahulu") }
            return
        }
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true, errorMessage = null) }
            repository.checkKey(key)
                .onSuccess { user ->
                    SessionStore.save(key, user)
                    NetworkClient.setApiKey(key)
                    _uiState.update { it.copy(isLoading = false, errorMessage = null) }
                }
                .onFailure { err ->
                    _uiState.update {
                        it.copy(
                            isLoading = false,
                            errorMessage = err.localizedMessage ?: "Gagal login. Periksa API key."
                        )
                    }
                }
        }
    }

    fun clearError() {
        _uiState.update { it.copy(errorMessage = null) }
    }
}
