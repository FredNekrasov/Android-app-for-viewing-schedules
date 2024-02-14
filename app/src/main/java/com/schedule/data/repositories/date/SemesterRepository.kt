package com.schedule.data.repositories.date

import com.schedule.data.local.dao.date.ISemesterDao
import com.schedule.domain.model.date.Semester
import com.schedule.domain.repository.IRepository

class SemesterRepository(private val dao: ISemesterDao) : IRepository<Semester> {
    override suspend fun insertRecord(entity: Semester) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<Semester> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}