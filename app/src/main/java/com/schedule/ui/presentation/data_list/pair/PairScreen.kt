package com.schedule.ui.presentation.data_list.pair

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import com.schedule.ui.presentation.data_list.pair.view_model.PairVM
import com.schedule.ui.utils.FredSearchBar
import org.koin.androidx.compose.koinViewModel

@Composable
fun PairScreen(vm: PairVM = koinViewModel()) {
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
        LazyRow(Modifier.fillMaxWidth()) {
            items(state.second) {
                PairListItem(it)
                Spacer(Modifier.height(8.dp))
            }
        }
    }
}