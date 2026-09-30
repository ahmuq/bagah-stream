package com.bagah.streaming.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bagah.streaming.R
import com.bagah.streaming.ui.theme.AccentBlack
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.SurfaceElevated
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary

@Composable
fun PlatformHeader(
    badge: String,
    subtitle: String,
    onSearchClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "Logo Bagah",
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = badge,
                    color = TextPrimary,
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black,
                    letterSpacing = 0.5.sp
                )
                Text(text = subtitle, color = TextMuted, fontSize = 11.sp, fontWeight = FontWeight.Medium)
            }
        }
        IconButton(
            onClick = onSearchClick,
            modifier = Modifier
                .size(38.dp)
                .background(SurfaceDark, CircleShape)
                .border(1.dp, BorderSubtle, CircleShape)
        ) {
            Icon(
                imageVector = Icons.Rounded.Search,
                contentDescription = "Pencarian",
                tint = AccentWhite,
                modifier = Modifier.size(19.dp)
            )
        }
    }
}

@Composable
fun SpotlightBadge(label: String, episodeCount: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(
            modifier = Modifier
                .background(Color.Black.copy(alpha = 0.8f), RoundedCornerShape(4.dp))
                .border(0.5.dp, CardBorderDark, RoundedCornerShape(4.dp))
                .padding(horizontal = 6.dp, vertical = 2.dp)
        ) {
            Text(text = label, color = AccentWhite, fontSize = 9.sp, fontWeight = FontWeight.Bold)
        }
        if (episodeCount > 0) {
            Text(
                text = "$episodeCount Episode",
                color = TextMuted,
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
fun WatchNowCta() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(AccentWhite, RoundedCornerShape(8.dp))
            .padding(horizontal = 14.dp, vertical = 7.dp)
    ) {
        Icon(
            imageVector = Icons.Rounded.PlayArrow,
            contentDescription = "Putar",
            tint = AccentBlack,
            modifier = Modifier.size(18.dp)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = "Tonton Sekarang", color = AccentBlack, fontSize = 12.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun CarouselDots(count: Int, currentPage: Int) {
    if (count <= 1) return
    Row(
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        repeat(count) { index ->
            val isCurrent = currentPage == index
            Box(
                modifier = Modifier
                    .padding(horizontal = 3.dp)
                    .height(4.dp)
                    .width(if (isCurrent) 18.dp else 5.dp)
                    .clip(RoundedCornerShape(2.dp))
                    .background(if (isCurrent) AccentWhite else TextMuted.copy(alpha = 0.35f))
            )
        }
    }
}

@Composable
fun PlatformTabRow(tabs: List<String>, selected: String, onSelect: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .padding(vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        tabs.forEach { tab ->
            val isSelected = selected == tab
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .background(if (isSelected) AccentWhite else SurfaceDark)
                    .border(1.dp, if (isSelected) AccentWhite else BorderSubtle, RoundedCornerShape(20.dp))
                    .clickable { onSelect(tab) }
                    .padding(horizontal = 14.dp, vertical = 7.dp)
            ) {
                Text(
                    text = tab,
                    color = if (isSelected) AccentBlack else TextSecondary,
                    fontSize = 12.sp,
                    fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium
                )
            }
        }
    }
}

data class FilterChip(
    val label: String,
    val value: String
)

@Composable
fun FilterChipRow(
    options: List<FilterChip>,
    selectedValue: String,
    onSelect: (String) -> Unit,
    leadingLabel: String? = null,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (leadingLabel != null) {
            Text(
                text = leadingLabel,
                color = TextMuted,
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.width(4.dp))
        }

        options.forEach { option ->
            val isSelected = selectedValue == option.value
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(14.dp))
                    .background(if (isSelected) SurfaceElevated else Color.Transparent)
                    .border(
                        width = 1.dp,
                        color = if (isSelected) AccentWhite else BorderSubtle,
                        shape = RoundedCornerShape(14.dp)
                    )
                    .clickable { onSelect(option.value) }
                    .padding(horizontal = 11.dp, vertical = 5.dp)
            ) {
                Text(
                    text = option.label,
                    color = if (isSelected) AccentWhite else TextMuted,
                    fontSize = 11.sp,
                    fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Medium
                )
            }
        }
    }
}

@Composable
fun LoadingBlock(message: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator(color = AccentWhite, strokeWidth = 2.dp, modifier = Modifier.size(36.dp))
        Spacer(modifier = Modifier.height(14.dp))
        Text(text = message, color = TextSecondary, fontSize = 13.sp)
    }
}

@Composable
fun ErrorBlock(message: String, onRetry: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = message, color = TextSecondary, fontSize = 14.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = onRetry,
            colors = ButtonDefaults.buttonColors(containerColor = AccentWhite, contentColor = AccentBlack),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(text = "Coba Lagi", fontWeight = FontWeight.SemiBold)
        }
    }
}
