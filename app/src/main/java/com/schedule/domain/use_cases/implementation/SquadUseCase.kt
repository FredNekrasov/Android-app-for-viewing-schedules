package com.schedule.domain.use_cases.implementation

import com.schedule.data.remote.dtos.SquadDto
import com.schedule.domain.model.Squad
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SquadUseCase(private val repository: IRepository<SquadDto>) : IUseCase<Squad> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Squad>>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val list = dtoList.map { it.toEntity() }
        return MutableStateFlow(connectionType to list)
    }
}