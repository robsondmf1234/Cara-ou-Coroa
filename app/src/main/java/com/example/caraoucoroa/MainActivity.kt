package com.example.caraoucoroa

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var botaoJogar: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botaoJogar = findViewById(R.id.botaoJogar)

        botaoJogar.setOnClickListener(View.OnClickListener {

            //Gerando numero randomico
            val numeroAleatorio: Int = (0..1).random()

            //Instanciando a intent
            val intent: Intent = Intent(applicationContext, SegundaActivity::class.java)

            //Adicionando o numero a intent
            intent.putExtra("numberRandom", numeroAleatorio)

            //Abridno a segunda tela
            startActivity(intent)

        })
    }
}