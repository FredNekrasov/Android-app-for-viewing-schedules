package com.schedule.domain.use_cases.implementation.date

import com.schedule.data.remote.dtos.date.WeekDto
import com.schedule.domain.model.date.Week
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class WeekUseCase(private val repository: IRepository<WeekDto>) : IUseCase<Week> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Week>>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val list = dtoList.map { it.toEntity() }
        return MutableStateFlow(connectionType to list)
    }
}