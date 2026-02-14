package com.example.androidcleanarchitecture.presentation

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.annotation.KoinApplication
import org.koin.plugin.module.dsl.startKoin

@KoinApplication
class AndroidCleanArchitectureApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin<AndroidCleanArchitectureApp> {
            androidLogger()
            androidContext(this@AndroidCleanArchitectureApp)
        }
    }
}