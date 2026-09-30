package com.bagah.streaming.ui.screens.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.bagah.streaming.data.session.SessionStore
import com.bagah.streaming.ui.theme.AccentBlack
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.SurfaceCard
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary
import kotlinx.coroutines.delay

@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel = viewModel()
) {
    val session by SessionStore.state.collectAsState()
    val uiState by viewModel.uiState.collectAsState()
    val user = session.user
    val apiKey = session.apiKey.orEmpty()

    LaunchedEffect(uiState.message) {
        if (uiState.message != null) {
            delay(2500)
            viewModel.clearMessage()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack)
    ) {
        Text(
            text = "PROFIL",
            color = TextPrimary,
            fontSize = 18.sp,
            fontWeight = FontWeight.Black,
            letterSpacing = 0.5.sp,
            modifier = Modifier
                .statusBarsPadding()
                .padding(horizontal = 20.dp, vertical = 14.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 20.dp)
        ) {
            // Kartu identitas
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(SurfaceDark, RoundedCornerShape(16.dp))
                    .border(1.dp, BorderSubtle, RoundedCornerShape(16.dp))
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(54.dp)
                        .background(AccentWhite.copy(alpha = 0.12f), CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = user?.name?.trim()?.firstOrNull()?.uppercase() ?: "B",
                        color = AccentWhite,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.size(14.dp))
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = user?.name?.ifBlank { "Pengguna Bagah" } ?: "Pengguna Bagah",
                        color = TextPrimary,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = user?.email ?: "-",
                        color = TextMuted,
                        fontSize = 12.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                InfoChip("TIER", user?.tier?.ifBlank { "-" } ?: "-")
                InfoChip("ROLE", user?.role?.ifBlank { "-" } ?: "-")
                InfoChip("STATUS", if (user?.isActive == true) "AKTIF" else "-")
            }

            Spacer(modifier = Modifier.height(16.dp))

            InfoCard {
                InfoRow("Limit harian", user?.limit ?: "-")
                InfoRow("Terpakai hari ini", (user?.usedToday ?: 0).toString())
                InfoRow("Sisa kuota", user?.remaining ?: "-")
                InfoRow("Total terpakai", (user?.totalUsed ?: 0).toString())
                if (!user?.premiumExpires.isNullOrBlank()) {
                    InfoRow("Premium s/d", formatDate(user?.premiumExpires))
                }
                if (!user?.resetAt.isNullOrBlank()) {
                    InfoRow("Reset kuota", formatDate(user?.resetAt))
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            InfoCard {
                InfoRow("API Key", maskKey(apiKey))
            }

            Spacer(modifier = Modifier.height(20.dp))

            OutlinedButton(
                onClick = { viewModel.refresh() },
                enabled = !uiState.isRefreshing,
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = AccentWhite),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .border(1.dp, BorderSubtle, RoundedCornerShape(12.dp))
            ) {
                if (uiState.isRefreshing) {
                    CircularProgressIndicator(
                        color = AccentWhite,
                        strokeWidth = 2.dp,
                        modifier = Modifier.size(18.dp)
                    )
                } else {
                    Text(text = "Segarkan Profil", fontWeight = FontWeight.SemiBold)
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            OutlinedButton(
                onClick = { viewModel.clearCache() },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = AccentWhite),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .border(1.dp, BorderSubtle, RoundedCornerShape(12.dp))
            ) {
                Text(text = "Bersihkan Cache", fontWeight = FontWeight.SemiBold)
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = { viewModel.logout() },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AccentWhite,
                    contentColor = AccentBlack
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp)
            ) {
                Text(text = "Keluar", fontWeight = FontWeight.Bold)
            }

            if (uiState.message != null) {
                Spacer(modifier = Modifier.height(14.dp))
                Text(
                    text = uiState.message ?: "",
                    color = TextSecondary,
                    fontSize = 12.sp
                )
            }

            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Composable
private fun InfoChip(label: String, value: String) {
    Column(
        modifier = Modifier
            .background(SurfaceCard, RoundedCornerShape(10.dp))
            .border(1.dp, BorderSubtle, RoundedCornerShape(10.dp))
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Text(text = label, color = TextMuted, fontSize = 9.sp, fontWeight = FontWeight.Bold)
        Text(text = value, color = TextPrimary, fontSize = 12.sp, fontWeight = FontWeight.SemiBold)
    }
}

@Composable
private fun InfoCard(content: @Composable () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(SurfaceDark, RoundedCornerShape(16.dp))
            .border(1.dp, BorderSubtle, RoundedCornerShape(16.dp))
            .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
        content()
    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = label, color = TextMuted, fontSize = 13.sp)
        Text(
            text = value,
            color = TextPrimary,
            fontSize = 13.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

private fun maskKey(key: String): String {
    if (key.isBlank()) return "-"
    if (key.length <= 8) return "••••"
    return key.take(4) + "••••••" + key.takeLast(4)
}

private fun formatDate(iso: String?): String {
    if (iso.isNullOrBlank()) return "-"
    return iso.substringBefore("T").ifBlank { iso }
}
