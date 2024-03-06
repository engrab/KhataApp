package com.example.khataapp.screens.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.khataapp.R


@Composable
fun ProfileImage() {

    Card(
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(2.dp)
    ) {

        Image(
            painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileImagePreview() {

    ProfileImage()
}