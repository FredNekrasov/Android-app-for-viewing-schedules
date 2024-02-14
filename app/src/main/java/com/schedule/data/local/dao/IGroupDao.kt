package com.schedule.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.schedule.domain.model.Squad

@Dao
interface IGroupDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(squad: Squad)
    @Query("SELECT * FROM Squad")
    suspend fun getAll(): List<Squad>
    @Query("DELETE FROM Squad")
    suspend fun deleteAll()
}