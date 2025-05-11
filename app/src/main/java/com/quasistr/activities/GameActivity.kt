package com.quasistr.activities

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.os.VibrationEffect
import android.os.Vibrator
import android.os.VibratorManager
import android.view.WindowManager
import android.app.AlertDialog
import android.content.pm.ActivityInfo
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.quasistr.data.Decks
import com.quasistr.screens.CountdownScreen
import com.quasistr.screens.GameScreen
import com.quasistr.screens.ScoreScreen
import com.quasistr.ui.theme.QuasistrTheme
import com.quasistr.utils.SoundManager

class GameActivity : ComponentActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private var accelerometer: Sensor? = null
    private var vibrator: Vibrator? = null
    private lateinit var soundManager: SoundManager

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

    private var showCorrectAnimation by mutableStateOf(false)
    private var showSkipAnimation by mutableStateOf(false)

    private var gameMode = "Normal"
    private var initialTime = 60000L
    private var correctBonus = 0L
    private var skipPenalty = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        updateOrientation()

        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        val deckName = intent.getStringExtra("deck") ?: "Movies"
        gameMode = intent.getStringExtra("gameMode") ?: "Normal"

        configureGameMode()

        words = Decks.getWordsByDeckName(deckName).shuffled()

        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        soundManager = SoundManager(this)

        vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val vibratorManager = getSystemService(VIBRATOR_MANAGER_SERVICE) as VibratorManager
            vibratorManager.defaultVibrator
        } else {
            @Suppress("DEPRECATION")
            getSystemService(VIBRATOR_SERVICE) as Vibrator
        }

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
                            setScreen("Countdown")
                        },
                        onBackToDecks = { finish() }
                    )
                }
            }
        }
    }

    private fun updateOrientation() {
        requestedOrientation = when (currentScreen) {
            "Countdown", "Game" -> ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            else -> ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        }
    }

    private fun setScreen(screen: String) {
        currentScreen = screen
        updateOrientation()
    }

    private fun configureGameMode() {
        when (gameMode) {
            "Normal" -> {
                initialTime = 60000L
                correctBonus = 0L
                skipPenalty = 0L
            }
            "Challenge" -> {
                initialTime = 60000L
                correctBonus = 10000L
                skipPenalty = 5000L
            }
            "Language Learning" -> {
                initialTime = 60000L
                correctBonus = 0L
                skipPenalty = 0L
            }
            "PVP Team" -> {
                initialTime = 60000L
                correctBonus = 0L
                skipPenalty = 0L
            }
            else -> {
                initialTime = 60000L
                correctBonus = 0L
                skipPenalty = 0L
            }
        }
    }

    private fun startGame() {
        gameTimer?.cancel()
        gameStarted = true
        setScreen("Game")
        soundManager.playCountdownSound()
        startTimer(initialTime)
    }

    private fun startTimer(timeMillis: Long) {
        gameTimer = object : CountDownTimer(timeMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                remainingTime = (millisUntilFinished / 1000).toInt()

                if (millisUntilFinished <= 10000 && millisUntilFinished > 9000) {
                    soundManager.playTimeWarningSound()
                }

                if (millisUntilFinished <= 3000 && !vibrationTriggered) {
                    vibrationTriggered = true
                    vibrate(3000)
                    soundManager.playTimeWarningSound()
                }
            }

            override fun onFinish() {
                soundManager.playGameOverSound()
                showScoreScreen()
                vibrationTriggered = false
            }
        }.start()
    }

    private fun resetGame() {
        currentWordIndex = 0
        guessedWords.clear()
        skippedWords.clear()
        guessedCount = 0
        skippedCount = 0
        remainingTime = 60
        gameStarted = false
        words = words.shuffled()
    }

    private fun showScoreScreen() {
        gameStarted = false
        gameTimer?.cancel()
        setScreen("Score")
    }

    override fun onResume() {
        super.onResume()
        accelerometer?.also { sensor ->
            sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL)
        }
    }

    override fun onPause() {
        super.onPause()
        sensorManager.unregisterListener(this)
        gameTimer?.cancel()
    }

    override fun onSensorChanged(event: SensorEvent?) {
        if (!gameStarted || event == null || currentScreen != "Game") return

        val z = event.values[2]

        if (isVertical && currentWordIndex < words.size) {
            if (z > 7) {  // Tilted backwards (guessed)
                vibrate(200)
                soundManager.playCorrectSound()
                guessedWords.add(words[currentWordIndex])
                guessedCount++
                isVertical = false

                showCorrectAnimation = true

                if (gameMode == "Challenge" && correctBonus > 0) {
                    applyTimeChange(correctBonus)
                }

                moveToNextWord()
            } else if (z < -7) {  // Tilted forward (skipped)
                vibrate(200)
                soundManager.playSkipSound()
                skippedWords.add(words[currentWordIndex])
                skippedCount++
                isVertical = false

                showSkipAnimation = true

                if (gameMode == "Challenge" && skipPenalty > 0) {
                    applyTimeChange(-skipPenalty)
                }

                moveToNextWord()
            }
        } else if (z in -3f..3f) {
            isVertical = true

            showCorrectAnimation = false
            showSkipAnimation = false
        }
    }

    private fun applyTimeChange(changeMillis: Long) {
        gameTimer?.cancel()

        val currentTimeMillis = remainingTime * 1000L
        var newTimeMillis = currentTimeMillis + changeMillis

        if (newTimeMillis < 1000) newTimeMillis = 1000

        startTimer(newTimeMillis)
    }

    private fun vibrate(duration: Long) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
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

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        when (currentScreen) {
            "Countdown" -> {
                finish()
            }
            "Game" -> {
                AlertDialog.Builder(this)
                    .setTitle("End Game?")
                    .setMessage("Are you sure you want to end the current game?")
                    .setPositiveButton("Yes") { _, _ ->
                        finish()
                    }
                    .setNegativeButton("No", null)
                    .show()
            }
            "Score" -> {
                finish()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        soundManager.release()
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
}