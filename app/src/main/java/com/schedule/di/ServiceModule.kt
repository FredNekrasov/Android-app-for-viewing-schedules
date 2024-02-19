package com.schedule.di

import com.schedule.data.remote.dtos.PairDto
import com.schedule.data.remote.dtos.SquadDto
import com.schedule.data.remote.dtos.SubjectDto
import com.schedule.data.remote.dtos.TeacherDto
import com.schedule.data.remote.dtos.UserDto
import com.schedule.data.remote.dtos.date.SemesterDto
import com.schedule.data.remote.dtos.date.WeekDto
import com.schedule.data.remote.dtos.room.AudienceDto
import com.schedule.data.remote.dtos.room.AudienceTypeDto
import com.schedule.data.remote.services.IService
import com.schedule.data.remote.services.implementation.IGroupService
import com.schedule.data.remote.services.implementation.IPairService
import com.schedule.data.remote.services.implementation.ISubjectService
import com.schedule.data.remote.services.implementation.ITeacherService
import com.schedule.data.remote.services.implementation.IUserService
import com.schedule.data.remote.services.implementation.date.ISemesterService
import com.schedule.data.remote.services.implementation.date.IWeekService
import com.schedule.data.remote.services.implementation.room.IAudienceService
import com.schedule.data.remote.services.implementation.room.IAudienceTypeService
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val serviceModule = module {
    single<IService<UserDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IUserService::class.java)
    }
    single<IService<TeacherDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(ITeacherService::class.java)
    }
    single<IService<SubjectDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(ISubjectService::class.java)
    }
    single<IService<SquadDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IGroupService::class.java)
    }
    single<IService<AudienceTypeDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IAudienceTypeService::class.java)
    }
    single<IService<AudienceDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IAudienceService::class.java)
    }
    single<IService<SemesterDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(ISemesterService::class.java)
    }
    single<IService<WeekDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IWeekService::class.java)
    }
    single<IService<PairDto>> {
        Retrofit.Builder().baseUrl(IService.BaseUrl)
            .addConverterFactory(MoshiConverterFactory.create()).build()
            .create(IPairService::class.java)
    }
}