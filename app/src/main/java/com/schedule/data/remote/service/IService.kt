package com.schedule.data.remote.service

import retrofit2.http.GET
import retrofit2.http.Path

interface IService<T> {
    @GET("/api/{entity}")
    suspend fun getList(@Path("entity") path: String): List<T>?
    companion object {
        const val BASE_URL = "http://192.168.1.231:5141"
    }
}