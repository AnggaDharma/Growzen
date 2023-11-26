package com.example.growzen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class DataObatTabletActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_obat_tablet)

        val buttonTablet = findViewById<Button>(R.id.btn_tablet_1)
        buttonTablet.setOnClickListener {
            val intent = Intent(this@DataObatTabletActivity , DataObat_Tablet2Activity ::class.java)
            startActivity(intent)
        }


        //fungsi klik untuk bottom navigation
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation_DO)
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