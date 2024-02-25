package com.schedule.di

import com.schedule.data.remote.services.*
import com.schedule.data.remote.services.date.*
import com.schedule.data.remote.services.room.*
import org.koin.core.qualifier.named
import org.koin.dsl.module
import com.schedule.ui.strings.KoinDIQualifierStrings as koinStr

val serviceModule = module {
    single(qualifier = named(koinStr.userEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(IUserService::class.java)
    }
    single(qualifier = named(koinStr.teacherEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(ITeacherService::class.java)
    }
    single(qualifier = named(koinStr.subjectEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(ISubjectService::class.java)
    }
    single(qualifier = named(koinStr.squadEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(IGroupService::class.java)
    }
    single(qualifier = named(koinStr.audienceTypeEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(IAudienceTypeService::class.java)
    }
    single(qualifier = named(koinStr.audienceEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(IAudienceService::class.java)
    }
    single(qualifier = named(koinStr.semesterEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(ISemesterService::class.java)
    }
    single(qualifier = named(koinStr.weekEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(IWeekService::class.java)
    }
    single(qualifier = named(koinStr.pairEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(IPairService::class.java)
    }
    single(qualifier = named(koinStr.scheduleEntity + koinStr.service),createdAtStart = true) {
        IUserService.build().create(ScheduleService::class.java)
    }
}