package com.schedule.data.repositories

import com.schedule.data.local.dao.IUserDao
import com.schedule.domain.model.User
import com.schedule.domain.repository.IRepository

class UserRepository(private val dao: IUserDao) : IRepository<User> {
    override suspend fun insertRecord(entity: User) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<User> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}