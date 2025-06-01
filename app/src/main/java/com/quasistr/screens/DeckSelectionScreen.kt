package com.quasistr.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Timer
import androidx.compose.material.icons.filled.TimerOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.R
import com.quasistr.data.DeckManager
import com.quasistr.ui.theme.AmberPrimary
import com.quasistr.ui.theme.IndigoBackground
import com.quasistr.ui.theme.IndigoDark
import com.quasistr.ui.theme.IndigoLight
import com.quasistr.ui.theme.IndigoSurface

@Composable
fun DeckSelectionScreen(
    currentGameMode: String = "Normal",
    onDeckSelect: (String) -> Unit,
    onGameModeClick: () -> Unit = {},
    onSettingsClick: () -> Unit
) {
    val context = LocalContext.current  // Add this line to get context
    var searchText by remember { mutableStateOf("") }
    var selectedDeck by remember { mutableStateOf<String?>(null) }

    val allDecks = DeckManager.getDecksForCurrentLanguage(context).map { (deckId, deck) ->
        deck.name to deck.words.size
    }

    val filteredDecks = if (searchText.isEmpty()) {
        allDecks
    } else {
        allDecks.filter { it.first.contains(searchText, ignoreCase = true) }
    }

    // No Scaffold - just a basic Box with background
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        // Background circles - asymmetric positioning
        Box(
            modifier = Modifier
                .size(320.dp)
                .offset(x = 20.dp, y = (-20).dp)
                .align(Alignment.Center)
                .clip(CircleShape)
                .background(IndigoSurface.copy(alpha = 0.6f))
        )

        Box(
            modifier = Modifier
                .size(220.dp)
                .offset(x = 40.dp, y = (-30).dp)
                .align(Alignment.Center)
                .clip(CircleShape)
                .background(IndigoLight.copy(alpha = 0.5f))
        )

        // Content column
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // App header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.app_name),
                    color = Color.White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )

                IconButton(
                    onClick = onSettingsClick,
                    modifier = Modifier
                        .size(48.dp)
                        .background(IndigoSurface, CircleShape)
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = stringResource(R.string.settings),
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Game Mode Selector
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = onGameModeClick),
                colors = CardDefaults.cardColors(
                    containerColor = IndigoSurface
                ),
                shape = RoundedCornerShape(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            imageVector = when(currentGameMode) {
                                "Challenge" -> Icons.Default.TimerOff
                                "Language Learning" -> Icons.Default.School
                                "PVP Team" -> Icons.Default.Group
                                else -> Icons.Default.Timer
                            },
                            contentDescription = null,
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "${stringResource(R.string.game_mode)}: $currentGameMode",
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    }
                    Icon(
                        imageVector = Icons.Default.ArrowDropDown,
                        contentDescription = "Change Mode",
                        tint = Color.White
                    )
                }
            }

            // Search Bar
            TextField(
                value = searchText,
                onValueChange = { searchText = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
                placeholder = { Text("Search decks...") },
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White,
                    focusedTextColor = IndigoDark,
                    unfocusedTextColor = IndigoDark,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = RoundedCornerShape(12.dp),
                singleLine = true
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.select_deck),
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )

                if (selectedDeck != null) {
                    Text(
                        text = "$selectedDeck ${stringResource(R.string.selected)}",
                        color = AmberPrimary,
                        fontSize = 14.sp,
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                    )
                }
            }

            // Deck Grid
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                contentPadding = PaddingValues(vertical = 8.dp),
                modifier = Modifier.weight(1f)
            ) {
                items(filteredDecks) { (deckName, wordCount) ->
                    DeckItem(
                        name = deckName,
                        wordCount = wordCount,
                        isSelected = selectedDeck == deckName,
                        onClick = {
                            selectedDeck = deckName
                        }
                    )
                }

                item {
                    DeckItem(
                        name = stringResource(R.string.coming_soon).uppercase(),
                        wordCount = 0,
                        isSelected = false,
                        isDisabled = true,
                        onClick = {}
                    )
                }
            }

            // Play Button
            Button(
                onClick = {
                    selectedDeck?.let { deckName ->
                        // Find the deck ID by name
                        val deckId = DeckManager.getDecksForCurrentLanguage(context)
                            .entries.find { it.value.name == deckName }?.key
                        deckId?.let { onDeckSelect(it) }
                    }
                },
                enabled = selectedDeck != null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp)
                    .padding(vertical = 8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AmberPrimary,
                    disabledContainerColor = Color.Gray.copy(alpha = 0.6f)
                ),
                shape = RoundedCornerShape(12.dp),
                elevation = ButtonDefaults.buttonElevation(8.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Play",
                        tint = IndigoDark,
                        modifier = Modifier.size(28.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = stringResource(R.string.play_game),
                        color = IndigoDark,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DeckItem(
    name: String,
    wordCount: Int,
    isSelected: Boolean = false,
    isDisabled: Boolean = false,
    onClick: () -> Unit
) {
    Surface(
        onClick = onClick,
        enabled = !isDisabled,
        modifier = Modifier
            .fillMaxWidth()
            .height(110.dp),
        color = when {
            isDisabled -> IndigoDark
            isSelected -> AmberPrimary
            else -> IndigoSurface
        },
        shape = RoundedCornerShape(16.dp),
        shadowElevation = if (isSelected) 8.dp else 2.dp
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(12.dp)
        ) {
            if (isDisabled) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color.White.copy(alpha = 0.7f),
                    modifier = Modifier.size(28.dp)
                )
            }

            Text(
                text = name,
                color = if (isSelected) IndigoDark else Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )

            if (!isDisabled) {
                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = "$wordCount ${stringResource(R.string.words)}",
                    color = if (isSelected) IndigoDark.copy(alpha = 0.7f) else Color.White.copy(alpha = 0.7f),
                    fontSize = 13.sp
                )
            }
        }
    }
}