package com.schedule.data.local.dao

import androidx.room.*
import com.schedule.domain.model.PairEntity

@Dao
interface IPairDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(pairEntity: PairEntity)
    @Query("SELECT * FROM PairEntity")
    suspend fun getAll(): List<PairEntity>
    @Query("DELETE FROM PairEntity")
    suspend fun deleteAll()
}