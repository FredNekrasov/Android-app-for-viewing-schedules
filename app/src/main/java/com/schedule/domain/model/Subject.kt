package com.schedule.domain.model

data class Subject(
    val subjectName: String,
    val lectureHours: Int,
    val practiceHours: Int,
    val totalHours: Int,
    val consultationHours: Int,
    val typeOfCertification: String
)