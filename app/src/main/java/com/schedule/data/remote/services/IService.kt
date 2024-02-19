package com.schedule.data.remote.services

import retrofit2.http.GET

interface IService<T> {
    @GET
    suspend fun getData(): List<T>
    companion object {
        const val BaseUrl = "http://qwrty:5141"
    }
}