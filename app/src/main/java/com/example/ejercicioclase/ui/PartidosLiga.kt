package com.example.ejercicioclase.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicioclase.ui.theme.EjercicioClaseTheme

@Composable
fun LaLigaScreen(){
    Column(
        modifier = Modifier.fillMaxSize().padding(10.dp)
    ) {
        Text(
            text = "Toda La Liga gratis",
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn(

        ) {
            item{
                LaLigaCard()
            }
        }

    }
}

@Composable
fun LaLigaCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "Hola, mundo"
            )
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LaLigaScreenPreview(){
    EjercicioClaseTheme() {
        LaLigaScreen()
    }
}