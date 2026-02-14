package com.example.androidcleanarchitecture.presentation

import android.app.Application
import com.example.androidcleanarchitecture.BuildConfig
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.annotation.KoinApplication
import org.koin.plugin.module.dsl.startKoin

@KoinApplication
class AndroidCleanArchitectureApp : Application() {

    override fun onCreate() {
        super.onCreate()

        Napier.base(DebugAntilog())

        startKoin<AndroidCleanArchitectureApp> {
            androidLogger()
            androidContext(this@AndroidCleanArchitectureApp)
            properties(mapOf(
                "base_url" to BuildConfig.BASE_URL
            ))
        }
    }
}
