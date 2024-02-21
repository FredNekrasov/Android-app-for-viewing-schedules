package com.schedule.data.remote.services

import retrofit2.http.GET

interface IService<T> {
    @GET
    suspend fun getData(): List<T>?
    companion object {
        const val BaseUrl = "http://192.168.1.231:5141"
    }
}