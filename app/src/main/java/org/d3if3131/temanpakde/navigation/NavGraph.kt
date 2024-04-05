package org.d3if3131.temanpakde.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.d3if3131.temanpakde.ui.screen.AboutScreen
import org.d3if3131.temanpakde.ui.screen.HomeScreen
import org.d3if3131.temanpakde.ui.screen.MainScreen

@Composable
fun SetupNavGraph (navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    )
    {
        composable (route = Screen.Main.route) {
            MainScreen(navController)
        }
        composable (route = Screen.Home.route) {
            HomeScreen(navController)
        }
        composable (route = Screen.About.route) {
            AboutScreen(navController)
        }
    }
}