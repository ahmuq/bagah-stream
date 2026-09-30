package com.bagah.streaming.data.session

import android.content.Context
import android.content.SharedPreferences
import com.bagah.streaming.data.model.ApiKeyInfo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.serialization.json.Json

data class SessionState(
    val apiKey: String? = null,
    val user: ApiKeyInfo? = null
) {
    val isLoggedIn: Boolean get() = !apiKey.isNullOrBlank()
}

/**
 * Menyimpan API key + profil user di SharedPreferences supaya tidak perlu login ulang
 * setelah app ditutup. Data hilang hanya jika cache/data app dihapus atau app di-uninstall.
 */
object SessionStore {
    private const val PREF = "bagah_session"
    private const val KEY_API = "api_key"
    private const val KEY_USER = "user_json"

    private val json = Json {
        ignoreUnknownKeys = true
        isLenient = true
        encodeDefaults = true
    }

    private var prefs: SharedPreferences? = null

    private val _state = MutableStateFlow(SessionState())
    val state: StateFlow<SessionState> = _state.asStateFlow()

    fun init(context: Context) {
        if (prefs != null) return
        prefs = context.applicationContext.getSharedPreferences(PREF, Context.MODE_PRIVATE)
        val key = prefs?.getString(KEY_API, null)
        val user = prefs?.getString(KEY_USER, null)?.let {
            runCatching { json.decodeFromString(ApiKeyInfo.serializer(), it) }.getOrNull()
        }
        _state.value = SessionState(apiKey = key, user = user)
    }

    val apiKey: String? get() = _state.value.apiKey

    fun save(apiKey: String, user: ApiKeyInfo?) {
        prefs?.edit()?.let { editor ->
            editor.putString(KEY_API, apiKey)
            if (user != null) {
                editor.putString(KEY_USER, json.encodeToString(ApiKeyInfo.serializer(), user))
            } else {
                editor.remove(KEY_USER)
            }
            editor.apply()
        }
        _state.value = SessionState(apiKey = apiKey, user = user)
    }

    fun updateUser(user: ApiKeyInfo?) {
        val key = _state.value.apiKey ?: return
        save(key, user)
    }

    fun clear() {
        prefs?.edit()?.clear()?.apply()
        _state.value = SessionState()
    }
}
