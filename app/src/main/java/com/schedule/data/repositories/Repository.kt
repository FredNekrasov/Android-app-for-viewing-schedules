package com.schedule.data.repositories

import com.schedule.data.remote.services.IService
import com.schedule.domain.repository.IRepository
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.ConnectionType.CONNECTION_ERROR
import com.schedule.ui.utils.ConnectionType.JSON_CONVERSION_ERROR
import com.schedule.ui.utils.ConnectionType.LOADING
import com.schedule.ui.utils.ConnectionType.NO_DATA
import com.schedule.ui.utils.ConnectionType.NO_INTERNET
import com.schedule.ui.utils.ConnectionType.SUCCESS
import com.schedule.ui.utils.ConnectionType.UNKNOWN
import com.squareup.moshi.JsonDataException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.HttpException
import java.io.IOException

class Repository<T>(private val api: IService<T>) : IRepository<T> {
    override suspend fun getDTOList(): StateFlow<Pair<ConnectionType,List<T>>> {
        val data = MutableStateFlow(Pair(LOADING,emptyList<T>()))
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