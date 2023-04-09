package com.example.myapplication1

import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewActivity : AppCompatActivity() {

    private val file = "SharedPreference"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        val sharedPreferences = getSharedPreferences(file, Context.MODE_PRIVATE)
        val textView = findViewById<TextView>(R.id.textView)

        val pulOut = sharedPreferences.getString("key","лажа")
        textView.text = pulOut

    }
}