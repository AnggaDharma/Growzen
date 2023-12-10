package com.example.growzen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class TambahObat2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_obat2)

        //fungsi klik untuk bottom navigation


        val alarm = findViewById<Button>(R.id.btn_simpan)
        alarm.setOnClickListener {
            val intent = Intent(this@TambahObat2Activity, MainActivity::class.java)
            startActivity(intent)
        }

    }
}