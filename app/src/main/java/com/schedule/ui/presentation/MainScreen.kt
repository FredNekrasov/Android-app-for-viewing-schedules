package com.schedule.ui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.DrawerValue.Closed
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.schedule.ui.utils.navigation.NavItem
import kotlinx.coroutines.launch

@Composable
fun MainScreen(array: Array<NavItem>) {
    val controller = rememberNavController()
    val drawerState = rememberDrawerState(Closed)
    val scope = rememberCoroutineScope()
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
                        icon = { Icon(if (index == selectedItemIndex) item.selectedIcon else item.unselectedIcon, item.title) },
                        shape = MaterialTheme.shapes.medium
                    )
                }
            }
        }, drawerState = drawerState) {
        MainScaffold(controller) { scope.launch { drawerState.open() } }
    }
}