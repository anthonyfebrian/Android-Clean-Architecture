package com.example.androidcleanarchitecture.network.di

import com.example.androidcleanarchitecture.network.utils.httpClient
import io.github.aakira.napier.Napier
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import org.koin.core.annotation.Module
import org.koin.core.annotation.Single
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Configuration
import org.koin.core.annotation.Property

@Module
class NetworkModule {
    @Single
    fun provideJson() = Json {
        ignoreUnknownKeys = true
        useAlternativeNames = false
        prettyPrint = true
        isLenient = true
        explicitNulls = false
    }

    @Single
    fun provideHttpClient(
        json: Json,
        @Property("base_url") baseUrl: String,
    ): HttpClient {
        Napier.d { "baseUrl: $baseUrl" }
        return httpClient {
            defaultRequest {
                url(baseUrl)
            }

            install(ContentNegotiation) {
                json(json)
            }
            install(Logging) {
                level = LogLevel.ALL
                logger = object : Logger {
                    override fun log(message: String) {
                        Napier.d(tag = "Ktor", message = message)
                    }
                }
            }
        }
    }
}