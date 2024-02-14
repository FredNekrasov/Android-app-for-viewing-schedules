package com.schedule.domain.model.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AudienceType(
    val typeName: String,
    val description: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)