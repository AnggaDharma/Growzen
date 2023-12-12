package com.example.growzen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Spinner
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.example.growzen.Adapter.DataObatAdapter
import com.example.growzen.Database.DatabaseNote
import com.example.growzen.databinding.ActivityDataObatBinding


class DataObatActivity : AppCompatActivity() {

//    private lateinit var viewModel: DataObatViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_obat)
//
//
////        val jenis = intent.getStringExtra("JENIS") ?: ""
////
////        viewModel = ViewModelProvider(this)[DataObatViewModel::class.java]
////
////        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
////        val adapter = DataObatAdapter()
////        recyclerView.adapter = adapter
////
////        viewModel.getDataObatByJenis(jenis).observe(this, Observer { dataObatList ->
////            adapter.submitList(dataObatList)
////        })
    }
}




//class DataObatActivity : AppCompatActivity() {
//
//    private lateinit var binding: ActivityDataObatBinding
//    private lateinit var viewModel: DataObatViewModel
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_obat)
//        binding.lifecycleOwner = this
//
//        val jenis = intent.getStringExtra("JENIS") ?: ""
//
//        viewModel = ViewModelProvider(this, ViewModelFactory(repository = DataObatRepository(database = DatabaseNote(this)))).get(DataObatViewModel::class.java)
//
//
//        binding.viewModel = viewModel
//
//        val adapter = DataObatAdapter()
//        binding.recyclerView.adapter = adapter
//
//        viewModel.getDataObatByJenis(jenis).observe(this, Observer { dataObatList ->
//            dataObatList?.let {
//                adapter.submitList(it)
//            }
//        })
//
//    }
//
//
//}