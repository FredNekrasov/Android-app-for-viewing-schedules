package com.schedule.ui.utils.special_views

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.schedule.ui.strings.DataStrings
import com.schedule.ui.utils.navigation.ScreensRoute

@Composable
fun ToProfile(controller: NavController) {
    FloatingActionButton({ controller.navigate(ScreensRoute.Profile.route) }) { Icon(Icons.Default.AccountCircle,DataStrings.profile) }
}