package com.example.tracker_data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tracker_data.local.entity.TrackedFoodEntity

@Database(
    entities = [TrackedFoodEntity::class],
    exportSchema = false,
    version = 1
)
abstract class TrackerDatabase : RoomDatabase() {

    abstract val trackerDao: TrackerDao
}
