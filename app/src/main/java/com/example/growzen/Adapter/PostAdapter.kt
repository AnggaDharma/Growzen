package com.example.growzen.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.growzen.Model.post
import com.example.growzen.R

class PostAdapter(private val context: Context, private val postList: List<post>) :
RecyclerView.Adapter<PostAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("StringFormatInvalid")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = postList[position]

        // Set data to views
        holder.textUsername.text = post.username
        holder.textContent.text = post.content
        holder.textPostTime.text = post.postTime
        holder.img_post.setImageResource (post.image)
        holder.imagePost.setImageResource(post.image)

        holder.textLikeCount.text = context.getString(R.string.like_count, post.likes)
        holder.textCommentCount.text = context.getString(R.string.comment_count, post.comments)
    }

    override fun getItemCount(): Int {
        return postList.size
    }


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textUsername: TextView = itemView.findViewById(R.id.textUsername)
        val img_post: ImageView = itemView.findViewById(R.id.img_profile)
        val textContent: TextView = itemView.findViewById(R.id.textContent)
        val textPostTime: TextView = itemView.findViewById(R.id.textContent)
        val imagePost: ImageView = itemView.findViewById(R.id.imagePost)
        val imageLike: ImageView = itemView.findViewById(R.id.imageLike)
        val textLikeCount: TextView = itemView.findViewById(R.id.textLikeCount)
        val imageComment: ImageView = itemView.findViewById(R.id.imageComment)
        val textCommentCount: TextView = itemView.findViewById(R.id.textCommentCount)
    }
}



