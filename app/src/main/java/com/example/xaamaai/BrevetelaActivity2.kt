package com.example.xaamaai

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class BrevetelaActivity2 : AppCompatActivity() {

    private lateinit var telaEmBreve: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_brevetela2)

        telaEmBreve = findViewById(R.id.btnvoltar)

        telaEmBreve.setOnClickListener {

            val intent = Intent (this, MainActivity::class.java)

            startActivity(intent)
        }


        }
    }
