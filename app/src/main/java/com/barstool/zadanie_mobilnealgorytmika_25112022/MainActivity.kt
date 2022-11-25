package com.barstool.zadanie_mobilnealgorytmika_25112022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val losuj = findViewById<Button>(R.id.btnLosuj)
        val sortuj = findViewById<Button>(R.id.btnSort)

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
        while (i < 9){
            przyciski[i].text = Random.nextInt(0,50).toString()
            i += 1
        }
    }
    }
}