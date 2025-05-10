package com.quasistr.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.ui.theme.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun CountdownScreen(
    onStartGame: () -> Unit,
    onCancel: () -> Unit
) {
    var countdown by remember { mutableStateOf(3) }
    val coroutineScope = rememberCoroutineScope()
    var countdownStarted by remember { mutableStateOf(false) }
    
    val scaleAnim = remember { Animatable(1f) }
    
    LaunchedEffect(countdownStarted) {
        if (countdownStarted) {
            while (countdown > 0) {
                // Animate scale up and down
                scaleAnim.animateTo(
                    targetValue = 2.5f,
                    animationSpec = tween(900, easing = FastOutSlowInEasing)
                )
                countdown--
                delay(100)
                scaleAnim.animateTo(
                    targetValue = 1f,
                    animationSpec = tween(0)
                )
            }
            // Start the game when countdown reaches 0
            onStartGame()
        }
    }
    
    Box(
        modifier = Modifier
            .fillMaxSize()
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
        
        // Cancel button
        IconButton(
            onClick = onCancel,
            modifier = Modifier
                .padding(16.dp)
                .size(48.dp)
                .background(IndigoSurface, CircleShape)
                .align(Alignment.TopEnd)
        ) {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Cancel",
                tint = Color.White
            )
        }
        
        // Content
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "GET READY!",
                color = AmberPrimary,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            
            Spacer(modifier = Modifier.height(24.dp))
            
            if (countdownStarted) {
                // Countdown number
                Text(
                    text = countdown.toString(),
                    color = Color.White,
                    fontSize = (64 * scaleAnim.value).sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            } else {
                // Instructions
                Text(
                    text = "Tilt your phone UP for correct guesses,\nDOWN to skip words.",
                    color = Color.White,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 24.dp)
                )
                
                Spacer(modifier = Modifier.height(32.dp))
                
                // Start button
                Button(
                    onClick = { 
                        countdownStarted = true
                    },
                    modifier = Modifier
                        .height(56.dp)
                        .width(200.dp),
                    shape = MaterialTheme.shapes.medium,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = AmberPrimary
                    )
                ) {
                    Text(
                        text = "START",
                        color = IndigoDark,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}