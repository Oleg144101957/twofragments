package com.vishnevskiypro.twofragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.setFragmentResult
import com.vishnevskiypro.twofragments.databinding.FragmentOneBinding


class OneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentOneBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val bundle = Bundle()


        //слушаем изменения в поле EditText и сразу кладем их в Bundle
        binding.editTextOne.doOnTextChanged { text, start, before, count ->
            bundle.putString("MyString", text.toString())
            setFragmentResult("ArgOne", bundle)
        }


        //по нажатию на кнопку кладем строку в Bundle
        binding.btnOne.setOnClickListener {
            val inputTextOne = binding.editTextOne.text.toString()

            bundle.putString("MyString", inputTextOne)
            setFragmentResult("ArgOne", bundle)
        }
    }

}