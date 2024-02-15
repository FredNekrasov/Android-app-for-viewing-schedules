package com.schedule.ui.utils.navigation

import com.schedule.ui.strings.DataStrings
import com.schedule.ui.strings.Strings

sealed class ScreensRoute(val route: String) {
    data object Authorization : ScreensRoute(Strings.authorization)
    data object Profile : ScreensRoute(DataStrings.profile)
    data object Teachers : ScreensRoute(DataStrings.teacherTitle)
    data object Subjects : ScreensRoute(DataStrings.subjectTitle)
    data object Groups : ScreensRoute(DataStrings.groupTitle)
    data object AudienceTypes : ScreensRoute(DataStrings.audienceTypeTitle)
    data object Audiences : ScreensRoute(DataStrings.audienceTitle)
    data object Pairs : ScreensRoute(DataStrings.pairTitle)
    data object Semesters : ScreensRoute(DataStrings.semesterTitle)
    data object Weeks : ScreensRoute(DataStrings.weekTitle)
    data object Days : ScreensRoute(DataStrings.dayTitle)
}