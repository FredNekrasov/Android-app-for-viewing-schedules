package com.schedule.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subject(
    val subjectName: String,
    val lectureHours: Int,
    val practicHours: Int,
    val totalHours: Int,
    val consultationHours: Int,
    val typeOfCertification: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)