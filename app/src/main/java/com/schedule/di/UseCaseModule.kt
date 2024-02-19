package com.schedule.di

import com.schedule.domain.model.PairEntity
import com.schedule.domain.model.Squad
import com.schedule.domain.model.Subject
import com.schedule.domain.model.Teacher
import com.schedule.domain.model.date.Semester
import com.schedule.domain.model.date.Week
import com.schedule.domain.model.room.Audience
import com.schedule.domain.model.room.AudienceType
import com.schedule.domain.use_cases.IUseCase
import com.schedule.domain.use_cases.implementation.PairUseCase
import com.schedule.domain.use_cases.implementation.SquadUseCase
import com.schedule.domain.use_cases.implementation.SubjectUseCase
import com.schedule.domain.use_cases.implementation.TeacherUseCase
import com.schedule.domain.use_cases.implementation.date.SemesterUseCase
import com.schedule.domain.use_cases.implementation.date.WeekUseCase
import com.schedule.domain.use_cases.implementation.room.AudienceTypeUseCase
import com.schedule.domain.use_cases.implementation.room.AudienceUseCase
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
    fun bindGroupUseCase(squadUseCase: SquadUseCase): IUseCase<Squad>
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