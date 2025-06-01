package com.quasistr.screens

import android.content.Intent
import android.net.Uri
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
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Camera
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Launch
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Vibration
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.quasistr.ui.theme.AmberPrimary
import com.quasistr.ui.theme.IndigoBackground
import com.quasistr.ui.theme.IndigoDark
import com.quasistr.ui.theme.IndigoSurface
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
    val availableLanguages = PreferenceManager.getAvailableUILanguages()
    val languageNames = availableLanguages.toMap()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        // Background circles - matching your app style
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
            // Header - matching your app style
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

                Spacer(modifier = Modifier.width(48.dp))
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Settings content - beautiful cards
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                // Language Settings
                item {
                    SectionCard(
                        title = stringResource(R.string.language_settings),
                        items = listOf(
                            SettingsItemData(
                                icon = Icons.Default.Language,
                                title = stringResource(R.string.language),
                                description = languageNames[currentUILanguage] ?: "🇺🇸 English",
                                onClick = { showUILanguageDialog = true }
                            )
                        )
                    )
                }

                // Game Settings
                item {
                    SectionCard(
                        title = stringResource(R.string.game_settings),
                        items = listOf(
                            SettingsItemData(
                                icon = Icons.Default.VolumeUp,
                                title = stringResource(R.string.sound_effects),
                                description = stringResource(R.string.coming_soon),
                                onClick = { },
                                enabled = false
                            ),
                            SettingsItemData(
                                icon = Icons.Default.Vibration,
                                title = stringResource(R.string.vibration),
                                description = stringResource(R.string.coming_soon),
                                onClick = { },
                                enabled = false
                            )
                        )
                    )
                }

                // About
                item {
                    SectionCard(
                        title = stringResource(R.string.about),
                        items = listOf(
                            SettingsItemData(
                                icon = Icons.Default.Info,
                                title = stringResource(R.string.about_quasistr),
                                description = stringResource(R.string.about_description),
                                onClick = { showAboutDialog = true }
                            ),
                            SettingsItemData(
                                icon = Icons.Default.People,
                                title = stringResource(R.string.credits),
                                description = stringResource(R.string.credits_description),
                                onClick = { showCreditsDialog = true }
                            )
                        )
                    )
                }

                // Legal
                item {
                    SectionCard(
                        title = stringResource(R.string.legal),
                        items = listOf(
                            SettingsItemData(
                                icon = Icons.Default.Description,
                                title = stringResource(R.string.terms_of_service),
                                description = stringResource(R.string.terms_description),
                                onClick = { showTermsDialog = true }
                            )
                        )
                    )
                }

                // Connect
                item {
                    SectionCard(
                        title = stringResource(R.string.connect),
                        items = listOf(
                            SettingsItemData(
                                icon = Icons.Default.Camera,
                                title = stringResource(R.string.follow_on_instagram),
                                description = "@donkey_desk",
                                onClick = {
                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/donkey_desk/"))
                                    context.startActivity(intent)
                                }
                            ),
                            SettingsItemData(
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
                            ),
                            SettingsItemData(
                                icon = Icons.Default.Star,
                                title = stringResource(R.string.rate_quasistr),
                                description = stringResource(R.string.rate_description),
                                onClick = {
                                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.quasistr"))
                                    context.startActivity(intent)
                                }
                            )
                        )
                    )
                }
            }
        }
    }

    // MAXIMUM WIDTH Language Selection Dialog
    if (showUILanguageDialog) {
        Dialog(onDismissRequest = { showUILanguageDialog = false }) {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.98f) // 98% of screen width - MAXIMUM WIDTH
                    .padding(8.dp)
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(
                            elevation = 24.dp,
                            shape = RoundedCornerShape(24.dp),
                            ambientColor = AmberPrimary.copy(alpha = 0.3f),
                            spotColor = AmberPrimary.copy(alpha = 0.5f)
                        ),
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(containerColor = IndigoSurface)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Stunning header with icon
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    AmberPrimary,
                                    RoundedCornerShape(20.dp)
                                )
                                .padding(20.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Language,
                                contentDescription = null,
                                tint = IndigoDark,
                                modifier = Modifier.size(32.dp)
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Text(
                                text = stringResource(R.string.select_language),
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = IndigoDark,
                                textAlign = TextAlign.Center
                            )
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        // Language options with gorgeous styling
                        LazyColumn(
                            verticalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            items(availableLanguages) { (code, nameWithFlag) ->
                                WideLanguageOption(
                                    nameWithFlag = nameWithFlag,
                                    isSelected = code == currentUILanguage,
                                    onClick = {
                                        PreferenceManager.setUILanguageAndRecreate(context as android.app.Activity, code)
                                        showUILanguageDialog = false
                                    }
                                )
                            }
                        }

                        Spacer(modifier = Modifier.height(24.dp))

                        // Beautiful close button
                        Button(
                            onClick = { showUILanguageDialog = false },
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                                .shadow(8.dp, RoundedCornerShape(25.dp)),
                            shape = RoundedCornerShape(25.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = AmberPrimary
                            )
                        ) {
                            Text(
                                text = stringResource(R.string.close),
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                color = IndigoDark
                            )
                        }
                    }
                }
            }
        }
    }

    // Credits Dialog with CLEAN design
    if (showCreditsDialog) {
        UnifiedDialog(
            title = stringResource(R.string.credits),
            icon = Icons.Default.People,
            onDismiss = { showCreditsDialog = false }
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CleanCreditItem(
                    text = stringResource(R.string.developer_credit),
                    url = "https://www.linkedin.com/in/%C3%A1d%C3%A1m-mik%C3%B3/"
                )

                CleanCreditItem(
                    text = stringResource(R.string.designer_credit),
                    url = "https://www.linkedin.com/in/thanh-phuong-le-phan/"
                )
            }
        }
    }

    // About Dialog
    if (showAboutDialog) {
        UnifiedDialog(
            title = stringResource(R.string.about_quasistr),
            icon = Icons.Default.Info,
            onDismiss = { showAboutDialog = false }
        ) {
            Text(
                text = stringResource(R.string.about_content),
                color = Color.White,
                lineHeight = 20.sp,
                fontSize = 14.sp
            )
        }
    }

    // Terms Dialog
    if (showTermsDialog) {
        UnifiedDialog(
            title = stringResource(R.string.terms_of_service),
            icon = Icons.Default.Description,
            onDismiss = { showTermsDialog = false },
            scrollable = true
        ) {
            Text(
                text = stringResource(R.string.terms_content),
                color = Color.White,
                fontSize = 14.sp,
                lineHeight = 18.sp
            )
        }
    }
}

