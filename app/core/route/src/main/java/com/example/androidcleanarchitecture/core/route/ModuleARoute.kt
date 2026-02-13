package com.example.androidcleanarchitecture.core.route

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object ModuleARoute {

    @Serializable
    data object ExampleA1Page: NavKey

    @Serializable
    data class ExampleA1DetailPage(
        val text: String,
    ): NavKey

}