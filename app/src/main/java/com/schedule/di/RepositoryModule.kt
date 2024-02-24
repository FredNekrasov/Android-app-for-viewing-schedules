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
import com.schedule.data.repositories.GroupRepository
import com.schedule.data.repositories.PairRepository
import com.schedule.data.repositories.SubjectRepository
import com.schedule.data.repositories.TeacherRepository
import com.schedule.data.repositories.UserRepository
import com.schedule.data.repositories.date.SemesterRepository
import com.schedule.data.repositories.date.WeekRepository
import com.schedule.data.repositories.room.AudienceRepository
import com.schedule.data.repositories.room.AudienceTypeRepository
import com.schedule.domain.repository.IRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<IRepository<UserDto>> { UserRepository(get()) }
    single<IRepository<TeacherDto>> { TeacherRepository(get()) }
    single<IRepository<SubjectDto>> { SubjectRepository(get()) }
    single<IRepository<SquadDto>> { GroupRepository(get()) }
    single<IRepository<AudienceTypeDto>> { AudienceTypeRepository(get()) }
    single<IRepository<AudienceDto>> { AudienceRepository(get()) }
    single<IRepository<SemesterDto>> { SemesterRepository(get()) }
    single<IRepository<WeekDto>> { WeekRepository(get()) }
    single<IRepository<PairDto>> { PairRepository(get()) }
}