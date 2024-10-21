package com.example.hw_noteapp

import PreferenceHelper
import android.app.Application
import androidx.room.Database
import androidx.room.Room
import com.example.noteapp.data.db.AppDatabase

class App : Application() {

    companion object {
        var appDatabase: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        val sharedPreferences = PreferenceHelper(this)
        sharedPreferences.unit(this)
        getInstance()
    }

    fun getInstance(): AppDatabase? {
        if (appDatabase == null) {
            appDatabase = applicationContext?.let {
                Room.databaseBuilder(
                    it,
                    AppDatabase::class.java,
                    "note,database"
                ).fallbackToDestructiveMigration().allowMainThreadQueries().build()
            }
        }
        return appDatabase
    }
}