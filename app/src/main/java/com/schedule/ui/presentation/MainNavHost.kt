package com.schedule.ui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.schedule.ui.presentation.data_list.date.semester.SemesterScreen
import com.schedule.ui.presentation.data_list.date.semester.view_model.SemesterVM
import com.schedule.ui.presentation.data_list.date.week.WeekScreen
import com.schedule.ui.presentation.data_list.date.week.view_model.WeekVM
import com.schedule.ui.presentation.data_list.pair.PairScreen
import com.schedule.ui.presentation.data_list.pair.view_model.PairVM
import com.schedule.ui.presentation.data_list.room.audience.AudienceScreen
import com.schedule.ui.presentation.data_list.room.audience.view_model.AudienceVM
import com.schedule.ui.presentation.data_list.room.audience_type.AudienceTypeScreen
import com.schedule.ui.presentation.data_list.room.audience_type.view_model.AudienceTypeVM
import com.schedule.ui.presentation.data_list.squad.GroupScreen
import com.schedule.ui.presentation.data_list.squad.view_model.SquadVM
import com.schedule.ui.presentation.data_list.subject.SubjectScreen
import com.schedule.ui.presentation.data_list.subject.view_model.SubjectVM
import com.schedule.ui.presentation.data_list.teacher.TeacherScreen
import com.schedule.ui.presentation.data_list.teacher.view_model.TeacherVM
import com.schedule.ui.presentation.data_list.user.Profile
import com.schedule.ui.presentation.data_list.user.view_model.UserVM
import com.schedule.ui.utils.navigation.ScreensRoute.*
import org.koin.androidx.compose.koinViewModel

@Composable
fun MainNavHost(
    controller: NavHostController,
    modifier: Modifier,
    userVM: UserVM = koinViewModel(),
    teacherVM: TeacherVM = koinViewModel(),
    subjectVM: SubjectVM = koinViewModel(),
    groupVM: SquadVM = koinViewModel(),
    audienceTypeVM: AudienceTypeVM = koinViewModel(),
    audienceVM: AudienceVM = koinViewModel(),
    semesterVM: SemesterVM = koinViewModel(),
    weekVM: WeekVM = koinViewModel(),
    pairVM: PairVM = koinViewModel()
) {
    Column(modifier,Arrangement.Center,Alignment.CenterHorizontally) {
        NavHost(controller, Authorization.route){
            composable(Authorization.route){ Authorization(controller,userVM) }
            composable(Profile.route){ Profile(userVM) }
            composable(Pairs.route){ PairScreen(pairVM) }
            composable(Teachers.route){ TeacherScreen(teacherVM) }
            composable(Subjects.route){ SubjectScreen(subjectVM) }
            composable(Groups.route){ GroupScreen(groupVM) }
            composable(AudienceTypes.route){ AudienceTypeScreen(audienceTypeVM) }
            composable(Audiences.route){ AudienceScreen(audienceVM) }
            composable(Semesters.route){ SemesterScreen(semesterVM) }
            composable(Weeks.route){ WeekScreen(weekVM) }
        }
    }
}