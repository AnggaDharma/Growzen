package com.example.growzen.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.growzen.Model.ModelsArtikel
import com.example.growzen.R
import java.util.EventListener

class ArtikelAdapter (private val context: Context, private val ModelsArikel : List<ModelsArtikel>, val listener: (ModelsArtikel)-> Unit)
    : RecyclerView.Adapter<ArtikelAdapter.ArtikelViewHolder>() {
    class ArtikelViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imgartikel = view.findViewById<ImageView>(R.id.img_artikel)
        val judulartikel = view.findViewById<TextView>(R.id.tv_judul_artikel)
        fun bindView(modelsArtikel: ModelsArtikel, listener: (ModelsArtikel) -> Unit) {
            imgartikel.setImageResource(modelsArtikel.imgartikel)
            judulartikel.text = modelsArtikel.judulartikel
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtikelViewHolder {
        return ArtikelViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ArtikelViewHolder, position: Int) {
        holder.bindView(ModelsArikel[position], listener)
    }


    override fun getItemCount(): Int = ModelsArikel.size
}

