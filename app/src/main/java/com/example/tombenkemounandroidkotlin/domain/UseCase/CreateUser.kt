package com.example.tombenkemounandroidkotlin.domain.UseCase

import com.example.tombenkemounandroidkotlin.data.repository.UserRepository
import com.example.tombenkemounandroidkotlin.domain.entity.User

class CreateUser(
    private val userRepository: UserRepository) {

    suspend fun invoke(user: User) {
        userRepository.createUser(user)


        /* fun invoke(emailUser: String, userPassword: String, verifPassword: String): String {
            return userRepository.createUser(emailUser, userPassword, verifPassword)
        }*/
    }
}