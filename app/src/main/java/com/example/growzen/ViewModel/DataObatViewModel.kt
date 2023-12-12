//package com.example.growzen.ViewModel
//
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.example.growzen.Entity.DataObat
//import com.example.growzen.Repository.DataObatRepository
//import kotlinx.coroutines.launch
//
//
//
////class DataObatViewModel(application: Application) : AndroidViewModel(application) {
////
////    private val repository: DataObatRepository
////    val allDataObat: LiveData<List<DataObat>>
////
////    init {
////        val dataObatDao = DatabaseNote.invoke(application).dao()
//////        val dataObatDao = DatabaseNote.getDatabase(application).Dao()
////        repository = DataObatRepository(dataObatDao)
////        allDataObat = repository.allDataObat
////
////    fun insertDataObat(dataObat: DataObat) = viewModelScope.launch {
////        repository.insertDataObat(dataObat)
////        Log.d("DataObatViewModel", "Data inserted successfully: $dataObat")
////    }
////
////    fun getDataObatByJenis(jenis: String): LiveData<List<DataObat>> {
////        return repository.getDataObatByJenis(jenis)
////    }
////}
//
//
//
//
//
//
////class DataObatViewModel(
////    val repo: DataObatRepository
////) : ViewModel() {
////    fun getAllDataObat() =
////        repo.getAllDataObat()
////
////    fun insertDataObat(dataObat: DataObat) =
////        viewModelScope.launch {
////            repo.insertDataObat(dataObat)
////        }
////
////    fun getDataObatByJenis(jenis: String) =
////        repo.getDataObatByJenis(jenis)
////}
//
//
//
//
//
//
//class DataObatViewModel(val repo: DataObatRepository) : ViewModel() {
//    fun getAllDataObat() = repo.getAllDataObat()
//
//    fun insertDataObat(dataObat: DataObat) = viewModelScope.launch {
//        repo.insertDataObat(dataObat)
//    }
//
//    fun getDataObatByJenis(jenis: String) = repo.getDataObatByJenis(jenis)
//}
//
