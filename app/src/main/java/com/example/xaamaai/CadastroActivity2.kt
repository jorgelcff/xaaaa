package com.example.xaamaai



import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CadastroActivity2 : AppCompatActivity() {

    private lateinit var telaLogin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cadastro2)

        telaLogin = findViewById(R.id.txtlogin)

        telaLogin.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        }



        }


