package com.schedule.domain.model.date

import com.schedule.domain.model.PairEntity

data class Schedule(
    val dayOfWeek: String,
    val pair1: PairEntity?,
    val pair2: PairEntity?,
    val pair3: PairEntity?,
    val pair4: PairEntity?,
    val pair5: PairEntity?,
    val pair6: PairEntity?,
    val pair7: PairEntity?,
    val week: Int
)