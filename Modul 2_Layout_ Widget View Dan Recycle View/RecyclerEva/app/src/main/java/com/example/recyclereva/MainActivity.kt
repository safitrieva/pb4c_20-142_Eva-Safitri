package com.example.recyclereva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var pahlawanList : ArrayList<pahlawan>
    private lateinit var pahlawanAdapter: PahlawanAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        pahlawanList = ArrayList()

        pahlawanList.add(pahlawan(R.drawable.soekarno , "Soekarno"))
        pahlawanList.add(pahlawan(R.drawable.dahlan , "KH. Ahmad Dahlan"))
        pahlawanList.add(pahlawan(R.drawable.dd ,"Ki Hajar Dewantara"))
        pahlawanList.add(pahlawan(R.drawable.husnitamrin ,"Husni Tamrin"))
        pahlawanList.add(pahlawan(R.drawable.supriyadi ,"Supriyadadi"))
        pahlawanList.add(pahlawan(R.drawable.asyari ,"As'ad Asyari"))

        pahlawanList.add(pahlawan(R.drawable.soekarno , "Soekarno"))
        pahlawanList.add(pahlawan(R.drawable.dahlan , "KH. Ahmad Dahlan"))
        pahlawanList.add(pahlawan(R.drawable.dd ,"Ki Hajar Dewantara"))
        pahlawanList.add(pahlawan(R.drawable.ihusnitamrin ,"Husni Tamrin"))
        pahlawanList.add(pahlawan(R.drawable.supriyadi ,"Supriyadadi"))
        pahlawanList.add(pahlawan(R.drawable.asyari ,"As'ad Asyari"))

        pahlawanAdapter = PahlawanAdapter(pahlawanList)
        recyclerView.adapter = pahlawanAdapter

        pahlawanAdapter.onItemClick = {
            val intent = Intent( this , DetailActivity::class.java)
            intent.putExtra("pahlawan" , it)
            startActivity(intent)
        }
    }
}