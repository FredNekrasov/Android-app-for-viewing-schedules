package com.schedule.data.local.dao.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.schedule.domain.model.room.Audience

@Dao
interface IAudienceDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(audience: Audience)
    @Query("SELECT * FROM Audience")
    suspend fun getAll(): List<Audience>
    @Query("DELETE FROM Audience")
    suspend fun deleteAll()
}