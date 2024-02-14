package com.schedule.data.remote.dtos.date

data class WeekDto(
    val id: Int,
    val semester: SemesterDto,
    val weekNumber: Int
)