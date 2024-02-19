package com.schedule.data.remote.services.implementation.room

import com.schedule.data.remote.dtos.room.AudienceDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface IAudienceService : IService<AudienceDto> {
    @GET("/api/Audiences")
    override suspend fun getData(): List<AudienceDto>?
}