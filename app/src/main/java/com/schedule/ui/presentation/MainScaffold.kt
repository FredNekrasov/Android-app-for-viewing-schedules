package com.schedule.ui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.schedule.R
import com.schedule.ui.utils.FredTopBar
import com.schedule.ui.utils.navigation.ScreensRoute.*
import com.schedule.ui.utils.navigation.getHeaderName
import com.schedule.ui.utils.special_views.ToProfile

@Composable
fun MainScaffold(controller: NavHostController, openDrawer: () -> Unit) {
    val snackbarHostState = remember { SnackbarHostState() }
    val currentRoute = controller.currentBackStackEntryAsState().value?.destination?.route
    val appName = stringResource(R.string.app_name)
    val modifier = Modifier.fillMaxSize()
    Scaffold(
        modifier,
        topBar = { if(currentRoute != Authorization.route && currentRoute != null ) FredTopBar(getHeaderName(controller,appName),openDrawer) },
        snackbarHost = { SnackbarHost(snackbarHostState) },
        floatingActionButton = {
            when(currentRoute){
                null, Authorization.route, Profile.route -> {}
                else -> ToProfile(controller)
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) { padding ->
        MainNavHost(controller,modifier.padding(padding))
    }
}