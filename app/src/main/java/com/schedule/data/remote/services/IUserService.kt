package com.schedule.data.remote.services

import com.schedule.data.remote.dtos.UserDto
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface IUserService {
    @GET("/api/User")
    suspend fun getData(): List<UserDto>?
    companion object {
        private const val BASE_URL = "http://localhost:5141"
        fun build(): Retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(MoshiConverterFactory.create()).build()
    }
}