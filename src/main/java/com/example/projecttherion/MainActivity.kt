package com.example.projecttherion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            val intent = Intent(this,LoginOwner::class.java)
            startActivity(intent)
        }
        val client = findViewById<Button>(R.id.button22)

        client.setOnClickListener {
            val intent = Intent(this,LoginClient::class.java)
            startActivity(intent)
        }
            }
        }