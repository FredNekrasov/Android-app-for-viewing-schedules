package com.schedule.data.remote.services.implementation

import com.schedule.data.remote.dtos.SubjectDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface ISubjectService : IService<SubjectDto> {
    @GET("/api/Subjects")
    override suspend fun getData(): List<SubjectDto>?
}