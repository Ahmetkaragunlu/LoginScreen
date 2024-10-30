package com.ahmetkaragunlu.loginscreenapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ahmetkaragunlu.loginscreenapp.R
import com.ahmetkaragunlu.loginscreenapp.editText.EditText
import com.ahmetkaragunlu.loginscreenapp.navigation.Screens
import com.ahmetkaragunlu.loginscreenapp.viewmodel.LoginViewModel


@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    viewModel: LoginViewModel = viewModel(),
    navController: NavController
) {

    Text(
        stringResource(R.string.sign_up),
        modifier = modifier.padding(48.dp),
        style = MaterialTheme.typography.headlineLarge
    )
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        EditText(
            value = viewModel.username,
            onValueChange = { viewModel.updateUsername(it) },
            label = R.string.name,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Next
            ),
            supportingText = if (!viewModel.isNameValid() && viewModel.username.isNotBlank()) {
                R.string.name_error
            } else {
                null
            }
        )
        EditText(
            value = viewModel.email,
            onValueChange = { viewModel.updateEmail(it) },
            label = R.string.email,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Next
            ),
            supportingText = if (!viewModel.isEmailValid() && viewModel.email.isNotBlank()) {
                R.string.email_error
            } else {
                null
            }
        )
        EditText(
            value = viewModel.password,
            onValueChange = { viewModel.updatePassword(it) },
            label = R.string.password,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Number
            ),
            supportingText = if (!viewModel.isPasswordValid() && viewModel.password.isNotBlank()) {
                R.string.password_error
            } else {
                null
            }
        )
        Button(
            onClick = { navController.navigate(Screens.MAINSCREEN.route) },
            enabled = viewModel.formValid(),
            shape = RectangleShape
        ) {
            Text(text = stringResource(R.string._continue))
        }
    }
}