package com.example.growzen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class TambahObatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_obat)

        val spinner: Spinner = findViewById(R.id.spinner2)

        // Contoh penggunaan ArrayAdapter untuk mengisi Spinner
        val jenisObatArray = resources.getStringArray(R.array.Jenis_Obat)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, jenisObatArray)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter


        // Menanggapi perubahan yang dipilih di Spinner
//        spinner.setOnItemSelectedListener { _, _, position, _ ->
//            val selectedJenisObat = jenisObatArray[position]
//
//        }

        // Sisanya dari kode onCreate
        // ...
    }
}