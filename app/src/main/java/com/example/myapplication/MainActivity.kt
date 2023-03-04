package com.example.myapplication

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private  lateinit var timer: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val root = findViewById<ConstraintLayout>(R.id.root)
        val textView = findViewById<TextView>(R.id.textView)
        val count2 = findViewById<Button>(R.id.button)


        val timer = object : CountDownTimer(10000, 1000) {
            override fun onTick(remaining: Long) {
                textView.text = (remaining / 1000).toString()

            }

            override fun onFinish() {
                textView.text = "Done!"
            }

        }

        count2.setOnClickListener {
            timer.start()
        }
    }


    override fun onStop() {
        super.onStop()
        timer.cancel()
    }
    var name = "Hi Ibra"
 }

