package com.example.myapplication1

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val file = "SharedPreference"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = getSharedPreferences(file, Context.MODE_PRIVATE) //с 19-21 строку можно использовать в других классах//
        val edit = sharedPreferences.edit()

        val save = findViewById<Button>(R.id.Save)
        val editText = findViewById<EditText>(R.id.editText)
        val openNewScreen = findViewById<Button>(R.id.openNewScreen)
        val intent = Intent(this, NewActivity::class.java)



        save.setOnClickListener {

            val text = editText.text.toString()
            edit.putString("key", text).commit()


        }
        openNewScreen.setOnClickListener {
            sharedPreferences.getString("key","лажа")
            startActivity(intent)


        }
}}