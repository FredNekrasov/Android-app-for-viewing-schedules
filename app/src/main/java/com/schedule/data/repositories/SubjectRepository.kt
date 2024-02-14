package com.schedule.data.repositories

import com.schedule.data.local.dao.ISubjectDao
import com.schedule.domain.model.Subject
import com.schedule.domain.repository.IRepository

class SubjectRepository(private val dao: ISubjectDao) : IRepository<Subject> {
    override suspend fun insertRecord(entity: Subject) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<Subject> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}