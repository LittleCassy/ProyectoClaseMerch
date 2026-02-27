package com.example.ejercicioclase.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejercicioclase.ui.theme.EjercicioClaseTheme
import com.example.myapplication.R

class Mascot : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioClaseTheme {

            }
        }
    }
}

@Composable
fun MascotScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = ""
        )

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
        ) {

        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MascotScreenPreview(){
    EjercicioClaseTheme() {
        MascotScreen()
    }
}