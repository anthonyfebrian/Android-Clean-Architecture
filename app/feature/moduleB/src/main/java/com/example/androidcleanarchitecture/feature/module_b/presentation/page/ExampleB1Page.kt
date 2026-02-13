package com.example.androidcleanarchitecture.feature.module_b.presentation.page

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ExampleB1Page(
    navToDetail: () -> Unit
) {
    Column {
        Text(
            text = "ExampleB1Page"
        )
        Button(onClick = navToDetail) {
            Text("Go to Module B")
        }
    }
}