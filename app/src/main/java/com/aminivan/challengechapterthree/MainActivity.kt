package com.aminivan.challengechapterthree

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.aminivan.challengechapterthree.fragment.FragmentAlphabet
import com.aminivan.challengechapterthree.fragment.FragmentWords
import com.aminivan.challengechapterthree.parcel.DataParcel

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