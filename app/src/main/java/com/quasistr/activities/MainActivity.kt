package com.quasistr.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.quasistr.screens.DeckSelectionScreen
import com.quasistr.screens.GameModesScreen
import com.quasistr.screens.MainMenuScreen
import com.quasistr.ui.theme.QuasistrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuasistrTheme {
                var currentScreen by remember { mutableStateOf("MainMenu") }
                var gameMode by remember { mutableStateOf("Normal") }

                when (currentScreen) {
                    "MainMenu" -> MainMenuScreen(
                        onPlayClick = { currentScreen = "DeckSelection" },
                        onGameModesClick = { currentScreen = "GameModes" },
                        onSettingsClick = { /* Future implementation */ }
                    )
                    "DeckSelection" -> DeckSelectionScreen(
                        currentGameMode = gameMode,
                        onBackClick = { currentScreen = "MainMenu" },
                        onDeckSelect = { deck ->
                            val intent = Intent(this@MainActivity, GameActivity::class.java)
                            intent.putExtra("deck", deck)
                            intent.putExtra("gameMode", gameMode)
                            startActivity(intent)
                        },
                        onGameModeClick = { currentScreen = "GameModes" }
                    )
                    "GameModes" -> GameModesScreen(
                        currentGameMode = gameMode,
                        onBackClick = { currentScreen = "MainMenu" },
                        onModeSelect = { mode ->
                            gameMode = mode
                            currentScreen = "DeckSelection"
                        }
                    )
                }
            }
        }
    }
}