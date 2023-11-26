package com.example.growzen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.growzen.Adapter.ArtikelAdapter
import com.example.growzen.Model.ModelsArtikel
import com.google.android.material.bottomnavigation.BottomNavigationView

class ArtikelActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artikel)
//
//        val isiconten= findViewById<ImageView>(R.id.img_artikel)
//        isiconten.setOnClickListener {
//            val intent = Intent(this@ArtikelActivity , IsiArtikellActivity ::class.java)
//            startActivity(intent)
//        }


        //fungsi klik untuk bottom navigation
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_artikel)
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

        val artikelList = listOf<ModelsArtikel>(
            ModelsArtikel(R.drawable.content1,
                "Apa Itu TBC ?"
            ),
            ModelsArtikel(
                R.drawable.content2,
                "tanda-tanda gejela TBC?"
            ),
            ModelsArtikel(
                R.drawable.content3,
                "Pengobatan TBC ?"
            ),
            ModelsArtikel(
                R.drawable.content4,
                "Penyebab Terkena TBC?"
            ),
            )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_artikel)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ArtikelAdapter(this,artikelList){

        }



    }
}