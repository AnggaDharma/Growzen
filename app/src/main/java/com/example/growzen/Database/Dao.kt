package com.example.growzen.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.growzen.Entity.DataObat
import com.example.growzen.Entity.WaktuObat

@Dao
interface Dao {

    @Query("SELECT * FROM waktuobat")
    fun getAllWaktuObatData(): LiveData<List<WaktuObat>>

    @Query("SELECT * FROM waktuobat WHERE id = :id")
    fun getWaktuObatById(id: Int): LiveData<WaktuObat>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWaktuObat(data: WaktuObat)

    @Update()
    suspend fun updateWaktuObat(data: WaktuObat)

    @Delete()
    suspend fun deleteWaktuObat(data: WaktuObat)

    @Query("SELECT * FROM dataobat")
    fun getAllDataObatData(): LiveData<List<DataObat>>

    @Query("SELECT * FROM dataobat WHERE id = :id")
    fun getDataObatById(id: Int): LiveData<DataObat>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDataObat(data: DataObat)

    @Update()
    suspend fun updateDataObat(data: DataObat)

    @Delete()
    suspend fun deleteDataObat(data: DataObat)

    @Query("SELECT * FROM dataobat WHERE jenisObat = :jenisObat")
    fun getDataObatByJenis(jenisObat: String): List<DataObat>

}