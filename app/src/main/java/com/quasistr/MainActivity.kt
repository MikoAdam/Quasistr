package com.quasistr

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

                when (currentScreen) {
                    "MainMenu" -> MainMenuScreen(
                        onPlayClick = { currentScreen = "DeckSelection" },
                        onGameModesClick = { currentScreen = "GameModes" },
                        onSettingsClick = { /* Future implementation */ }
                    )
                    "DeckSelection" -> DeckSelectionScreen(
                        onBackClick = { currentScreen = "MainMenu" },
                        onDeckSelect = { deck ->
                            // Start GameActivity with the selected deck
                            val intent = Intent(this@MainActivity, GameActivity::class.java)
                            intent.putExtra("deck", deck)
                            startActivity(intent)
                        }
                    )
                    "GameModes" -> GameModesScreen(
                        onBackClick = { currentScreen = "MainMenu" },
                        onModeSelect = {
                            // For now, all modes just go to deck selection
                            currentScreen = "DeckSelection"
                        }
                    )
                }
            }
        }
    }
}