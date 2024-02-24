package com.schedule.ui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import com.schedule.ui.presentation.data_list.date.semester.SemesterScreen
import com.schedule.ui.presentation.data_list.date.week.WeekScreen
import com.schedule.ui.presentation.data_list.pair.PairScreen
import com.schedule.ui.presentation.data_list.room.audience.AudienceScreen
import com.schedule.ui.presentation.data_list.room.audience_type.AudienceTypeScreen
import com.schedule.ui.presentation.data_list.squad.GroupScreen
import com.schedule.ui.presentation.data_list.subject.SubjectScreen
import com.schedule.ui.presentation.data_list.teacher.TeacherScreen
import com.schedule.ui.presentation.data_list.user.Profile
import com.schedule.ui.presentation.data_list.user.view_model.UserVM
import com.schedule.ui.utils.navigation.ScreensRoute.*
import org.koin.androidx.compose.koinViewModel

@Composable
fun MainNavHost(
    controller: NavHostController,
    modifier: Modifier,
    userVM: UserVM = koinViewModel()
) {
    Column(modifier,Arrangement.Center,Alignment.CenterHorizontally) {
        NavHost(controller, Authorization.route){
            composable(Authorization.route){ Authorization(controller,userVM) }
            composable(Profile.route){ Profile(userVM) }
            composable(Pairs.route){ PairScreen() }
            composable(Teachers.route){ TeacherScreen() }
            composable(Subjects.route){ SubjectScreen() }
            composable(Groups.route){ GroupScreen() }
            composable(AudienceTypes.route){ AudienceTypeScreen() }
            composable(Audiences.route){ AudienceScreen() }
            composable(Semesters.route){ SemesterScreen() }
            composable(Weeks.route){ WeekScreen() }
        }
    }
}