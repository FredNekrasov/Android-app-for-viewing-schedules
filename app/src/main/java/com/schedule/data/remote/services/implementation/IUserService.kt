package com.schedule.data.remote.services.implementation

import com.schedule.data.remote.dtos.UserDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface IUserService : IService<UserDto> {
    @GET("/api/Users")
    override suspend fun getData(): List<UserDto>?
}