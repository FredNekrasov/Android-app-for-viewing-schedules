package com.schedule.data.remote.services.implementation

import com.schedule.data.remote.dtos.PairDto
import com.schedule.data.remote.services.IService
import retrofit2.http.GET

interface IPairService : IService<PairDto> {
    @GET("/api/Pairs")
    override suspend fun getData(): List<PairDto>?
}