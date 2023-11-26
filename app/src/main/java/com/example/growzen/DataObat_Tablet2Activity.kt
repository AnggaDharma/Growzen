package com.example.growzen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class DataObat_Tablet2Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_obat_tablet2)


        //fungsi klik untuk bottom navigation
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_Tablet)
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
    }
}