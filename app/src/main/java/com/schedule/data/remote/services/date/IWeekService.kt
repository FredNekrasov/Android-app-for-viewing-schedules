package com.schedule.data.remote.services.date

import com.schedule.data.remote.dtos.date.WeekDto
import retrofit2.http.GET

interface IWeekService {
    @GET("/api/Weeks")
    suspend fun getData(): List<WeekDto>?
}