package com.schedule.di

import com.schedule.data.remote.services.*
import com.schedule.data.remote.services.date.*
import com.schedule.data.remote.services.room.*
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val serviceModule = module {
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IUserService::class.java)
    }
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(ITeacherService::class.java)
    }
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(ISubjectService::class.java)
    }
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IGroupService::class.java)
    }
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IAudienceTypeService::class.java)
    }
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IAudienceService::class.java)
    }
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(ISemesterService::class.java)
    }
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IWeekService::class.java)
    }
    single {
        Retrofit.Builder().baseUrl(IUserService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IPairService::class.java)
    }
}