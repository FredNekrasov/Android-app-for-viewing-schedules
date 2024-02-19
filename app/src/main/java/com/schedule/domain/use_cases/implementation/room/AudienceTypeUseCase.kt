package com.schedule.domain.use_cases.implementation.room

import com.schedule.domain.model.room.AudienceType
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class AudienceTypeUseCase @Inject constructor(
    private val repository: IRepository<AudienceType>
) : IUseCase<AudienceType> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<AudienceType>>> {
        TODO()
    }
}