package com.quasistr.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.ui.theme.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DeckSelectionScreen(
    currentGameMode: String = "Normal",
    onBackClick: () -> Unit,
    onDeckSelect: (String) -> Unit,
    onGameModeClick: () -> Unit = {}
) {
    var searchText by remember { mutableStateOf("") }
    var selectedDeck by remember { mutableStateOf<String?>(null) }

    val allDecks = listOf("Acting", "Countries", "Capitals", "Animals", "Movies", "Celebrities",
        "Fruits", "Vegetables", "Professions", "Sports", "Colors", "Instruments",
        "Vehicles", "Planets", "Famous Landmarks")
    val filteredDecks = if (searchText.isEmpty()) {
        allDecks
    } else {
        allDecks.filter { it.contains(searchText, ignoreCase = true) }
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "SELECT DECK",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBackClick,
                        modifier = Modifier
                            .padding(8.dp)
                            .background(IndigoSurface, CircleShape)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = IndigoBackground
                )
            )
        },
        containerColor = IndigoBackground
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(IndigoBackground)
        ) {
            // Background circles
            Box(
                modifier = Modifier
                    .size(300.dp)
                    .align(Alignment.Center)
                    .clip(CircleShape)
                    .background(IndigoSurface.copy(alpha = 0.6f))
            )

            Box(
                modifier = Modifier
                    .size(200.dp)
                    .align(Alignment.Center)
                    .clip(CircleShape)
                    .background(IndigoLight.copy(alpha = 0.5f))
            )

            // Content
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                // Game Mode Selector
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
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
                                    "Challenge" -> Icons.Default.Favorite
                                    "Language Learning" -> Icons.Default.Info
                                    "PVP Team" -> Icons.Default.Star
                                    else -> Icons.Default.Lock
                                },
                                contentDescription = null,
                                tint = Color.White
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                text = "Mode: $currentGameMode",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
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
                        .padding(vertical = 8.dp),
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
                    shape = RoundedCornerShape(24.dp),
                    singleLine = true
                )

                // Deck Grid
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.weight(1f)
                ) {
                    items(filteredDecks) { deck ->
                        DeckItem(
                            name = deck,
                            wordCount = 30,
                            isSelected = selectedDeck == deck,
                            onClick = {
                                selectedDeck = deck
                            }
                        )
                    }

                    item {
                        AddCustomDeckItem()
                    }
                }

                // Bottom Action Bar
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp),
                    color = IndigoDark,
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = onBackClick,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = IndigoSurface
                            ),
                            shape = RoundedCornerShape(24.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text("MENU")
                        }

                        Button(
                            onClick = {
                                selectedDeck?.let { deck ->
                                    onDeckSelect(deck)
                                }
                            },
                            enabled = selectedDeck != null,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = AmberPrimary,
                                disabledContainerColor = AmberPrimary.copy(alpha = 0.5f)
                            ),
                            shape = RoundedCornerShape(24.dp)
                        ) {
                            Text(
                                text = "PLAY",
                                color = IndigoDark,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                imageVector = Icons.Default.PlayArrow,
                                contentDescription = null,
                                tint = IndigoDark,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
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
    onClick: () -> Unit
) {
    Surface(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        color = if (isSelected) AmberPrimary else IndigoSurface,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = name,
                color = if (isSelected) IndigoDark else Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp
            )

            Text(
                text = "$wordCount words",
                color = if (isSelected) IndigoDark.copy(alpha = 0.7f) else Color.White.copy(alpha = 0.7f),
                fontSize = 12.sp
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddCustomDeckItem() {
    Surface(
        onClick = { /* Open deck creation */ },
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        color = IndigoDark,
        shape = RoundedCornerShape(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.padding(8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(32.dp)
                    .background(Color.Transparent)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color.White.copy(alpha = 0.7f),
                    modifier = Modifier.align(Alignment.Center)
                )
            }

            Text(
                text = "ADD CUSTOM",
                color = Color.White.copy(alpha = 0.7f),
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp
            )
        }
    }
}