package com.example.tombenkemounandroidkotlin.data.local.models

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tombenkemounandroidkotlin.data.local.models.UserLocal

@Database(entities = arrayOf(
    UserLocal::class
), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDao
}