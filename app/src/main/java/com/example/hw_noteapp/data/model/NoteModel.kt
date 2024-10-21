package com.example.noteapp.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Entity(tableName = "noteModel")
data class NoteModel(
    val title: String,
    val description: String,
    val date: String,
    val time: String,
    val selectedColor: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}