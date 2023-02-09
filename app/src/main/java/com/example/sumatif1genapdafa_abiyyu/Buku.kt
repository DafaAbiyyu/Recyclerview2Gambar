package com.example.sumatif1genapdafa_abiyyu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Buku : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buku)

        recyclerView = findViewById(R.id.listDatabuku)
        var data = ArrayList<DataGambar>()
        data.add(DataGambar(R.drawable.teknologi2,"TEKNOLOGI"))
        data.add(DataGambar(R.drawable.otomotif2,"OTOMOTIF"))
        data.add(DataGambar(R.drawable.sejarah2,"SEJARAH"))
        data.add(DataGambar(R.drawable.kesenian,"KESENIAN"))
        data.add(DataGambar(R.drawable.ekonimi2,"EKONOMI"))

        recyclerAdapter = Adapternya(data)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager
    }
    fun daribuku (view: View) {
        val pindah = Intent(this,MainActivity::class.java)
        startActivity(pindah)
    }
}