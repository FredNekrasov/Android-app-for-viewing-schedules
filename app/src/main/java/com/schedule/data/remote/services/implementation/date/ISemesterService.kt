package com.schedule.data.remote.services.implementation.date

import com.schedule.data.remote.dtos.date.SemesterDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface ISemesterService : IService<SemesterDto> {
    @GET("/api/Semesters")
    override suspend fun getData(): List<SemesterDto>?
}