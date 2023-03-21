package com.example.myapplication1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val intent = Intent(this, NewActivity::class.java)


        button.setOnClickListener {
            intent.putExtra(NewActivity.INTENT_NAME,"КНОПКА")
            startActivity(intent)

        }
        button2.setOnClickListener {
            intent.putExtra(NewActivity.INTENT_NAME,"КНОПКА2")
            startActivity(intent)
    }
}}