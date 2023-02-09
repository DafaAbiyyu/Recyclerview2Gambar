package com.example.sumatif1genapdafa_abiyyu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapternya (private val dataSet:ArrayList<DataGambar>) :
        RecyclerView.Adapter<Adapternya.ViewHolder>() {
        class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
                var foto1: ImageView = view.findViewById(R.id.tempatGambar1)
                var judul1: TextView =view.findViewById(R.id.tempaiText1)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
                val inflate = LayoutInflater.from(parent.context)
                        .inflate(R.layout.activity_adapternya,parent,false)
                return ViewHolder(inflate)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
               val dataGambar = dataSet[position]
                holder.foto1.setImageResource(dataGambar.gambar1)
                holder.judul1.text = dataGambar.title1
        }

        override fun getItemCount(): Int {
                return dataSet.size
        }
}