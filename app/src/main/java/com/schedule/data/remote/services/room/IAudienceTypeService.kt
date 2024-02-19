package com.schedule.data.remote.services.room

import com.schedule.data.remote.dtos.room.AudienceTypeDto
import retrofit2.http.GET

interface IAudienceTypeService {
    @GET("/api/AudienceTypes")
    suspend fun getAudienceTypes(): List<AudienceTypeDto>?
}