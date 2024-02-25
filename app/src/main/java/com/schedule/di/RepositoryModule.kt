package com.schedule.di

import com.schedule.data.remote.dtos.PairDto
import com.schedule.data.remote.dtos.SquadDto
import com.schedule.data.remote.dtos.SubjectDto
import com.schedule.data.remote.dtos.TeacherDto
import com.schedule.data.remote.dtos.UserDto
import com.schedule.data.remote.dtos.date.ScheduleDto
import com.schedule.data.remote.dtos.date.SemesterDto
import com.schedule.data.remote.dtos.date.WeekDto
import com.schedule.data.remote.dtos.room.AudienceDto
import com.schedule.data.remote.dtos.room.AudienceTypeDto
import com.schedule.data.repositories.GroupRepository
import com.schedule.data.repositories.PairRepository
import com.schedule.data.repositories.SubjectRepository
import com.schedule.data.repositories.TeacherRepository
import com.schedule.data.repositories.UserRepository
import com.schedule.data.repositories.date.ScheduleRepository
import com.schedule.data.repositories.date.SemesterRepository
import com.schedule.data.repositories.date.WeekRepository
import com.schedule.data.repositories.room.AudienceRepository
import com.schedule.data.repositories.room.AudienceTypeRepository
import com.schedule.domain.repository.IRepository
import com.schedule.ui.strings.KoinDIQualifierStrings as koinStr
import org.koin.core.qualifier.named
import org.koin.dsl.module

val repositoryModule = module {
    single<IRepository<UserDto>>(qualifier = named(koinStr.userEntity + koinStr.repository)) {
        UserRepository(get(qualifier = named(koinStr.userEntity + koinStr.service)))
    }
    single<IRepository<TeacherDto>>(qualifier = named(koinStr.teacherEntity + koinStr.repository)) {
        TeacherRepository(get(qualifier = named(koinStr.teacherEntity + koinStr.service)))
    }
    single<IRepository<SubjectDto>>(qualifier = named(koinStr.subjectEntity + koinStr.repository)) {
        SubjectRepository(get(qualifier = named(koinStr.subjectEntity + koinStr.service)))
    }
    single<IRepository<SquadDto>>(qualifier = named(koinStr.squadEntity + koinStr.repository)) {
        GroupRepository(get(qualifier = named(koinStr.squadEntity + koinStr.service)))
    }
    single<IRepository<AudienceTypeDto>>(qualifier = named(koinStr.audienceTypeEntity + koinStr.repository)) {
        AudienceTypeRepository(get(qualifier = named(koinStr.audienceTypeEntity + koinStr.service)))
    }
    single<IRepository<AudienceDto>>(qualifier = named(koinStr.audienceEntity + koinStr.repository)) {
        AudienceRepository(get(qualifier = named(koinStr.audienceEntity + koinStr.service)))
    }
    single<IRepository<SemesterDto>>(qualifier = named(koinStr.semesterEntity + koinStr.repository)) {
        SemesterRepository(get(qualifier = named(koinStr.semesterEntity + koinStr.service)))
    }
    single<IRepository<WeekDto>>(qualifier = named(koinStr.weekEntity + koinStr.repository)) {
        WeekRepository(get(qualifier = named(koinStr.weekEntity + koinStr.service)))
    }
    single<IRepository<PairDto>>(qualifier = named(koinStr.pairEntity + koinStr.repository)) {
        PairRepository(get(qualifier = named(koinStr.pairEntity + koinStr.service)))
    }
    single<IRepository<ScheduleDto>>(qualifier = named(koinStr.scheduleEntity + koinStr.repository)) {
        ScheduleRepository(get(qualifier = named(koinStr.scheduleEntity + koinStr.service)))
    }
}