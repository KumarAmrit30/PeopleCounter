package com.example.myfirstapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var peopleCount=0;
        val textView=findViewById<TextView>(R.id.textView)
        textView.text="People Counter : $peopleCount"
        val btnClickMe=findViewById<Button>(R.id.myButton)
        btnClickMe.setOnClickListener {
            peopleCount++;
            textView.text="People Counter : $peopleCount"
        }
        val btnReset=findViewById<Button>(R.id.resetButton)
        btnReset.setOnClickListener {
            peopleCount=0;
            textView.text="People Counter : $peopleCount"
        }
    }
}