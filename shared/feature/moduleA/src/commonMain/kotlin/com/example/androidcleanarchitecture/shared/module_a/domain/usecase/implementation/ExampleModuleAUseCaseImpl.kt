package com.example.androidcleanarchitecture.shared.module_a.domain.usecase.implementation

import com.example.androidcleanarchitecture.shared.module_a.domain.usecase.ExampleModuleAUseCase
import org.koin.core.annotation.Factory

@Factory(binds = [ExampleModuleAUseCase::class])
class ExampleModuleAUseCaseImpl: ExampleModuleAUseCase {
    override fun invoke() {
        TODO("Not yet implemented")
    }
}