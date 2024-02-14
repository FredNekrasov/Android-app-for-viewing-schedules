package com.schedule.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.schedule.data.local.dao.IGroupDao
import com.schedule.data.local.dao.IPairDao
import com.schedule.data.local.dao.ISubjectDao
import com.schedule.data.local.dao.ITeacherDao
import com.schedule.data.local.dao.IUserDao
import com.schedule.data.local.dao.date.ISemesterDao
import com.schedule.data.local.dao.date.IWeekDao
import com.schedule.data.local.dao.room.IAudienceDao
import com.schedule.data.local.dao.room.IAudienceTypeDao
import com.schedule.domain.model.PairEntity
import com.schedule.domain.model.Squad
import com.schedule.domain.model.Subject
import com.schedule.domain.model.Teacher
import com.schedule.domain.model.User
import com.schedule.domain.model.date.Semester
import com.schedule.domain.model.date.Week
import com.schedule.domain.model.room.Audience
import com.schedule.domain.model.room.AudienceType
import javax.inject.Singleton

@Singleton
@Database(
    entities = [Teacher::class, Subject::class, Squad::class, AudienceType::class, Audience::class, Semester::class, Week::class, PairEntity::class, User::class],
    version = 1,
    exportSchema = false
)
abstract class MainDB : RoomDatabase() {
    abstract val teacherDao: ITeacherDao
    abstract val subjectDao: ISubjectDao
    abstract val groupDao: IGroupDao
    abstract val audienceTypeDao: IAudienceTypeDao
    abstract val audienceDao: IAudienceDao
    abstract val semesterDao: ISemesterDao
    abstract val weekDao: IWeekDao
    abstract val pairDao: IPairDao
    abstract val userDao: IUserDao
    companion object {
        const val DB_NAME = "schedule.db"
    }
}