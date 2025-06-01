package com.quasistr.activities

import android.app.AlertDialog
import android.content.Context
import android.content.pm.ActivityInfo
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
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.quasistr.R
import com.quasistr.components.AsymmetricBackground
import com.quasistr.data.DeckManager
import com.quasistr.screens.CountdownScreen
import com.quasistr.screens.GameScreen
import com.quasistr.screens.ScoreScreen
import com.quasistr.ui.theme.QuasistrTheme
import com.quasistr.utils.AnalyticsUtil
import com.quasistr.utils.PreferenceManager

class GameActivity : ComponentActivity(), SensorEventListener {
    private lateinit var sensorManager: SensorManager
    private var accelerometer: Sensor? = null
    private var vibrator: Vibrator? = null

    private var currentScreen by mutableStateOf("Countdown")
    private var currentWordIndex by mutableIntStateOf(0)
    private var words = listOf<String>()
    private var guessedWords = mutableListOf<String>()
    private var skippedWords = mutableListOf<String>()
    private var guessedCount by mutableIntStateOf(0)
    private var skippedCount by mutableIntStateOf(0)
    private var gameTimer: CountDownTimer? = null
    private var isVertical = true
    private var gameStarted = false
    private var remainingTime by mutableIntStateOf(60)

    private var showCorrectAnimation by mutableStateOf(false)
    private var showSkipAnimation by mutableStateOf(false)

    private var gameMode = "Normal"
    private var initialTime = 60000L
    private var correctBonus = 0L
    private var skipPenalty = 0L
    private var deckName = ""
    private var isLanguageLearning = false

    override fun attachBaseContext(newBase: Context?) {
        super.attachBaseContext(newBase?.let { PreferenceManager.wrapContext(it) })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Ensure locale is always set correctly
        val languageCode = PreferenceManager.getUILanguage(this)
        PreferenceManager.updateLocale(this, languageCode)

        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        updateOrientation()

        WindowCompat.setDecorFitsSystemWindows(window, false)
        WindowInsetsControllerCompat(window, window.decorView).let { controller ->
            controller.hide(WindowInsetsCompat.Type.systemBars())
            controller.systemBarsBehavior = WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }

        deckName = intent.getStringExtra("deck") ?: ""
        gameMode = intent.getStringExtra("gameMode") ?: "Normal"
        isLanguageLearning = intent.getBooleanExtra("isLanguageLearning", false)

        AnalyticsUtil.logGameStart(deckName, gameMode)

        configureGameMode()
        loadWords()

        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        accelerometer = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)

        vibrator = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val vibratorManager = getSystemService(VIBRATOR_MANAGER_SERVICE) as VibratorManager
            vibratorManager.defaultVibrator
        } else {
            @Suppress("DEPRECATION")
            getSystemService(VIBRATOR_SERVICE) as Vibrator
        }

        setContent {
            QuasistrTheme {
                AsymmetricBackground {
                    AnimatedContent(
                        targetState = currentScreen,
                        transitionSpec = {
                            fadeIn(animationSpec = tween(300)) togetherWith
                                    fadeOut(animationSpec = tween(300))
                        }
                    ) { screen ->
                        when (screen) {
                            "Countdown" -> CountdownScreen(
                                deckName = deckName,
                                gameMode = gameMode,
                                isLanguageLearning = isLanguageLearning,
                                onStartGame = { startGame() },
                                onCancel = { finish() }
                            )
                            "Game" -> GameScreen(
                                currentWord = if (currentWordIndex < words.size) words[currentWordIndex] else "",
                                guessedCount = guessedCount,
                                skippedCount = skippedCount,
                                remainingTime = remainingTime,
                                onEndGame = { endGame() }
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
        }
    }

    private fun loadWords() {
        words = if (isLanguageLearning) {
            val allLanguageLearningDecks = mutableMapOf<String, com.quasistr.data.models.LanguageLearningDeck>()
            allLanguageLearningDecks.putAll(DeckManager.getLanguageLearningDecks("de"))
            allLanguageLearningDecks.putAll(DeckManager.getLanguageLearningDecks("en"))
            allLanguageLearningDecks.putAll(DeckManager.getLanguageLearningDecks("hu"))

            val deck = allLanguageLearningDecks[deckName]
            deck?.words?.shuffled() ?: emptyList()
        } else {
            if (deckName.isNotEmpty()) {
                DeckManager.getWordsByDeckName(deckName, this).shuffled()
            } else {
                DeckManager.getAllDeckNames(this).firstOrNull()?.let { firstDeck ->
                    DeckManager.getWordsByDeckName(firstDeck, this).shuffled()
                } ?: emptyList()
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
                initialTime = 90000L
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
        startTimer(initialTime)
    }

    private fun startTimer(timeMillis: Long) {
        gameTimer = object : CountDownTimer(timeMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                remainingTime = (millisUntilFinished / 1000).toInt()
            }

            override fun onFinish() {
                vibrate(3000)
                endGame()
            }
        }.start()
    }

    private fun resetGame() {
        // Stop any running timer first
        gameTimer?.cancel()
        gameStarted = false

        // Reset all game state completely
        currentWordIndex = 0
        guessedWords.clear()
        skippedWords.clear()
        guessedCount = 0
        skippedCount = 0
        remainingTime = if (gameMode == "Language Learning") 90 else 60

        // Reset animations and sensor state
        showCorrectAnimation = false
        showSkipAnimation = false
        isVertical = true

        // Reload words from the same deck
        loadWords()
    }

    private fun endGame() {
        gameStarted = false
        gameTimer?.cancel()

        if (currentWordIndex < words.size && !skippedWords.contains(words[currentWordIndex]) && !guessedWords.contains(words[currentWordIndex])) {
            skippedWords.add(words[currentWordIndex])
            skippedCount++
        }

        vibrate(3000)

        val timePlayed = (initialTime/1000 - remainingTime).toInt()
        AnalyticsUtil.logGameEnd(
            deck = deckName,
            gameMode = gameMode,
            guessedCount = guessedCount,
            skippedCount = skippedCount,
            timePlayedSeconds = timePlayed
        )

        setScreen("Score")
    }

    override fun onResume() {
        super.onResume()

        // Force locale update every time activity resumes
        val languageCode = PreferenceManager.getUILanguage(this)
        PreferenceManager.updateLocale(this, languageCode)

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
            if (z > 7) {
                vibrate(200)
                guessedWords.add(words[currentWordIndex])
                guessedCount++
                isVertical = false

                showCorrectAnimation = true

                if (gameMode == "Challenge" && correctBonus > 0) {
                    applyTimeChange(correctBonus)
                }

                moveToNextWord()
            } else if (z < -7) {
                vibrate(200)
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
            endGame()
        }
    }

    override fun onBackPressed() {
        when (currentScreen) {
            "Countdown" -> {
                finish()
            }
            "Game" -> {
                val dialog = AlertDialog.Builder(this)
                    .setTitle(getString(R.string.end_game_title))
                    .setMessage(getString(R.string.end_game_message))
                    .setPositiveButton(getString(R.string.yes)) { dialogInterface, _ ->
                        dialogInterface.dismiss()
                        finish()
                    }
                    .setNegativeButton(getString(R.string.no)) { dialogInterface, _ ->
                        dialogInterface.dismiss()
                    }
                    .setCancelable(false)
                    .create()

                dialog.show()
            }
            "Score" -> {
                finish()
            }
            else -> {
                super.onBackPressed()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        gameTimer?.cancel()
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {}
}