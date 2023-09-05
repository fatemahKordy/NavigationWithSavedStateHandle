package com.example.navigationwithsavedstatehandle.ui.screens

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(private val savedStateHandle: SavedStateHandle) :
    ViewModel() {

    var profileUiState = MutableStateFlow("")
        private set

    //receive the value of argument name
    val name: String = checkNotNull(savedStateHandle["name"])

    init {
        sayHello()
    }

    private fun sayHello() {
        profileUiState.update { name }

    }
}