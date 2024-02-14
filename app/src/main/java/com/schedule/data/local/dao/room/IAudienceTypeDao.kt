package com.schedule.data.local.dao.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.schedule.domain.model.room.AudienceType

@Dao
interface IAudienceTypeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(audienceType: AudienceType)
    @Query("SELECT * FROM AudienceType")
    suspend fun getAll(): List<AudienceType>
    @Query("DELETE FROM AudienceType")
    suspend fun deleteAll()
}