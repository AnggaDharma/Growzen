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

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDataObat(dataObat: DataObat)

    @Query("SELECT * FROM dataobat")
    fun getAllDataObat(): LiveData<List<DataObat>>

//    @Query("SELECT * FROM dataobat WHERE jenisObat = :jenis")
//    fun getDataObatByJenis(jenis:String):LiveData<List<DataObat>>

    @Query("SELECT * FROM dataobat WHERE jenisObat = :jenis")
    fun getDataObatByJenis(jenis:String):LiveData<DataObat>


    @Update
    suspend fun updateObat(obat: DataObat)

    @Delete
    suspend fun deleteObat(obat: DataObat)

}