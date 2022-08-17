package com.vishnevskiypro.twofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.setFragmentResult
import androidx.lifecycle.ViewModelProvider
import com.vishnevskiypro.twofragments.databinding.FragmentOneBinding


class OneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        val mViewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        mViewModel.message.observe(viewLifecycleOwner, {
            binding.tvOne.text = it
        })

        binding = FragmentOneBinding.inflate(layoutInflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


    }

}