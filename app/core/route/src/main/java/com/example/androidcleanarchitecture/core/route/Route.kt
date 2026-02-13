package com.example.androidcleanarchitecture.core.route

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
object Route {
    @Serializable
    data object Main: NavKey
}