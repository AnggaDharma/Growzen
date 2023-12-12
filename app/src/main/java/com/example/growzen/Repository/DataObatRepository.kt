//package com.example.growzen.Repository
//
//import androidx.lifecycle.LiveData
//import com.example.growzen.Database.DatabaseNote
//import com.example.growzen.Entity.DataObat
//
//class DataObatRepository (
//
//    val database:DatabaseNote
//    ) {
//        fun getAllDataObat(): LiveData<List<DataObat>> = database.dao().getAllDataObat()
//        fun getDataObatByJenis(jenis: String):LiveData<DataObat> = database.dao().getDataObatByJenis(jenis)
//        suspend fun insertDataObat(dataObat:DataObat) = database.dao().insertDataObat(dataObat)
//
//}
//
