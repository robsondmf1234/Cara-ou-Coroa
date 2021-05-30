package com.example.caraoucoroa

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity() {

    lateinit var botaoVoltar: ImageButton
    lateinit var imageCaraOuCoroa: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        botaoVoltar = findViewById(R.id.botaoVoltar)
        imageCaraOuCoroa = findViewById(R.id.imageCaraOuCoroa)

        //Recuperando os dados vindo da primeira actvity
        val dados: Bundle? = intent.extras

        //Verificando se o bundle não está nulo
        if (dados != null) {
            //Extrando o int do bundle
            val number: Int = dados.getInt("numberRandom")


            if (number == 0) imageCaraOuCoroa.setImageResource(R.drawable.moeda_cara)
            else imageCaraOuCoroa.setImageResource(R.drawable.moeda_coroa)
        }

        botaoVoltar.setOnClickListener(View.OnClickListener {
            //Finalizando a activity
            finish()
        })
    }
}