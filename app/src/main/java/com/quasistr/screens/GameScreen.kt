package com.quasistr.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.ui.theme.*
import kotlinx.coroutines.delay

@Composable
fun GameScreen(
    currentWord: String,
    guessedCount: Int,
    skippedCount: Int,
    remainingTime: Int,
    onEndGame: () -> Unit
) {
    var showCorrectAnimation by remember { mutableStateOf(false) }
    var showSkipAnimation by remember { mutableStateOf(false) }
    var wordScale by remember { mutableStateOf(1f) }

    val correctIconSize = animateFloatAsState(
        targetValue = if (showCorrectAnimation) 1.5f else 1f,
        animationSpec = tween(
            durationMillis = 300,
            easing = FastOutSlowInEasing
        ), label = "correctIconAnimation"
    )

    val skipIconSize = animateFloatAsState(
        targetValue = if (showSkipAnimation) 1.5f else 1f,
        animationSpec = tween(
            durationMillis = 300,
            easing = FastOutSlowInEasing
        ), label = "skipIconAnimation"
    )

    LaunchedEffect(currentWord) {
        wordScale = 0.8f
        delay(50)
        wordScale = 1f
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        Box(
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.Center)
                .clip(CircleShape)
                .background(IndigoSurface.copy(alpha = 0.6f))
        )

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
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "✓ $guessedCount",
                        color = Color.Green,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "✗ $skippedCount",
                        color = Color.Red,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                }

                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .clip(CircleShape)
                        .background(
                            when {
                                remainingTime <= 5 -> Color.Red
                                remainingTime <= 15 -> Color.Yellow
                                else -> AmberPrimary
                            }
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = remainingTime.toString(),
                        color = IndigoDark,
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    )
                }
            }

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .scale(wordScale),
                shape = RoundedCornerShape(16.dp),
                color = Color.White,
                shadowElevation = 8.dp
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = currentWord,
                        fontSize = when {
                            currentWord.length > 20 -> 28.sp
                            currentWord.length > 15 -> 32.sp
                            currentWord.length > 10 -> 36.sp
                            else -> 40.sp
                        },
                        fontWeight = FontWeight.Bold,
                        color = IndigoDark,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowUp,
                            contentDescription = "Tilt Up",
                            tint = Color.Green,
                            modifier = Modifier
                                .size(48.dp * correctIconSize.value)
                        )
                        Text(
                            text = "CORRECT",
                            color = Color.Green,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "Tilt Down",
                            tint = Color.Red,
                            modifier = Modifier
                                .size(48.dp * skipIconSize.value)
                        )
                        Text(
                            text = "SKIP",
                            color = Color.Red,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Button(
                    onClick = onEndGame,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = IndigoSurface
                    )
                ) {
                    Text("End Game")
                }
            }
        }
    }
}