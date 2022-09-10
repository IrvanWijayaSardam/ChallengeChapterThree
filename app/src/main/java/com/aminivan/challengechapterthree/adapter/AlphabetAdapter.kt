package com.aminivan.challengechapterthree.adapter

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.challengechapterthree.DataAlphabet
import com.aminivan.challengechapterthree.R
import com.aminivan.challengechapterthree.fragment.FragmentWords



class AlphabetAdapter (private val listAlphabet: ArrayList<DataAlphabet>
) : RecyclerView.Adapter<AlphabetAdapter.ViewHolder>() {
    private lateinit var context :Context
    private lateinit var webView: WebView

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val btnAlphabet = itemView.findViewById<Button>(R.id.btnList)

    }

    interface OnAdapterListener {
        fun onClick(alphabet : String)
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
                    val activity=v!!.context as AppCompatActivity
                    val fragmentWords = FragmentWords(holder.btnAlphabet.text.toString())
                    activity.supportFragmentManager.beginTransaction().replace(R.id.fcFragment,fragmentWords).addToBackStack(null).commit()

                } else {
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=${holder.btnAlphabet.text.toString()}"))
                    context.startActivity(browserIntent)
                }

            }
        })

        holder.btnAlphabet.setOnLongClickListener {
            val dialog = Dialog(context)
            dialog.setContentView(R.layout.custom_dialog)

            webView = dialog.findViewById<WebView>(R.id.webView)
            webView.webViewClient = WebViewClient()
            webView.loadUrl("https://www.google.com/search?q=${holder.btnAlphabet.text.toString()}")
            val webSettings = webView.settings
            webSettings.javaScriptEnabled = true
            webSettings.domStorageEnabled = true
            webSettings.allowFileAccess = true
            webSettings.allowContentAccess = true
            val close : Button = dialog.findViewById(R.id.btn_dialog_close)
            close.setOnClickListener{dialog.dismiss()}

            dialog.show()

            return@setOnLongClickListener true
        }
    }

    override fun getItemCount(): Int {
        return listAlphabet.size
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        context = recyclerView.context
    }
}