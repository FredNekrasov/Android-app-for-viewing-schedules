package com.schedule.data.remote.services

import com.schedule.data.remote.dtos.UserDto
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface IUserService {
    @GET("/api/User")
    suspend fun getData(): List<UserDto>?
    companion object {
        private const val BaseUrl = "http://192.168.1.231:5141"
        fun build(): Retrofit = Retrofit.Builder().baseUrl(BaseUrl).addConverterFactory(MoshiConverterFactory.create()).build()
    }
}