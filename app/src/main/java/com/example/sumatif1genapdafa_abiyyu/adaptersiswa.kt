package com.example.sumatif1genapdafa_abiyyu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adaptersiswa (private val dataSet:ArrayList<datagambarsiswa>) :
    RecyclerView.Adapter<adaptersiswa.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var foto1: ImageView = view.findViewById(R.id.idgambar)
        var nama: TextView = view.findViewById(R.id.idnama)
        var nis: TextView = view.findViewById(R.id.idnis)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_adaptersiswa, parent, false)
        return ViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataGambar = dataSet[position]
        holder.foto1.setImageResource(dataGambar.gambar)
        holder.nama.text = dataGambar.nama
        holder.nis.text = dataGambar.nis

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}