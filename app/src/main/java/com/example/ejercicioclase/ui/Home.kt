package com.example.ejercicioclase.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejercicioclase.ui.theme.EjercicioClaseTheme
import com.example.myapplication.R


class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioClaseTheme {
                Surface(){
                    Navigation()
                }
            }
        }
    }
}
@Composable
fun HomeScreen(navController : NavController){
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(bottom = 80.dp)
        ) {
            item{
                TopBar()
            }
            item{
                SectionTitle("Ofertas del día")
            }
            item{
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
            }
            item{
                Banner()
            }
            item{
                Spacer(
                    modifier = Modifier.height(20.dp)
                )
            }
            item{
                ProductCorrousel()
            }
        }


        //Haría de barra de navegación
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)

        ){
            BottomNav(navController)

            //TODO Ponerlo en su sitio

        }
        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd).padding(bottom = 70.dp)
        ){
            FloatingButton()
        }
    }
}

@Composable
fun Banner(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
        shape = RectangleShape
    ) {
        //TODO Implementar imagen
    }
}

@Composable
fun ProductCorrousel(){
    LazyRow(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(3){
            Card(
                modifier = Modifier
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_launcher_foreground),
                        contentDescription = "Producto 1",
                        modifier = Modifier
                            .height(150.dp)
                            .width(150.dp)
                    )
                    Text(
                        text = "CBD",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview(){
    EjercicioClaseTheme() {
        HomeScreen(NavController(LocalContext.current))
    }
}

@Preview(showSystemUi = true, showBackground = true,
    device = "spec:width=411dp,height=891dp,orientation=landscape"
)
@Composable
fun Preview2(){
    EjercicioClaseTheme() {
        HomeScreen(NavController(LocalContext.current))
    }
}

@Composable
fun ProductSection(){
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 80.dp),
        contentPadding = PaddingValues(horizontal = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        items(3){
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "Sample product",
                modifier = Modifier
                    .height(200.dp)
                    .width(150.dp)
            )
        }
    }
}

@Composable
fun FloatingButton(){
    FloatingActionButton(
        onClick = {
            //TODO Enviar a la promoción
        },
        containerColor = Color.Red,
        shape = CircleShape,
        modifier = Modifier
            .height(100.dp)
            .width(100.dp),

    ) {
        Text(
            text = "Toda \n La Liga \n gratis",
            fontWeight = FontWeight.Bold,
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
fun PreviewFloatingButton(){
    EjercicioClaseTheme() {
        FloatingButton()
    }
}










