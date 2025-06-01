package com.quasistr.data.models

data class Deck(
    val id: String,
    val name: String,
    val category: String,
    val instruction: String? = null,
    val words: List<String>
)