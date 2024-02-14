package com.schedule.di

import com.schedule.data.local.MainDB
import com.schedule.data.repositories.PairRepository
import com.schedule.data.repositories.SquadRepository
import com.schedule.data.repositories.SubjectRepository
import com.schedule.data.repositories.TeacherRepository
import com.schedule.data.repositories.UserRepository
import com.schedule.data.repositories.date.SemesterRepository
import com.schedule.data.repositories.date.WeekRepository
import com.schedule.data.repositories.room.AudienceRepository
import com.schedule.data.repositories.room.AudienceTypeRepository
import com.schedule.domain.model.PairEntity
import com.schedule.domain.model.Squad
import com.schedule.domain.model.Subject
import com.schedule.domain.model.Teacher
import com.schedule.domain.model.User
import com.schedule.domain.model.date.Semester
import com.schedule.domain.model.date.Week
import com.schedule.domain.model.room.Audience
import com.schedule.domain.model.room.AudienceType
import com.schedule.domain.repository.IRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideUserRepository(mainDB: MainDB): IRepository<User> = UserRepository(mainDB.userDao)
    @Provides
    @Singleton
    fun provideTeacherRepository(mainDB: MainDB): IRepository<Teacher> = TeacherRepository(mainDB.teacherDao)
    @Provides
    @Singleton
    fun provideSubjectRepository(mainDB: MainDB): IRepository<Subject> = SubjectRepository(mainDB.subjectDao)
    @Provides
    @Singleton
    fun provideSquadRepository(mainDB: MainDB): IRepository<Squad> = SquadRepository(mainDB.groupDao)
    @Provides
    @Singleton
    fun provideAudienceTypeRepository(mainDB: MainDB): IRepository<AudienceType> = AudienceTypeRepository(mainDB.audienceTypeDao)
    @Provides
    @Singleton
    fun provideAudienceRepository(mainDB: MainDB): IRepository<Audience> = AudienceRepository(mainDB.audienceDao)
    @Provides
    @Singleton
    fun provideSemesterRepository(mainDB: MainDB): IRepository<Semester> = SemesterRepository(mainDB.semesterDao)
    @Provides
    @Singleton
    fun provideWeekRepository(mainDB: MainDB): IRepository<Week> = WeekRepository(mainDB.weekDao)
    @Provides
    @Singleton
    fun providePairRepository(mainDB: MainDB): IRepository<PairEntity> = PairRepository(mainDB.pairDao)
}