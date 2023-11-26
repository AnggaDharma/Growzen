package com.example.growzen

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Home : AppCompatActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //fungsi klik untuk bottom navigation

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_view)
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

        val artikel = findViewById<ImageView>(R.id.Artikel_1)
        artikel.setOnClickListener{
            val intent = Intent(this@Home, ArtikelActivity::class.java)
            startActivity(intent)
        }

        val notikasi = findViewById<ImageView>(R.id.notifikasi)
        notikasi.setOnClickListener{
            val intent = Intent(this@Home, NotifikasiActivity ::class.java)
            startActivity(intent)
        }

        val tablet = findViewById<ImageView>(R.id.Tablet)
        tablet.setOnClickListener {
            val intent = Intent(this@Home , DataObatTabletActivity ::class.java)
            startActivity(intent)
        }





    }
}
