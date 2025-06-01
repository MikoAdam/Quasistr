package com.quasistr.screens

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.R
import com.quasistr.data.DeckManager
import com.quasistr.ui.theme.AmberPrimary
import com.quasistr.ui.theme.IndigoBackground
import com.quasistr.ui.theme.IndigoDark
import com.quasistr.ui.theme.IndigoSurface
import kotlinx.coroutines.delay

@Composable
fun CountdownScreen(
    deckName: String = "",
    gameMode: String = "Normal",
    isLanguageLearning: Boolean = false,
    onStartGame: () -> Unit,
    onCancel: () -> Unit
) {
    val context = LocalContext.current
    var countdown by remember { mutableStateOf(-1) }
    var isCountingDown by remember { mutableStateOf(false) }

    val scale by animateFloatAsState(
        targetValue = if (countdown > 0) 1.15f else 1.0f,
        animationSpec = spring(dampingRatio = Spring.DampingRatioMediumBouncy)
    )

    LaunchedEffect(isCountingDown) {
        if (isCountingDown) {
            for (i in 3 downTo 1) {
                countdown = i
                delay(1000)
            }
            countdown = 0
            delay(300)
            onStartGame()
        }
    }

    // Get display info
    val displayName = if (isLanguageLearning) {
        formatLanguageLearningDeckName(deckName)
    } else {
        val decks = DeckManager.getDecksForCurrentLanguage(context)
        decks[deckName]?.name ?: deckName
    }

    val customInstruction = if (!isLanguageLearning) {
        val decks = DeckManager.getDecksForCurrentLanguage(context)
        decks[deckName]?.instruction
    } else null

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        // Beautiful background circles - matching your app style
        Box(
            modifier = Modifier
                .size(300.dp)
                .offset(x = (-50).dp, y = (-50).dp)
                .align(Alignment.TopStart)
                .clip(CircleShape)
                .background(IndigoSurface.copy(alpha = 0.3f))
        )

        Box(
            modifier = Modifier
                .size(200.dp)
                .offset(x = 50.dp, y = (-30).dp)
                .align(Alignment.TopEnd)
                .clip(CircleShape)
                .background(AmberPrimary.copy(alpha = 0.2f))
        )

        // Close button - WORKING and styled like your app
        IconButton(
            onClick = onCancel,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp)
                .size(48.dp)
                .background(IndigoSurface, CircleShape)
        ) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = stringResource(R.string.cancel),
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }

        // Main layout - fits in landscape perfectly
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = 80.dp,
                    start = 32.dp,
                    end = 32.dp,
                    bottom = 32.dp
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            // Left side - Information
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Get Ready title
                Text(
                    text = stringResource(R.string.get_ready),
                    color = AmberPrimary,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Deck info - beautiful card
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(6.dp, RoundedCornerShape(16.dp)),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = AmberPrimary),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = displayName,
                            color = IndigoDark,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            lineHeight = 24.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))

                        Text(
                            text = gameMode,
                            color = IndigoDark.copy(alpha = 0.8f),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center
                        )
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Instructions OR custom instruction (not both)
                if (!customInstruction.isNullOrBlank()) {
                    // Show custom instruction instead of normal instructions
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .shadow(4.dp, RoundedCornerShape(12.dp)),
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFE91E63).copy(alpha = 0.9f)
                        ),
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = "⚠️",
                                fontSize = 24.sp,
                                modifier = Modifier.padding(bottom = 8.dp)
                            )

                            Text(
                                text = customInstruction,
                                color = Color.White,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Center,
                                lineHeight = 18.sp
                            )
                        }
                    }
                } else {
                    // Show normal tilt instructions
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .shadow(4.dp, RoundedCornerShape(12.dp)),
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(containerColor = IndigoSurface),
                        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Text(
                                text = stringResource(R.string.tilt_up_correct),
                                color = Color.White,
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                lineHeight = 18.sp
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = stringResource(R.string.tilt_down_skip),
                                color = Color.White,
                                fontSize = 14.sp,
                                textAlign = TextAlign.Center,
                                lineHeight = 18.sp
                            )
                        }
                    }
                }
            }

            // Right side - Play button or countdown
            Box(
                modifier = Modifier
                    .size(200.dp),
                contentAlignment = Alignment.Center
            ) {
                when {
                    countdown > 0 -> {
                        // Countdown
                        Card(
                            modifier = Modifier
                                .size(180.dp)
                                .scale(scale)
                                .shadow(12.dp, CircleShape),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(containerColor = AmberPrimary),
                            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(AmberPrimary),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = countdown.toString(),
                                    color = IndigoDark,
                                    fontSize = 72.sp,
                                    fontWeight = FontWeight.ExtraBold
                                )
                            }
                        }
                    }

                    countdown == 0 -> {
                        // GO!
                        Card(
                            modifier = Modifier
                                .size(180.dp)
                                .shadow(12.dp, CircleShape),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(containerColor = Color(0xFF4CAF50)),
                            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color(0xFF4CAF50)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "GO!",
                                    color = Color.White,
                                    fontSize = 40.sp,
                                    fontWeight = FontWeight.ExtraBold
                                )
                            }
                        }
                    }

                    else -> {
                        // Giant play button
                        Button(
                            onClick = { isCountingDown = true },
                            modifier = Modifier
                                .size(180.dp)
                                .shadow(8.dp, CircleShape),
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = AmberPrimary),
                            elevation = ButtonDefaults.buttonElevation(
                                defaultElevation = 8.dp,
                                pressedElevation = 12.dp
                            )
                        ) {
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = stringResource(R.string.play_game),
                                tint = IndigoDark,
                                modifier = Modifier.size(72.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

// Helper function to format language learning deck names
private fun formatLanguageLearningDeckName(deckId: String): String {
    val parts = deckId.split("_")
    if (parts.size >= 3) {
        val language = parts[0].uppercase()
        val level = parts[1].uppercase()
        val topic = parts.drop(2).joinToString(" ") {
            it.replaceFirstChar { char ->
                if (char.isLowerCase()) char.titlecase() else char.toString()
            }
        }
        return "$language $level: $topic"
    }
    return deckId
}