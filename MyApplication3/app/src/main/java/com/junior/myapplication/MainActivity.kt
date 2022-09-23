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

        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(id.textDado)

        val imageDado = findViewById<ImageView>(id.imageDado)

        textDado.text = rolagem.toString()

        when(lados){
            6 -> {
                when(rolagem){
                    1 -> imageDado.setImageResource(R.drawable.dice_1)
                    2 -> imageDado.setImageResource(R.drawable.dice_2)
                    3 -> imageDado.setImageResource(R.drawable.dice_3)
                    4 -> imageDado.setImageResource(R.drawable.dice_4)
                    5 -> imageDado.setImageResource(R.drawable.dice_5)
                    6 -> imageDado.setImageResource(R.drawable.dice_6)
                }
            }
            12 -> {
                when(rolagem){
                    1 -> imageDado.setImageResource(R.drawable.dice_1)
                    2 -> imageDado.setImageResource(R.drawable.dice_2)
                    3 -> imageDado.setImageResource(R.drawable.dice_3)
                    4 -> imageDado.setImageResource(R.drawable.dice_4)
                    5 -> imageDado.setImageResource(R.drawable.dice_5)
                    6 -> imageDado.setImageResource(R.drawable.dice_6)
                    else -> {
                        imageDado.setImageResource(R.drawable.ic_square)
                    }
                }
            }
            20 -> {

            }
        }
    }
}
