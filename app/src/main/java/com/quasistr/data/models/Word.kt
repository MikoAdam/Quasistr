package com.quasistr.data.models

data class Word(
    val text: String,
    val difficulty: Int = 1,
    val category: String = ""
)