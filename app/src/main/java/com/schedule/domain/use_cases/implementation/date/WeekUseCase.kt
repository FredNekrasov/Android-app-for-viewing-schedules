package com.schedule.domain.use_cases.implementation.date

import com.schedule.data.remote.dtos.date.WeekDto
import com.schedule.data.remote.service.IService
import com.schedule.data.repositories.date.WeekRepository
import com.schedule.domain.model.date.Week
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
    private val api: IService, private val repository: WeekRepository
) : IUseCase<Week> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Week>>> {
        val list = repository.getAllData()
        val data = MutableStateFlow(Pair(LOADING,list))
        try {
            val entityList = api.getList<WeekDto>("weeks")?.map { it.toEntity() }
            if(entityList == null) data.emit(Pair(ConnectionType.NO_DATA, list)) else {
                repository.deleteAllData()
                entityList.forEach { repository.insertRecord(it) }
                data.emit(Pair(ConnectionType.SUCCESS, repository.getAllData()))
            }
        } catch(ex: HttpException) {
            data.emit(ConnectionType.CONNECTION_ERROR to list)
        } catch(ex: JsonDataException) {
            data.emit(ConnectionType.JSON_CONVERSION_ERROR to list)
        } catch(ex: IOException) {
            data.emit(ConnectionType.NO_INTERNET to list)
        } catch(ex: Exception) {
            data.emit(ConnectionType.UNKNOWN to list)
        }
        return data
    }
}