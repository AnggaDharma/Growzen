package com.example.growzen.Model

data class post (
    val id: Int,
    val username: String,
    val content: String,
    val postTime : String,
    val image: Int, // ID sumber daya gambar
    var likes: Int,
    var comments: Int
)