package com.quasistr.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.EaseInOutQuad
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.R
import com.quasistr.ui.theme.AmberPrimary
import com.quasistr.ui.theme.IndigoBackground
import com.quasistr.ui.theme.IndigoDark
import com.quasistr.ui.theme.IndigoLight
import com.quasistr.ui.theme.IndigoSurface

@Composable
fun ScoreScreen(
    guessedWords: List<String>,
    skippedWords: List<String>,
    onPlayAgain: () -> Unit,
    onBackToDecks: () -> Unit
) {
    val context = LocalContext.current
    val totalWords = guessedWords.size + skippedWords.size
    val allWordsGuessed = guessedWords.size == totalWords && totalWords > 0

    // Special animation for victory
    val scale = remember { Animatable(0.95f) }
    val rotation = remember { Animatable(0f) }

    LaunchedEffect(allWordsGuessed) {
        if (allWordsGuessed) {
            // Pulse animation for victory
            while (true) {
                scale.animateTo(
                    targetValue = 1.05f,
                    animationSpec = tween(700, easing = FastOutSlowInEasing)
                )
                scale.animateTo(
                    targetValue = 0.98f,
                    animationSpec = tween(700, easing = FastOutSlowInEasing)
                )
            }
        }
    }

    LaunchedEffect(allWordsGuessed) {
        if (allWordsGuessed) {
            // Subtle rotation animation for victory
            rotation.animateTo(
                targetValue = -3f,
                animationSpec = tween(1000, easing = EaseInOutQuad)
            )
            rotation.animateTo(
                targetValue = 3f,
                animationSpec = tween(2000, easing = EaseInOutQuad)
            )
            rotation.animateTo(
                targetValue = 0f,
                animationSpec = tween(1000, easing = EaseInOutQuad)
            )
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        // Background decorative elements
        Box(
            modifier = Modifier
                .size(300.dp)
                .offset(y = (-30).dp)
                .align(Alignment.Center)
                .clip(CircleShape)
                .background(IndigoSurface.copy(alpha = 0.6f))
        )

        Box(
            modifier = Modifier
                .size(200.dp)
                .offset(x = 40.dp, y = (-20).dp)
                .align(Alignment.Center)
                .clip(CircleShape)
                .background(IndigoLight.copy(alpha = 0.5f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header with victory message or game over
            if (allWordsGuessed) {
                Box(
                    modifier = Modifier
                        .scale(scale.value)
                        .rotate(rotation.value)
                ) {
                    Surface(
                        shape = RoundedCornerShape(20.dp),
                        color = Color.Transparent,
                        modifier = Modifier.padding(vertical = 8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .background(
                                    brush = Brush.horizontalGradient(
                                        colors = listOf(
                                            Color(0xFFF9A825), // Dark amber
                                            Color(0xFFFFD700), // Gold
                                            Color(0xFFFFC107)  // Amber
                                        )
                                    )
                                )
                                .padding(horizontal = 32.dp, vertical = 16.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = null,
                                    tint = IndigoDark,
                                    modifier = Modifier.size(36.dp)
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Text(
                                    text = stringResource(R.string.perfect_score),
                                    color = IndigoDark,
                                    fontSize = 28.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    textAlign = TextAlign.Center
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = null,
                                    tint = IndigoDark,
                                    modifier = Modifier.size(36.dp)
                                )
                            }
                        }
                    }
                }

                // Victory message
                AnimatedVisibility(
                    visible = true,
                    enter = fadeIn() + expandVertically()
                ) {
                    Text(
                        text = stringResource(R.string.perfect_score_message, totalWords),
                        color = Color.White,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                }
            } else {
                Text(
                    text = stringResource(R.string.game_results),
                    color = AmberPrimary,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 16.dp, bottom = 8.dp)
                )
            }

            // Score stats card
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp),
                shape = RoundedCornerShape(16.dp),
                color = IndigoSurface,
                shadowElevation = 4.dp
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ScoreStat(
                        label = stringResource(R.string.guessed),
                        value = "${guessedWords.size}",
                        ratio = if (totalWords > 0) guessedWords.size.toFloat() / totalWords else 0f,
                        color = Color(0xFF4CAF50) // Green
                    )

                    ScoreStat(
                        label = stringResource(R.string.skipped),
                        value = "${skippedWords.size}",
                        ratio = if (totalWords > 0) skippedWords.size.toFloat() / totalWords else 0f,
                        color = Color(0xFFF44336) // Red
                    )

                    ScoreStat(
                        label = stringResource(R.string.accuracy),
                        value = if (totalWords > 0) "${(guessedWords.size * 100 / totalWords)}%" else "0%",
                        ratio = if (totalWords > 0) guessedWords.size.toFloat() / totalWords else 0f,
                        color = AmberPrimary
                    )
                }
            }

            // Word lists section
            Row(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                // Guessed words card
                Surface(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(end = 4.dp),
                    shape = RoundedCornerShape(16.dp),
                    color = Color.White.copy(alpha = 0.9f),
                    shadowElevation = 2.dp
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(bottom = 8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Check,
                                contentDescription = null,
                                tint = Color(0xFF4CAF50),
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = stringResource(R.string.guessed_words),
                                color = Color(0xFF4CAF50),
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }

                        Divider(color = Color(0xFF4CAF50).copy(alpha = 0.3f))
                        Spacer(modifier = Modifier.height(8.dp))

                        if (guessedWords.isEmpty()) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = stringResource(R.string.no_words_guessed),
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                                )
                            }
                        } else {
                            LazyColumn(
                                verticalArrangement = Arrangement.spacedBy(4.dp),
                                modifier = Modifier.padding(horizontal = 4.dp)
                            ) {
                                items(guessedWords) { word ->
                                    Text(
                                        text = "• $word",
                                        color = IndigoDark,
                                        fontSize = 14.sp,
                                        lineHeight = 18.sp,
                                        modifier = Modifier.padding(vertical = 2.dp)
                                    )
                                }
                            }
                        }
                    }
                }

                // Skipped words card
                Surface(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .padding(start = 4.dp),
                    shape = RoundedCornerShape(16.dp),
                    color = Color.White.copy(alpha = 0.9f),
                    shadowElevation = 2.dp
                ) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(bottom = 8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = null,
                                tint = Color(0xFFF44336),
                                modifier = Modifier.size(20.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = stringResource(R.string.skipped_words),
                                color = Color(0xFFF44336),
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }

                        Divider(color = Color(0xFFF44336).copy(alpha = 0.3f))
                        Spacer(modifier = Modifier.height(8.dp))

                        if (skippedWords.isEmpty()) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .weight(1f),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = stringResource(R.string.no_words_skipped),
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                                )
                            }
                        } else {
                            LazyColumn(
                                verticalArrangement = Arrangement.spacedBy(4.dp),
                                modifier = Modifier.padding(horizontal = 4.dp)
                            ) {
                                items(skippedWords) { word ->
                                    Text(
                                        text = "• $word",
                                        color = IndigoDark,
                                        fontSize = 14.sp,
                                        lineHeight = 18.sp,
                                        modifier = Modifier.padding(vertical = 2.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // Bottom buttons row
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = onBackToDecks,
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 8.dp)
                        .height(56.dp),
                    shape = RoundedCornerShape(28.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = IndigoSurface
                    ),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 4.dp,
                        pressedElevation = 8.dp
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = null,
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = stringResource(R.string.menu),
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Button(
                    onClick = onPlayAgain,
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp)
                        .height(56.dp),
                    shape = RoundedCornerShape(28.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AmberPrimary
                    ),
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 4.dp,
                        pressedElevation = 8.dp
                    )
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Refresh,
                            contentDescription = null,
                            tint = IndigoDark
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = stringResource(R.string.play_again),
                            color = IndigoDark,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ScoreStat(
    label: String,
    value: String,
    ratio: Float,
    color: Color
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(horizontal = 8.dp)
    ) {
        Text(
            text = label,
            color = Color.White,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )

        Text(
            text = value,
            color = color,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )

        // Progress indicator
        LinearProgressIndicator(
            progress = ratio,
            modifier = Modifier
                .width(60.dp)
                .padding(top = 4.dp)
                .height(4.dp),
            color = color,
            trackColor = Color.White.copy(alpha = 0.3f)
        )
    }
}