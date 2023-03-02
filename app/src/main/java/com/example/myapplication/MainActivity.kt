package com.example.myapplication

import android.content.IntentSender.OnFinished
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

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//     val timer = object : CountDownTimer(millislnFuture: 10000){
//         override fun onTick (milliUntilFinished: Long) {
//             println(milliUntilFinished / 1000)
//         }
//            override fun OnFinished() {
//                println("Finished")
//            }
//        }

    }




        fun countMe(view: View){
        val countString = textView.text.toString()
            var count : Int = Integer.parseInt(countString)
            count++

            textView.text =count.toString()
    }

}