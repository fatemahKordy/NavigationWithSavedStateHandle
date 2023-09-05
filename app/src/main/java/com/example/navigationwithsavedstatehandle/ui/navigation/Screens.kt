package com.example.navigationwithsavedstatehandle.ui.navigation

sealed class Screens(val route: String) {

    object ProfileScreen : Screens("Profile")
    object LoginScreen : Screens("Login")

}
