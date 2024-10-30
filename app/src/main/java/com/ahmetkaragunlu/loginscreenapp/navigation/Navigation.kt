package com.ahmetkaragunlu.loginscreenapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahmetkaragunlu.loginscreenapp.screens.LoginScreen
import com.ahmetkaragunlu.loginscreenapp.screens.MainScreen
import com.ahmetkaragunlu.loginscreenapp.screens.SignInScreen
import com.ahmetkaragunlu.loginscreenapp.screens.SignUpScreen


@Composable
fun Navigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.LOGINSCREEN.route) {
        composable(route = Screens.LOGINSCREEN.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screens.SIGNINSCREEN.route) {
            SignInScreen(navController = navController)
        }
        composable(route = Screens.SIGNUPSCREEN.route) {
            SignUpScreen(navController = navController)
        }
        composable(route = Screens.MAINSCREEN.route) {
            MainScreen(navController = navController)
        }
    }
}