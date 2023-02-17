package com.example.trafficlightapp2hw2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var counter: OnClickListener
    private lateinit var redLight : ImageView
    private lateinit var yellowLight : ImageView
    private lateinit var greenLight : ImageView

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        currentIndex = (currentIndex + 1)% 3

        if (currentIndex == 1){
            redLight.visibility = View.VISIBLE
            yellowLight.visibility = View.INVISIBLE
            greenLight.visibility = View.INVISIBLE
            button.setBackgroundColor(Color.RED)
            button.text = "STOP"

        } else if (currentIndex == 2) {
            redLight.visibility = View.INVISIBLE
            yellowLight.visibility = View.INVISIBLE
            greenLight.visibility = View.VISIBLE
            button.setBackgroundColor(Color.GREEN)
            button.text = "GO"

        } else if (currentIndex ==3) {
            redLight.visibility = View.INVISIBLE
            yellowLight.visibility = View.VISIBLE
            greenLight.visibility = View.INVISIBLE
            button.setBackgroundColor(Color.YELLOW)
            button.text = "WAIT"

        }
    }
}