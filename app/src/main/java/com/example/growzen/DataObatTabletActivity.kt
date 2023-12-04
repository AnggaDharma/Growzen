package com.example.growzen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class DataObatTabletActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_obat_tablet)

        val buttonTablet = findViewById<Button>(R.id.btn_tablet_1)
        buttonTablet.setOnClickListener {
            val intent = Intent(this@DataObatTabletActivity , DataObat_Tablet2Activity ::class.java)
            startActivity(intent)
        }


    }
}