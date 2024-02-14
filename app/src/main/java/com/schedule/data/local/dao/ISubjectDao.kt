package com.schedule.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.schedule.domain.model.Subject

@Dao
interface ISubjectDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(subject: Subject)
    @Query("SELECT * FROM Subject")
    suspend fun getAll(): List<Subject>
    @Query("DELETE FROM Subject")
    suspend fun deleteAll()
}