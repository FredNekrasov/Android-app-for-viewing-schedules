package com.schedule.domain.use_cases

import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.StateFlow

interface IUseCase<T> {
    suspend fun getList(): StateFlow<Pair<ConnectionType, List<T>>>
}