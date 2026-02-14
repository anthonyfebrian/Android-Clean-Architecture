package com.example.androidcleanarchitecture.feature.module_c.presentation.page

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.androidcleanarchitecture.feature.module_c.presentation.viewmodel.ExampleC1ViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun ExampleC1Page(
    viewModel: ExampleC1ViewModel = koinViewModel(),
    navToDetail: () -> Unit
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
