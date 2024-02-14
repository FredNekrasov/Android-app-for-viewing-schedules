package com.schedule.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.schedule.domain.model.Teacher

@Dao
interface ITeacherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(teacher: Teacher)
    @Query("SELECT * FROM Teacher")
    suspend fun getAll(): List<Teacher>
    @Query("DELETE FROM Teacher")
    suspend fun deleteAll()
}