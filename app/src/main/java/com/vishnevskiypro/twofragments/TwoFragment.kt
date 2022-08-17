package com.vishnevskiypro.twofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.lifecycle.ViewModelProvider
import com.vishnevskiypro.twofragments.databinding.FragmentOneBinding
import com.vishnevskiypro.twofragments.databinding.FragmentTwoBinding

class TwoFragment : Fragment() {

    private lateinit var binding: FragmentTwoBinding
    lateinit var model: SharedViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentTwoBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        binding.btnTwo.setOnClickListener {
            val msg = binding.editTextTwo.text.toString()
            model.sendMessage(msg)
        }
    }
}