package com.schedule.data.local.dao.date

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.schedule.domain.model.date.Week

@Dao
interface IWeekDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(week: Week)
    @Query("SELECT * FROM Week")
    suspend fun getAll(): List<Week>
    @Query("DELETE FROM Week")
    suspend fun deleteAll()
}