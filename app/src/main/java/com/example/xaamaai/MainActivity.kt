package com.example.xaamaai
import android.content.Intent
import android.os.Bundle
import android.widget.Button

import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    private lateinit var telaCadastro: TextView
    private lateinit var telaBreve: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        telaCadastro = findViewById(R.id.txtCadastro)

        telaCadastro.setOnClickListener {
            val intent = Intent(this, CadastroActivity2::class.java)

            startActivity(intent)

        telaBreve = findViewById(R.id.btn_em_breve)

        telaBreve.setOnClickListener {
            val intent = Intent(this, BrevetelaActivity2::class.java)

            startActivity(intent)
        }

        }

    }

}






