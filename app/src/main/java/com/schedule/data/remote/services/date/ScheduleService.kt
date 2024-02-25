package com.schedule.data.remote.services.date

import com.schedule.data.remote.dtos.date.ScheduleDto
import retrofit2.http.GET

interface ScheduleService {
    @GET("/api/Days")
    suspend fun getData(): List<ScheduleDto>?
}