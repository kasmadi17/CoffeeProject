package com.latte.auth

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * @author Kasmadi
 * @date 21/11/23
 */
class AutViewModel:ViewModel() {
    private val _autState = MutableStateFlow<AuthState>(AuthState.Loading)
    val autState = _autState.asStateFlow()

    fun auth(token:String){
    }
}