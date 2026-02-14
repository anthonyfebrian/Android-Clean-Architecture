package com.example.androidcleanarchitecture.shared.module_a.infrastructure.repository

import com.example.androidcleanarchitecture.shared.module_a.domain.repository.ModuleARepository
import com.example.androidcleanarchitecture.shared.module_a.infrastructure.datasource.local.ModuleALocalDataSource
import com.example.androidcleanarchitecture.shared.module_a.infrastructure.datasource.remote.ModuleARemoteDataSource
import org.koin.core.annotation.Single

@Single(binds = [ModuleARepository::class])
class ModuleARepositoryImpl(
    private val remoteDataSource: ModuleARemoteDataSource,
    private val localDataSource: ModuleALocalDataSource
): ModuleARepository {
}