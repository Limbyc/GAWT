package com.valance.gawt

import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.valance.gawt.presentation.ui.components.ModalNavigationDrawerWrapper
import com.valance.gawt.presentation.ui.screen.LogInScreen
import com.valance.gawt.presentation.ui.screen.MainScreen
import com.valance.gawt.presentation.ui.screen.MapScreen
import com.valance.gawt.presentation.ui.screen.ProfileScreen
import com.valance.gawt.presentation.ui.screen.RiverDataScreen
import com.valance.gawt.presentation.ui.screen.RiverScreen
import com.valance.gawt.presentation.ui.screen.StaffDataScreen
import com.valance.gawt.presentation.ui.screen.WelcomeScreen

object Routes {
    const val LOGIN = "login"
    const val HOME = "home"
    const val RIVER = "river"
    const val WELCOME = "welcome"
    const val MAP = "map"
    const val PROFILE = "profile"
    const val RIVER_DATA = "river_data"
    const val STAFF_DATA = "staff_data"
    const val MODAL_NAVIGATION_DRAWER = "modal_navigation_drawer"
} //TODO сделать через константы

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "welcome") {
        composable("login") {
            LogInScreen(onClick = {
                navController.navigate("home")
            })
        }
        composable("home") {
            MainScreen(navController = navController)
        }
        composable("river"){
            RiverScreen(navController = navController)
        }
        composable("welcome"){
            WelcomeScreen(onClick = {
                navController.navigate("login")
            })
        }
        composable("map"){
            MapScreen(navController = navController)
        }
        composable("profile") {
            ProfileScreen(navController = navController)
        }
        composable("river_data"){
            RiverDataScreen(navController = navController)
        }
        composable("staff_data"){
            StaffDataScreen(navController = navController)
        }
        composable("modal_navigation_drawer"){
            ModalNavigationDrawerWrapper(
                drawerState = DrawerState(DrawerValue.Closed),
                content = { ProfileScreen(navController = navController) },
                navController = navController
            )
        }
    }
}

