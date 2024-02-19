package com.schedule.domain.repository

import com.schedule.ui.utils.ConnectionType
import kotlinx.coroutines.flow.StateFlow

interface IRepository<T> {
    suspend fun getDTOList(): StateFlow<Pair<ConnectionType,List<T>>>
}