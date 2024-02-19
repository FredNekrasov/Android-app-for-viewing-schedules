package com.schedule.domain.use_cases.implementation

import com.schedule.domain.model.Teacher
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TeacherUseCase @Inject constructor(
    private val repository: IRepository<Teacher>
) : IUseCase<Teacher> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Teacher>>> {
        TODO()
    }
}