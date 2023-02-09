package com.example.sumatif1genapdafa_abiyyu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
      fun Kevisi (view: View) {
            val pindah = Intent(this,visi_misi::class.java)
            startActivity(pindah)
      }
    fun KeGuru (view: View) {
          val pindah2 = Intent(this,Guru::class.java)
          startActivity(pindah2)
     }
      fun KeBuku (view: View) {
          val pin = Intent(this,Buku::class.java)
          startActivity(pin)
      }
    fun KeSiswa (view: View) {
          val dah = Intent(this,Siswa::class.java)
          startActivity(dah)
      }
}