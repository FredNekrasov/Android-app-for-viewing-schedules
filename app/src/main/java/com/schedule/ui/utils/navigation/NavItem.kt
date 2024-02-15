package com.schedule.ui.utils.navigation

import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(
    val title: String,
    val route: ScreensRoute,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
)