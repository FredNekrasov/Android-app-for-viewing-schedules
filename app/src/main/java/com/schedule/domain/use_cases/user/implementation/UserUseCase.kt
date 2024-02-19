package com.schedule.domain.use_cases.user.implementation

import com.schedule.data.remote.dtos.UserDto
import com.schedule.domain.model.User
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.user.IUserUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserUseCase(private val repository: IRepository<UserDto>) : IUserUseCase {
    override suspend fun authorization(userName: String,password: String): StateFlow<Pair<ConnectionType, User?>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val userDto = dtoList.find { it.userName == userName && it.password == password }
        return MutableStateFlow(connectionType to userDto?.toEntity())
    }
}