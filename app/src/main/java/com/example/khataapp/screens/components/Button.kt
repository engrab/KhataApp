package com.example.khataapp.screens.components

import android.graphics.drawable.shapes.OvalShape
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ButtonComp(cashIn: () -> Unit, color: ButtonColors, image: ImageVector, desc: String, text: String) {

    Button(
       colors = color ,
        onClick = { cashIn() }
    ) {
        Icon(image, contentDescription = desc)
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = text)
    }

}

@Preview(showBackground = true)
@Composable
fun ButtonCompPreview() {
    ButtonComp(
        cashIn = { },
        color = ButtonDefaults.buttonColors(),
        image = Icons.Default.Add,
        desc = "Add",
        text = "Cash In"
    )
}
