package com.aminivan.challengechapterthree.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aminivan.challengechapterthree.R
import com.aminivan.challengechapterthree.databinding.FragmentWordsBinding


class FragmentWords : Fragment() {

    private lateinit var binding: FragmentWordsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_words, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWordsBinding.bind(view)


        var alphabetChoosen = arguments?.getString("alphabet_choosen")
        binding.tvHelloWords.setText("Data Received : "+alphabetChoosen.toString())
    }

}