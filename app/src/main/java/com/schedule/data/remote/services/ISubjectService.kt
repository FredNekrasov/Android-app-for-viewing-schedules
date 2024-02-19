package com.schedule.data.remote.services

import com.schedule.data.remote.dtos.SubjectDto
import retrofit2.http.GET

interface ISubjectService {
    @GET("/api/Subjects")
    suspend fun getSubjects(): List<SubjectDto>?
}