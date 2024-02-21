package com.schedule.data.remote.services.implementation

import com.schedule.data.remote.dtos.TeacherDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface ITeacherService : IService<TeacherDto> {
    @GET("/api/Teacher")
    override suspend fun getData(): List<TeacherDto>?
}