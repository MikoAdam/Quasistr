package com.quasistr.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.EaseOutBack
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.quasistr.R
import com.quasistr.components.AsymmetricBackground
import com.quasistr.ui.theme.QuasistrTheme
import kotlinx.coroutines.delay

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuasistrTheme {
                SplashScreen(
                    onSplashComplete = {
                        startActivity(Intent(this, MainActivity::class.java))
                        finish()
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
                    }
                )
            }
        }
    }
}

@Composable
fun SplashScreen(onSplashComplete: () -> Unit) {
    var splashStage by remember { mutableStateOf(1) }
    val scale = remember { Animatable(0.8f) }
    val rotate = remember { Animatable(-5f) }
    val alpha = remember { Animatable(0f) }

    LaunchedEffect(splashStage) {
        if (splashStage == 1) {
            alpha.snapTo(0f)
            scale.snapTo(0.8f)
            rotate.snapTo(-5f)

            alpha.animateTo(1f, tween(500))
            scale.animateTo(1f, tween(700, easing = EaseOutBack))
            rotate.animateTo(0f, tween(700, easing = EaseOutBack))

            delay(1500)
            alpha.animateTo(0f, tween(500))

            delay(200)
            splashStage = 2
        } else if (splashStage == 2) {
            alpha.snapTo(0f)
            scale.snapTo(0.8f)
            rotate.snapTo(-5f)

            alpha.animateTo(1f, tween(500))
            scale.animateTo(1f, tween(700, easing = EaseOutBack))
            rotate.animateTo(0f, tween(700, easing = EaseOutBack))

            delay(1500)
            onSplashComplete()
        }
    }

    AsymmetricBackground {
        if (splashStage == 1) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .scale(scale.value)
                    .rotate(rotate.value)
                    .graphicsLayer(alpha = alpha.value),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.donkey_desk_logo),
                    contentDescription = "Donkey Desk Studio",
                    modifier = Modifier
                        .width(220.dp)
                        .padding(bottom = 16.dp)
                )

                Text(
                    text = "A Donkey Desk Studio Game",
                    color = Color.White,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(24.dp))

                // Marketing text
                Text(
                    text = "Free • No Ads • No Registration • Privacy Focused",
                    color = Color.White.copy(alpha = 0.9f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 32.dp)
                )
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .scale(scale.value)
                    .rotate(rotate.value)
                    .graphicsLayer(alpha = alpha.value),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.quasistr_logo),
                    contentDescription = "QuasistR Logo",
                    modifier = Modifier
                        .width(280.dp)
                        .padding(bottom = 16.dp)
                )

                Text(
                    text = "Tilt to Play • Party Game",
                    color = Color.White,
                    fontSize = 18.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}