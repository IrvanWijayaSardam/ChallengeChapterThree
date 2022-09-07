package com.aminivan.challengechapterthree

import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.challengechapterthree.fragment.FragmentWords


class AlphabetAdapter (private val listAlphabet: ArrayList<DataAlphabet>) : RecyclerView.Adapter<AlphabetAdapter.ViewHolder>() {
    private lateinit var context :Context

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
                if(holder.btnAlphabet.length() == 1){
                    var bund = Bundle()
                    var intent: Intent = Intent(context,WordsActivity::class.java)
                    bund.putString("alphabet_choosen",holder.btnAlphabet.text.toString())
                    intent.putExtras(bund)
                    context.startActivity(intent)

                } else {
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=${holder.btnAlphabet.text.toString()}"))
                    context.startActivity(browserIntent)
                }

            }
        })
    }

    override fun getItemCount(): Int {
        return listAlphabet.size
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }
}