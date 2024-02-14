package com.schedule.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    val userID: Int,
    val userName: String,
    val password: String,
    val email: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)