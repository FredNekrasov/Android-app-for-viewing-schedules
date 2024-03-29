package com.schedule.ui.presentation.data_list.room.audience

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import com.schedule.ui.presentation.data_list.room.audience.view_model.AudienceVM
import com.schedule.ui.strings.KoinDIQualifierStrings as koinStr
import com.schedule.ui.utils.FredSearchBar
import org.koin.androidx.compose.koinViewModel
import org.koin.core.qualifier.named

@Composable
fun AudienceScreen(audienceVM: AudienceVM = koinViewModel(qualifier = named(koinStr.audienceEntity + koinStr.vm))) {
    val state = audienceVM.data.collectAsState().value
    var searchItem by rememberSaveable { mutableStateOf("") }
    var isActive by rememberSaveable { mutableStateOf(false) }
    Column(Modifier.fillMaxSize(), Arrangement.Top, Alignment.CenterHorizontally) {
        Spacer(Modifier.height(16.dp))
        FredSearchBar(
            searchItem,
            { searchItem = it },
            {
                audienceVM.getData(searchItem)
                isActive = false
            },
            isActive,
            { isActive = it }
        )
        Spacer(Modifier.height(16.dp))
        LazyColumn(Modifier.fillMaxWidth()) {
            items(state.second) {
                AudienceListItem(it)
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}