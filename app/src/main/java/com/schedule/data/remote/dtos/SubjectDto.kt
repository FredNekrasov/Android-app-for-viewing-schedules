package com.schedule.data.remote.dtos

data class SubjectDto(
    val id: Int,
    val subjectName: String,
    val lectureHours: Int,
    val practicHours: Int,
    val totalHours: Int,
    val consultationHours: Int,
    val typeOfCertification: String
)