package com.quasistr.data

import android.content.Context
import com.quasistr.data.decks.EnglishDecks
import com.quasistr.data.decks.FrenchDecks
import com.quasistr.data.decks.GermanDecks
import com.quasistr.data.decks.HungarianDecks
import com.quasistr.data.decks.SpanishDecks
import com.quasistr.data.languagelearning.EnglishLearningDecks
import com.quasistr.data.languagelearning.FrenchLearningDecks
import com.quasistr.data.languagelearning.GermanLearningDecks
import com.quasistr.data.languagelearning.HungarianLearningDecks
import com.quasistr.data.languagelearning.SpanishLearningDecks
import com.quasistr.data.models.Deck
import com.quasistr.data.models.LanguageLearningDeck
import com.quasistr.utils.PreferenceManager

object DeckManager {
    
    // Get regular decks based on deck language setting
    fun getDecksForCurrentLanguage(context: Context): Map<String, Deck> {
        val languageCode = PreferenceManager.getDeckLanguage(context)
        return getDecksForLanguage(languageCode)
    }

    fun getDecksForLanguage(languageCode: String): Map<String, Deck> {
        return when(languageCode) {
            "de" -> GermanDecks.decks
            "hu" -> HungarianDecks.decks
            "fr" -> FrenchDecks.decks
            "es" -> SpanishDecks.decks
            else -> EnglishDecks.decks
        }
    }
    
    // Get language learning decks
    fun getLanguageLearningDecks(targetLanguage: String): Map<String, LanguageLearningDeck> {
        return when(targetLanguage) {
            "de" -> GermanLearningDecks.decks
            "en" -> EnglishLearningDecks.decks
            "hu" -> HungarianLearningDecks.decks
            "es" -> SpanishLearningDecks.decks
            "fr" -> FrenchLearningDecks.decks
            else -> emptyMap()
        }
    }
    
    fun getLanguageLearningDecksByLevel(targetLanguage: String, level: String): Map<String, LanguageLearningDeck> {
        return getLanguageLearningDecks(targetLanguage).filter { (_, deck) ->
            deck.level == level
        }
    }
    
    fun getAvailableLanguageLearningLanguages(): List<String> {
        return listOf("de", "en", "hu")
    }
    
    fun getAvailableLevelsForLanguage(targetLanguage: String): List<String> {
        val decks = getLanguageLearningDecks(targetLanguage)
        return decks.values.map { it.level }.distinct().sorted()
    }
    
    // Legacy functions for compatibility
    fun getWordsByDeckName(deckName: String, context: Context): List<String> {
        return getDecksForCurrentLanguage(context)[deckName]?.words ?: emptyList()
    }
    
    fun getAllDeckNames(context: Context): List<String> {
        return getDecksForCurrentLanguage(context).keys.toList()
    }
    
    fun getDeckWordCount(deckName: String, context: Context): Int {
        return getDecksForCurrentLanguage(context)[deckName]?.words?.size ?: 0
    }
}