package com.schedule.di

import com.schedule.domain.model.*
import com.schedule.domain.model.date.*
import com.schedule.domain.model.room.*
import com.schedule.domain.use_cases.IUseCase
import com.schedule.domain.use_cases.implementation.*
import com.schedule.domain.use_cases.implementation.date.*
import com.schedule.domain.use_cases.implementation.room.*
import com.schedule.domain.use_cases.user.IUserUseCase
import com.schedule.domain.use_cases.user.implementation.UserUseCase
import com.schedule.ui.strings.KoinDIQualifierStrings as koinStr
import org.koin.core.qualifier.named
import org.koin.dsl.module

val useCaseModule = module {
    factory<IUserUseCase>(qualifier = named(koinStr.userEntity + koinStr.useCase)) {
        UserUseCase(get(qualifier = named(koinStr.userEntity + koinStr.repository)))
    }
    factory<IUseCase<Teacher>>(qualifier = named(koinStr.teacherEntity + koinStr.useCase)) {
        TeacherUseCase(get(qualifier = named(koinStr.teacherEntity + koinStr.repository)))
    }
    factory<IUseCase<Subject>>(qualifier = named(koinStr.subjectEntity + koinStr.useCase)) {
        SubjectUseCase(get(qualifier = named(koinStr.subjectEntity + koinStr.repository)))
    }
    factory<IUseCase<Squad>>(qualifier = named(koinStr.squadEntity + koinStr.useCase)) {
        SquadUseCase(get(qualifier = named(koinStr.squadEntity + koinStr.repository)))
    }
    factory<IUseCase<AudienceType>>(qualifier = named(koinStr.audienceTypeEntity + koinStr.useCase)) {
        AudienceTypeUseCase(get(qualifier = named(koinStr.audienceTypeEntity + koinStr.repository)))
    }
    factory<IUseCase<Audience>>(qualifier = named(koinStr.audienceEntity + koinStr.useCase)) {
        AudienceUseCase(get(qualifier = named(koinStr.audienceEntity + koinStr.repository)))
    }
    factory<IUseCase<Semester>>(qualifier = named(koinStr.semesterEntity + koinStr.useCase)) {
        SemesterUseCase(get(qualifier = named(koinStr.semesterEntity + koinStr.repository)))
    }
    factory<IUseCase<Week>>(qualifier = named(koinStr.weekEntity + koinStr.useCase)) {
        WeekUseCase(get(qualifier = named(koinStr.weekEntity + koinStr.repository)))
    }
    factory<IUseCase<PairEntity>>(qualifier = named(koinStr.pairEntity + koinStr.useCase)) {
        PairUseCase(get(qualifier = named(koinStr.pairEntity + koinStr.repository)))
    }
    factory<IUseCase<Schedule>>(qualifier = named(koinStr.scheduleEntity + koinStr.useCase)) {
        ScheduleUseCase(get(qualifier = named(koinStr.scheduleEntity + koinStr.repository)))
    }
}