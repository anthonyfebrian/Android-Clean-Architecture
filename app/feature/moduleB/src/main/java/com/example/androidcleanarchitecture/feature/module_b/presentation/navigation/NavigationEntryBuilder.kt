package com.example.androidcleanarchitecture.feature.module_b.presentation.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.androidcleanarchitecture.core.route.ModuleBRoute
import com.example.androidcleanarchitecture.feature.module_b.presentation.page.ExampleB1Page
import com.example.androidcleanarchitecture.feature.module_b.presentation.page.ExampleB1DetailPage

fun EntryProviderScope<NavKey>.moduleBEntryBuilder() {
    entry<ModuleBRoute.ExampleB1DetailPage> { args ->
        ExampleB1DetailPage(args.text)
    }
}
