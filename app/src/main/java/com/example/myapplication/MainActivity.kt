package com.example.myapplication

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private lateinit var timer: CountDownTimer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val TIMER_DURATION = 10000L
        var timerIsStarted = false
        var clicks = 0
        var highScore = 0

        val scoreButton = findViewById<TextView>(R.id.score_button)
        val timerTextView = findViewById<TextView>(R.id.timer_tv)
        val highScoreTextView = findViewById<TextView>(R.id.highscore_tv)

        val timer = object : CountDownTimer(TIMER_DURATION, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timerTextView.text = (millisUntilFinished / 1000).toString()

            }

            override fun onFinish() {
                if (clicks > highScore) {
                    timerIsStarted = false
                    highScore = clicks
                    clicks = 0
                    scoreButton.text = clicks.toString()
                }
            }
        }
        scoreButton.setOnClickListener {
            if (!timerIsStarted) {
                timer.start()
                timerIsStarted = true
            } else {
                clicks++
                scoreButton.text = clicks.toString()
            }
        }
    }
}
