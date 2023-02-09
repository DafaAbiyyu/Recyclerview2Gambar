package com.example.sumatif1genapdafa_abiyyu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class visi_misi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visi_misi)
    }
    fun darivisi (view: View) {
        val pindah = Intent(this,MainActivity::class.java)
        startActivity(pindah)
    }
}