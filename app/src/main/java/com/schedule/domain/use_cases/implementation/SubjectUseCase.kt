package com.schedule.domain.use_cases.implementation

import com.schedule.data.remote.dtos.SubjectDto
import com.schedule.domain.model.Subject
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SubjectUseCase(private val repository: IRepository<SubjectDto>) : IUseCase<Subject> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Subject>>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val list = dtoList.map { it.toEntity() }
        return MutableStateFlow(connectionType to list)
    }
}