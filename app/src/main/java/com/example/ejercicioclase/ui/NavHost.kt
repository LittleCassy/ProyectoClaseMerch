package com.example.ejercicioclase.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "Home"
    ){
        composable("Home"){
            HomeScreen(navController)
        }
        composable("ProductHistory"){
            //TODO ProductHistoryScreen()
        }
        composable("Cart"){
            //TODO CartScreen()
        }
        composable("Profile"){
            //TODO ProfileScreen()
        }
        composable("LaLiga"){
            //TODO LaLigaScreen()
        }
    }
}