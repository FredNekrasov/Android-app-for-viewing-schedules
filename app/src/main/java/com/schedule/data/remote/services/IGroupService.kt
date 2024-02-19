package com.schedule.data.remote.services

import com.schedule.data.remote.dtos.SquadDto
import retrofit2.http.GET

interface IGroupService {
    @GET("/api/Groups")
    suspend fun getGroups(): List<SquadDto>?
}