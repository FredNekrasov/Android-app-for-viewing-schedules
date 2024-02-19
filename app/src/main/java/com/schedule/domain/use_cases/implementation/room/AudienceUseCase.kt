package com.schedule.domain.use_cases.implementation.room

import com.schedule.data.remote.dtos.room.AudienceDto
import com.schedule.domain.model.room.Audience
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AudienceUseCase(private val repository: IRepository<AudienceDto>) : IUseCase<Audience> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Audience>>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val list = dtoList.map { it.toEntity() }
        return MutableStateFlow(connectionType to list)
    }
}