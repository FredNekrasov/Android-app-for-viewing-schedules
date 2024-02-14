package com.schedule.domain.model.date

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Semester(
    val year: Int,
    val semesterNumber: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)