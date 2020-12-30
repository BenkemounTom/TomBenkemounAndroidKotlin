package com.example.tombenkemounandroidkotlin.presentation.Main

sealed class LoginStatus

data class LoginSuccess(val email : String):LoginStatus()

object LoginError : LoginStatus()
