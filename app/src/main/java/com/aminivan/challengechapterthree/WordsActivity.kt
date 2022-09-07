package com.aminivan.challengechapterthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aminivan.challengechapterthree.fragment.FragmentAlphabet
import com.aminivan.challengechapterthree.fragment.FragmentWords

class WordsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_words)

        openFragmentWords()

    }

    fun openFragmentWords(){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcWords, FragmentWords())
            commit()
        }
    }
}