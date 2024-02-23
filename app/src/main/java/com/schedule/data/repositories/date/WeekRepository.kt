package com.schedule.data.repositories.date

import com.schedule.data.remote.dtos.date.WeekDto
import com.schedule.data.remote.services.date.IWeekService
import com.schedule.domain.repository.IRepository
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.ConnectionType.*
import com.squareup.moshi.JsonDataException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.HttpException
import java.io.IOException

class WeekRepository(private val api: IWeekService) : IRepository<WeekDto> {
    override suspend fun getDTOList(): StateFlow<Pair<ConnectionType,List<WeekDto>>> {
        val data = MutableStateFlow(Pair(LOADING,emptyList<WeekDto>()))
        try {
            val result = api.getData()
            if (result == null) data.emit(Pair(NO_DATA,emptyList())) else data.emit(Pair(SUCCESS,result))
        } catch(ex: HttpException) {
            data.emit(CONNECTION_ERROR to emptyList())
        } catch(ex: JsonDataException) {
            data.emit(JSON_CONVERSION_ERROR to emptyList())
        } catch(ex: IOException) {
            data.emit(NO_INTERNET to emptyList())
        } catch(ex: Exception) {
            data.emit(UNKNOWN to emptyList())
        }
        return data
    }
}