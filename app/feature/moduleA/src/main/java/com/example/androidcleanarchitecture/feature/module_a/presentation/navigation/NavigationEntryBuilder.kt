package com.example.androidcleanarchitecture.feature.module_a.presentation.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.androidcleanarchitecture.core.route.ModuleARoute
import com.example.androidcleanarchitecture.feature.module_a.presentation.page.ExampleA1Page
import com.example.androidcleanarchitecture.feature.module_a.presentation.page.ExampleAiDetailPage

fun EntryProviderScope<NavKey>.moduleAEntryBuilder() {
    entry<ModuleARoute.ExampleA1DetailPage> { args ->
        ExampleAiDetailPage(args.text)
    }
}