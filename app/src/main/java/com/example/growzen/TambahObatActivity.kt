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

        //fungsi klik untuk bottom navigation
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_TambahObat1)
        bottomNavigationView.setOnNavigationItemReselectedListener { item ->
            when (item.itemId){
                R.id.itemBeranda ->{
                    startActivity(Intent(this, Home ::class.java))
                    return@setOnNavigationItemReselectedListener
                }
                R.id.itemSharing->{
                    startActivity(Intent(this, SharingActivity ::class.java))
                    return@setOnNavigationItemReselectedListener
                }
                R.id.itemDataobat->{
                    startActivity(Intent(this, TambahObatActivity ::class.java))
                    return@setOnNavigationItemReselectedListener
                }
                R.id.itemProfile->{
                    startActivity(Intent(this, ProfileActivity ::class.java))
                    return@setOnNavigationItemReselectedListener
                }
                else -> false
            }

        }


        val btn_next = findViewById<Button>(R.id.btn_next)
        btn_next.setOnClickListener {
            val intent = Intent(this@TambahObatActivity, TambahObat2Activity::class.java)
            startActivity(intent)

        }
    }
}