package com.schedule.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PairEntity(
    val teacher: String,
    val subject: String,
    val group: String,
    val audience: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)