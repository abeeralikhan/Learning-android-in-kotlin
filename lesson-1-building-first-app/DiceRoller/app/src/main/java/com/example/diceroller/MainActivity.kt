package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    // We're using lateinit here because we will initialize it late and promising the compiler it will be initialized
    // before any operation will be performed on it
    lateinit var diceImageContainer: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // made a reference object to the button by using the given id to the button "roll_button"
        val roll_button: Button = findViewById(R.id.roll_button)
        diceImageContainer = findViewById(R.id.dice_image)
        roll_button.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val imageToShow = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImageContainer.setImageResource(imageToShow)
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
    }
}