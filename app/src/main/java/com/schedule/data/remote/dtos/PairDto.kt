package com.schedule.data.remote.dtos

import com.schedule.data.remote.dtos.room.AudienceDto
import com.schedule.domain.model.PairEntity

data class PairDto(
    val pairID: Int,
    val group: SquadDto,
    val audience: AudienceDto,
    val subject: SubjectDto,
    val teacher: TeacherDto
) {
    fun toEntity() = PairEntity(
        "${teacher.surname} ${teacher.name} ${teacher.patronymic}",
        subject.subjectName,
        group.shortNumber,
        audience.audienceNumber
    )
}