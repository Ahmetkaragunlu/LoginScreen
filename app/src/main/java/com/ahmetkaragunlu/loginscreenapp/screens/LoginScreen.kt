package com.ahmetkaragunlu.loginscreenapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ahmetkaragunlu.loginscreenapp.R
import com.ahmetkaragunlu.loginscreenapp.navigation.Screens

@Composable
fun LoginScreen(modifier: Modifier = Modifier, navController: NavController) {

    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(R.drawable.login), contentDescription = null)
        Button(
            onClick = { navController.navigate(Screens.SIGNINSCREEN.route) },
            shape = RectangleShape,
            modifier = modifier
                .width(120.dp)
                .padding(top = 4.dp)
        ) {
            Text(text = stringResource(R.string.sign_in))
        }
        Button(
            onClick = { navController.navigate(Screens.SIGNUPSCREEN.route) },
            shape = RectangleShape,
            modifier = modifier.width(120.dp)
        ) {
            Text(text = stringResource(R.string.sign_up))
        }
    }
}