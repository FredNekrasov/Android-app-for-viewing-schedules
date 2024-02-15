package com.schedule.ui.presentation.data_list.user.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.schedule.domain.model.User
import com.schedule.domain.use_cases.user.IUserUseCase
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.ConnectionType.LOADING
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserVM @Inject constructor(private val useCase: IUserUseCase) : ViewModel() {
    private var dataMSF = MutableStateFlow<Pair<ConnectionType, User?>>(LOADING to null)
    val data = dataMSF.asStateFlow()
    fun getData(userName: String, password: String) {
        viewModelScope.launch {
            useCase.authorization(userName, password).collectLatest {
                dataMSF.emit(it)
            }
        }
    }
}