package com.example.androidcleanarchitecture.feature.module_c.presentation.page

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ExampleC1Page(    navToDetail: () -> Unit
) {
    Column {
        Text(
            text = "ExampleC1Page"
        )
        Button(onClick = navToDetail) {
            Text("Go to Module C")
        }
    }
}
