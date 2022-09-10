package com.aminivan.challengechapterthree

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.challengechapterthree.adapter.AlphabetAdapter
import com.aminivan.challengechapterthree.adapter.AlphabetAdapterGrid
import com.aminivan.challengechapterthree.databinding.ActivityMainBinding
import com.aminivan.challengechapterthree.fragment.FragmentAlphabet
import com.aminivan.challengechapterthree.fragment.FragmentWords


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var menuMain: Menu
    lateinit var newRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setSupportActionBar(binding.layoutToolbar)
        openFragmentAlphabet()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        this.menuMain = menu
        menuInflater.inflate(R.menu.menu,menu)

        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list){

            Toast.makeText(this, "Show List Executed", Toast.LENGTH_SHORT).show()
            showList()
        } else if (item.itemId == R.id.menu_grid) {
            Toast.makeText(this, "Show Grid Executed", Toast.LENGTH_SHORT).show()
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        menu!!.findItem(R.id.search_action).setVisible(false)
        super.onPrepareOptionsMenu(menu)
        return super.onPrepareOptionsMenu(menu)
    }

    fun openFragmentAlphabet(){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcFragment,FragmentAlphabet())
            commit()
        }
    }

    private fun showGrid() {
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
        val adapter = AlphabetAdapterGrid(listAlphabet)
        val gv = GridLayoutManager(this,3)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleViewAlphabet)
        recyclerView?.layoutManager = gv
        recyclerView?.adapter = adapter
    }
    private fun showList() {
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

        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        newRecyclerView = findViewById<RecyclerView>(R.id.recycleViewAlphabet)

        newRecyclerView.layoutManager = layoutManager
        newRecyclerView.adapter = adapter
    }


}