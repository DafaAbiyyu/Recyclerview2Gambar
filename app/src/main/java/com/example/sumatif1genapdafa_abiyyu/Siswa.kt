package com.example.sumatif1genapdafa_abiyyu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Siswa : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siswa)

        recyclerView = findViewById(R.id.listDatasiswa)
        var data = ArrayList<datagambarsiswa>()
        data.add(datagambarsiswa(R.drawable.siswa,"Hadi","20.47655"))
        data.add(datagambarsiswa(R.drawable.siswa,"karinia","20.3864"))
        data.add(datagambarsiswa(R.drawable.siswa,"Adit sopo","20.8433"))
        data.add(datagambarsiswa(R.drawable.siswa,"burhan","20.9833"))
        data.add(datagambarsiswa(R.drawable.siswa,"depot","20.9897"))


        recyclerAdapter = adaptersiswa(data)
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager
    }
    fun kembali (view: View) {
        val pindah = Intent(this@Siswa,MainActivity::class.java)
        startActivity(pindah)
    }
}