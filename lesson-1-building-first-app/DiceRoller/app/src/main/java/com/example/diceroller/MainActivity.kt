package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // made a reference object to the button by using the given id to the button "roll_button"
        val roll_button: Button = findViewById(R.id.roll_button)
        roll_button.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        val result_text: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        result_text.text = randomInt.toString()
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }
}