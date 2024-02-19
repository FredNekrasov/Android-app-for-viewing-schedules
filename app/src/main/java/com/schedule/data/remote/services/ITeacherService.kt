package com.schedule.data.remote.services

import com.schedule.data.remote.dtos.TeacherDto
import retrofit2.http.GET

interface ITeacherService {
    @GET("/api/Teachers")
    suspend fun getTeachers(): List<TeacherDto>?
}