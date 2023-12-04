package com.example.growzen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import com.google.android.material.bottomnavigation.BottomNavigationView

class TambahObatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_obat)


        val Btn_next = findViewById<Button>(R.id.btn_next)
        Btn_next.setOnClickListener {
            val intent = Intent(this@TambahObatActivity, TambahObat2Activity::class.java)
            startActivity(intent)

        }
    }
}