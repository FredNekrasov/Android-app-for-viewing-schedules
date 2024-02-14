package com.schedule.data.local.dao.date

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.schedule.domain.model.date.Semester

@Dao
interface ISemesterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(semester: Semester)
    @Query("SELECT * FROM Semester")
    suspend fun getAll(): List<Semester>
    @Query("DELETE FROM Semester")
    suspend fun deleteAll()
}