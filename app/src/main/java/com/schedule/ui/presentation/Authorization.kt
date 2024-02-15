package com.schedule.ui.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.schedule.ui.presentation.data_list.user.view_model.UserVM
import com.schedule.ui.strings.InternetStrings
import com.schedule.ui.strings.Strings
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.FredButton
import com.schedule.ui.utils.FredOTF
import com.schedule.ui.utils.FredTextField
import com.schedule.ui.utils.FredTextTitle
import com.schedule.ui.utils.navigation.ScreensRoute
import com.schedule.ui.utils.navigation.information
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun Authorization(
    controller: NavController,
    snackbarHostState: SnackbarHostState,
    scope: CoroutineScope,
    viewModel: UserVM
) {
    var userName by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }
    val state = viewModel.data.collectAsState()
    val modifier = Modifier.fillMaxSize()
    Scaffold(modifier, snackbarHost = { SnackbarHost(snackbarHostState) }) { padding ->
        Column(modifier.padding(padding), Arrangement.Center, Alignment.CenterHorizontally) {
            FredTextTitle(Strings.authorization)
            Spacer(Modifier.height(64.dp))
            FredTextField(userName, { userName = it }, Strings.enterUN)
            Spacer(Modifier.height(8.dp))
            FredOTF(password, { password = it }, Strings.enterPassword, KeyboardType.Password)
            Spacer(Modifier.height(32.dp))
            FredButton({
                viewModel.getData(userName, password)
                when(state.value.first) {
                    ConnectionType.SUCCESS -> {
                        scope.launch {
                            snackbarHostState.showSnackbar(information(state.value.first), duration = SnackbarDuration.Short)
                        }
                        controller.navigate(ScreensRoute.Profile.route)
                    }
                    else -> scope.launch {
                        snackbarHostState.showSnackbar(information(state.value.first), InternetStrings.error, duration = SnackbarDuration.Short)
                    }
                }
            }, Strings.logIn)
            Spacer(Modifier.height(8.dp))
        }
    }
}