package com.junior.testepi

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgFoto = findViewById<ImageView>(R.id.imageTeste)
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.fototeste)
        val bitmapRound = RoundedBitmapDrawableFactory.create(resources, bitmap)
        bitmapRound.cornerRadius = 100f
        imgFoto.setImageDrawable(bitmapRound)
    }
}