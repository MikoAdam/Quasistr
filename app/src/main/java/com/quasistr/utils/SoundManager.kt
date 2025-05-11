package com.quasistr.utils

import android.content.Context
import android.media.AudioManager

class SoundManager(private val context: Context) {
    private val audioManager = context.getSystemService(Context.AUDIO_SERVICE) as AudioManager

    fun playCorrectSound() {
        audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_RETURN)
    }

    fun playSkipSound() {
        audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_DELETE)
    }

    fun playCountdownSound() {
        audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD)
    }

    fun playGameOverSound() {
        audioManager.playSoundEffect(AudioManager.FX_KEYPRESS_SPACEBAR)
    }

    fun playButtonClickSound() {
        audioManager.playSoundEffect(AudioManager.FX_KEY_CLICK)
    }

    fun playTimeWarningSound() {
        audioManager.playSoundEffect(AudioManager.FX_FOCUS_NAVIGATION_UP)
    }

    fun release() {
        // No resources to release for AudioManager sound effects
    }
}