data class SettingsItemData(
    val icon: ImageVector,
    val title: String,
    val description: String,
    val onClick: () -> Unit,
    val enabled: Boolean = true
)

@Composable
fun SectionCard(
    title: String,
    items: List<SettingsItemData>
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(6.dp, RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = IndigoSurface),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            // Section header
            Text(
                text = title,
                color = AmberPrimary,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Items
            items.forEachIndexed { index, item ->
                if (index > 0) {
                    Spacer(modifier = Modifier.height(12.dp))
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable(enabled = item.enabled, onClick = item.onClick)
                        .padding(vertical = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = null,
                        tint = if (item.enabled) Color.White else Color.White.copy(alpha = 0.5f),
                        modifier = Modifier.size(24.dp)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = item.title,
                            color = if (item.enabled) Color.White else Color.White.copy(alpha = 0.5f),
                            fontWeight = FontWeight.Medium,
                            fontSize = 16.sp
                        )
                        Text(
                            text = item.description,
                            color = if (item.enabled) Color.White.copy(alpha = 0.7f) else Color.White.copy(alpha = 0.3f),
                            fontSize = 14.sp
                        )
                    }

                    if (item.enabled) {
                        Icon(
                            imageVector = Icons.Default.ChevronRight,
                            contentDescription = null,
                            tint = Color.White.copy(alpha = 0.5f)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun UnifiedDialog(
    title: String,
    icon: ImageVector,
    onDismiss: () -> Unit,
    scrollable: Boolean = false,
    content: @Composable () -> Unit
) {
    Dialog(onDismissRequest = onDismiss) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(
                        elevation = 24.dp,
                        shape = RoundedCornerShape(24.dp),
                        ambientColor = AmberPrimary.copy(alpha = 0.3f),
                        spotColor = AmberPrimary.copy(alpha = 0.5f)
                    ),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = IndigoSurface)
            ) {
                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Stunning header with icon
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(
                                AmberPrimary,
                                RoundedCornerShape(20.dp)
                            )
                            .padding(20.dp)
                    ) {
                        Icon(
                            imageVector = icon,
                            contentDescription = null,
                            tint = IndigoDark,
                            modifier = Modifier.size(32.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = title,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.ExtraBold,
                            color = IndigoDark,
                            textAlign = TextAlign.Center
                        )
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Content area
                    if (scrollable) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(max = 400.dp)
                        ) {
                            Column(
                                modifier = Modifier.verticalScroll(rememberScrollState())
                            ) {
                                content()
                            }
                        }
                    } else {
                        content()
                    }

                    Spacer(modifier = Modifier.height(24.dp))

                    // Beautiful close button
                    Button(
                        onClick = onDismiss,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                            .shadow(8.dp, RoundedCornerShape(25.dp)),
                        shape = RoundedCornerShape(25.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = AmberPrimary
                        )
                    ) {
                        Text(
                            text = stringResource(R.string.close),
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp,
                            color = IndigoDark
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun WideLanguageOption(
    nameWithFlag: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .shadow(
                elevation = if (isSelected) 16.dp else 6.dp,
                shape = RoundedCornerShape(20.dp),
                ambientColor = if (isSelected) AmberPrimary.copy(alpha = 0.5f) else Color.Gray.copy(alpha = 0.2f)
            ),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = if (isSelected) {
                AmberPrimary
            } else {
                Color.White.copy(alpha = 0.95f)
            }
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
                            .size(36.dp)
                            .background(
                                IndigoDark,
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

@Composable
fun CleanCreditItem(
    text: String,
    url: String
) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(intent)
            },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.95f))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = text,
                color = IndigoDark,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                modifier = Modifier.weight(1f)
            )

            Icon(
                imageVector = Icons.Default.Launch,
                contentDescription = "Open link",
                tint = IndigoDark.copy(alpha = 0.6f),
                modifier = Modifier.size(20.dp)
            )
        }
    }
}