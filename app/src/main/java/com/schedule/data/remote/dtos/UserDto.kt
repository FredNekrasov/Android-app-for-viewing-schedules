package com.schedule.data.remote.dtos

import com.schedule.domain.model.User

data class UserDto(
    val userID: Int,
    val userName: String,
    val password: String,
    val email: String
) {
    fun toEntity() = User(userID, userName, password, email)
}