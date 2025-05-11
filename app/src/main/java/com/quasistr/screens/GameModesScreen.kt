package com.quasistr.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.ui.theme.*

@Composable
fun GameModesScreen(
    currentGameMode: String = "Normal",
    onBackClick: () -> Unit,
    onModeSelect: (String) -> Unit
) {
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

        Box(
            modifier = Modifier
                .size(200.dp)
                .align(Alignment.Center)
                .clip(CircleShape)
                .background(IndigoLight.copy(alpha = 0.5f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier
                        .size(40.dp)
                        .background(IndigoSurface, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "GAME MODES",
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            val gameModes = listOf(
                GameMode("Normal", "60 seconds fixed timer. Tilt up for correct, down to skip. Simple!",
                    Icons.Default.Call, isSelected = currentGameMode == "Normal"),
                GameMode("Challenge", "Start with 60s. Correct: +10s, Skip: -5s. 3 hearts (mistakes). How long can you go?",
                    Icons.Default.Favorite, isSelected = currentGameMode == "Challenge"),
                GameMode("Language Learning", "Practice language skills! Replay skipped words after the game to improve vocabulary.",
                    Icons.Default.Info, isSelected = currentGameMode == "Language Learning"),
                GameMode("PVP Team", "Local match with point counter per team. Share deck, enjoy the competitive end summary!",
                    Icons.Default.Star, isSelected = currentGameMode == "PVP Team")
            )

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp),
                modifier = Modifier.weight(1f)
            ) {
                items(gameModes) { gameMode ->
                    GameModeItem(
                        mode = gameMode,
                        onClick = { onModeSelect(gameMode.title) }
                    )
                }
            }

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                color = IndigoDark,
                shape = RoundedCornerShape(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = onBackClick,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = IndigoSurface
                        ),
                        shape = RoundedCornerShape(24.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("MENU")
                    }

                    Button(
                        onClick = {
                            val selectedMode = gameModes.find { it.isSelected }?.title ?: "Normal"
                            onModeSelect(selectedMode)
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = AmberPrimary
                        ),
                        shape = RoundedCornerShape(24.dp)
                    ) {
                        Text(
                            text = "SELECT",
                            color = IndigoDark,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = null,
                            tint = IndigoDark,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
    }
}

data class GameMode(
    val title: String,
    val description: String,
    val icon: ImageVector,
    val isSelected: Boolean = false
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameModeItem(
    mode: GameMode,
    onClick: () -> Unit
) {
    val backgroundColor = if (mode.isSelected) AmberPrimary else IndigoSurface
    val textColor = if (mode.isSelected) IndigoDark else Color.White

    Surface(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        color = backgroundColor,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 4.dp)
            ) {
                Icon(
                    imageVector = mode.icon,
                    contentDescription = null,
                    tint = textColor
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = mode.title,
                    color = textColor,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }

            Text(
                text = mode.description,
                color = textColor.copy(alpha = 0.8f),
                fontSize = 14.sp
            )
        }
    }
}