package com.example.androidcleanarchitecture.network.utils

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.darwin.Darwin
import io.ktor.client.engine.darwin.certificates.CertificatePinner

actual fun httpClient(config: HttpClientConfig<*>.() -> Unit) = HttpClient(Darwin) {
    config(this)
    engine {
        configureRequest {
            val builder = CertificatePinner.Builder()
            getSslCertificate().forEach {
                builder.add(it.first, it.second)
            }
            handleChallenge(builder.build())

            setAllowsCellularAccess(true)
        }
    }
}