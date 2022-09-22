package com.junior.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.junior.myapplication.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)



        val exit = findViewById<ImageView>(id.imageExit)

        exit.setOnClickListener{
            finishAffinity();
        }
        /* findViewById() */

        /* Recuperando os buttons */
        val buttonD6 = findViewById<Button>(id.buttonD6);
        val buttonD12 = findViewById<Button>(id.buttonD12);
        val buttonD20 = findViewById<Button>(id.buttonD20);

        buttonD6.setOnClickListener {
            //Toast.makeText(this, "Clicou", Toast.LENGTH_SHORT).show()
            rolardados(6)
        }

        buttonD12.setOnClickListener {
            //Toast.makeText(this, "Clicou", Toast.LENGTH_SHORT).show()
            rolardados(12)
        }

        buttonD20.setOnClickListener {
            //Toast.makeText(this, "Clicou", Toast.LENGTH_SHORT).show()
            rolardados(20)
        }

    }


    private fun rolardados(lados: Int) {


        when(lados){
            6 -> {
                val rolagem = (1..6).random()

                val textDado = findViewById<TextView>(id.textDado)

//                val imageDado = findViewById<ImageView>(id.imageDado)
                textDado.text = rolagem.toString()

//                when(rolagem){
//                    1 -> imageDado.setImageDrawable(R.drawable)
//
//                }
            }
            12 -> {
                val rolagem = (1..12).random()

                val textDado = findViewById<TextView>(id.textDado)

                textDado.text = rolagem.toString()
            }
            20 -> {
                val rolagem = (1..20).random()

                val textDado = findViewById<TextView>(id.textDado)

                textDado.text = rolagem.toString()
            }
        }

    }


}