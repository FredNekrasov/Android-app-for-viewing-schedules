package com.schedule.data.remote.services.implementation.date

import com.schedule.data.remote.dtos.date.WeekDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface IWeekService : IService<WeekDto> {
    @GET("/api/Weeks")
    override suspend fun getData(): List<WeekDto>?
}