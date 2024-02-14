package com.schedule.data.remote.service

import retrofit2.http.GET
import retrofit2.http.Path

interface IService {
    @GET("/api/{entity}")
    suspend fun<T> getList(@Path("entity") path: String): List<T>
    companion object {
        const val BASE_URL = "http://ipv4:5141"
    }
}