package com.schedule.domain.model.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Audience(
    val audienceType: String,
    val seatsNumber: Int,
    val studentNumber: Int,
    val audienceNumber: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)