package com.example.navigation_example

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navigation_example.databinding.FragmentFirstBinding
import com.example.navigation_example.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // 프레그먼트를 바인딩해줌
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        return binding.root
    }
}