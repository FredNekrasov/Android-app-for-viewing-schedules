package com.schedule.domain.use_cases.implementation

import com.schedule.data.remote.services.IGroupService
import com.schedule.domain.model.Squad
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

class SquadUseCase @Inject constructor(
    private val repository: IRepository<Squad>
) : IUseCase<Squad> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Squad>>> {
        TODO()
    }
}