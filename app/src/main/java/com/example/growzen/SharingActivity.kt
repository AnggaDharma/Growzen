package com.example.growzen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.growzen.Adapter.PostAdapter
import com.example.growzen.Model.ModelSharing
import com.google.android.material.bottomnavigation.BottomNavigationView


class SharingActivity : AppCompatActivity() {
    private lateinit var postAdapter: PostAdapter
    private lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sharing)

        //fungsi klik untuk bottom navigation
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_Sharing)
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


        val postList = generateDummyData()
        postAdapter = PostAdapter(this, postList)

        recyclerView = findViewById(R.id.rv_post)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = postAdapter
    }

    private fun generateDummyData(): List<ModelSharing> {
        // You can replace this with your actual data retrieval logic
        val dummyList = mutableListOf<ModelSharing>()
        dummyList.add(ModelSharing(R.drawable.pict_profile, "Nayeon", "12 October 2023", "SDH mw 3 bulan minum oat, 2 mnggu trakhir ni dr pinggul sampai lutut nyeri trutama saat mw bangun dr tidur, trus kalau di kaki ditekuk itu nyeri skalii, ada yg sama gak,??\n" +
                "Tnggl 13 ni kntrol dahak dan ronsen doakan yha smoga hasilnya membaik", 10, 9))
        dummyList.add(ModelSharing(R.drawable.pict_profile, "Momo", "11 October 2023", "Halo. Saya mau tanya nih. Kemarin jadwal makan obat saya malam.\n" +
                "Tapi karena ketiduran jadi ingatnya pagi jam 5. Setelah itu sekarang keadaan saya persis seperti gejala awal. Mohon masukan bagi yg mengerti, apakah saya sudah kebal obat ya? "
            ,  20, 8))
        // Add more items as needed
        return dummyList
    }
}

