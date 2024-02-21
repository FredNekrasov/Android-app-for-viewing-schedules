package com.schedule

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue.Closed
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.schedule.ui.presentation.Authorization
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
import com.schedule.ui.theme.ScheduleAppTheme
import com.schedule.ui.utils.navigation.ScreensRoute
import com.schedule.ui.utils.navigation.getNavItems
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.getViewModel

class MainActivity : ComponentActivity() {
    private val array = getNavItems()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val teacherVM = getViewModel<TeacherVM>()
        val subjectVM = getViewModel<SubjectVM>()
        val groupVM = getViewModel<SquadVM>()
        val audienceTypeVM = getViewModel<AudienceTypeVM>()
        val audienceVM = getViewModel<AudienceVM>()
        val semesterVM = getViewModel<SemesterVM>()
        val weekVM = getViewModel<WeekVM>()
        val pairVM = getViewModel<PairVM>()
        val userVM = getViewModel<UserVM>()
        setContent {
            ScheduleAppTheme {
                Surface(Modifier.fillMaxSize(),color = MaterialTheme.colorScheme.background) {
                    val controller = rememberNavController()
                    val drawerState = rememberDrawerState(Closed)
                    val scope = rememberCoroutineScope()
                    val snackbarHostState = remember { SnackbarHostState() }
                    var selectedItemIndex by rememberSaveable { mutableIntStateOf(0) }
                    ModalNavigationDrawer(
                        drawerContent = {
                            ModalDrawerSheet {
                                Spacer(Modifier.height(16.dp))
                                array.forEachIndexed { index, item ->
                                    NavigationDrawerItem(
                                        label = { Text(item.title) },
                                        selected = index == selectedItemIndex,
                                        onClick = {
                                            controller.navigate(item.route.route)
                                            selectedItemIndex = index
                                            scope.launch { drawerState.close() }
                                        },Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
                                        icon = {
                                            Icon(if (index == selectedItemIndex) item.selectedIcon else item.unselectedIcon, item.title)
                                        },
                                        shape = MaterialTheme.shapes.medium
                                    )
                                }
                            }
                        }, drawerState = drawerState) {
                        NavHost(controller, ScreensRoute.Authorization.route){
                            composable(ScreensRoute.Authorization.route){ Authorization(controller, snackbarHostState, scope, userVM) }
                            composable(ScreensRoute.Profile.route){ Profile({ scope.launch { drawerState.open() } }, userVM) }
                            composable(ScreensRoute.Teachers.route){ TeacherScreen({ scope.launch { drawerState.open() } }, controller, snackbarHostState, scope, teacherVM) }
                            composable(ScreensRoute.Subjects.route){ SubjectScreen({ scope.launch { drawerState.open() } }, controller, snackbarHostState, scope, subjectVM) }
                            composable(ScreensRoute.AudienceTypes.route){ AudienceTypeScreen({ scope.launch { drawerState.open() } }, controller, snackbarHostState, scope, audienceTypeVM) }
                            composable(ScreensRoute.Audiences.route){ AudienceScreen({ scope.launch { drawerState.open() } }, controller, snackbarHostState, scope, audienceVM) }
                            composable(ScreensRoute.Semesters.route){ SemesterScreen({ scope.launch { drawerState.open() } }, controller, snackbarHostState, scope, semesterVM) }
                            composable(ScreensRoute.Weeks.route){ WeekScreen({ scope.launch { drawerState.open() } }, controller, snackbarHostState, scope, weekVM) }
                            composable(ScreensRoute.Groups.route){ GroupScreen({ scope.launch { drawerState.open() } }, controller, snackbarHostState, scope, groupVM) }
                            composable(ScreensRoute.Pairs.route){ PairScreen({ scope.launch { drawerState.open() } }, controller, snackbarHostState, scope, pairVM) }
                        }
                    }
                }
            }
        }
    }
}