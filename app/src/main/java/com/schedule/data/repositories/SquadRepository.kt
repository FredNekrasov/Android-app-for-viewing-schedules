package com.schedule.data.repositories

import com.schedule.data.local.dao.IGroupDao
import com.schedule.domain.model.Squad
import com.schedule.domain.repository.IRepository

class SquadRepository(private val dao: IGroupDao) : IRepository<Squad> {
    override suspend fun insertRecord(entity: Squad) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<Squad> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}