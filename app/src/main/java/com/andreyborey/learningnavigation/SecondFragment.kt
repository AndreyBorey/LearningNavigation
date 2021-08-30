package com.andreyborey.learningnavigation

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.andreyborey.learningnavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.btnToFirstFragment.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }

        binding.btnToThirdFragment.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }
}