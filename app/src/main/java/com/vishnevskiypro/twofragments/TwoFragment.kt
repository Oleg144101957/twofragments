package com.vishnevskiypro.twofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import com.vishnevskiypro.twofragments.databinding.FragmentOneBinding
import com.vishnevskiypro.twofragments.databinding.FragmentTwoBinding


class TwoFragment : Fragment() {

    private lateinit var binding: FragmentTwoBinding


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

        //подписываемся на данные, которые лежат в Bundle
        setFragmentResultListener("ArgOne"){ key, bundle ->
            val result = bundle.getString("MyString")
            binding.tvTwo.text = result

        }

    }

}