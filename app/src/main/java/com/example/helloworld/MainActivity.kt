package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hwButton = findViewById<Button>(R.id.hwButton)
        hwButton.setOnClickListener {
            Log.v("Hello world", "Button clicked")
            Toast.makeText(this,"Aw, you're nice!\nHi to you too!", Toast.LENGTH_LONG).show()
        }
    }
}