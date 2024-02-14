package com.schedule.domain.use_cases.user.implementation

import com.schedule.domain.model.User
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.StateFlow

interface IUserUseCase {
    suspend fun authorization(userName: String, password: String): StateFlow<Pair<ConnectionType, User?>>
}