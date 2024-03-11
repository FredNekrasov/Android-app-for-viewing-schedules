package com.schedule.ui.utils.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.navigation.NavController
import com.schedule.ui.strings.*
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.navigation.ScreensRoute.*

fun internetStateInfo(type: ConnectionType): String {
    return when (type) {
        ConnectionType.SUCCESS -> InternetStrings.success
        ConnectionType.NO_INTERNET -> InternetStrings.noInternet
        ConnectionType.NO_DATA -> InternetStrings.noData
        ConnectionType.LOADING -> InternetStrings.loading
        ConnectionType.UNKNOWN -> InternetStrings.unknown
        ConnectionType.CONNECTION_ERROR -> InternetStrings.connectionError
        ConnectionType.JSON_CONVERSION_ERROR -> InternetStrings.jsonConversionError
    }
}
fun getHeaderName(controller: NavController,str: String): String {
    return when (controller.currentDestination?.route) {
        Groups.route -> DataStrings.groupTitle
        Subjects.route -> DataStrings.subjectTitle
        AudienceTypes.route -> DataStrings.audienceTypeTitle
        Audiences.route -> DataStrings.audienceTitle
        Teachers.route -> DataStrings.teacherTitle
        Semesters.route -> DataStrings.semesterTitle
        Weeks.route -> DataStrings.weekTitle
        Pairs.route -> DataStrings.pairTitle
        Days.route -> DataStrings.dayTitle
        Profile.route -> DataStrings.profile
        else -> str
    }
}
fun getNavItems(): Array<NavItem> {
    return arrayOf(
        NavItem(DataStrings.groupTitle, Groups, Icons.Default.Group, Icons.Outlined.Group),
        NavItem(DataStrings.subjectTitle, Subjects, Icons.Default.Subtitles, Icons.Outlined.Subtitles),
        NavItem(DataStrings.audienceTypeTitle, AudienceTypes, Icons.Default.TypeSpecimen, Icons.Outlined.TypeSpecimen),
        NavItem(DataStrings.audienceTitle, Audiences, Icons.Default.MeetingRoom, Icons.Outlined.MeetingRoom),
        NavItem(DataStrings.teacherTitle, Teachers, Icons.Default.Person, Icons.Outlined.Person),
        NavItem(DataStrings.semesterTitle, Semesters, Icons.Default.AccessTime, Icons.Outlined.AccessTime),
        NavItem(DataStrings.weekTitle, Weeks, Icons.Default.CalendarViewWeek, Icons.Outlined.CalendarViewWeek),
        NavItem(DataStrings.pairTitle, Pairs, Icons.Default.PlayLesson, Icons.Outlined.PlayLesson),
        NavItem(DataStrings.dayTitle, Days, Icons.Default.Today, Icons.Outlined.Today),
    )
}