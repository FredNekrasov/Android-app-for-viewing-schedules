package com.schedule.domain.use_cases.implementation.date

import com.schedule.data.remote.dtos.date.ScheduleDto
import com.schedule.domain.model.date.Schedule
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ScheduleUseCase(private val repository: IRepository<ScheduleDto>) : IUseCase<Schedule> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Schedule>>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val list = dtoList.map { it.toEntity() }
        return MutableStateFlow(connectionType to list)
    }
}