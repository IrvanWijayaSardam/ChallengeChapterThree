package com.aminivan.challengechapterthree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.challengechapterthree.fragment.FragmentWords

class AlphabetAdapter (private val listAlphabet: ArrayList<DataAlphabet>) : RecyclerView.Adapter<AlphabetAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val btnAlphabet = itemView.findViewById<Button>(R.id.btnList)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_alphabet,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.btnAlphabet.text = listAlphabet[position].alphabet
        holder.btnAlphabet.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val activity=v!!.context as AppCompatActivity
                var bund = Bundle()
                bund.putString("alphabet_choosen",holder.btnAlphabet.text.toString())
                Navigation.findNavController(holder.itemView).navigate(R.id.action_fragmentAlphabet_to_fragmentWords,bund)
            }
        })
    }

    override fun getItemCount(): Int {
        return listAlphabet.size
    }
}