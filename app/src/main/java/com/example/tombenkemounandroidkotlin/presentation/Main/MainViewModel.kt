package com.example.tombenkemounandroidkotlin.presentation.Main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tombenkemounandroidkotlin.domain.UseCase.CreateUser
import com.example.tombenkemounandroidkotlin.domain.UseCase.GetUserUseCase
import com.example.tombenkemounandroidkotlin.domain.entity.User
import kotlinx.coroutines.*

class MainViewModel(
    private val CreateUser : CreateUser,
    private val getUserUseCase: GetUserUseCase
): ViewModel(){


    val loginLiveData: MutableLiveData<LoginStatus> = MutableLiveData()


    fun onClickLogin(emailUser: String ) {
        viewModelScope.launch(Dispatchers.IO) {
           // CreateUser.invoke(User(eamilUser))
            getUserUseCase.invoke(emailUser)
            //CreateUser.invoke(User("test"))
           // delay(1000)
            val user : User? = getUserUseCase.invoke(emailUser)
            //val debug = "debug"
           val loginStatus = if(user != null){
            LoginSuccess(user.email)
            } else {
                LoginError
            }
        withContext(Dispatchers.Main){
             loginLiveData.value = loginStatus
                                    }

        }
   //     counter.value = (counter.value ?:0) + 1
    }

}