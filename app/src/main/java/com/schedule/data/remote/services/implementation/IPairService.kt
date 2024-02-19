package com.schedule.data.remote.services.implementation

import com.schedule.data.remote.dtos.PairDto
import retrofit2.http.GET

interface IPairService {
    @GET("/api/Pairs")
    suspend fun getPairs(): List<PairDto>?
}