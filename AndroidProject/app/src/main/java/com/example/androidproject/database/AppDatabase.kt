package com.example.androidproject.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [], version = 1)
abstract class AppDatabase : RoomDatabase() {
    // Add your DAOs here
    // abstract fun exampleDao(): ExampleDao
}