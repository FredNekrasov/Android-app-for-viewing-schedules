package com.schedule.data.remote.dtos.room

import com.schedule.domain.model.room.AudienceType

data class AudienceTypeDto(
    val id: Int,
    val typeName: String,
    val description: String
) {
    fun toEntity() = AudienceType(typeName, description)
}