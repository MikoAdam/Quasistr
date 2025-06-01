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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Launch
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Vibration
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.quasistr.ui.theme.AmberPrimary
import com.quasistr.ui.theme.IndigoBackground
import com.quasistr.ui.theme.IndigoDark
import com.quasistr.ui.theme.IndigoLight
import com.quasistr.ui.theme.IndigoSurface

@Composable
fun SettingsScreen(
    onBackClick: () -> Unit
) {
    var showCredits by remember { mutableStateOf(false) }
    var showUserAgreement by remember { mutableStateOf(false) }
    var showAbout by remember { mutableStateOf(false) }
    val uriHandler = LocalUriHandler.current

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        // Background decorative elements
        Box(
            modifier = Modifier
                .size(320.dp)
                .align(Alignment.Center)
                .offset(y = (-50).dp)
                .clip(CircleShape)
                .background(IndigoSurface.copy(alpha = 0.6f))
        )

        Box(
            modifier = Modifier
                .size(220.dp)
                .align(Alignment.Center)
                .offset(x = 40.dp, y = (-30).dp)
                .clip(CircleShape)
                .background(IndigoLight.copy(alpha = 0.5f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header with back button
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp),
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
                        tint = Color.White,
                        modifier = Modifier.size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(16.dp))

                Text(
                    text = "Settings & Info",
                    color = Color.White,
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Settings categories
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.weight(1f)
            ) {
                // Game Settings Section
                item {
                    Text(
                        text = "GAME SETTINGS",
                        color = AmberPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp)
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.VolumeUp,
                        title = "Sound Effects",
                        description = "Coming soon",
                        enabled = false,
                        onClick = { }
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Vibration,
                        title = "Vibration",
                        description = "Coming soon",
                        enabled = false,
                        onClick = { }
                    )
                }

                // About Section
                item {
                    Text(
                        text = "ABOUT",
                        color = AmberPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp, top = 16.dp)
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Info,
                        title = "About QuasistR",
                        description = "Learn more about the game",
                        onClick = { showAbout = true }
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.People,
                        title = "Credits",
                        description = "Meet the team behind QuasistR",
                        onClick = { showCredits = true }
                    )
                }

                // Legal Section
                item {
                    Text(
                        text = "LEGAL",
                        color = AmberPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp, top = 16.dp)
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Description,
                        title = "Terms of Service",
                        description = "User agreement and privacy policy",
                        onClick = { showUserAgreement = true }
                    )
                }

                // Connect Section
                item {
                    Text(
                        text = "CONNECT",
                        color = AmberPrimary,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 8.dp, bottom = 8.dp, top = 16.dp)
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.CameraAlt,
                        title = "Follow on Instagram",
                        description = "@donkey_desk",
                        onClick = {
                            uriHandler.openUri("https://www.instagram.com/donkey_desk/")
                        }
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Email,
                        title = "Contact Support",
                        description = "quasistr@gmail.com",
                        onClick = {
                            uriHandler.openUri("mailto:quasistr@gmail.com")
                        }
                    )
                }

                item {
                    SettingsItem(
                        icon = Icons.Default.Star,
                        title = "Rate QuasistR",
                        description = "Leave a review on Google Play",
                        onClick = {
                            uriHandler.openUri("market://details?id=com.quasistr")
                        }
                    )
                }
            }

            // Version info
            Text(
                text = "QuasistR v1.0.0",
                color = Color.White.copy(alpha = 0.5f),
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }
    }

    // About Dialog
    if (showAbout) {
        Dialog(onDismissRequest = { showAbout = false }) {
            Surface(
                modifier = Modifier.padding(32.dp),
                shape = RoundedCornerShape(16.dp),
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = "About QuasistR",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = IndigoDark,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Text(
                        text = """
                        QuasistR is a modern take on the classic charades game. Simply hold your phone to your forehead and let others see the word!
                        
                        How to Play:
                        • Hold phone to your forehead (screen facing others)
                        • Others act out or describe the word
                        • Tilt UP when you guess correctly
                        • Tilt DOWN to skip the word
                        • Try to guess as many as possible before time runs out!
                        
                        Features:
                        • 20+ themed word decks with 30+ words each
                        • Multiple game modes
                        • Perfect for parties and gatherings
                        • Free, ad-free, and privacy-focused
                        """.trimIndent(),
                        fontSize = 14.sp,
                        color = Color.Black,
                        lineHeight = 20.sp,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        TextButton(onClick = { showAbout = false }) {
                            Text("Close", color = AmberPrimary, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }

    // Credits Dialog
    if (showCredits) {
        Dialog(onDismissRequest = { showCredits = false }) {
            Surface(
                modifier = Modifier.padding(32.dp),
                shape = RoundedCornerShape(16.dp),
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Text(
                        text = "Credits",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = IndigoDark,
                        modifier = Modifier.padding(bottom = 16.dp)
                    )

                    Text(
                        text = "Developed by:",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 16.sp
                    )

                    Surface(
                        modifier = Modifier
                            .clickable {
                                uriHandler.openUri("https://www.linkedin.com/in/%C3%A1d%C3%A1m-mik%C3%B3/")
                            }
                            .padding(vertical = 4.dp),
                        color = AmberPrimary.copy(alpha = 0.1f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Adam Miko",
                                fontSize = 14.sp,
                                color = IndigoDark,
                                fontWeight = FontWeight.Medium
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Icon(
                                imageVector = Icons.Default.Launch,
                                contentDescription = "Open LinkedIn",
                                tint = IndigoDark,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Graphic Design by:",
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        fontSize = 16.sp
                    )

                    Surface(
                        modifier = Modifier
                            .clickable {
                                uriHandler.openUri("https://www.linkedin.com/in/thanh-phuong-le-phan/")
                            }
                            .padding(vertical = 4.dp),
                        color = AmberPrimary.copy(alpha = 0.1f),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Row(
                            modifier = Modifier.padding(12.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "Gia Phan",
                                fontSize = 14.sp,
                                color = IndigoDark,
                                fontWeight = FontWeight.Medium
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Icon(
                                imageVector = Icons.Default.Launch,
                                contentDescription = "Open LinkedIn",
                                tint = IndigoDark,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Special thanks to all beta testers for their valuable feedback!",
                        fontSize = 12.sp,
                        color = Color.Black.copy(alpha = 0.7f),
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {
                        TextButton(onClick = { showCredits = false }) {
                            Text("Close", color = AmberPrimary, fontWeight = FontWeight.Bold)
                        }
                    }
                }
            }
        }
    }

    // Terms of Service Dialog - Full Screen
    if (showUserAgreement) {
        Dialog(onDismissRequest = { showUserAgreement = false }) {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                color = Color.White
            ) {
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Terms of Service",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = IndigoDark
                        )
                        IconButton(onClick = { showUserAgreement = false }) {
                            Icon(Icons.Default.Close, contentDescription = "Close", tint = IndigoDark)
                        }
                    }

                    Divider(modifier = Modifier.padding(vertical = 8.dp))

                    LazyColumn {
                        item {
                            Text(
                                text = """
                                TERMS OF SERVICE AND PRIVACY POLICY
                                
                                Effective Date: January 1, 2025
                                
                                1. ACCEPTANCE OF TERMS
                                By downloading, installing, or using QuasistR ("the App"), you agree to be bound by these Terms of Service ("Terms"). If you do not agree to these Terms, do not use the App.
                                
                                2. DESCRIPTION OF SERVICE
                                QuasistR is a mobile charades game application that allows users to play word-guessing games using device motion controls.
                                
                                3. PRIVACY AND DATA COLLECTION
                                3.1 Data We Collect:
                                • Anonymous usage analytics (game sessions, popular decks, crash reports)
                                • Device information (OS version, device model for compatibility)
                                
                                3.2 Data We Do NOT Collect:
                                • Personal information or identity data
                                • Location data
                                • Contact information
                                • User-generated content
                                
                                3.3 Analytics:
                                We use Firebase Analytics to understand app usage patterns. All data is anonymized and used solely for improving the user experience.
                                
                                4. USER CONDUCT
                                You agree not to:
                                • Reverse engineer or attempt to extract source code
                                • Use the App for any illegal purposes
                                • Attempt to disable or circumvent security features
                                
                                5. INTELLECTUAL PROPERTY
                                5.1 App Content: The App and its original content are protected by copyright and other intellectual property laws. All rights reserved.
                                
                                5.2 Third-Party Content: Some word lists may include references to movies, TV shows, books, celebrities, and other copyrighted works. These references are used for educational and entertainment purposes under fair use principles. QuasistR does not claim ownership of any third-party intellectual property.
                                
                                5.3 Trademark Notice: All trademarks, service marks, and trade names referenced in the App are the property of their respective owners.
                                
                                6. DISCLAIMER OF WARRANTIES
                                THE APP IS PROVIDED "AS IS" WITHOUT WARRANTIES OF ANY KIND, EXPRESS OR IMPLIED. WE DO NOT WARRANT THAT THE APP WILL BE UNINTERRUPTED OR ERROR-FREE.
                                
                                7. LIMITATION OF LIABILITY
                                IN NO EVENT SHALL THE APP DEVELOPER BE LIABLE FOR ANY INDIRECT, INCIDENTAL, SPECIAL, OR CONSEQUENTIAL DAMAGES ARISING FROM YOUR USE OF THE APP.
                                
                                8. CHANGES TO TERMS
                                We reserve the right to modify these Terms at any time. Updated Terms will be posted within the App.
                                
                                9. TERMINATION
                                We may terminate your access to the App at any time for violation of these Terms.
                                
                                10. GOVERNING LAW
                                These Terms are governed by applicable local laws without regard to conflict of law principles.
                                
                                11. CONTACT INFORMATION
                                For questions about these Terms or privacy concerns, contact us at:
                                Email: quasistr@gmail.com
                                
                                By continuing to use QuasistR, you acknowledge that you have read, understood, and agree to be bound by these Terms of Service.
                                """.trimIndent(),
                                fontSize = 12.sp,
                                color = IndigoDark,
                                lineHeight = 16.sp
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun SettingsItem(
    icon: ImageVector,
    title: String,
    description: String,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = enabled) { onClick() },
        shape = RoundedCornerShape(16.dp),
        color = if (enabled) IndigoSurface else IndigoSurface.copy(alpha = 0.5f),
        shadowElevation = if (enabled) 2.dp else 0.dp
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = if (enabled) AmberPrimary else Color.White.copy(alpha = 0.5f),
                modifier = Modifier.size(24.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    color = if (enabled) Color.White else Color.White.copy(alpha = 0.5f),
                    fontWeight = FontWeight.Bold,
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
                    tint = Color.White.copy(alpha = 0.3f),
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}