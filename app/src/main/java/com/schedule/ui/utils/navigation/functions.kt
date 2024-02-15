package com.schedule.ui.utils.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import com.schedule.ui.strings.*
import com.schedule.ui.utils.ConnectionType

fun information(type: ConnectionType): String {
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
fun getNavItems(): Array<NavItem> {
    return arrayOf(
        NavItem(DataStrings.groupTitle, ScreensRoute.Groups, Icons.Default.Group, Icons.Outlined.Group),
        NavItem(DataStrings.subjectTitle, ScreensRoute.Subjects, Icons.Default.Subtitles, Icons.Outlined.Subtitles),
        NavItem(DataStrings.audienceTypeTitle, ScreensRoute.AudienceTypes, Icons.Default.TypeSpecimen, Icons.Outlined.TypeSpecimen),
        NavItem(DataStrings.audienceTitle, ScreensRoute.Audiences, Icons.Default.MeetingRoom, Icons.Outlined.MeetingRoom),
        NavItem(DataStrings.teacherTitle, ScreensRoute.Teachers, Icons.Default.Person, Icons.Outlined.Person),
        NavItem(DataStrings.semesterTitle, ScreensRoute.Semesters, Icons.Default.AccessTime, Icons.Outlined.AccessTime),
        NavItem(DataStrings.weekTitle, ScreensRoute.Weeks, Icons.Default.NextWeek, Icons.Outlined.NextWeek),
        NavItem(DataStrings.pairTitle, ScreensRoute.Pairs, Icons.Default.PlayLesson, Icons.Outlined.PlayLesson),
        NavItem(DataStrings.dayTitle, ScreensRoute.Days, Icons.Default.Today, Icons.Outlined.Today),
    )
}