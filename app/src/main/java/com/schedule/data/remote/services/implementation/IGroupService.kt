package com.schedule.data.remote.services.implementation

import com.schedule.data.remote.dtos.SquadDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface IGroupService : IService<SquadDto> {
    @GET("/api/Groups")
    override suspend fun getData(): List<SquadDto>?
}