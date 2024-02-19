package com.schedule.data.remote.services.implementation.room

import com.schedule.data.remote.dtos.room.AudienceDto
import retrofit2.http.GET

interface IAudienceService {
    @GET("/api/Audiences")
    suspend fun getAudiences(): List<AudienceDto>?
}