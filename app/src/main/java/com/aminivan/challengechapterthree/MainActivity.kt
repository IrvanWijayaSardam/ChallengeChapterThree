package com.aminivan.challengechapterthree

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aminivan.challengechapterthree.fragment.FragmentAlphabet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFragmentAlphabet()
    }

    fun openFragmentAlphabet(){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcFragment,FragmentAlphabet())
            commit()
        }
    }
}