package com.schedule.data.remote.dtos.date

import com.schedule.domain.model.date.Week

data class WeekDto(
    val id: Int,
    val semester: SemesterDto,
    val weekNumber: Int
) {
    fun toEntity() = Week("${semester.toEntity().semesterNumber} ${semester.year}", weekNumber)
}