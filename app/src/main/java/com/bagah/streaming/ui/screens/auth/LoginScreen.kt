package com.bagah.streaming.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.R
import com.bagah.streaming.ui.theme.AccentBlack
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

@Composable
fun LoginScreen(
    viewModel: LoginViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    var apiKey by rememberSaveable { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .imePadding()
                .padding(horizontal = 28.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "Logo Bagah",
                modifier = Modifier.size(72.dp)
            )
            Spacer(modifier = Modifier.height(14.dp))
            Text(
                text = "BAGAH STREAMING",
                color = TextPrimary,
                fontSize = 22.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 1.sp
            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text = "Masuk dengan API key untuk mulai menonton",
                color = TextSecondary,
                fontSize = 13.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(28.dp))

            OutlinedTextField(
                value = apiKey,
                onValueChange = {
                    apiKey = it
                    if (uiState.errorMessage != null) viewModel.clearError()
                },
                label = { Text("API Key") },
                singleLine = true,
                isError = uiState.errorMessage != null,
                shape = RoundedCornerShape(12.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = AccentWhite,
                    unfocusedBorderColor = BorderSubtle,
                    errorBorderColor = com.bagah.streaming.ui.theme.AccentWhite,
                    focusedContainerColor = SurfaceDark,
                    unfocusedContainerColor = SurfaceDark,
                    errorContainerColor = SurfaceDark,
                    focusedTextColor = TextPrimary,
                    unfocusedTextColor = TextPrimary,
                    cursorColor = AccentWhite,
                    focusedLabelColor = TextMuted,
                    unfocusedLabelColor = TextMuted
                ),
                modifier = Modifier.fillMaxWidth()
            )

            if (uiState.errorMessage != null) {
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = uiState.errorMessage ?: "",
                    color = com.bagah.streaming.ui.theme.TextSecondary,
                    fontSize = 12.sp,
                    modifier = Modifier.fillMaxWidth()
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = { viewModel.login(apiKey) },
                enabled = !uiState.isLoading,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AccentWhite,
                    contentColor = AccentBlack,
                    disabledContainerColor = SurfaceDark,
                    disabledContentColor = TextMuted
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                if (uiState.isLoading) {
                    CircularProgressIndicator(
                        color = AccentBlack,
                        strokeWidth = 2.dp,
                        modifier = Modifier.size(20.dp)
                    )
                } else {
                    Text(text = "Masuk", fontSize = 15.sp, fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "API key hanya diminta sekali. Setelah itu kamu langsung masuk, kecuali data app dihapus atau app di-uninstall.",
                color = TextMuted,
                fontSize = 11.sp,
                textAlign = TextAlign.Center,
                lineHeight = 15.sp
            )
        }
    }
}
