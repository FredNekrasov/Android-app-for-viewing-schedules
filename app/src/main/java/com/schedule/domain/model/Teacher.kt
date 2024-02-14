package com.schedule.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Teacher(
    val name: String,
    val surname: String,
    val patronymic: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)