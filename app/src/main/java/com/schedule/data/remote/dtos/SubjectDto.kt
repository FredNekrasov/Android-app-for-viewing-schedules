package com.schedule.data.remote.dtos

import com.schedule.domain.model.Subject

data class SubjectDto(
    val id: Int,
    val subjectName: String,
    val lectureHours: Int,
    val practicHours: Int,
    val totalHours: Int,
    val consultationHours: Int,
    val typeOfCertification: String
) {
    fun toEntity() = Subject(
        subjectName,
        lectureHours,
        practicHours,
        totalHours,
        consultationHours,
        typeOfCertification
    )
}