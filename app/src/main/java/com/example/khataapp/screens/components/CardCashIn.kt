package com.example.khataapp.screens.components


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun CardCashIn(amount: Int, cash: String) {

    Card(
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary),
        elevation = CardDefaults.cardElevation(5.dp),
        modifier = Modifier
            .width(200.dp)
            .height(150.dp),

        ) {


        Text(
            text = "Rs $amount",
            modifier = Modifier.fillMaxSize(.5f)
                .align(alignment = Alignment.CenterHorizontally),
            textAlign = TextAlign.Center
        )
        Text(
            text = cash,
            modifier = Modifier.fillMaxSize(.5f)
                .align(alignment = Alignment.CenterHorizontally)
        )


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardCashInPreview() {
    CardCashIn(amount = 4500, cash = "Cash In")
}