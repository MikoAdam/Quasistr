package com.quasistr.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import com.quasistr.ui.theme.IndigoBackground
import com.quasistr.ui.theme.IndigoLight
import com.quasistr.ui.theme.IndigoSurface

@Composable
fun AsymmetricBackground(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(IndigoBackground)
    ) {
        // Draw asymmetric background circles similar to the logo
        Canvas(modifier = Modifier.fillMaxSize()) {
            // Main large circle - slightly off-center
            val mainCircleRadius = size.width * 0.45f
            val mainCircleCenter = Offset(
                x = size.width * 0.52f, // Slightly to the right
                y = size.height * 0.48f // Slightly up
            )

            // Draw main circle with gradient
            drawCircle(
                brush = Brush.radialGradient(
                    colors = listOf(IndigoSurface, IndigoBackground),
                    center = mainCircleCenter,
                    radius = mainCircleRadius * 1.2f
                ),
                center = mainCircleCenter,
                radius = mainCircleRadius,
                alpha = 0.6f
            )

            // Inner circle - more off-center than main
            val innerCircleRadius = mainCircleRadius * 0.65f
            val innerCircleCenter = Offset(
                x = mainCircleCenter.x + size.width * 0.03f, // More to the right
                y = mainCircleCenter.y - size.height * 0.02f  // More up
            )

            // Draw inner circle
            drawCircle(
                color = IndigoLight,
                center = innerCircleCenter,
                radius = innerCircleRadius,
                alpha = 0.5f
            )

            // Small accent circle
            val accentCircleRadius = innerCircleRadius * 0.3f
            val accentCircleCenter = Offset(
                x = mainCircleCenter.x - size.width * 0.15f,
                y = mainCircleCenter.y + size.height * 0.15f
            )

            // Draw accent circle
            drawCircle(
                color = IndigoLight,
                center = accentCircleCenter,
                radius = accentCircleRadius,
                alpha = 0.25f
            )
        }

        // Content
        content()
    }
}