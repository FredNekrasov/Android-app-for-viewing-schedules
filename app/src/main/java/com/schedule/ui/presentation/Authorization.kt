package com.schedule.ui.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.*
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.schedule.ui.presentation.data_list.user.view_model.UserVM
import com.schedule.ui.strings.Strings
import com.schedule.ui.utils.ConnectionType.SUCCESS
import com.schedule.ui.utils.*
import com.schedule.ui.utils.navigation.ScreensRoute.*

@Composable
fun Authorization(controller: NavController,userVM: UserVM) {
    var userName by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    val state = userVM.data.collectAsState()
    Column(Modifier.fillMaxSize(),Arrangement.Center,Alignment.CenterHorizontally) {
        FredTextTitle(Strings.authorization)
        Spacer(Modifier.height(64.dp))
        FredTextField(userName, { userName = it }, Strings.enterUN)
        Spacer(Modifier.height(8.dp))
        FredOTF(password, { password = it }, Strings.enterPassword, KeyboardType.NumberPassword)
        Spacer(Modifier.height(32.dp))
        FredButton({ userVM.getData(userName,password) },Strings.logIn)
        if(state.value.first == SUCCESS) controller.navigate(Profile.route)
    }
}