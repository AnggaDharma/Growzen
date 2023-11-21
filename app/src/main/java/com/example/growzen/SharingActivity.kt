package com.example.growzen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.growzen.Adapter.PostAdapter
import com.example.growzen.Model.post

class SharingActivity : AppCompatActivity() {
    private lateinit var itemAdapter: PostAdapter
    private lateinit var postList: List<post>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi data postingan
      //  postList = generatePostList()

        // Inisialisasi adapter
        itemAdapter = PostAdapter(this, postList)

        // Atur RecyclerView
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = itemAdapter
//    }
//
//    private fun generatePostList(): List<post> {
//        val postList = mutableListOf<post>()
//        postList.add(
//            post(
//                "Nayeon",
//                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
//                "5 November 2023 08:00",
//                10,
//                5,
//                R.drawable.sample_image
//            )
//        )
//        postList.add(
//            post(
//                "Momo",
//                "Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
//                "6 November 2023 10:30",
//                20,
//                8,
//                R.drawable.sample_image
//            )
//        )
//        // Tambahkan postingan lainnya sesuai kebutuhan
//
//        return postList
    }
}