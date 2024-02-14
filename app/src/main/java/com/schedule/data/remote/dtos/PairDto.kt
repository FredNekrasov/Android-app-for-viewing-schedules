package com.schedule.data.remote.dtos

import com.schedule.data.remote.dtos.room.AudienceDto

data class PairDto(
    val pairID: Int,
    val group: SquadDto,
    val audience: AudienceDto,
    val subject: SubjectDto,
    val teacher: TeacherDto
)