package com.example.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Activity : AppCompatActivity() {
    lateinit var tvHome : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_)


        var intendStarted = intend

           var extras = intendStarted.extras

           var data = extras?.getString("harmankey")

           tvHome = findViewById(R.id.tvHome)

           tvHome.text = data
    }

    fun clickHandler(view: View) {
        var hIntent = Intent( this,MainActivity::class.java)
        startActivity(hIntent)
    }
}