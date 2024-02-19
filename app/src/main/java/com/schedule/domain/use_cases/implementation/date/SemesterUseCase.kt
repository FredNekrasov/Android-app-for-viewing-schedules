package com.schedule.domain.use_cases.implementation.date

import com.schedule.data.remote.dtos.date.SemesterDto
import com.schedule.domain.model.date.Semester
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SemesterUseCase(private val repository: IRepository<SemesterDto>) : IUseCase<Semester> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Semester>>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val list = dtoList.map { it.toEntity() }
        return MutableStateFlow(connectionType to list)
    }
}