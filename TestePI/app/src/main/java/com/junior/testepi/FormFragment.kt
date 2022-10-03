package com.junior.testepi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.junior.testepi.databinding.FragmentFormBinding


class FormFragment : Fragment() {
//    private val mainViewModel: MainViewModel by activityViewModels()
    private lateinit var binding: FragmentFormBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        binding.buttonPostar.setOnClickListener{
            inserirNoBanco()

        }

        return binding.root
    }
    private fun validarCampos( image: String, descricao: String): Boolean{
        return !( (descricao == "" || descricao.length < 5 || descricao.length > 200) ||
                        (image ==  "" || image.length < 10)
                )
    }

    private fun inserirNoBanco(){
        val image = binding.imgLink.text.toString()
        val desc = binding.textLegenda.text.toString()

        if(validarCampos( desc, image)){
            Toast.makeText(context, "Tarefa criada 😎🍭💅", Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }else{
            Toast.makeText(context, "Verique os campos 😢😶‍🌫️🤯", Toast.LENGTH_LONG).show()
        }
    }


}