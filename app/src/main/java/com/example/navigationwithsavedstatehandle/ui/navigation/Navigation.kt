package com.example.navigationwithsavedstatehandle.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.navigationwithsavedstatehandle.ui.screens.LoginScreen
import com.example.navigationwithsavedstatehandle.ui.screens.ProfileScreen


@Composable
fun navigationHost(navHostController: NavHostController) {

    NavHost(navController = navHostController, startDestination = Screens.LoginScreen.route) {
        composable(Screens.LoginScreen.route) {
            LoginScreen({navHostController.navigate(Screens.ProfileScreen.route+"/$it")})
        }

        composable(
            Screens.ProfileScreen.route+"/{name}",
            arguments = listOf(navArgument("name") {
                NavType.StringType
            })
        ) {
            ProfileScreen()
        }
    }

}