package com.schedule.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Squad(
    val groupNumber: String,
    val shortGroupNumber: String,
    val studentNumber: Int,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)