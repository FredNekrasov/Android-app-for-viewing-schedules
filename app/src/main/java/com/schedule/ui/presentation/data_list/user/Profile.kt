package com.schedule.ui.presentation.data_list.user

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import com.schedule.ui.presentation.data_list.user.view_model.UserVM

@Composable
fun Profile(userVM: UserVM) {
    val user = userVM.data.collectAsState().value.second
    Column(Modifier.fillMaxSize(), Arrangement.Top, Alignment.CenterHorizontally) {
        Spacer(Modifier.height(16.dp))
        LazyColumn {
            item { UserInfo(user, Modifier.fillMaxWidth()) }
        }
    }
}