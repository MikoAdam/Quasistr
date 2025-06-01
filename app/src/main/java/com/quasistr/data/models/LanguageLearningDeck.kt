package com.quasistr.data.models

data class LanguageLearningDeck(
    val id: String,
    val targetLanguage: String,  // "de", "en", etc.
    val level: String,          // "A1", "A2", "B1", etc.
    val topic: String,          // "Family", "Food", etc.
    val instruction: String? = null,
    val words: List<String>
)