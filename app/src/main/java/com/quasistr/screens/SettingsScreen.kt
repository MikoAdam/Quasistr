package com.quasistr.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.quasistr.R
import com.quasistr.ui.theme.*
import com.quasistr.utils.PreferenceManager

@Composable
fun SettingsScreen(
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    var showUILanguageDialog by remember { mutableStateOf(false) }
    var showCreditsDialog by remember { mutableStateOf(false) }
    var showAboutDialog by remember { mutableStateOf(false) }
    var showTermsDialog by remember { mutableStateOf(false) }

    // Get current language preferences
    val currentUILanguage = PreferenceManager.getUILanguage(context)

    // Get available languages from PreferenceManager
    val availableLanguages = PreferenceManager.getAvailableUILanguages()
    val languageNames = availableLanguages.toMap()

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

                Text(
                    text = stringResource(R.string.settings),
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.width(48.dp)) // Balance the layout
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Settings content
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Language Settings Section
                item {
                    SectionHeader(stringResource(R.string.language_settings))
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Language,
                        title = stringResource(R.string.language),
                        description = languageNames[currentUILanguage] ?: "🇺🇸 English",
                        onClick = { showUILanguageDialog = true }
                    )
                }

                // Game Settings Section
                item {
                    SectionHeader(stringResource(R.string.game_settings))
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.VolumeUp,
                        title = stringResource(R.string.sound_effects),
                        description = stringResource(R.string.coming_soon),
                        onClick = { },
                        enabled = false
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Vibration,
                        title = stringResource(R.string.vibration),
                        description = stringResource(R.string.coming_soon),
                        onClick = { },
                        enabled = false
                    )
                }

                // About Section
                item {
                    SectionHeader(stringResource(R.string.about))
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Info,
                        title = stringResource(R.string.about_quasistr),
                        description = stringResource(R.string.about_description),
                        onClick = { showAboutDialog = true }
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.People,
                        title = stringResource(R.string.credits),
                        description = stringResource(R.string.credits_description),
                        onClick = { showCreditsDialog = true }
                    )
                }

                // Legal Section
                item {
                    SectionHeader(stringResource(R.string.legal))
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Description,
                        title = stringResource(R.string.terms_of_service),
                        description = stringResource(R.string.terms_description),
                        onClick = { showTermsDialog = true }
                    )
                }

                // Connect Section
                item {
                    SectionHeader(stringResource(R.string.connect))
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Camera,
                        title = stringResource(R.string.follow_on_instagram),
                        description = "@donkey_desk",
                        onClick = {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/donkey_desk/"))
                            context.startActivity(intent)
                        }
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Email,
                        title = stringResource(R.string.contact_support),
                        description = "quasistr@gmail.com",
                        onClick = {
                            val intent = Intent(Intent.ACTION_SENDTO).apply {
                                data = Uri.parse("mailto:quasistr@gmail.com")
                                putExtra(Intent.EXTRA_SUBJECT, "QuasistR Support")
                            }
                            context.startActivity(intent)
                        }
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Star,
                        title = stringResource(R.string.rate_quasistr),
                        description = stringResource(R.string.rate_description),
                        onClick = {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.quasistr"))
                            context.startActivity(intent)
                        }
                    )
                }
            }
        }
    }

    // GORGEOUS Language Selection Dialog
    if (showUILanguageDialog) {
        BeautifulLanguageSelectionDialog(
            title = stringResource(R.string.select_language),
            currentLanguage = currentUILanguage,
            availableLanguages = availableLanguages,
            onLanguageSelected = { languageCode ->
                PreferenceManager.setUILanguageAndRecreate(context as android.app.Activity, languageCode)
                showUILanguageDialog = false
            },
            onDismiss = { showUILanguageDialog = false }
        )
    }

    // Credits Dialog
    if (showCreditsDialog) {
        Dialog(onDismissRequest = { showCreditsDialog = false }) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = stringResource(R.string.credits),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = IndigoDark
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    // Developer credit
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Gray.copy(alpha = 0.1f), RoundedCornerShape(8.dp))
                            .clickable {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/%C3%A1d%C3%A1m-mik%C3%B3/"))
                                context.startActivity(intent)
                            }
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Launch,
                            contentDescription = null,
                            tint = IndigoDark,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = stringResource(R.string.developer_credit),
                            color = IndigoDark,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    // Designer credit
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Gray.copy(alpha = 0.1f), RoundedCornerShape(8.dp))
                            .clickable {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/thanh-phuong-le-phan/"))
                                context.startActivity(intent)
                            }
                            .padding(12.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.Launch,
                            contentDescription = null,
                            tint = IndigoDark,
                            modifier = Modifier.size(16.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = stringResource(R.string.designer_credit),
                            color = IndigoDark,
                            fontWeight = FontWeight.Medium
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    TextButton(
                        onClick = { showCreditsDialog = false },
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text(stringResource(R.string.close))
                    }
                }
            }
        }
    }

    // About Dialog
    if (showAboutDialog) {
        Dialog(onDismissRequest = { showAboutDialog = false }) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = stringResource(R.string.about_quasistr),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = IndigoDark
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = stringResource(R.string.about_content),
                        color = IndigoDark,
                        lineHeight = 20.sp
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    TextButton(
                        onClick = { showAboutDialog = false },
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text(stringResource(R.string.close))
                    }
                }
            }
        }
    }

    // Terms Dialog with localized content
    if (showTermsDialog) {
        Dialog(onDismissRequest = { showTermsDialog = false }) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.8f)
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = stringResource(R.string.terms_of_service),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = IndigoDark
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Text(
                            text = stringResource(R.string.terms_content),
                            color = IndigoDark,
                            fontSize = 14.sp,
                            lineHeight = 18.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    TextButton(
                        onClick = { showTermsDialog = false },
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text(stringResource(R.string.close))
                    }
                }
            }
        }
    }
}

