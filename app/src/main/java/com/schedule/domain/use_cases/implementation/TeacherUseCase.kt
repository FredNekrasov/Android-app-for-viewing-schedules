package com.schedule.domain.use_cases.implementation

import com.schedule.data.remote.dtos.TeacherDto
import com.schedule.data.remote.service.IService
import com.schedule.domain.model.Teacher
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

class TeacherUseCase @Inject constructor(
    private val api: IService<TeacherDto>, private val repository: IRepository<Teacher>
) : IUseCase<Teacher> {
    override suspend fun getList(): StateFlow<Pair<ConnectionType,List<Teacher>>> {
        val list = repository.getAllData()
        val data = MutableStateFlow(Pair(LOADING,list))
        try {
            val entityList = api.getList("teacher")?.map { it.toEntity() }
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