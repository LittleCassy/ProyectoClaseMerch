package com.example.ejercicioclase.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicioclase.ui.theme.EjercicioClaseTheme
import com.example.myapplication.R

class Home : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioClaseTheme {
                HomeScreen()
            }
        }
    }
}

@Composable
fun HomeScreen(){
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
            BottomNav()

            //TODO Ponerlo en su sitio
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
fun BottomNav(){
    Column(

    ) {
        Row(
            modifier = Modifier
                .padding(vertical = 15.dp)
                .fillMaxWidth()
                .height(70.dp)
                .background(Color.Gray),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,

        ) {
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .height(64.dp)
                    .width(64.dp)
                    .clickable {
                        //TODO Nico con los clickables
                    }
            )
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .height(64.dp)
                    .width(64.dp)
                    .clickable {

                    }
            )
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .height(64.dp)
                    .width(64.dp)
                    .clickable {

                    }
            )
            Image(
                painter = painterResource(R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = Modifier
                    .height(64.dp)
                    .width(64.dp)
                    .clickable {

                    }
            )
        }
    }
}

@Composable
fun SearchField(label : String, modifier: Modifier = Modifier){
    //Hay que hacer una variable busqueda que sera byremember mutable state
    var search by remember { mutableStateOf("") }

    TextField(
        value = search,
        onValueChange = {search = it},
        label = { Text(text = label) },
        singleLine = true,
    )

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

@Composable
fun ProductCard(){

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview(){
    EjercicioClaseTheme() {
        HomeScreen()
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

//Se usa para poner los títulos a las secciones donde lo queramos utilizar
@Composable
fun SectionTitle(title : String){
    Text(
        text = title,
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun TopBar(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Logo",
            modifier = Modifier
                .height(64.dp)
                .width(64.dp),
        )

        SearchField("Buscar...")

        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Menu",
            modifier = Modifier
                .height(64.dp)
                .width(64.dp)
        )
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
            .width(100.dp)
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










