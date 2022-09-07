package com.aminivan.challengechapterthree.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.challengechapterthree.AlphabetAdapter
import com.aminivan.challengechapterthree.DataAlphabet
import com.aminivan.challengechapterthree.R


class FragmentAlphabet : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alphabet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listAlphabet = arrayListOf(
            DataAlphabet("A"),
            DataAlphabet("B"),
            DataAlphabet("C"),
            DataAlphabet("D"),
            DataAlphabet("E"),
            DataAlphabet("F"),
            DataAlphabet("G"),
            DataAlphabet("H"),
            DataAlphabet("I"),
            DataAlphabet("J"),
            DataAlphabet("K"),
            DataAlphabet("O"),
            DataAlphabet("P"),
            DataAlphabet("Q"),
            DataAlphabet("R"),
            DataAlphabet("S"),
            DataAlphabet("T"),
            DataAlphabet("U"),
            DataAlphabet("V"),
            DataAlphabet("W"),
            DataAlphabet("X"),
            DataAlphabet("Y"),
            DataAlphabet("Z"),
        )

        Toast.makeText(context,"This is fragment Alphabet",Toast.LENGTH_SHORT).show()
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycleViewAlphabet)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

    }

}