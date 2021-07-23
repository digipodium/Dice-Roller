package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textOutput: TextView = findViewById(R.id.text_value);
        textOutput.setText("Welcome")

        val btn: Button = findViewById(R.id.button_roll)
        btn.setOnClickListener {
            val random = (1..6).random()
            textOutput.text = random.toString()
        }

    }
}