package com.schedule.data.repositories

import com.schedule.data.local.dao.IPairDao
import com.schedule.domain.model.PairEntity
import com.schedule.domain.repository.IRepository

class PairRepository(private val dao: IPairDao) : IRepository<PairEntity> {
    override suspend fun insertRecord(entity: PairEntity) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<PairEntity> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}