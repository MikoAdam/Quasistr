package com.quasistr.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TimerOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.ui.theme.AmberPrimary
import com.quasistr.ui.theme.IndigoSurface

@Composable
fun GameModesScreen(
    currentGameMode: String,
    onBackClick: () -> Unit,
    onModeSelect: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Back",
                    tint = Color.White
                )
            }

            Text(
                text = "Game Modes",
                color = AmberPrimary,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 8.dp)
            )
        }

        GameModeButton(
            name = "Normal",
            icon = Icons.Default.Timer,
            description = "60 seconds to guess as many words as possible",
            isCurrentMode = currentGameMode == "Normal",
            isAvailable = true,
            onClick = { onModeSelect("Normal") }
        )

        GameModeButton(
            name = "Challenge",
            icon = Icons.Default.TimerOff,
            description = "Get +10 seconds for each correct guess, -5 seconds for each skip",
            isCurrentMode = currentGameMode == "Challenge",
            isAvailable = true,
            onClick = { onModeSelect("Challenge") }
        )

        GameModeButton(
            name = "Language Learning",
            icon = Icons.Default.School,
            description = "Learn vocabulary in another language",
            isCurrentMode = currentGameMode == "Language Learning",
            isAvailable = false,
            onClick = { onModeSelect("Language Learning") }
        )

        GameModeButton(
            name = "PVP Team",
            icon = Icons.Default.Group,
            description = "Team vs Team competition mode",
            isCurrentMode = currentGameMode == "PVP Team",
            isAvailable = false,
            onClick = { onModeSelect("PVP Team") }
        )
    }
}

@Composable
fun GameModeButton(
    name: String,
    icon: ImageVector,
    description: String,
    isCurrentMode: Boolean,
    isAvailable: Boolean,
    onClick: () -> Unit
) {
    Button(
        onClick = { if (isAvailable) onClick() },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isCurrentMode) AmberPrimary else IndigoSurface
        ),
        shape = RoundedCornerShape(16.dp),
        enabled = isAvailable
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = if (!isAvailable) Icons.Default.Lock else icon,
                contentDescription = name,
                tint = if (isCurrentMode) Color.Black else Color.White
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp)
            ) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    color = if (isCurrentMode) Color.Black else Color.White
                )

                Text(
                    text = if (isAvailable) description else "Coming Soon",
                    fontSize = 12.sp,
                    color = if (isCurrentMode) Color.Black.copy(alpha = 0.7f) else Color.White.copy(alpha = 0.7f)
                )
            }
        }
    }
}