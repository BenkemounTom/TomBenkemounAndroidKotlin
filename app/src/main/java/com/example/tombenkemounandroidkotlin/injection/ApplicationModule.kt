package com.example.tombenkemounandroidkotlin.injection

import android.content.Context
import androidx.room.Room
import com.example.tombenkemounandroidkotlin.data.local.models.AppDatabase
import com.example.tombenkemounandroidkotlin.data.local.models.DatabaseDao
import com.example.tombenkemounandroidkotlin.data.repository.UserRepository
import com.example.tombenkemounandroidkotlin.domain.UseCase.CreateUser
import com.example.tombenkemounandroidkotlin.domain.UseCase.GetUserUseCase
import com.example.tombenkemounandroidkotlin.presentation.Main.MainViewModel
import com.example.tombenkemounandroidkotlin.presentation.Main.ViewModelList
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel(get(), get())
    }
    factory { ViewModelList() }
}

val domainModule = module {
    factory { CreateUser(get()) }
    factory { GetUserUseCase(get())
    }

}

val dataModule = module {
    single { UserRepository(get()) }
    single { createDatabase(androidContext()) }
}

fun createDatabase(context: Context): DatabaseDao {
    val appDatabase: AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java, "database-name"
    ).build()
    return appDatabase.databaseDao()
}



