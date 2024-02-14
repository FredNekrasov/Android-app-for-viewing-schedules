package com.schedule.domain.model.date

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Week(
    val semester: String,
    val weekNumber: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)