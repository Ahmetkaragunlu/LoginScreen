package com.ahmetkaragunlu.loginscreenapp.viewmodel

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class LoginViewModel : ViewModel() {


    var username by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var email by mutableStateOf("")
        private set


    fun updateUsername(value: String) {
        username = value
    }

    fun updatePassword(value: String) {
        password = value
    }

    fun updateEmail(value: String) {
        email = value
    }
    fun isEmailValid()= Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun isPasswordValid()=password.length >= 6

    fun isNameValid()= username.trim().length >= 3

    fun isEmailAndPasswordValid()=isEmailValid() && isPasswordValid()

    fun formValid()= isNameValid() && isPasswordValid() && isEmailValid()

}