package com.example.androidcleanarchitecture.feature.module_a.presentation.page

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.androidcleanarchitecture.feature.module_a.presentation.viewmodel.ExampleA1ViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ExampleA1Page(
    viewModel: ExampleA1ViewModel = koinViewModel(),
    navToDetail: () -> Unit
) {
    Column {
        Text(
            text = "ExampleA1Page"
        )
        Button(onClick = navToDetail) {
            Text("Go to Module A")
        }
    }
}