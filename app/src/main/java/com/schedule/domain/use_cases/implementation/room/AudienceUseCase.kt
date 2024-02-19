package com.schedule.domain.use_cases.implementation.room

import com.schedule.data.remote.services.room.IAudienceService
import com.schedule.domain.model.room.Audience
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.IUseCase
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.ConnectionType.LOADING
import com.squareup.moshi.JsonDataException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class AudienceUseCase @Inject constructor(
    private val repository: IRepository<Audience>
) : IUseCase<Audience> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Audience>>> {
        TODO()
    }
}