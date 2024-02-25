package com.schedule.ui.presentation.data_list.date.schedule

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import com.schedule.ui.presentation.data_list.date.schedule.view_model.ScheduleVM
import com.schedule.ui.utils.FredSearchBar
import com.schedule.ui.strings.KoinDIQualifierStrings as koinStr
import org.koin.androidx.compose.koinViewModel
import org.koin.core.qualifier.named

@Composable
fun ScheduleScreen(scheduleVM: ScheduleVM = koinViewModel(qualifier = named(koinStr.scheduleEntity + koinStr.vm))) {
    val state = scheduleVM.data.collectAsState().value
    var searchItem by rememberSaveable { mutableStateOf("") }
    var isActive by rememberSaveable { mutableStateOf(false) }
    Column(Modifier.fillMaxSize(),Arrangement.Top,Alignment.CenterHorizontally) {
        Spacer(Modifier.height(16.dp))
        FredSearchBar(
            searchItem,
            { searchItem = it },
            {
                scheduleVM.getData(searchItem)
                isActive = false
            },
            isActive,
            { isActive = it }
        )
        Spacer(Modifier.height(16.dp))
        LazyRow(Modifier.fillMaxSize()) {
            items(state.second) {
                ScheduleListItem(it)
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}