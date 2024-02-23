package com.schedule.data.remote.services.room

import com.schedule.data.remote.dtos.room.AudienceDto
import retrofit2.http.GET

interface IAudienceService {
    @GET("/api/Audiences")
    suspend fun getData(): List<AudienceDto>?
}