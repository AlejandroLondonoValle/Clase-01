package com.sena.clase_01.ui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun SecondaryText(text: String) {
    Text(
        text = text,
        color = Color.White
    )
}