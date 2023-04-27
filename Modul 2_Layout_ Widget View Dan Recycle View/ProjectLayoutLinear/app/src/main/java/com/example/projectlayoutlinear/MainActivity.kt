package com.example.projectlayoutlinear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.wear.tiles.material.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<EditText>(R.id.txtNama)
        val nim = findViewById<EditText>(R.id.txtNim)
        val rdsi = findViewById<RadioButton>(R.id.rbSistemInformasi)
        val rdtif = findViewById<RadioButton>(R.id.rbTeknikInformatika)
        val rdti = findViewById<RadioButton>(R.id.rbTeknikindustri)
        val imgBtn = findViewById<ImageButton>(R.id.imgButtonAdd)
        val cancelBtn = findViewById<ImageButton>(R.id.imgButtonCancel)
        val rgroup = findViewById<RadioGroup>(R.id.rgroup)
        val cb = findViewById<CheckBox>(R.id.cbCoding)
        val cb1 = findViewById<CheckBox>(R.id.cbReading)

        cancelBtn.setOnClickListener {
            text.setText("")
            nim.setText("")
            rgroup.clearCheck()
        }

        imgBtn.setOnClickListener {
            val tampil: String
            val prodi: String
            val hobi: String


            if (rdsi.isChecked) {
                prodi = "Sistem Informasi"

            } else if (rdtif.isChecked) {
                prodi = "Teknik Informatika"

            }else if (rdti.isChecked) {
                prodi = "Teknik Industri"

            } else {
                prodi = ""
            }

            if (cb.isClickable) {
                hobi = "Coding"
            } else if (cb1.isClickable) {
                hobi = "Reading"
            }

            tampil = "Nama " + text.getText() + prodi  +  "Berhasil"
            Toast.makeText(this@MainActivity, tampil, Toast.LENGTH_SHORT).show()

        }
    }
}


