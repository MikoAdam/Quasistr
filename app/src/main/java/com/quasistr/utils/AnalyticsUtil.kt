package com.quasistr.utils

import android.os.Bundle
import com.google.firebase.analytics.FirebaseAnalytics
import com.quasistr.activities.QuasistrApplication

object AnalyticsUtil {
    // We'll initialize this when needed
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    // Make sure analytics is initialized
    private fun ensureInitialized() {
        if (!::firebaseAnalytics.isInitialized) {
            firebaseAnalytics = FirebaseAnalytics.getInstance(QuasistrApplication.getInstance())
        }
    }

    fun logEvent(name: String, params: Bundle? = null) {
        ensureInitialized()
        firebaseAnalytics.logEvent(name, params)
    }

    fun logScreenView(screenName: String, screenClass: String) {
        ensureInitialized()
        val bundle = Bundle().apply {
            putString(FirebaseAnalytics.Param.SCREEN_NAME, screenName)
            putString(FirebaseAnalytics.Param.SCREEN_CLASS, screenClass)
        }
        firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, bundle)
    }

    fun logGameStart(deck: String, gameMode: String) {
        ensureInitialized()
        val bundle = Bundle().apply {
            putString("deck_name", deck)
            putString("game_mode", gameMode)
        }
        firebaseAnalytics.logEvent("game_started", bundle)
    }

    fun logGameEnd(deck: String, gameMode: String, guessedCount: Int, skippedCount: Int, timePlayedSeconds: Int) {
        ensureInitialized()
        val totalWords = guessedCount + skippedCount
        val successRate = if (totalWords > 0) guessedCount.toDouble() / totalWords else 0.0

        val bundle = Bundle().apply {
            putString("deck_name", deck)
            putString("game_mode", gameMode)
            putInt("words_guessed", guessedCount)
            putInt("words_skipped", skippedCount)
            putInt("total_words", totalWords)
            putDouble("success_rate", successRate)
            putBoolean("perfect_score", skippedCount == 0 && guessedCount > 0)
            putInt("time_played_seconds", timePlayedSeconds)
        }
        firebaseAnalytics.logEvent("game_completed", bundle)
    }

    fun logDeckSelected(deckName: String) {
        ensureInitialized()
        val bundle = Bundle().apply {
            putString("deck_name", deckName)
        }
        firebaseAnalytics.logEvent("deck_selected", bundle)
    }

    fun logGameModeSelected(gameModeName: String) {
        ensureInitialized()
        val bundle = Bundle().apply {
            putString("mode_name", gameModeName)
        }
        firebaseAnalytics.logEvent("game_mode_selected", bundle)
    }
}