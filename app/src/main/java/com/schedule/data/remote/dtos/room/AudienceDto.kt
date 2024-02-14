package com.schedule.data.remote.dtos.room

import com.schedule.domain.model.room.Audience

data class AudienceDto(
    val id: Int,
    val audienceType: AudienceTypeDto,
    val seatsNumber: Int,
    val studentNumber: Int,
    val audienceNumber: String
) {
    fun toEntity() = Audience(audienceType.typeName, seatsNumber, studentNumber, audienceNumber)
}