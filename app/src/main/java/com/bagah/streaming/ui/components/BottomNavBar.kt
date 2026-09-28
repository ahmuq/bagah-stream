package com.bagah.streaming.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Movie
import androidx.compose.material.icons.rounded.PlayCircle
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.SlowMotionVideo
import androidx.compose.material.icons.rounded.Theaters
import androidx.compose.material.icons.rounded.VideoLibrary
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bagah.streaming.ui.navigation.Screen
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.CardBorderDark
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.SurfaceElevated
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary

data class NavItem(
    val title: String,
    val route: String,
    val icon: ImageVector
)

@Composable
fun BagahBottomNavBar(
    currentRoute: String?,
    onNavigate: (String) -> Unit
) {
    val items = listOf(
        NavItem("Anime", Screen.AnimeHome.route, Icons.Rounded.Movie),
        NavItem("DramaBox", Screen.DramaHome.route, Icons.Rounded.VideoLibrary),
        NavItem("ReelShort", Screen.ReelShortHome.route, Icons.Rounded.PlayCircle),
        NavItem("FreeReels", Screen.FreeReelsHome.route, Icons.Rounded.SlowMotionVideo),
        NavItem("FlickReels", Screen.FlickReelsHome.route, Icons.Rounded.Theaters),
        NavItem("ShortMax", Screen.ShortMaxHome.route, Icons.Rounded.VideoLibrary),
        NavItem("Cari", Screen.Search.route, Icons.Rounded.Search)
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color.Transparent,
                        BgBlack.copy(alpha = 0.85f),
                        BgBlack
                    )
                )
            )
            .navigationBarsPadding()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 8.dp)
                .background(
                    color = SurfaceDark.copy(alpha = 0.95f),
                    shape = RoundedCornerShape(24.dp)
                )
                .border(
                    width = 1.dp,
                    color = BorderSubtle,
                    shape = RoundedCornerShape(24.dp)
                )
                .padding(horizontal = 4.dp, vertical = 5.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                items.forEach { item ->
                    val isSelected = currentRoute == item.route
                    val iconColor by animateColorAsState(
                        targetValue = if (isSelected) AccentWhite else TextMuted,
                        animationSpec = tween(200),
                        label = "iconColor"
                    )
                    val textColor by animateColorAsState(
                        targetValue = if (isSelected) TextPrimary else TextMuted,
                        animationSpec = tween(200),
                        label = "textColor"
                    )

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .clip(RoundedCornerShape(16.dp))
                            .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = null
                            ) {
                                if (!isSelected) {
                                    onNavigate(item.route)
                                }
                            }
                            .background(
                                color = if (isSelected) SurfaceElevated else Color.Transparent,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .border(
                                width = if (isSelected) 1.dp else 0.dp,
                                color = if (isSelected) CardBorderDark else Color.Transparent,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .padding(horizontal = 6.dp, vertical = 5.dp)
                    ) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = iconColor,
                            modifier = Modifier.size(19.dp)
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = item.title,
                            color = textColor,
                            fontSize = 10.sp,
                            maxLines = 1,
                            fontWeight = if (isSelected) FontWeight.SemiBold else FontWeight.Medium
                        )
                    }
                }
            }
        }
    }
}

