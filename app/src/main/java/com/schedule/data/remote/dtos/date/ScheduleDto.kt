package com.schedule.data.remote.dtos.date

import com.schedule.data.remote.dtos.PairDto
import com.schedule.domain.model.date.Schedule

data class ScheduleDto(
    val id: Int,
    val dayOfWeek: String,
    val pair1: PairDto?,
    val pair2: PairDto?,
    val pair3: PairDto?,
    val pair4: PairDto?,
    val pair5: PairDto?,
    val pair6: PairDto?,
    val pair7: PairDto?,
    val week: WeekDto
) {
    fun toEntity() = Schedule(
        dayOfWeek = dayOfWeek,
        pair1 = pair1?.toEntity(),
        pair2 = pair2?.toEntity(),
        pair3 = pair3?.toEntity(),
        pair4 = pair4?.toEntity(),
        pair5 = pair5?.toEntity(),
        pair6 = pair6?.toEntity(),
        pair7 = pair7?.toEntity(),
        week = week.weekNumber
    )
}