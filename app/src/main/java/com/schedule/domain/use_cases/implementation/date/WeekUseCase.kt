package com.schedule.domain.use_cases.implementation.date

import com.schedule.data.remote.services.date.IWeekService
import com.schedule.domain.model.date.Week
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

class WeekUseCase @Inject constructor(
    private val repository: IRepository<Week>
) : IUseCase<Week> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Week>>> {
        TODO()
    }
}