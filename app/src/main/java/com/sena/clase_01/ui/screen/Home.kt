package com.sena.clase_01.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.sena.clase_01.ui.section.Body
import com.sena.clase_01.ui.section.Footer
import com.sena.clase_01.ui.section.Header

@Composable
fun Home(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.LightGray
    ) {
        // Columna principal que ordena las secciones de arriba a abajo
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Header()
            Body(modifier = Modifier.weight(1f))
            Footer()
        }
    }
}