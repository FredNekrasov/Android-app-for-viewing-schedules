package com.schedule.data.remote.dtos.date

import com.schedule.domain.model.date.Semester

data class SemesterDto(
    val id: Int,
    val year: Int,
    val isEven: Boolean
) {
    fun toEntity() = Semester(year, if(isEven) 2 else 1)
}