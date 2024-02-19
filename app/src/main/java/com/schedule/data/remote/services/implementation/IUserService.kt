package com.schedule.data.remote.services.implementation

import com.schedule.data.remote.dtos.UserDto
import retrofit2.http.GET

interface IUserService {
    @GET("/api/Users")
    suspend fun getUsers(): List<UserDto>?
    companion object {
        const val BaseUrl = "http://qwrty:5141"
    }
}