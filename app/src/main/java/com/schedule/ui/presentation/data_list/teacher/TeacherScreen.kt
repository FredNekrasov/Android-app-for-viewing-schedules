package com.schedule.ui.presentation.data_list.teacher

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import com.schedule.ui.presentation.data_list.teacher.view_model.TeacherVM
import com.schedule.ui.utils.FredSearchBar
import org.koin.androidx.compose.koinViewModel

@Composable
fun TeacherScreen(vm: TeacherVM = koinViewModel()) {
    val state = vm.data.collectAsState().value
    var searchItem by rememberSaveable { mutableStateOf("") }
    var isActive by rememberSaveable { mutableStateOf(false) }
    Column(Modifier.fillMaxSize(), Arrangement.Top, Alignment.CenterHorizontally) {
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
            items(state.second) {
                TeacherListItem(it)
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}