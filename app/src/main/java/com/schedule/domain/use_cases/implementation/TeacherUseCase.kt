package com.schedule.domain.use_cases.implementation

import com.schedule.data.remote.dtos.TeacherDto
import com.schedule.domain.model.Teacher
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TeacherUseCase(private val repository: IRepository<TeacherDto>) : IUseCase<Teacher> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Teacher>>> {
        val (connectionType, dtoList) = repository.getDTOList().value
        val list = dtoList.map { it.toEntity() }
        return MutableStateFlow(connectionType to list)
    }
}