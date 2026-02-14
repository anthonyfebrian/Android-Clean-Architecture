package com.example.androidcleanarchitecture.network.utils

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig
import io.ktor.client.engine.okhttp.OkHttp
import okhttp3.CertificatePinner


actual fun httpClient(config: HttpClientConfig<*>.() -> Unit) = HttpClient(OkHttp) {
    config(this)

    engine {
        config {
            val certificatePinnerBuilder = CertificatePinner.Builder()
            getSslCertificate().forEach {
                certificatePinnerBuilder.add(it.first, it.second)
            }
            certificatePinner(certificatePinnerBuilder.build())
        }
    }
}
