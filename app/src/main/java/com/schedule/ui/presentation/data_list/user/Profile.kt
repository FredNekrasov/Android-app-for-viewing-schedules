package com.schedule.ui.presentation.data_list.user

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.schedule.ui.presentation.data_list.user.view_model.UserVM
import com.schedule.ui.strings.DataStrings
import com.schedule.ui.utils.FredTopBar

@Composable
fun Profile(
    function: () -> Unit,
    viewModel: UserVM,
) {
    val user = viewModel.data.collectAsState().value.second
    Scaffold(Modifier.fillMaxSize(),topBar = { FredTopBar(DataStrings.profile,function) }) { padding ->
        Column(Modifier.fillMaxSize().padding(padding), Arrangement.Center, Alignment.CenterHorizontally) {
            Spacer(Modifier.height(16.dp))
            UserInfo(user, Modifier.fillMaxWidth())
        }
    }
}