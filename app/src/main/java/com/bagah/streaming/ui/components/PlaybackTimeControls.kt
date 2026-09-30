package com.bagah.streaming.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Forward10
import androidx.compose.material.icons.rounded.Replay10
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.media3.common.Player
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.TextPrimary
import com.bagah.streaming.ui.theme.TextSecondary
import kotlinx.coroutines.delay

@Composable
fun PlaybackTimeControls(
    player: Player,
    modifier: Modifier = Modifier
) {
    var positionMs by remember { mutableStateOf(0L) }
    var durationMs by remember { mutableStateOf(0L) }

    LaunchedEffect(player) {
        while (true) {
            if (player.playbackState == Player.STATE_READY || player.isPlaying) {
                positionMs = player.currentPosition.coerceAtLeast(0L)
                val dur = player.duration
                durationMs = if (dur > 0) dur else 0L
            }
            delay(500)
        }
    }

    val seek: (Long) -> Unit = { delta ->
        val dur = player.duration
        val max = if (dur > 0) dur else Long.MAX_VALUE
        val target = (player.currentPosition + delta).coerceIn(0L, max)
        player.seekTo(target)
        positionMs = target
    }

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        IconButton(
            onClick = { seek(-10_000L) },
            modifier = Modifier
                .size(32.dp)
                .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                .border(1.dp, BorderSubtle, CircleShape)
        ) {
            Icon(
                imageVector = Icons.Rounded.Replay10,
                contentDescription = "Mundur 10 detik",
                tint = TextPrimary,
                modifier = Modifier.size(18.dp)
            )
        }
        Text(
            text = "${formatPlaybackTime(positionMs)} / ${formatPlaybackTime(durationMs)}",
            color = TextSecondary,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
        IconButton(
            onClick = { seek(10_000L) },
            modifier = Modifier
                .size(32.dp)
                .background(Color.Black.copy(alpha = 0.5f), CircleShape)
                .border(1.dp, BorderSubtle, CircleShape)
        ) {
            Icon(
                imageVector = Icons.Rounded.Forward10,
                contentDescription = "Maju 10 detik",
                tint = TextPrimary,
                modifier = Modifier.size(18.dp)
            )
        }
    }
}

private fun formatPlaybackTime(ms: Long): String {
    if (ms <= 0) return "00:00"
    val totalSeconds = ms / 1000
    val minutes = totalSeconds / 60
    val seconds = totalSeconds % 60
    return "%02d:%02d".format(minutes, seconds)
}
