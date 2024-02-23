package com.schedule.data.repositories.room

import com.schedule.data.remote.dtos.room.AudienceDto
import com.schedule.data.remote.services.room.IAudienceService
import com.schedule.domain.repository.IRepository
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.ConnectionType.*
import com.squareup.moshi.JsonDataException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.HttpException
import java.io.IOException

class AudienceRepository(private val api: IAudienceService) : IRepository<AudienceDto> {
    override suspend fun getDTOList(): StateFlow<Pair<ConnectionType,List<AudienceDto>>> {
        val data = MutableStateFlow(Pair(LOADING,emptyList<AudienceDto>()))
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