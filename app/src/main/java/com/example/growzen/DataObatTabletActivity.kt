package com.example.growzen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class DataObatTabletActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_obat_tablet)

        val tombol = findViewById<Button>(R.id.btn_tablet_1)
        tombol.setOnClickListener {
            val intent = Intent(this, DataObat_Tablet2Activity::class.java)
            startActivity(intent)
        }

    }
}