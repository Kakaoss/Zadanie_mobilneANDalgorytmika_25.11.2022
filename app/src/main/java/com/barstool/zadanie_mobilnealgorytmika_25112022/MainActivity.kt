package com.barstool.zadanie_mobilnealgorytmika_25112022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val losuj = findViewById<Button>(R.id.btnLosuj)
        val sortuj = findViewById<Button>(R.id.btnSort)



    }
}