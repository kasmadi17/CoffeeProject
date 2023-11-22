package com.latte.auth

/**
 * @author Kasmadi
 * @date 21/11/23
 */
sealed interface AuthState{
    data object Success:AuthState
    data object Loading:AuthState
    data class Error(val msg:String?):AuthState
}

