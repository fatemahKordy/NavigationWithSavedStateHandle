package com.example.navigationwithsavedstatehandle.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(onRegisterClicked :(String)->Unit,loginViewModel:LoginViewModel= hiltViewModel()) {

    val uiState by loginViewModel.loginUiState.collectAsState()


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = uiState.userName,
            placeholder = { Text("Username") },
            onValueChange = loginViewModel::setName)


        Spacer(modifier = Modifier.height(32.dp))

        Button(onClick ={onRegisterClicked(uiState.userName)} ) {
            Text(text = "REGISTER")
        }
  }
}