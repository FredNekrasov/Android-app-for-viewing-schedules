package com.schedule.ui.presentation.data_list.date.semester

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import com.schedule.ui.presentation.data_list.date.semester.view_model.SemesterVM
import com.schedule.ui.strings.KoinDIQualifierStrings as koinStr
import com.schedule.ui.utils.FredSearchBar
import org.koin.androidx.compose.koinViewModel
import org.koin.core.qualifier.named

@Composable
fun SemesterScreen(semesterVM: SemesterVM = koinViewModel(qualifier = named(koinStr.semesterEntity + koinStr.vm))) {
    val state = semesterVM.data.collectAsState().value
    var searchItem by rememberSaveable { mutableStateOf("") }
    var isActive by rememberSaveable { mutableStateOf(false) }
    Column(Modifier.fillMaxSize(), Arrangement.Top, Alignment.CenterHorizontally) {
        Spacer(Modifier.height(16.dp))
        FredSearchBar(
            searchItem,
            { searchItem = it },
            {
                semesterVM.getData(searchItem)
                isActive = false
            },
            isActive,
            { isActive = it }
        )
        Spacer(Modifier.height(16.dp))
        LazyColumn(Modifier.fillMaxWidth()) {
            items(state.second) {
                SemesterListItem(it)
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}