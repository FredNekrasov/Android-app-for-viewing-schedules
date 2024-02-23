package com.schedule.data.remote.services

import com.schedule.data.remote.dtos.UserDto
import retrofit2.http.GET

interface IUserService {
    @GET("/api/User")
    suspend fun getData(): List<UserDto>?
    companion object {
        const val BaseUrl = "http://qwerty:5141"
    }
}