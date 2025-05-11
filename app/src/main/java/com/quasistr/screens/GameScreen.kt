package com.quasistr.screens

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.ui.theme.AmberPrimary
import com.quasistr.ui.theme.IndigoDark
import com.quasistr.ui.theme.IndigoSurface
import kotlinx.coroutines.delay

@Composable
fun GameScreen(
    currentWord: String,
    guessedCount: Int,
    skippedCount: Int,
    remainingTime: Int,
    onEndGame: () -> Unit
) {
    var wordScale by remember { mutableFloatStateOf(1f) }
    var containerWidth by remember { mutableIntStateOf(0) }
    var containerHeight by remember { mutableIntStateOf(0) }

    val fontSize = remember(currentWord, containerWidth, containerHeight) {
        if (containerWidth <= 0 || containerHeight <= 0) return@remember 80.sp

        val baseSizeByLength = when {
            currentWord.length > 25 -> 48
            currentWord.length > 20 -> 56
            currentWord.length > 15 -> 64
            currentWord.length > 10 -> 72
            else -> 80
        }

        val maxChars = containerWidth / (baseSizeByLength * 0.5f)

        val sizeByWidth = if (currentWord.length > maxChars) {
            (containerWidth * 0.98f) / currentWord.length
        } else {
            baseSizeByLength.toFloat()
        }

        val maxHeight = containerHeight * 0.95f
        val finalSize = minOf(sizeByWidth, maxHeight * 0.75f)

        finalSize.sp
    }

    val timerPulse = remember { Animatable(1f) }

    LaunchedEffect(remainingTime) {
        if (remainingTime <= 5) {
            timerPulse.animateTo(
                targetValue = 1.3f,
                animationSpec = tween(250, easing = LinearEasing)
            )
            timerPulse.animateTo(
                targetValue = 1f,
                animationSpec = tween(250, easing = LinearEasing)
            )
        }
    }

    LaunchedEffect(currentWord) {
        wordScale = 0.8f
        delay(50)
        wordScale = 1f
    }

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    modifier = Modifier
                        .background(
                            color = IndigoSurface.copy(alpha = 0.7f),
                            shape = RoundedCornerShape(16.dp)
                        )
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "✓ $guessedCount",
                        color = Color(0xFF4CAF50),
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "✗ $skippedCount",
                        color = Color(0xFFF44336),
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                }

                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .scale(if (remainingTime <= 5) timerPulse.value else 1f)
                        .clip(CircleShape)
                        .background(
                            when {
                                remainingTime <= 5 -> Color(0xFFF44336)
                                remainingTime <= 15 -> Color(0xFFFFEB3B)
                                else -> AmberPrimary
                            }
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = remainingTime.toString(),
                        color = if (remainingTime <= 15) Color.Black else IndigoDark,
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp
                    )
                }
            }

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
                    .scale(wordScale)
                    .onGloballyPositioned { coordinates ->
                        containerWidth = coordinates.size.width
                        containerHeight = coordinates.size.height
                    },
                shape = RoundedCornerShape(16.dp),
                color = Color.White,
                shadowElevation = 8.dp
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = currentWord,
                        fontSize = fontSize,
                        fontWeight = FontWeight.Bold,
                        color = IndigoDark,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                    )
                }
            }

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = IndigoSurface.copy(alpha = 0.8f)
                ),
                shape = RoundedCornerShape(12.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "↑ TILT UP = CORRECT",
                        color = Color(0xFF4CAF50),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )

                    Text(
                        text = "↓ TILT DOWN = SKIP",
                        color = Color(0xFFF44336),
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
            }

            Button(
                onClick = onEndGame,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 8.dp)
                    .height(48.dp)
                    .widthIn(min = 160.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = IndigoSurface
                ),
                shape = RoundedCornerShape(24.dp),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = 4.dp,
                    pressedElevation = 8.dp
                )
            ) {
                Text(
                    "END GAME",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }
        }
    }
}