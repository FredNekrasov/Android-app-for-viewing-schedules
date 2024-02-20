package com.schedule.ui.presentation.data_list.squad

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.schedule.ui.presentation.data_list.squad.view_model.SquadVM
import com.schedule.ui.strings.DataStrings
import com.schedule.ui.strings.Strings
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.FredSearchBar
import com.schedule.ui.utils.FredTopBar
import com.schedule.ui.utils.navigation.information
import com.schedule.ui.utils.special_views.ToProfile
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun GroupScreen(
    function: () -> Unit,
    controller: NavController,
    snackbarHostState: SnackbarHostState,
    scope: CoroutineScope,
    vm: SquadVM
) {
    val state = vm.data.collectAsState().value
    val modifier = Modifier.fillMaxSize()
    var searchItem by rememberSaveable { mutableStateOf("") }
    var isActive by rememberSaveable { mutableStateOf(false) }
    Scaffold(
        modifier,
        topBar = { FredTopBar(DataStrings.groupTitle, function) },
        snackbarHost = { SnackbarHost(snackbarHostState) },
        floatingActionButton = { ToProfile(controller) },
        floatingActionButtonPosition = FabPosition.End
    ) { padding ->
        Column(modifier.padding(padding), Arrangement.Center, Alignment.CenterHorizontally) {
            Spacer(Modifier.height(16.dp))
            FredSearchBar(
                searchItem,
                { searchItem = it },
                {
                    vm.getData(searchItem)
                    isActive = false
                },
                isActive,
                { isActive = it }
            )
            Spacer(Modifier.height(16.dp))
            LazyColumn(Modifier.fillMaxWidth()) {
                when(state.first) {
                    ConnectionType.SUCCESS -> {
                        scope.launch {
                            snackbarHostState.showSnackbar(information(state.first), Strings.successful, duration = SnackbarDuration.Short)
                        }
                        items(state.second) {
                            GroupListItem(it)
                            Spacer(Modifier.height(8.dp))
                        }
                    }
                    else -> scope.launch {
                        snackbarHostState.showSnackbar(information(state.first), duration = SnackbarDuration.Short)
                    }
                }
            }
        }
    }
}