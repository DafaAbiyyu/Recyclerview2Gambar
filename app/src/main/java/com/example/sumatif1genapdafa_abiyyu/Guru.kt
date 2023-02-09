package com.example.sumatif1genapdafa_abiyyu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Guru : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guru)

        recyclerView = findViewById(R.id.listData_guru)
        var data = ArrayList<DataGambarguru>()
        data.add(DataGambarguru(R.drawable.grahambell,R.drawable.grahambell,"Pak imam","teori produktif"))
        data.add(DataGambarguru(R.drawable.grahambell,R.drawable.grahambell,"pak zubaidi","teori produktif"))
        data.add(DataGambarguru(R.drawable.grahambell,R.drawable.grahambell,"pak karim","database"))
        data.add(DataGambarguru(R.drawable.grahambell,R.drawable.grahambell,"pak tias","B.inggris"))


        recyclerAdapter = Adapterguru(data)
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        recyclerView.adapter = recyclerAdapter
        recyclerView.layoutManager = layoutManager
    }

    fun dariGURU (view: View) {
        val pindah = Intent(this,MainActivity::class.java)
        startActivity(pindah)
    }
}