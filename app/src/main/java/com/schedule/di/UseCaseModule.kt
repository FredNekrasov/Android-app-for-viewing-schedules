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
import org.koin.dsl.module

val useCaseModule = module {
    factory<IUseCase<Teacher>> { TeacherUseCase(get()) }
    factory<IUseCase<Subject>> { SubjectUseCase(get()) }
    factory<IUseCase<Squad>> { SquadUseCase(get()) }
    factory<IUseCase<AudienceType>> { AudienceTypeUseCase(get()) }
    factory<IUseCase<Audience>> { AudienceUseCase(get()) }
    factory<IUseCase<Semester>> { SemesterUseCase(get()) }
    factory<IUseCase<Week>> { WeekUseCase(get()) }
    factory<IUseCase<PairEntity>> { PairUseCase(get()) }
    factory<IUserUseCase> { UserUseCase(get()) }
}