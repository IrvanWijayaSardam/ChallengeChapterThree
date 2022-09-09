package com.aminivan.challengechapterthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import android.util.Log.DEBUG
import android.util.Log.INFO
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.challengechapterthree.adapter.AlphabetAdapter
import com.aminivan.challengechapterthree.adapter.AlphabetAdapterGrid
import com.aminivan.challengechapterthree.databinding.ActivityMainBinding
import com.aminivan.challengechapterthree.databinding.FragmentWordsBinding
import java.util.logging.Level.INFO

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var menuMain: Menu
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        setSupportActionBar(binding.layoutToolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        this.menuMain = menu
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun showOverflowMenu(showMenu : Boolean){
        if (menuMain == null){
            return
        }
        menuMain.setGroupVisible(R.id.main_menu_group,showMenu)
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
        val recyclerView = findViewById<RecyclerView>(R.id.recycleViewAlphabet)
        var replacedSelected: String = listAlphabet.get(0).toString().replace("DataAlphabet(alphabet=","",true)



        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
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

}