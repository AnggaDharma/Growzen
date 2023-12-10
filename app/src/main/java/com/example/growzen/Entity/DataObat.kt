package com.example.growzen.Entity

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "dataobat")
data class DataObat(
    @PrimaryKey(autoGenerate = true)
    val id:Int = 0,
    val namaObat: String,
    val jenisObat: String,
    val dosis: String,
    val stok: Int
)

