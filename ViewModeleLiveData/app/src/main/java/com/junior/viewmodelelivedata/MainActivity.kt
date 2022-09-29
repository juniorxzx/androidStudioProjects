package com.junior.viewmodelelivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.junior.viewmodelelivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//  Sera observado sempre que mudar de valor.
      mainViewModel.cont.observe(this){
          binding.textCont.text = it.toString()
      }

        binding.textCont.text = mainViewModel.cont.toString()
        binding.buttonClic.setOnClickListener{
            mainViewModel.addNum()

        }
    }
}