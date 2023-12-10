package com.example.growzen.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.growzen.Entity.DataObat
import com.example.growzen.Entity.WaktuObat


@Database(entities = [DataObat::class,WaktuObat::class], version = 2)
abstract class DatabaseNote : RoomDatabase() {
    abstract fun dao(): Dao

    companion object {
        private const val DB_NAME = "database.db"
        @Volatile
        private var instance: DatabaseNote? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also {
                instance = it
            }
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            DatabaseNote::class.java,
            DB_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }
}