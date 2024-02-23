package com.schedule.data.repositories.room

import com.schedule.data.remote.dtos.room.AudienceTypeDto
import com.schedule.data.remote.services.room.IAudienceTypeService
import com.schedule.domain.repository.IRepository
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.ConnectionType.*
import com.squareup.moshi.JsonDataException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.HttpException
import java.io.IOException

class AudienceTypeRepository(private val api: IAudienceTypeService) : IRepository<AudienceTypeDto> {
    override suspend fun getDTOList(): StateFlow<Pair<ConnectionType,List<AudienceTypeDto>>> {
        val data = MutableStateFlow(Pair(LOADING,emptyList<AudienceTypeDto>()))
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