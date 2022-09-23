package com.junior.testepi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.junior.testepi.databinding.ActivityHomeBinding
import com.junior.testepi.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener{
            val voltarParaPostagem = Intent(this, HomeActivity::class.java)
            startActivity(voltarParaPostagem)
        }
    }
}