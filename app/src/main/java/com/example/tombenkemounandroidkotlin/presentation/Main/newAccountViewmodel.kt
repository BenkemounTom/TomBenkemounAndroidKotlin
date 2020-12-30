package com.example.tombenkemounandroidkotlin.presentation.Main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tombenkemounandroidkotlin.domain.UseCase.CreateUser
import com.example.tombenkemounandroidkotlin.domain.entity.User
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
/*
class newAccountViewmodel (
   private val createUserUse: CreateUser
    ): ViewModel()
    {
        val createLiveData: MutableLiveData<CreateStatus> = MutableLiveData()

        fun onClickedCreate(emailUser: String, userPassword: String, verifPassword: String) {
            val user = User(emailUser, userPassword)
            viewModelScope.launch(Dispatchers.IO) {
                val create = createUserUse.invoke(emailUser, userPassword, verifPassword)
                val createStatus = when {
                    create.equals("NoEmail") -> NoEmail
                    create.equals("InvalidEmail") -> InvalidEmail
                    create.equals("NoPassword") -> NoPassword
                    else -> UnkownError
                }

                withContext(Dispatchers.Main) {
                    createLiveData.value = createStatus
                }
            }
        }


    */


