package com.example.growzen.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.growzen.Entity.DataObat
import com.example.growzen.R
import androidx.recyclerview.widget.DiffUtil


class DataObatAdapter : ListAdapter<DataObat, DataObatAdapter.DataObatViewHolder>(DataObatDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataObatViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_obat, parent, false)
        return DataObatViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataObatViewHolder, position: Int) {
        val dataObat = getItem(position)
        holder.bind(dataObat)
    }

    fun submitList(dataObatList: DataObat) {
        submitList(dataObatList)
    }



    class DataObatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvNamaObat: TextView = itemView.findViewById(R.id.tvNamaObat)
        private val tvDosis: TextView = itemView.findViewById(R.id.tvDosis)
        private val tvStok: TextView = itemView.findViewById(R.id.tvStok)
        private val tvJenis: TextView = itemView.findViewById(R.id.tvWaktu)

        fun bind(dataObat: DataObat) {
            tvNamaObat.text = dataObat.namaObat
            tvDosis.text = dataObat.dosis
            tvStok.text = dataObat.stok.toString()
            tvJenis.text = dataObat.jenisObat
        }
    }

    private class DataObatDiffCallback : DiffUtil.ItemCallback<DataObat>() {
        override fun areItemsTheSame(oldItem: DataObat, newItem: DataObat): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: DataObat, newItem: DataObat): Boolean {
            return oldItem == newItem
        }
    }
}