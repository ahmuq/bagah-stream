package com.bagah.streaming.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val MonochromeDarkColorScheme = darkColorScheme(
    primary = AccentWhite,
    secondary = TextSecondary,
    tertiary = BorderSubtle,
    background = BgBlack,
    surface = SurfaceDark,
    surfaceVariant = SurfaceCard,
    onPrimary = AccentBlack,
    onSecondary = AccentWhite,
    onBackground = TextPrimary,
    onSurface = TextPrimary,
    onSurfaceVariant = TextSecondary,
    outline = CardBorderDark
)

@Composable
fun BagahStreamingTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = MonochromeDarkColorScheme,
        typography = Typography,
        content = content
    )
}

