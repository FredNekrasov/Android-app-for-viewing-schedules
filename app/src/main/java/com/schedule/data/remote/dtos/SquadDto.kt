package com.schedule.data.remote.dtos

import com.schedule.domain.model.Squad

data class SquadDto(
    val id: Int,
    val groupNumber: String,
    val shortNumber: String,
    val studentNumber: Int
) {
    fun toEntity() = Squad(groupNumber, shortNumber, studentNumber)
}