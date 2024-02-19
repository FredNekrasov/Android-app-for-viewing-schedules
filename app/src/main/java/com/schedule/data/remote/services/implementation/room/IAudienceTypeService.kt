package com.schedule.data.remote.services.implementation.room

import com.schedule.data.remote.dtos.room.AudienceTypeDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface IAudienceTypeService : IService<AudienceTypeDto> {
    @GET("/api/AudienceTypes")
    override suspend fun getData(): List<AudienceTypeDto>?
}