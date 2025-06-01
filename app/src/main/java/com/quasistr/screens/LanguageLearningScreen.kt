package com.quasistr.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.R
import com.quasistr.data.DeckManager
import com.quasistr.ui.theme.AmberPrimary
import com.quasistr.ui.theme.IndigoBackground
import com.quasistr.ui.theme.IndigoDark
import com.quasistr.ui.theme.IndigoSurface

@Composable
fun LanguageLearningScreen(
    onBackClick: () -> Unit,
    onDeckSelect: (String) -> Unit
) {
    val context = LocalContext.current
    var selectedLanguage by remember { mutableStateOf<String?>(null) }

    // Get available language learning languages
    val availableLanguages = DeckManager.getAvailableLanguageLearningLanguages()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        // Background circles
        Box(
            modifier = Modifier
                .size(300.dp)
                .offset(x = (-50).dp, y = (-50).dp)
                .align(Alignment.TopStart)
                .clip(CircleShape)
                .background(IndigoSurface.copy(alpha = 0.3f))
        )

        Box(
            modifier = Modifier
                .size(200.dp)
                .offset(x = 50.dp, y = (-30).dp)
                .align(Alignment.TopEnd)
                .clip(CircleShape)
                .background(AmberPrimary.copy(alpha = 0.2f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier
                        .size(48.dp)
                        .background(IndigoSurface, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.School,
                        contentDescription = null,
                        tint = AmberPrimary,
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = stringResource(R.string.language_learning_mode),
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.width(48.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            if (selectedLanguage == null) {
                // Language selection
                Text(
                    text = stringResource(R.string.select_target_language),
                    color = AmberPrimary,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(availableLanguages) { languageCode ->
                        LanguageCard(
                            languageCode = languageCode,
                            onLanguageSelect = { selectedLanguage = languageCode }
                        )
                    }
                }
            } else {
                // Deck selection for selected language
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = getLanguageDisplayName(selectedLanguage!!),
                        color = AmberPrimary,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    TextButton(
                        onClick = { selectedLanguage = null }
                    ) {
                        Text(
                            text = stringResource(R.string.change_language),
                            color = Color.White
                        )
                    }
                }

                // Get decks for selected language
                val languageLearningDecks = DeckManager.getLanguageLearningDecks(selectedLanguage!!)

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    items(languageLearningDecks.entries.toList()) { (deckId, deck) ->
                        LanguageLearningDeckCard(
                            deckId = deckId,
                            deckName = deck.id,
                            level = deck.level,
                            topic = deck.topic,
                            wordCount = deck.words.size,
                            languageCode = selectedLanguage!!,
                            onDeckSelect = { onDeckSelect(deckId) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun LanguageCard(
    languageCode: String,
    onLanguageSelect: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onLanguageSelect() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = IndigoSurface),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = getLanguageFlag(languageCode),
                    fontSize = 32.sp
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = getLanguageDisplayName(languageCode),
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = getLanguageNativeName(languageCode),
                        color = Color.White.copy(alpha = 0.7f),
                        fontSize = 14.sp
                    )
                }
            }

            Icon(
                imageVector = Icons.Default.School,
                contentDescription = null,
                tint = AmberPrimary,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun LanguageLearningDeckCard(
    deckId: String,
    deckName: String,
    level: String,
    topic: String,
    wordCount: Int,
    languageCode: String,
    onDeckSelect: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onDeckSelect() },
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.95f)),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Language flag and level badge
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = getLanguageFlag(languageCode),
                    fontSize = 28.sp
                )
                Spacer(modifier = Modifier.height(4.dp))
                Box(
                    modifier = Modifier
                        .background(
                            AmberPrimary,
                            RoundedCornerShape(8.dp)
                        )
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = level,
                        color = IndigoDark,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Deck info
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = deckName,
                    color = IndigoDark,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = topic,
                    color = IndigoDark.copy(alpha = 0.7f),
                    fontSize = 14.sp
                )
                Text(
                    text = stringResource(R.string.word_count, wordCount),
                    color = IndigoDark.copy(alpha = 0.5f),
                    fontSize = 12.sp
                )
            }
        }
    }
}

private fun getLanguageFlag(languageCode: String): String {
    return when (languageCode) {
        "de" -> "🇩🇪"
        "en" -> "🇺🇸"
        "hu" -> "🇭🇺"
        "fr" -> "🇫🇷"
        "es" -> "🇪🇸"
        else -> "🌐"
    }
}

private fun getLanguageDisplayName(languageCode: String): String {
    return when (languageCode) {
        "de" -> "German"
        "en" -> "English"
        "hu" -> "Hungarian"
        "fr" -> "French"
        "es" -> "Spanish"
        else -> languageCode.uppercase()
    }
}

private fun getLanguageNativeName(languageCode: String): String {
    return when (languageCode) {
        "de" -> "Deutsch"
        "en" -> "English"
        "hu" -> "Magyar"
        "fr" -> "Français"
        "es" -> "Español"
        else -> languageCode
    }
}