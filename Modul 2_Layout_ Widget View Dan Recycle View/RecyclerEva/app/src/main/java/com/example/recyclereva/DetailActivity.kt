package com.example.recyclereva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val pahlawan = intent.getParcelableExtra<pahlawan>("pahlawan")
        if (pahlawan !=null){
            val textView : TextView = findViewById(R.id.detailActivity)
            val imageView : ImageView = findViewById(R.id.imageView2)

            textView.text = pahlawan.name
            imageView.setImageResource(pahlawan.image)
        }
    }
}