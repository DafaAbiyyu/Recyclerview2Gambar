package com.example.sumatif1genapdafa_abiyyu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapterguru (private val dataSet:ArrayList<DataGambarguru>) :
    RecyclerView.Adapter<Adapterguru.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var foto1: ImageView = view.findViewById(R.id.idgambar)
        var nama: TextView = view.findViewById(R.id.idnama)
        var nama2: TextView = view.findViewById(R.id.idnis)
        var foto2: ImageView=view.findViewById(R.id.idgambar2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adapterguru, parent, false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataGambar = dataSet[position]
        holder.foto1.setImageResource(dataGambar.gambar)
        holder.nama.text = dataGambar.nama
        holder.nama2.text = dataGambar.nama2
        holder.foto2.setImageResource(dataGambar.gambar2)

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}