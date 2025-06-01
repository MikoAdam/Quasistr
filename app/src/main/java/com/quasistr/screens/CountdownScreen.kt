package com.quasistr.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.R
import com.quasistr.data.DeckManager
import com.quasistr.ui.theme.*
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
        targetValue = if (countdown > 0) 1.2f else 1.0f,
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

    // Get deck info for display
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
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        IndigoBackground,
                        IndigoDark,
                        IndigoBackground
                    )
                )
            )
    ) {
        // Subtle background decoration
        Box(
            modifier = Modifier
                .size(200.dp)
                .offset(x = (-50).dp, y = (-50).dp)
                .align(Alignment.TopStart)
                .clip(CircleShape)
                .background(AmberPrimary.copy(alpha = 0.1f))
        )

        // Close button - fixed position
        IconButton(
            onClick = onCancel,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(16.dp)
                .size(48.dp)
                .background(IndigoSurface.copy(alpha = 0.8f), CircleShape)
        ) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = stringResource(R.string.cancel),
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }

        // Smart layout based on content
        if (countdown > -1) {
            // During countdown - center the countdown number
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                when {
                    countdown > 0 -> {
                        Card(
                            modifier = Modifier
                                .size(220.dp)
                                .shadow(20.dp, CircleShape),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        brush = Brush.radialGradient(
                                            colors = listOf(
                                                AmberPrimary,
                                                Color(0xFFFF8F00)
                                            )
                                        )
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = countdown.toString(),
                                    color = Color.White,
                                    fontSize = 96.sp,
                                    fontWeight = FontWeight.Black,
                                    modifier = Modifier.scale(scale)
                                )
                            }
                        }
                    }
                    countdown == 0 -> {
                        Card(
                            modifier = Modifier
                                .size(220.dp)
                                .shadow(20.dp, CircleShape),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        brush = Brush.radialGradient(
                                            colors = listOf(
                                                Color(0xFF4CAF50),
                                                Color(0xFF2E7D32)
                                            )
                                        )
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "GO!",
                                    color = Color.White,
                                    fontSize = 56.sp,
                                    fontWeight = FontWeight.Black
                                )
                            }
                        }
                    }
                }
            }
        } else {
            // Before countdown - show all info in a smart layout
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState()),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.height(60.dp)) // Space for close button

                // Compact header
                Text(
                    text = stringResource(R.string.get_ready),
                    color = AmberPrimary,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Deck info - compact but clear
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(4.dp, RoundedCornerShape(16.dp)),
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White.copy(alpha = 0.95f)
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
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

                        Box(
                            modifier = Modifier
                                .background(
                                    AmberPrimary.copy(alpha = 0.2f),
                                    RoundedCornerShape(8.dp)
                                )
                                .padding(horizontal = 12.dp, vertical = 6.dp)
                        ) {
                            Text(
                                text = gameMode,
                                color = IndigoDark,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Instructions - always visible, compact
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(4.dp, RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = IndigoSurface
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            // Tilt up
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = "📱⬆️",
                                    fontSize = 24.sp
                                )
                                Text(
                                    text = stringResource(R.string.correct),
                                    color = Color.White,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    textAlign = TextAlign.Center
                                )
                            }

                            // Divider
                            Box(
                                modifier = Modifier
                                    .width(1.dp)
                                    .height(40.dp)
                                    .background(Color.White.copy(alpha = 0.3f))
                            )

                            // Tilt down
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier.weight(1f)
                            ) {
                                Text(
                                    text = "📱⬇️",
                                    fontSize = 24.sp
                                )
                                Text(
                                    text = stringResource(R.string.skip),
                                    color = Color.White,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Medium,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }

                // Custom instruction - only if exists, always visible
                if (!customInstruction.isNullOrBlank()) {
                    Spacer(modifier = Modifier.height(12.dp))

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .shadow(4.dp, RoundedCornerShape(12.dp)),
                        shape = RoundedCornerShape(12.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFFE91E63).copy(alpha = 0.9f)
                        )
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "⚠️",
                                fontSize = 20.sp,
                                modifier = Modifier.padding(end = 8.dp)
                            )

                            Text(
                                text = customInstruction,
                                color = Color.White,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                textAlign = TextAlign.Start,
                                lineHeight = 18.sp,
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }

                // Flexible spacer
                Spacer(modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier.height(20.dp))

                // Play button - always accessible
                Button(
                    onClick = { isCountingDown = true },
                    modifier = Modifier
                        .size(160.dp)
                        .shadow(12.dp, CircleShape),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.radialGradient(
                                    colors = listOf(
                                        AmberPrimary,
                                        Color(0xFFFF8F00)
                                    )
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = stringResource(R.string.play_game),
                            tint = Color.White,
                            modifier = Modifier.size(64.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))
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