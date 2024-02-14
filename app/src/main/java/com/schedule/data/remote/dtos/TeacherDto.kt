package com.schedule.data.remote.dtos

import com.schedule.domain.model.Teacher

data class TeacherDto(
    val id: Int,
    val name: String,
    val surname: String,
    val patronymic: String
) {
    fun toEntity() = Teacher(name, surname, patronymic)
}