package com.quasistr.activities

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.quasistr.animations.getTransitionSpec
import com.quasistr.components.AsymmetricBackground
import com.quasistr.screens.DeckSelectionScreen
import com.quasistr.screens.GameModesScreen
import com.quasistr.screens.SettingsScreen
import com.quasistr.ui.theme.QuasistrTheme
import com.quasistr.utils.AnalyticsUtil

class MainActivity : ComponentActivity() {
    private var backPressedTime = 0L
    private val currentScreenState = mutableStateOf("DeckSelection")
    private val gameModeState = mutableStateOf("Normal")

    private var currentScreen: String
        get() = currentScreenState.value
        set(value) { currentScreenState.value = value }

    private var gameMode: String
        get() = gameModeState.value
        set(value) { gameModeState.value = value }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AnalyticsUtil.logScreenView("Main", "MainActivity")

        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        setContent {
            QuasistrTheme {
                val currentScreen by remember { currentScreenState }
                val gameMode by remember { gameModeState }

                AsymmetricBackground {
                    AnimatedContent(
                        targetState = currentScreen,
                        transitionSpec = getTransitionSpec()
                    ) { screen ->
                        when (screen) {
                            "DeckSelection" -> DeckSelectionScreen(
                                currentGameMode = gameMode,
                                onDeckSelect = { deck ->
                                    // Log deck selection event
                                    AnalyticsUtil.logDeckSelected(deck)

                                    val intent = Intent(this@MainActivity, GameActivity::class.java).apply {
                                        putExtra("deck", deck)
                                        putExtra("gameMode", gameMode)
                                    }
                                    startActivity(intent)
                                },
                                onGameModeClick = { this@MainActivity.currentScreen = "GameModes" },
                                onSettingsClick = { this@MainActivity.currentScreen = "Settings" }
                            )
                            "GameModes" -> GameModesScreen(
                                currentGameMode = gameMode,
                                onBackClick = { this@MainActivity.currentScreen = "DeckSelection" },
                                onModeSelect = { mode ->
                                    // Log game mode selection
                                    AnalyticsUtil.logGameModeSelected(mode)

                                    this@MainActivity.gameMode = mode
                                    this@MainActivity.currentScreen = "DeckSelection"
                                }
                            )
                            "Settings" -> SettingsScreen(
                                onBackClick = { this@MainActivity.currentScreen = "DeckSelection" }
                            )
                        }
                    }
                }
            }
        }
    }

    override fun onBackPressed() {
        when (currentScreen) {
            "DeckSelection" -> {
                if (backPressedTime + 2000 > System.currentTimeMillis()) {
                    super.onBackPressed()
                } else {
                    Toast.makeText(this, "Press back again to exit",
                        Toast.LENGTH_SHORT).show()
                }
                backPressedTime = System.currentTimeMillis()
            }
            "GameModes", "Settings" -> {
                currentScreen = "DeckSelection"
            }
            else -> {
                super.onBackPressed()
            }
        }
    }
}