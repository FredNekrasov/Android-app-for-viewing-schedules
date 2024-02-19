package com.schedule.domain.model.room

data class Audience(
    val audienceType: String,
    val seatsNumber: Int,
    val studentNumber: Int,
    val audienceNumber: String
)