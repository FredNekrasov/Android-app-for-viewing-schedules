package com.schedule.domain.use_cases.user.implementation

import com.schedule.data.remote.dtos.UserDto
import com.schedule.data.remote.service.IService
import com.schedule.domain.model.User
import com.schedule.domain.repository.IRepository
import com.schedule.domain.use_cases.user.IUserUseCase
import com.schedule.ui.utils.ConnectionType
import com.schedule.ui.utils.ConnectionType.LOADING
import com.squareup.moshi.JsonDataException
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class UserUseCase @Inject constructor(private val api: IService<UserDto>, private val repository: IRepository<User>) : IUserUseCase {
    override suspend fun authorization(
        userName: String, password: String
    ): StateFlow<Pair<ConnectionType, User?>> {
        val user = repository.getAllData().firstOrNull { it.userName == userName && it.password == password }
        val data = MutableStateFlow(Pair(LOADING,user))
        try {
            val new = api.getList("user")?.find { userName == it.userName && password == it.password }
            if(new == null) data.emit(Pair(ConnectionType.NO_DATA, null)) else {
                repository.deleteAllData()
                repository.insertRecord(new.toEntity())
                data.emit(Pair(ConnectionType.SUCCESS, new.toEntity()))
            }
        } catch(ex: HttpException) {
            data.emit(ConnectionType.CONNECTION_ERROR to user)
        } catch(ex: JsonDataException) {
            data.emit(ConnectionType.JSON_CONVERSION_ERROR to user)
        } catch(ex: IOException) {
            data.emit(ConnectionType.NO_INTERNET to user)
        } catch(ex: Exception) {
            data.emit(ConnectionType.UNKNOWN to user)
        }
        return data
    }
}