package com.schedule.domain.use_cases.user.implementation

import com.schedule.domain.model.User
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.user.IUserUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class UserUseCase @Inject constructor(private val repository: IRepository<User>) : IUserUseCase {
    override suspend fun authorization(
        userName: String, password: String
    ): StateFlow<Pair<ConnectionType, User?>> {
        TODO()
    }
}