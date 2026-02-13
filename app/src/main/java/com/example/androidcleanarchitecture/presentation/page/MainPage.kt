package com.example.androidcleanarchitecture.presentation.page

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.androidcleanarchitecture.presentation.activity.Greeting

enum class AppDestinations(
    val label: String,
    val icon: ImageVector,
) {
    MODULE_A("Module A", Icons.Filled.Home),
    MODULE_B("Module B", Icons.Filled.Favorite),
    MODULE_C("Module C", Icons.Filled.AccountBox),
}

@Composable
fun MainPage() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.MODULE_A) }

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            it.icon,
                            contentDescription = it.label
                        )
                    },
                    label = { Text(it.label) },
                    selected = it == currentDestination,
                    onClick = { currentDestination = it }
                )
            }
        }
    ) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

            Greeting(
                name = "Android $currentDestination" ,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}