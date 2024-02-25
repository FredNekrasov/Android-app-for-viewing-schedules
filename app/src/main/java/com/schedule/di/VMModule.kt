package com.schedule.di

import com.schedule.ui.presentation.data_list.date.semester.view_model.SemesterVM
import com.schedule.ui.presentation.data_list.date.week.view_model.WeekVM
import com.schedule.ui.presentation.data_list.pair.view_model.PairVM
import com.schedule.ui.presentation.data_list.room.audience.view_model.AudienceVM
import com.schedule.ui.presentation.data_list.room.audience_type.view_model.AudienceTypeVM
import com.schedule.ui.presentation.data_list.squad.view_model.SquadVM
import com.schedule.ui.presentation.data_list.subject.view_model.SubjectVM
import com.schedule.ui.presentation.data_list.teacher.view_model.TeacherVM
import com.schedule.ui.presentation.data_list.user.view_model.UserVM
import com.schedule.ui.strings.KoinDIQualifierStrings as koinStr
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.qualifier.named
import org.koin.dsl.module

val vmModule = module {
    viewModel(qualifier = named(koinStr.userEntity + koinStr.vm)) { UserVM(get(qualifier = named(koinStr.userEntity + koinStr.useCase))) }
    viewModel(qualifier = named(koinStr.teacherEntity + koinStr.vm)) { TeacherVM(get(qualifier = named(koinStr.teacherEntity + koinStr.useCase))) }
    viewModel(qualifier = named(koinStr.subjectEntity + koinStr.vm)) { SubjectVM(get(qualifier = named(koinStr.subjectEntity + koinStr.useCase))) }
    viewModel(qualifier = named(koinStr.squadEntity + koinStr.vm)) { SquadVM(get(qualifier = named(koinStr.squadEntity + koinStr.useCase))) }
    viewModel(qualifier = named(koinStr.audienceTypeEntity + koinStr.vm)) { AudienceTypeVM(get(qualifier = named(koinStr.audienceTypeEntity + koinStr.useCase))) }
    viewModel(qualifier = named(koinStr.audienceEntity + koinStr.vm)) { AudienceVM(get(qualifier = named(koinStr.audienceEntity + koinStr.useCase))) }
    viewModel(qualifier = named(koinStr.semesterEntity + koinStr.vm)) { SemesterVM(get(qualifier = named(koinStr.semesterEntity + koinStr.useCase))) }
    viewModel(qualifier = named(koinStr.weekEntity + koinStr.vm)) { WeekVM(get(qualifier = named(koinStr.weekEntity + koinStr.useCase))) }
    viewModel(qualifier = named(koinStr.pairEntity + koinStr.vm)) { PairVM(get(qualifier = named(koinStr.pairEntity + koinStr.useCase))) }
}