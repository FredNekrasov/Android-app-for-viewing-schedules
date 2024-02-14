package com.schedule.di

import android.app.Application
import androidx.room.Room
import com.schedule.data.local.MainDB
import com.schedule.data.remote.service.IService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideMainDB(app: Application): MainDB = Room.databaseBuilder(app, MainDB::class.java, MainDB.DB_NAME)
        .allowMainThreadQueries()
        .build()

    @Provides
    @Singleton
    fun provideService(): IService = Retrofit.Builder()
        .baseUrl(IService.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(IService::class.java)
}