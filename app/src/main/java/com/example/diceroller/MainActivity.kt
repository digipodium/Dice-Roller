package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textOutput: TextView = findViewById(R.id.text_value)
        val textScore: TextView = findViewById(R.id.text_score)
        textOutput.setText("Welcome")

        val btn: Button = findViewById(R.id.button_roll)
        var score: Int = 0
        btn.setOnClickListener {
            val random = (1..6).random()
            textOutput.text = random.toString()
            if (random == 6) {
                score = score.inc()
                textScore.text = score.toString()
            }
            //TODO
            // 1. if the random value is 1, then decrease the score by -1

            //TODO
            // 2. add a counter that display how many times we clicked on the button
        }

        val btnReset: Button = findViewById(R.id.button_reset)
        btnReset.setOnClickListener {
            score = 0
            textScore.text = score.toString()
        }

    }
}