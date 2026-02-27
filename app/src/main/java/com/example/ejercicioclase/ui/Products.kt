package com.example.ejercicioclase.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ejercicioclase.ui.theme.EjercicioClaseTheme

@Composable
fun ProductsScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text(
            text = "Products CBD",
            style = MaterialTheme.typography.headlineLarge
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize(),
        ) {
            items(56){
                ProductCard("Test", "44", android.R.drawable.screen_background_dark)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ){
            BottomNav(navController)
        }

    }
}

//Provisional
@Composable
fun ProductCard(name : String, price : String, @DrawableRes image : Int){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(image),
                contentDescription = name,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxSize()
            )
            Text(
                text = name,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Text(
                    text = price,
                    fontSize = 18.sp,
                    color = Color.Green
                )
                Text(
                    text = price,
                    fontSize = 18.sp,
                    color = Color.Red
                )
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProductsPreview(){
    EjercicioClaseTheme() {
        ProductsScreen(navController = NavController(LocalContext.current))
    }
}










