package com.schedule.domain.use_cases.implementation

import com.schedule.domain.model.Squad
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class SquadUseCase @Inject constructor(
    private val repository: IRepository<Squad>
) : IUseCase<Squad> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Squad>>> {
        TODO()
    }
}