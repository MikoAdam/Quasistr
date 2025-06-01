package com.quasistr.utils

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.SharedPreferences
import android.content.res.Configuration
import androidx.core.app.ActivityCompat
import java.util.Locale

class LocaleContextWrapper(base: Context) : ContextWrapper(base) {
    companion object {
        fun wrap(context: Context, language: String): ContextWrapper {
            val config = Configuration(context.resources.configuration)
            val locale = Locale(language)
            Locale.setDefault(locale)

            config.setLocale(locale)
            val newContext = context.createConfigurationContext(config)
            return LocaleContextWrapper(newContext)
        }
    }
}

object PreferenceManager {
    private const val PREFS_NAME = "quasistr_prefs"
    private const val KEY_UI_LANGUAGE = "ui_language"
    private const val KEY_DECK_LANGUAGE = "deck_language"
    private const val KEY_SOUND_ENABLED = "sound_enabled"
    private const val KEY_VIBRATION_ENABLED = "vibration_enabled"

    private fun getPrefs(context: Context): SharedPreferences {
        return context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    // UI Language (affects menus, buttons, etc.)
    fun getUILanguage(context: Context): String {
        val prefs = getPrefs(context)
        val systemLanguage = Locale.getDefault().language
        return prefs.getString(KEY_UI_LANGUAGE, systemLanguage) ?: systemLanguage
    }

    fun setUILanguage(context: Context, languageCode: String) {
        getPrefs(context).edit()
            .putString(KEY_UI_LANGUAGE, languageCode)
            .apply()
    }

    // Deck Language (affects Normal/Challenge mode deck content)
    fun getDeckLanguage(context: Context): String {
        val prefs = getPrefs(context)
        val uiLanguage = getUILanguage(context)
        return prefs.getString(KEY_DECK_LANGUAGE, uiLanguage) ?: uiLanguage
    }

    fun setDeckLanguage(context: Context, languageCode: String) {
        getPrefs(context).edit()
            .putString(KEY_DECK_LANGUAGE, languageCode)
            .apply()
    }

    // Sound Settings
    fun isSoundEnabled(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_SOUND_ENABLED, true)
    }

    fun setSoundEnabled(context: Context, enabled: Boolean) {
        getPrefs(context).edit()
            .putBoolean(KEY_SOUND_ENABLED, enabled)
            .apply()
    }

    // Vibration Settings
    fun isVibrationEnabled(context: Context): Boolean {
        return getPrefs(context).getBoolean(KEY_VIBRATION_ENABLED, true)
    }

    fun setVibrationEnabled(context: Context, enabled: Boolean) {
        getPrefs(context).edit()
            .putBoolean(KEY_VIBRATION_ENABLED, enabled)
            .apply()
    }

    // Available languages
    fun getAvailableUILanguages(): List<Pair<String, String>> {
        return listOf(
            "en" to "🇺🇸 English",
            "de" to "🇩🇪 Deutsch",
            "hu" to "🇭🇺 Magyar",
            "fr" to "🇫🇷 Français",
            "es" to "🇪🇸 Español"
        )
    }

    fun setUILanguageAndRecreate(context: Context, languageCode: String) {
        setUILanguage(context, languageCode)
        setDeckLanguage(context, languageCode)

        if (context is Activity) {
            ActivityCompat.recreate(context)
        }
    }

    fun updateLocale(context: Context, languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)

        val config = Configuration(context.resources.configuration)
        config.setLocale(locale)
        context.resources.updateConfiguration(config, context.resources.displayMetrics)
    }

    fun wrapContext(context: Context): Context {
        val language = getUILanguage(context)
        return LocaleContextWrapper.wrap(context, language)
    }
}