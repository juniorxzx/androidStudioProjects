package com.junior.testepi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.junior.testepi.databinding.FragmentFormBinding

class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)

        binding.btnVoltar.setOnClickListener{
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }
        binding.buttonPostar.setOnClickListener{
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }
        return binding.root
    }


}