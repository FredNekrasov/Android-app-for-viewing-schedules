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
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vmModule = module {
    viewModel { UserVM(get()) }
    viewModel { TeacherVM(get()) }
    viewModel { SubjectVM(get()) }
    viewModel { SquadVM(get()) }
    viewModel { AudienceTypeVM(get()) }
    viewModel { AudienceVM(get()) }
    viewModel { SemesterVM(get()) }
    viewModel { WeekVM(get()) }
    viewModel { PairVM(get()) }
}