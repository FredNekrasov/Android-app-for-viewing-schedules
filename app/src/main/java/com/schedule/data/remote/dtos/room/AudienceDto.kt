package com.schedule.data.remote.dtos.room

data class AudienceDto(
    val id: Int,
    val audienceType: AudienceTypeDto,
    val seatsNumber: Int,
    val studentNumber: Int,
    val audienceNumber: String
)