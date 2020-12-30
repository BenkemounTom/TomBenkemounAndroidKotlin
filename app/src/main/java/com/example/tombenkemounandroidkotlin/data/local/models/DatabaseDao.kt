package com.example.tombenkemounandroidkotlin.data.local.models

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DatabaseDao {
    @Query("SELECT * FROM userlocal")
    fun getAll(): List<UserLocal>

    @Query("SELECT * FROM userlocal WHERE email LIKE :email Limit 1")
    fun findByName(email: String): UserLocal?

    //@Query("SELECT * FROM userlocal WHERE email LIKE :email AND password LIKE :password Limit 1")
    //fun findByName(email: String,password : String): UserLocal?

    @Insert
    fun insert( users: UserLocal)

    @Delete
    fun delete(user: UserLocal)
}