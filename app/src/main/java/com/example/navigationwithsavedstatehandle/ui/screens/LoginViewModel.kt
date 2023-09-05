package com.example.navigationwithsavedstatehandle.ui.screens

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {

    var loginUiState = MutableStateFlow(LoginUiState())
    private set

    fun setName(name :String){
        loginUiState.update { currentState->
            currentState.copy(userName = name)
        }
    }

//    fun setPass(Pass :String){
//        loginUiState.update { currentState->
//            currentState.copy(passWord = Pass)
//        }
//    }

}



data class LoginUiState( val userName :String="", val passWord :String="")