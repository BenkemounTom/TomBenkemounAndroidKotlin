package com.example.tombenkemounandroidkotlin.domain.UseCase

import com.example.tombenkemounandroidkotlin.data.repository.UserRepository
import com.example.tombenkemounandroidkotlin.domain.entity.User

class GetUserUseCase(
    private val userRepository: UserRepository
) {

    suspend fun invoke(email: String) : User?{
       return userRepository.getUser(email)
    }
 /*fun invoke(email: String, password: String): User? {
                return userRepository.getUser(email, password)
           }*/
}