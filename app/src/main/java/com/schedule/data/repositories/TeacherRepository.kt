package com.schedule.data.repositories

import com.schedule.data.local.dao.ITeacherDao
import com.schedule.domain.model.Teacher
import com.schedule.domain.repository.IRepository

class TeacherRepository(private val dao: ITeacherDao) : IRepository<Teacher> {
    override suspend fun insertRecord(entity: Teacher) = dao.insertRecord(entity)

    override suspend fun getAllData(): List<Teacher> = dao.getAll()

    override suspend fun deleteAllData() = dao.deleteAll()
}