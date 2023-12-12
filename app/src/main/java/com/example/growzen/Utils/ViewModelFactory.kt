//package com.example.growzen.Utils
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.example.growzen.Repository.DataObatRepository
//
//
//class ViewModelFactory  (private val repository: DataObatRepository
//) : ViewModelProvider.NewInstanceFactory() {
//
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        try {
//            val constructor = modelClass.getDeclaredConstructor(DataObatRepository::class.java)
//            return constructor.newInstance(repository)
//        } catch (e: Exception) {
//
//        }
//        return super.create(modelClass)
//    }
//}
