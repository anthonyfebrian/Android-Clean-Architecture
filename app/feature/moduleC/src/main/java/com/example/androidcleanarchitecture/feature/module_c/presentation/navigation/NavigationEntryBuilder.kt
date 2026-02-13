package com.example.androidcleanarchitecture.feature.module_c.presentation.navigation

import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavKey
import com.example.androidcleanarchitecture.core.route.ModuleCRoute
import com.example.androidcleanarchitecture.feature.module_c.presentation.page.ExampleC1Page
import com.example.androidcleanarchitecture.feature.module_c.presentation.page.ExampleC1DetailPage

fun EntryProviderScope<NavKey>.moduleCEntryBuilder() {
    entry<ModuleCRoute.ExampleC1DetailPage> { args ->
        ExampleC1DetailPage(args.text)
    }
}
