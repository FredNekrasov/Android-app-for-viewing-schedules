package com.schedule.data.remote.services.date

import com.schedule.data.remote.dtos.date.SemesterDto
import retrofit2.http.GET

interface ISemesterService {
    @GET("/api/Semesters")
    suspend fun getSemesters(): List<SemesterDto>?
}