@Composable
fun SectionHeader(title: String) {
    Text(
        text = title,
        color = AmberPrimary,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Composable
fun SettingsItem(
    icon: ImageVector,
    title: String,
    description: String,
    onClick: () -> Unit,
    enabled: Boolean = true
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = enabled, onClick = onClick),
        colors = CardDefaults.cardColors(
            containerColor = if (enabled) IndigoSurface else IndigoSurface.copy(alpha = 0.5f)
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = if (enabled) Color.White else Color.White.copy(alpha = 0.5f),
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    color = if (enabled) Color.White else Color.White.copy(alpha = 0.5f),
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )
                Text(
                    text = description,
                    color = if (enabled) Color.White.copy(alpha = 0.7f) else Color.White.copy(alpha = 0.3f),
                    fontSize = 14.sp
                )
            }

            if (enabled) {
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = null,
                    tint = Color.White.copy(alpha = 0.5f)
                )
            }
        }
    }
}

@Composable
fun BeautifulLanguageSelectionDialog(
    title: String,
    currentLanguage: String,
    availableLanguages: List<Pair<String, String>>,
    onLanguageSelected: (String) -> Unit,
    onDismiss: () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(
                        elevation = 24.dp,
                        shape = RoundedCornerShape(28.dp),
                        ambientColor = AmberPrimary.copy(alpha = 0.3f),
                        spotColor = AmberPrimary.copy(alpha = 0.5f)
                    ),
                shape = RoundedCornerShape(28.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Column(
                    modifier = Modifier.padding(28.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Gorgeous header with gradient background
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                brush = Brush.horizontalGradient(
                                    colors = listOf(
                                        AmberPrimary,
                                        Color(0xFFFFD700),
                                        AmberPrimary
                                    )
                                ),
                                shape = RoundedCornerShape(20.dp)
                            )
                            .padding(20.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Language,
                                contentDescription = null,
                                tint = IndigoDark,
                                modifier = Modifier.size(32.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = title,
                                fontSize = 24.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = IndigoDark,
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Language options with beautiful cards
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(12.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(availableLanguages) { (code, nameWithFlag) ->
                            BeautifulLanguageOption(
                                nameWithFlag = nameWithFlag,
                                isSelected = code == currentLanguage,
                                onClick = { onLanguageSelected(code) }
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Close button with style
                    Button(
                        onClick = onDismiss,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp),
                        shape = RoundedCornerShape(25.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = IndigoSurface
                        ),
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 4.dp
                        )
                    ) {
                        Text(
                            text = stringResource(R.string.close),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun BeautifulLanguageOption(
    nameWithFlag: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .shadow(
                elevation = if (isSelected) 12.dp else 4.dp,
                shape = RoundedCornerShape(20.dp),
                ambientColor = if (isSelected) AmberPrimary.copy(alpha = 0.4f) else Color.Gray.copy(alpha = 0.2f)
            ),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isSelected) {
                AmberPrimary
            } else {
                Color.White
            }
        ),
        border = if (isSelected) null else androidx.compose.foundation.BorderStroke(
            2.dp,
            Color.Gray.copy(alpha = 0.2f)
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    if (isSelected) {
                        Brush.horizontalGradient(
                            colors = listOf(
                                AmberPrimary,
                                Color(0xFFFFD700),
                                AmberPrimary
                            )
                        )
                    } else {
                        Brush.horizontalGradient(
                            colors = listOf(Color.White, Color.White)
                        )
                    }
                )
                .padding(20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = nameWithFlag,
                    fontSize = 20.sp,
                    fontWeight = if (isSelected) FontWeight.ExtraBold else FontWeight.SemiBold,
                    color = if (isSelected) IndigoDark else Color.Black
                )

                if (isSelected) {
                    Box(
                        modifier = Modifier
                            .size(32.dp)
                            .background(
                                Color.White,
                                CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "Selected",
                            tint = AmberPrimary,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
            }
        }
    }
}