package com.schedule.data.repositories.room

import com.schedule.data.local.dao.room.IAudienceTypeDao
import com.schedule.domain.model.room.AudienceType
import com.schedule.domain.repository.IRepository

class AudienceTypeRepository(private val dao: IAudienceTypeDao) : IRepository<AudienceType> {
    override suspend fun insertRecord(entity: AudienceType) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<AudienceType> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}