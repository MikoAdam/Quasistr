package com.quasistr.activities

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.analytics.FirebaseAnalytics

class QuasistrApplication : Application() {

    // Initialize Firebase Analytics directly
    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

        firebaseAnalytics = FirebaseAnalytics.getInstance(this)

        firebaseAnalytics.setUserProperty("app_version", "1.0")

        instance = this
    }

    companion object {
        private var instance: QuasistrApplication? = null

        fun getInstance(): QuasistrApplication {
            return instance ?: throw IllegalStateException("Application not created yet")
        }
    }
}