package com.schedule.data.repositories.date

import com.schedule.data.local.dao.date.IWeekDao
import com.schedule.domain.model.date.Week
import com.schedule.domain.repository.IRepository

class WeekRepository(private val dao: IWeekDao) : IRepository<Week> {
    override suspend fun insertRecord(entity: Week) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<Week> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}