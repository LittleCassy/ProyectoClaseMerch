package com.example.ejercicioclase.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R

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
fun BottomNav(navController : NavController) {

    Row(
        modifier = Modifier
            .padding(vertical = 12.dp)
            .fillMaxWidth()
            .height(70.dp)
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,

        ) {
        Icon(
            imageVector = Icons.Default.Home,
            tint = Color.Gray,
            contentDescription = "Home",
            modifier = Modifier
                .clickable {
                    navController.navigate("Home")
                }
        )
        Icon(
            imageVector = Icons.Default.Favorite,
            tint = Color.Gray,
            contentDescription = "ProductHistory",
            modifier = Modifier
                .clickable {
                    navController.navigate("ProductHistory")
                }
        )
        Icon(
            imageVector = Icons.Default.ShoppingCart,
            tint = Color.Gray,
            contentDescription = "Cart",
            modifier = Modifier
                .clickable {
                    navController.navigate("Cart")
                }
        )
        Icon(
            imageVector = Icons.Default.Person,
            tint = Color.Gray,
            contentDescription = "Profile",
            modifier = Modifier
                .clickable {
                    navController.navigate("Profile")
                }
        )

    }
}

