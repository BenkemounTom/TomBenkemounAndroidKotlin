package com.example.tombenkemounandroidkotlin.injection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ApplicationEsiea : Application() {


    override fun onCreate(){
        super.onCreate()
        // start Koin!
        startKoin {
            // Android context
            androidContext(this@ApplicationEsiea)
            // modules
            modules(presentationModule, domainModule, dataModule)
        }
    }
}
