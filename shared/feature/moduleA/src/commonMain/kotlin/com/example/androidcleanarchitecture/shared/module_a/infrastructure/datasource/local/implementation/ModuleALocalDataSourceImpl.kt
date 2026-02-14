package com.example.androidcleanarchitecture.shared.module_a.infrastructure.datasource.local.implementation

import com.example.androidcleanarchitecture.shared.module_a.infrastructure.datasource.local.ModuleALocalDataSource
import org.koin.core.annotation.Single

@Single(binds = [ModuleALocalDataSource::class])
class ModuleALocalDataSourceImpl: ModuleALocalDataSource {
}