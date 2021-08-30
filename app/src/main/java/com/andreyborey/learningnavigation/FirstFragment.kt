package com.andreyborey.learningnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.andreyborey.learningnavigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding:FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.btnToSecondFragment.setOnClickListener{
            (activity as MainActivity).navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }


}