package com.quasistr.animations

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ContentTransform
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith

// Transition animations
val enterTransition = slideInHorizontally(
    initialOffsetX = { fullWidth -> fullWidth }, 
    animationSpec = tween(durationMillis = 300)
) + fadeIn(animationSpec = tween(durationMillis = 300))

val exitTransition = slideOutHorizontally(
    targetOffsetX = { fullWidth -> -fullWidth },
    animationSpec = tween(durationMillis = 300)
) + fadeOut(animationSpec = tween(durationMillis = 300))

val popEnterTransition = slideInHorizontally(
    initialOffsetX = { fullWidth -> -fullWidth },
    animationSpec = tween(durationMillis = 300)
) + fadeIn(animationSpec = tween(durationMillis = 300))

val popExitTransition = slideOutHorizontally(
    targetOffsetX = { fullWidth -> fullWidth },
    animationSpec = tween(durationMillis = 300)
) + fadeOut(animationSpec = tween(durationMillis = 300))

// Navigation transition function
fun getTransitionSpec(): AnimatedContentTransitionScope<String>.() -> ContentTransform {
    return {
        when (targetState) {
            "MainMenu" -> {
                if (initialState == "DeckSelection" || initialState == "GameModes") {
                    popEnterTransition togetherWith popExitTransition
                } else {
                    enterTransition togetherWith exitTransition
                }
            }
            else -> enterTransition togetherWith exitTransition
        }
    }
}