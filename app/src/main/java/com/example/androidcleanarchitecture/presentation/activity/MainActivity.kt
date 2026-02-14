package com.example.androidcleanarchitecture.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.example.androidcleanarchitecture.core.route.Route
import com.example.androidcleanarchitecture.core.ui.theme.AppTheme
import com.example.androidcleanarchitecture.feature.module_a.presentation.navigation.moduleAEntryBuilder
import com.example.androidcleanarchitecture.feature.module_b.presentation.navigation.moduleBEntryBuilder
import com.example.androidcleanarchitecture.feature.module_c.presentation.navigation.moduleCEntryBuilder
import com.example.androidcleanarchitecture.presentation.page.MainPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                AndroidCleanArchitectureApp()
            }
        }
    }
}

@PreviewScreenSizes
@Composable
fun AndroidCleanArchitectureApp() {
    val backStack = rememberNavBackStack(Route.Main)

    NavDisplay(
        entryDecorators = listOf(
            rememberSaveableStateHolderNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator()
        ),
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Route.Main> {
                MainPage(
                    onNavigate = { dest -> backStack.add(dest) }
                )
            }
            moduleAEntryBuilder()
            moduleBEntryBuilder()
            moduleCEntryBuilder()
        },
    )
}