package com.quasistr.data.models

data class Deck(
    val id: String,
    val name: String,
    val category: String,
    val words: List<Word>,
    val language: String = "en"
)