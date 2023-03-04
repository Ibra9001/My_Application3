package com.example.myapplication

import android.content.IntentSender.OnFinished
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private  lateinit var timer: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val root = findViewById<ConstraintLayout>(R.id.root)
        val textView = findViewById<AppCompatTextView>(R.id.textView)
        val count2 = findViewById<AppCompatButton>(R.id.button)


        val timer = object : CountDownTimer(10000, 1000) {
            override fun onTick(remaining: Long) {
                textView.text = remaining.toString()

            }

            override fun onFinish() {
                textView.text = "Done!"
            }

        }
    }
    override fun onStart() {
        super.onStart()
        timer.start()
    }

    override fun onStop() {
        super.onStop()
        timer.cancel()
    }

}

