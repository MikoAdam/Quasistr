package com.quasistr.data.languagelearning

import com.quasistr.data.models.LanguageLearningDeck

object EnglishLearningDecks {
    val decks = mapOf(
        "english_a1_basics" to LanguageLearningDeck(
            id = "english_a1_basics",
            targetLanguage = "en",
            level = "A1",
            topic = "Basics", 
            words = listOf("hello", "goodbye", "please", "thank you", "yes", "no", "water", "food", "good", "bad", "big", "small", "hot", "cold", "love", "like", "want", "need", "have", "go", "come", "see", "know", "think", "work", "live", "eat", "drink", "sleep", "happy", "sad", "tired", "hungry", "thirsty")
        ),
        
        "english_a1_family" to LanguageLearningDeck(
            id = "english_a1_family", 
            targetLanguage = "en",
            level = "A1",
            topic = "Family",
            words = listOf("father", "mother", "son", "daughter", "brother", "sister", "grandmother", "grandfather", "parents", "children", "family", "man", "woman", "child", "uncle", "aunt", "cousin", "husband", "wife", "baby", "old", "young", "married", "single", "love", "care", "help", "visit", "call", "live", "together", "alone", "home", "house", "family")
        ),
        
        "english_a2_shopping" to LanguageLearningDeck(
            id = "english_a2_shopping",
            targetLanguage = "en", 
            level = "A2",
            topic = "Shopping",
            words = listOf("shop", "store", "buy", "sell", "price", "money", "cash", "card", "receipt", "change", "expensive", "cheap", "discount", "sale", "customer", "cashier", "queue", "trolley", "basket", "bag", "size", "color", "quality", "brand", "product", "clothes", "shoes", "food", "electronics", "gift", "return", "exchange", "refund", "online", "delivery")
        )
    )
}