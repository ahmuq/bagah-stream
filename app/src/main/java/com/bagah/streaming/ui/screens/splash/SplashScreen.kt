package com.bagah.streaming.ui.screens.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bagah.streaming.R
import com.bagah.streaming.ui.theme.AccentWhite
import com.bagah.streaming.ui.theme.BgBlack
import com.bagah.streaming.ui.theme.BorderSubtle
import com.bagah.streaming.ui.theme.SurfaceDark
import com.bagah.streaming.ui.theme.TextMuted
import com.bagah.streaming.ui.theme.TextPrimary
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SplashPopUpIntro(
    onAnimationFinished: () -> Unit
) {
    val scale = remember { Animatable(0.2f) }
    val alpha = remember { Animatable(0f) }
    val ringScale = remember { Animatable(0.5f) }
    val ringAlpha = remember { Animatable(0.8f) }
    val textAlpha = remember { Animatable(0f) }

    LaunchedEffect(Unit) {
        // 1. Pop-up spring bounce
        launch {
            scale.animateTo(
                targetValue = 1f,
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
        }
        launch {
            alpha.animateTo(
                targetValue = 1f,
                animationSpec = tween(durationMillis = 400, easing = FastOutSlowInEasing)
            )
        }
        // 2. Ripple pulse ring
        launch {
            ringScale.animateTo(
                targetValue = 1.7f,
                animationSpec = tween(durationMillis = 850, easing = FastOutSlowInEasing)
            )
        }
        launch {
            ringAlpha.animateTo(
                targetValue = 0f,
                animationSpec = tween(durationMillis = 850, easing = FastOutSlowInEasing)
            )
        }

        // 3. Text fade in
        delay(300)
        textAlpha.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 400)
        )

        // Hold briefly for delightful visual impact, then exit
        delay(2200)
        onAnimationFinished()
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BgBlack),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(140.dp)
            ) {
                // Expanding ripple ring on pop-up
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .scale(ringScale.value)
                        .alpha(ringAlpha.value)
                        .border(1.5.dp, AccentWhite.copy(alpha = 0.6f), CircleShape)
                )

                // Logo Container with Bouncy Pop-up Scale
                Box(
                    modifier = Modifier
                        .size(96.dp)
                        .scale(scale.value)
                        .alpha(alpha.value)
                        .clip(RoundedCornerShape(26.dp))
                        .background(SurfaceDark)
                        .border(1.dp, BorderSubtle, RoundedCornerShape(26.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_logo),
                        contentDescription = "Logo Bagah",
                        modifier = Modifier.size(62.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.alpha(textAlpha.value)
            ) {
                Text(
                    text = "BAGAH STREAMING",
                    color = TextPrimary,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Black,
                    letterSpacing = 2.sp
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = "Cinema • Anime • Drama",
                    color = TextMuted,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    letterSpacing = 1.sp
                )
            }
        }
    }
}
