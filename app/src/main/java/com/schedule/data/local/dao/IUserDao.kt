package com.schedule.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.schedule.domain.model.User

@Dao
interface IUserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRecord(user: User)
    @Query("SELECT * FROM User")
    suspend fun getAll(): List<User>
    @Delete
    suspend fun deleteRecord(user: User)
}