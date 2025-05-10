package com.quasistr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.quasistr.ui.theme.QuasistrTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuasistrTheme {
                var currentScreen by remember { mutableStateOf("MainMenu") }

                when (currentScreen) {
                    "MainMenu" -> MainMenuScreen(
                        onPlayClick = { currentScreen = "DeckSelection" },
                        onGameModesClick = { currentScreen = "GameModes" },
                        onSettingsClick = { /* Future implementation */ }
                    )
                    "DeckSelection" -> DeckSelectionScreen(
                        onBackClick = { currentScreen = "MainMenu" },
                        onDeckSelect = { /* Future implementation */ }
                    )
                    "GameModes" -> GameModesScreen(
                        onBackClick = { currentScreen = "MainMenu" },
                        onModeSelect = { currentScreen = "DeckSelection" }
                    )
                }
            }
        }
    }
}