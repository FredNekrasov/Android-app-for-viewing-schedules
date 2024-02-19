package com.schedule.domain.use_cases.implementation

import com.schedule.data.remote.dtos.PairDto
import com.schedule.domain.model.PairEntity
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class PairUseCase @Inject constructor(
    private val repository: IRepository<PairDto>
) : IUseCase<PairEntity> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<PairEntity>>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val list = dtoList.map { it.toEntity() }
        return MutableStateFlow(connectionType to list)
    }
}