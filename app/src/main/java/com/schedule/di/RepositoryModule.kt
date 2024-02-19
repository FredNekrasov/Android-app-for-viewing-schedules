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
import com.schedule.data.repositories.Repository
import com.schedule.domain.repository.IRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {
    @Binds
    @Singleton
    fun bindTeacherRepository(repository: Repository<TeacherDto>): IRepository<TeacherDto>
    @Binds
    @Singleton
    fun bindSubjectRepository(repository: Repository<SubjectDto>): IRepository<SubjectDto>
    @Binds
    @Singleton
    fun bindGroupRepository(repository: Repository<SquadDto>): IRepository<SquadDto>
    @Binds
    @Singleton
    fun bindAudienceTypeRepository(repository: Repository<AudienceTypeDto>): IRepository<AudienceTypeDto>
    @Binds
    @Singleton
    fun bindAudienceRepository(repository: Repository<AudienceDto>): IRepository<AudienceDto>
    @Binds
    @Singleton
    fun bindSemesterRepository(repository: Repository<SemesterDto>): IRepository<SemesterDto>
    @Binds
    @Singleton
    fun bindWeekRepository(repository: Repository<WeekDto>): IRepository<WeekDto>
    @Binds
    @Singleton
    fun bindUserRepository(repository: Repository<UserDto>): IRepository<UserDto>
    @Binds
    @Singleton
    fun bindPairRepository(repository: Repository<PairDto>): IRepository<PairDto>
}