package com.example.growzen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.growzen.Adapter.ArtikelAdapter
import com.example.growzen.Model.ModelsArtikel

class ArtikelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_artikel)

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