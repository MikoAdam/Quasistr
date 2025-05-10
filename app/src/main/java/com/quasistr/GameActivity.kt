package com.quasistr

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.os.CountDownTimer
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.quasistr.data.Decks
import com.quasistr.screens.CountdownScreen
import com.quasistr.screens.GameScreen
import com.quasistr.screens.ScoreScreen
import com.quasistr.ui.theme.QuasistrTheme

class GameActivity : ComponentActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private var accelerometer: Sensor? = null
    private var vibrator: Vibrator? = null

    // Game state
    private var currentScreen by mutableStateOf("Countdown")
    private var currentWordIndex by mutableStateOf(0)
    private var words = listOf<String>()
    private var guessedWords = mutableListOf<String>()
    private var skippedWords = mutableListOf<String>()
    private var guessedCount by mutableStateOf(0)
    private var skippedCount by mutableStateOf(0)
    private var gameTimer: CountDownTimer? = null
    private var isVertical = true
    private var gameStarted = false
    private var vibrationTriggered = false
    private var remainingTime by mutableStateOf(60)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Keep screen on during gameplay
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        // Force landscape orientation
        requestedOrientation = android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE

        // Get the selected deck name
        val deckName = intent.getStringExtra("deck") ?: "Movies"

        // Get words from the deck
        words = Decks.getWordsByDeckName(deckName).shuffled()

        // Initialize sensors
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        // Initialize vibrator
        vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        setContent {
            QuasistrTheme {
                when (currentScreen) {
                    "Countdown" -> CountdownScreen(
                        onStartGame = { startGame() },
                        onCancel = { finish() }
                    )
                    "Game" -> GameScreen(
                        currentWord = if (currentWordIndex < words.size) words[currentWordIndex] else "",
                        guessedCount = guessedCount,
                        skippedCount = skippedCount,
                        remainingTime = remainingTime,
                        onEndGame = { showScoreScreen() }
                    )
                    "Score" -> ScoreScreen(
                        guessedWords = guessedWords,
                        skippedWords = skippedWords,
                        onPlayAgain = {
                            resetGame()
                            currentScreen = "Countdown"
                        },
                        onBackToDecks = { finish() }
                    )
                }
            }
        }
    }

    private fun startGame() {
        // Reset any existing timer
        gameTimer?.cancel()

        // Mark game as started to enable tilt detection
        gameStarted = true
        currentScreen = "Game"

        // Start the game timer
        gameTimer = object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                remainingTime = (millisUntilFinished / 1000).toInt()

                // Vibrate when 3 seconds remaining
                if (millisUntilFinished <= 3000 && !vibrationTriggered) {
                    vibrationTriggered = true
                    vibrate(3000)
                }
            }

            override fun onFinish() {
                showScoreScreen()
                vibrationTriggered = false
            }
        }.start()
    }

    private fun resetGame() {
        // Reset game state
        currentWordIndex = 0
        guessedWords.clear()
        skippedWords.clear()
        guessedCount = 0
        skippedCount = 0
        remainingTime = 60
        gameStarted = false

        // Reshuffle words
        words = words.shuffled()
    }

    private fun showScoreScreen() {
        gameStarted = false
        gameTimer?.cancel()
        currentScreen = "Score"
    }

    override fun onResume() {
        super.onResume()
        // Register sensor listener
        accelerometer?.also { sensor ->
            sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onPause() {
        super.onPause()
        // Unregister sensor listener to avoid memory leaks
        sensorManager.unregisterListener(this)
        // Cancel the timer if running
        gameTimer?.cancel()
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (!gameStarted || event == null || currentScreen != "Game") return

        val z = event.values[2]  // Z-axis for front/back tilt

        if (isVertical && currentWordIndex < words.size) {
            if (z > 7) {  // Tilted backwards (guessed)
                vibrate(200)
                guessedWords.add(words[currentWordIndex])
                guessedCount++
                isVertical = false
                moveToNextWord()
            } else if (z < -7) {  // Tilted forward (skipped)
                vibrate(200)
                skippedWords.add(words[currentWordIndex])
                skippedCount++
                isVertical = false
                moveToNextWord()
            }
        } else if (z in -3f..3f) {
            isVertical = true  // Reset when phone returns to vertical
        }
    }

    private fun vibrate(duration: Long) {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            vibrator?.vibrate(VibrationEffect.createOneShot(duration, VibrationEffect.DEFAULT_AMPLITUDE))
        } else {
            @Suppress("DEPRECATION")
            vibrator?.vibrate(duration)
        }
    }

    private fun moveToNextWord() {
        currentWordIndex++
        if (currentWordIndex >= words.size) {
            showScoreScreen()
        }
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        // Not needed for this implementation
    }
}