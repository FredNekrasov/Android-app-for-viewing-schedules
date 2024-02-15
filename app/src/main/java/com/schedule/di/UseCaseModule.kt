package com.schedule.di

import com.schedule.domain.model.*
import com.schedule.domain.model.date.Semester
import com.schedule.domain.model.date.Week
import com.schedule.domain.model.room.*
import com.schedule.domain.use_cases.IUseCase
import com.schedule.domain.use_cases.implementation.*
import com.schedule.domain.use_cases.implementation.date.*
import com.schedule.domain.use_cases.implementation.room.*
import com.schedule.domain.use_cases.user.IUserUseCase
import com.schedule.domain.use_cases.user.implementation.UserUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface UseCaseModule {
    @Binds
    @Singleton
    fun bindUserUseCase(userUseCase: UserUseCase): IUserUseCase
    @Binds
    @Singleton
    fun bindTeacherUseCase(teacherUseCase: TeacherUseCase): IUseCase<Teacher>
    @Binds
    @Singleton
    fun bindSubjectUseCase(subjectUseCase: SubjectUseCase): IUseCase<Subject>
    @Binds
    @Singleton
    fun bindGroupUseCase(groupUseCase: SquadUseCase): IUseCase<Squad>
    @Binds
    @Singleton
    fun bindAudienceTypeUseCase(audienceTypeUseCase: AudienceTypeUseCase): IUseCase<AudienceType>
    @Binds
    @Singleton
    fun bindAudienceUseCase(audienceUseCase: AudienceUseCase): IUseCase<Audience>
    @Binds
    @Singleton
    fun bindSemesterUseCase(semesterUseCase: SemesterUseCase): IUseCase<Semester>
    @Binds
    @Singleton
    fun bindWeekUseCase(weekUseCase: WeekUseCase): IUseCase<Week>
    @Binds
    @Singleton
    fun bindPairUseCase(pairUseCase: PairUseCase): IUseCase<PairEntity>

}