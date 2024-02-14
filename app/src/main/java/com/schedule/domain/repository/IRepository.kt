package com.schedule.domain.repository

interface IRepository<T> {
    suspend fun insertRecord(entity: T)
    suspend fun getAllData(): List<T>
    suspend fun deleteAllData()
}