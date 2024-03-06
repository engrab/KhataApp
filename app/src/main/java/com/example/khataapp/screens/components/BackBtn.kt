package com.example.khataapp.screens.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BackButton(back: () -> Unit, image: ImageVector, desc: String, tint: Color) {

    IconButton(
        onClick = { back() }) {
        Icon(image, contentDescription = desc,
            tint =tint)
    }
}

@Preview(showBackground = true)
@Composable
fun BackButtonPreview() {
    BackButton(
        back = { },
        image = Icons.Default.ArrowBack,
        desc = "Back",
        tint = MaterialTheme.colorScheme.primary
    )
}
