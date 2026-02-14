package com.example.androidcleanarchitecture.shared.module_a.infrastructure.datasource.remote.implementation

import com.example.androidcleanarchitecture.shared.module_a.infrastructure.datasource.remote.ModuleARemoteDataSource
import io.ktor.client.HttpClient
import org.koin.core.annotation.Single

@Single(binds = [ModuleARemoteDataSource::class])
class ModuleARemoteDataSourceImpl(
    private val httpClient: HttpClient,
): ModuleARemoteDataSource {
}
