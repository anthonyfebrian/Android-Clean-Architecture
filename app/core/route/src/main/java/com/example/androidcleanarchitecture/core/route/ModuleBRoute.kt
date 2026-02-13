package com.example.androidcleanarchitecture.core.route

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
data object ModuleBRoute {

    @Serializable
    data object ExampleB1Page: NavKey

    @Serializable
    data class ExampleB1DetailPage(
        val text: String,
    ): NavKey

}
