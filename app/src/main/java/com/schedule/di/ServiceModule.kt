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
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ServiceComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ServiceComponent::class)
object ServiceModule {
    @Provides
    @Singleton
    fun provideUserService(): IService<UserDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(IUserService::class.java)
    @Provides
    @Singleton
    fun provideTeacherService(): IService<TeacherDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(ITeacherService::class.java)
    @Provides
    @Singleton
    fun provideSubjectService(): IService<SubjectDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(ISubjectService::class.java)
    @Provides
    @Singleton
    fun provideGroupService(): IService<SquadDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(IGroupService::class.java)
    @Provides
    @Singleton
    fun provideAudienceTypeService(): IService<AudienceTypeDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(IAudienceTypeService::class.java)
    @Provides
    @Singleton
    fun provideAudienceService(): IService<AudienceDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(IAudienceService::class.java)
    @Provides
    @Singleton
    fun provideSemesterService(): IService<SemesterDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(ISemesterService::class.java)
    @Provides
    @Singleton
    fun provideWeekService(): IService<WeekDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(IWeekService::class.java)
    @Provides
    @Singleton
    fun providePairService(): IService<PairDto> = Retrofit.Builder().baseUrl(IService.BaseUrl)
        .addConverterFactory(MoshiConverterFactory.create()).build().create(IPairService::class.java)
}