package com.example.androidcleanarchitecture.core.route

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object ModuleCRoute {

    @Serializable
    data object ExampleC1Page: NavKey

    @Serializable
    data class ExampleC1DetailPage(
        val text: String,
    ): NavKey

}
