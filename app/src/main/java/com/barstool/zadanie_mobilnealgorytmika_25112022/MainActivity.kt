package com.barstool.zadanie_mobilnealgorytmika_25112022

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Collections.swap
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val losuj = findViewById<Button>(R.id.btnLosuj)
        val sortuj = findViewById<Button>(R.id.btnSort)
        val text = findViewById<TextView>(R.id.napis)

        val przyciski:List<Switch> = listOf(
            findViewById(R.id.switch1),
            findViewById(R.id.switch2),
            findViewById(R.id.switch3),
            findViewById(R.id.switch4),
            findViewById(R.id.switch5),
            findViewById(R.id.switch6),
            findViewById(R.id.switch7),
            findViewById(R.id.switch8),
            findViewById(R.id.switch9)
        )

    losuj.setOnClickListener {
        var i = 0
        while (i < 8){
            przyciski[i].text = Random.nextInt(0,50).toString()
            i += 1
        }
    }
    sortuj.setOnClickListener {
            var x = 0
            val liczby:MutableList<Int> = mutableListOf()
            while (x < 8){
                if (przyciski[x].isChecked){
                    liczby.add(przyciski[x].text.toString().toInt())
                }
            x += 1
            }
        for (j in 0 until liczby.size-1)
            for (i in 0 until liczby.size-1)
                if (liczby[i] > liczby[i+1]){
                    val pom = liczby[i]
                    liczby[i] = liczby[i+1]
                    liczby[i+1] = pom
            }
        text.text = liczby.toString()
        }
    }
}
