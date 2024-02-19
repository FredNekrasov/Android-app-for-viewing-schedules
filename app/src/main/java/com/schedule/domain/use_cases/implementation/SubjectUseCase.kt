package com.schedule.domain.use_cases.implementation

import com.schedule.data.remote.services.ISubjectService
import com.schedule.domain.model.Subject
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

class SubjectUseCase @Inject constructor(
    private val repository: IRepository<Subject>
) : IUseCase<Subject> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Subject>>> {
        TODO()
    }
}