package com.schedule.data.repositories.room

import com.schedule.data.local.dao.room.IAudienceDao
import com.schedule.domain.model.room.Audience
import com.schedule.domain.repository.IRepository

class AudienceRepository(private val dao: IAudienceDao) : IRepository<Audience> {
    override suspend fun insertRecord(entity: Audience) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<Audience> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}