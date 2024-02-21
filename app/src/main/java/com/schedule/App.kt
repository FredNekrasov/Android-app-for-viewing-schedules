package com.schedule

import android.app.Application
import com.schedule.di.serviceModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.schedule.di.repositoryModule
import com.schedule.di.useCaseModule
import com.schedule.di.vmModule
import org.koin.android.ext.koin.androidLogger

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(serviceModule, repositoryModule, useCaseModule, vmModule)
        }
    }
}