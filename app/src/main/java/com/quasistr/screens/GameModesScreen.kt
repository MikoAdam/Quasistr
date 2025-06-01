package com.quasistr.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TimerOff
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.R
import com.quasistr.ui.theme.*

@Composable
fun GameModesScreen(
    currentGameMode: String,
    onBackClick: () -> Unit,
    onModeSelect: (String) -> Unit
) {
    val context = LocalContext.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        // Background circles
        Box(
            modifier = Modifier
                .size(280.dp)
                .offset(x = 50.dp, y = (-40).dp)
                .align(Alignment.TopEnd)
                .clip(CircleShape)
                .background(IndigoSurface.copy(alpha = 0.3f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier
                        .size(48.dp)
                        .background(IndigoSurface, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = stringResource(R.string.game_mode),
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Game modes
            GameModeButton(
                name = stringResource(R.string.normal_mode),
                icon = Icons.Default.Timer,
                description = stringResource(R.string.normal_mode_description),
                isCurrentMode = currentGameMode == "Normal",
                isAvailable = true,
                onClick = { onModeSelect("Normal") }
            )

            GameModeButton(
                name = stringResource(R.string.challenge_mode),
                icon = Icons.Default.TimerOff,
                description = stringResource(R.string.challenge_mode_description),
                isCurrentMode = currentGameMode == "Challenge",
                isAvailable = true,
                onClick = { onModeSelect("Challenge") }
            )

            GameModeButton(
                name = stringResource(R.string.language_learning_mode),
                icon = Icons.Default.School,
                description = stringResource(R.string.language_learning_description),
                isCurrentMode = currentGameMode == "Language Learning",
                isAvailable = true,
                onClick = { onModeSelect("Language Learning") }
            )

            GameModeButton(
                name = stringResource(R.string.pvp_team_mode),
                icon = Icons.Default.Group,
                description = stringResource(R.string.pvp_team_description),
                isCurrentMode = currentGameMode == "PVP Team",
                isAvailable = false,
                onClick = { onModeSelect("PVP Team") }
            )
        }
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
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = when {
                isCurrentMode -> AmberPrimary
                isAvailable -> IndigoSurface
                else -> IndigoSurface.copy(alpha = 0.5f)
            }
        ),
        shape = RoundedCornerShape(16.dp),
        onClick = { if (isAvailable) onClick() }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = if (!isAvailable) Icons.Default.Lock else icon,
                contentDescription = name,
                tint = if (isCurrentMode) IndigoDark else Color.White,
                modifier = Modifier.size(32.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = name,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = if (isCurrentMode) IndigoDark else Color.White
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = if (isAvailable) description else "Coming Soon",
                    fontSize = 14.sp,
                    color = if (isCurrentMode) IndigoDark.copy(alpha = 0.7f) else Color.White.copy(alpha = 0.7f)
                )
            }

            // Show checkmark for current mode
            if (isCurrentMode) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Selected",
                    tint = IndigoDark,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}