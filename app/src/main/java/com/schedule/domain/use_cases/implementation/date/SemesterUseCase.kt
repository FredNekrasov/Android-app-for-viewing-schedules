package com.schedule.domain.use_cases.implementation.date

import com.schedule.data.remote.services.implementation.date.ISemesterService
import com.schedule.domain.model.date.Semester
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

class SemesterUseCase @Inject constructor(
    private val repository: IRepository<Semester>
) : IUseCase<Semester> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Semester>>> {
        TODO()
    }
}