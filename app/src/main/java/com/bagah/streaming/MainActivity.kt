package com.bagah.streaming

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.bagah.streaming.data.api.NetworkClient
import com.bagah.streaming.data.session.SessionStore
import com.bagah.streaming.ui.BagahApp
import com.bagah.streaming.ui.theme.BagahStreamingTheme
import com.bagah.streaming.ui.theme.BgBlack

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        NetworkClient.install(applicationContext)
        SessionStore.init(applicationContext)
        NetworkClient.setApiKey(SessionStore.apiKey)
        enableEdgeToEdge()
        setContent {
            BagahStreamingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BgBlack
                ) {
                    BagahApp()
                }
            }
        }
    }
}

