package com.example.androidcleanarchitecture.network.utils

import io.ktor.client.HttpClient
import io.ktor.client.HttpClientConfig

/**
 * Creates an [HttpClient] instance with the specified configuration.
 *
 * This function is an expect declaration, meaning that platform-specific
 * implementations need to be provided for each target platform (e.g., Android, iOS).
 *
 * @param config An optional lambda function to configure the [HttpClient].
 *               The default configuration is empty.
 *
 * @return An [HttpClient] instance configured according to the provided [config].
 */
expect fun httpClient(config: HttpClientConfig<*>.() -> Unit = {}): HttpClient

/**
 * Returns a list of SSL certificate pinning configurations for specific hostnames.
 *
 * This function provides a list of pairs, where each pair represents a hostname and its corresponding
 * SHA-256 certificate fingerprint. This is used for certificate pinning, a security mechanism that
 * ensures the app only trusts the specific certificate associated with each hostname.
 *
 *
 * Each certificate is represented by its SHA-256 fingerprint, ensuring that the connection is secure
 * and the server is legitimate.
 *
 * @return A list of pairs, where each pair contains a hostname (String) and its corresponding SHA-256
 *         certificate fingerprint (String).
 */
fun getSslCertificate(): List<Pair<String, String>> {
    return listOf(
    )
}
