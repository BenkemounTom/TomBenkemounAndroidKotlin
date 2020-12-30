package com.example.tombenkemounandroidkotlin.data.repository

import com.example.tombenkemounandroidkotlin.data.local.models.DatabaseDao
import com.example.tombenkemounandroidkotlin.data.local.models.UserLocal

import com.example.tombenkemounandroidkotlin.data.local.models.toData
import com.example.tombenkemounandroidkotlin.data.local.models.toEntity
import com.example.tombenkemounandroidkotlin.domain.entity.User

class UserRepository (
    private val databaseDao: DatabaseDao) {

    suspend fun createUser(user: User) {
        databaseDao.insert(user.toData())
    }
    /*fun createUser(emailUser: String, userPassword: String, verifPassword: String): String{
        when{
            emailUser == "" -> return "NoEmail"
            !emailUser.contains("@") || !emailUser.contains(".") -> return "InvalidEmail"
            userPassword == "" -> return "NoPassword"
        }
        val user = User(emailUser, userPassword)
        databaseDao.insert(user.toData())
        return "Success"
    }*/


    fun getUser(email: String): User? {
        val userLocal: UserLocal? = databaseDao.findByName(email)
        return userLocal?.toEntity()
    }

   /* fun getUser(email: String, password: String): User? {
        val userLocal = databaseDao.findByName(email, password)
        return userLocal?.toEntity()
    }*/
}
