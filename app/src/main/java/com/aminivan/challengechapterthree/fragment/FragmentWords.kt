package com.aminivan.challengechapterthree.fragment

import android.os.Bundle
import android.view.*
import android.widget.SearchView
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.challengechapterthree.adapter.AlphabetAdapter
import com.aminivan.challengechapterthree.DataAlphabet
import com.aminivan.challengechapterthree.MainActivity
import com.aminivan.challengechapterthree.R
import com.aminivan.challengechapterthree.databinding.ActivityMainBinding
import com.aminivan.challengechapterthree.databinding.FragmentWordsBinding
import java.util.*
import kotlin.collections.ArrayList


class FragmentWords : Fragment() {

    private lateinit var binding: FragmentWordsBinding
    private lateinit var tempArray: ArrayList<DataAlphabet>
    private lateinit var newArrayList : ArrayList<DataAlphabet>
    private lateinit var newRecyleView : RecyclerView
    private lateinit var arrayWords: ArrayList<DataAlphabet>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(
            R.layout.fragment_words, container,
            false
        )

        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWordsBinding.bind(view)
        setHasOptionsMenu(true)

        newArrayList = arrayListOf()
        tempArray = arrayListOf()

        var alphabetChoosen = arguments?.getString("alphabet_choosen")
        requireActivity().title = "Words That Start With $alphabetChoosen"

        val listAlphabet = arrayListOf(
            DataAlphabet("Temporary"),
            DataAlphabet("Temporary"),)

        when(alphabetChoosen){
            "A" -> itsAChoosen()
            "B" -> itsBChoosen()
            "C" -> itsCChoosen()
            "D" -> itsDChoosen()
            "E" -> itsEChoosen()
            "F" -> itsFChoosen()
            "G" -> itsGChoosen()
            "H" -> itsHChoosen()
            "I" -> itsIChoosen()
            "J" -> itsJChoosen()
            "K" -> itsKChoosen()
            else -> Toast.makeText(context,"Else Choosed",Toast.LENGTH_LONG).show()
        }
        val adapter = AlphabetAdapter(tempArray)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        newRecyleView = requireView().findViewById<RecyclerView>(R.id.recycleViewWords)
        newArrayList.addAll(arrayWords)
        tempArray.addAll(arrayWords)

        newRecyleView.layoutManager = layoutManager
        newRecyleView.adapter = adapter
    }

    override fun onPrepareOptionsMenu(menu: Menu) {
        menu.setGroupVisible(R.id.main_menu_group,false)
        menu!!.findItem(R.id.search_action).setVisible(true)
        super.onPrepareOptionsMenu(menu)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        val item = menu?.findItem(R.id.search_action)
        val searchView = item?.actionView as SearchView
        searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(newText: String?): Boolean {
                tempArray.clear()
                val searchText = newText!!.toLowerCase(Locale.getDefault())
                if(searchText.isNotEmpty()){
                    newArrayList.forEach{
                        if (it.alphabet.toLowerCase(Locale.getDefault()).contains(searchText)){
                            tempArray.add(it)
                        }
                    }
                    newRecyleView.adapter!!.notifyDataSetChanged()
                }
                else{
                    tempArray.clear()
                    tempArray.addAll(newArrayList)
                    newRecyleView.adapter!!.notifyDataSetChanged()
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                tempArray.clear()
                val searchText = newText!!.toLowerCase(Locale.getDefault())
                if(searchText.isNotEmpty()){
                    newArrayList.forEach{
                        if (it.alphabet.toLowerCase(Locale.getDefault()).contains(searchText)){
                            tempArray.add(it)
                        }
                    }
                    newRecyleView.adapter!!.notifyDataSetChanged()
                }
                else{
                    tempArray.clear()
                    tempArray.addAll(newArrayList)
                    newRecyleView.adapter!!.notifyDataSetChanged()
                }
            return false
            }

        })
        super.onCreateOptionsMenu(menu, inflater)
    }

    fun itsAChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Adam"),
            DataAlphabet("Animal"),
            DataAlphabet("Anime"),
            DataAlphabet("Anaconda"),
            DataAlphabet("Ant"),
            DataAlphabet("Ape"),
            DataAlphabet("Artic Fox"),
            DataAlphabet("Armadillo"),
            DataAlphabet("Asuka Langley"),
            DataAlphabet("Advanced Ayanami Series"),
            DataAlphabet("Aoi Mogami"),
            DataAlphabet("Ayanami Rei"),
            DataAlphabet("Arael"),
        )
        return arrayWords
    }
    fun itsBChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Bardiel"),
            DataAlphabet("Bumblebee"),
            DataAlphabet("Bunzamon Horaki"),
            DataAlphabet("Boruto"),
            DataAlphabet("British"),
            DataAlphabet("Bandung"),
            DataAlphabet("Artic Fox"),
            DataAlphabet("Break It"),
            DataAlphabet("Baba Yaga"),
            DataAlphabet("Barsa"),
            DataAlphabet("Bessie"),
        )
        return arrayWords
    }
    fun itsCChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Castorp"),
            DataAlphabet("Cat King"),
            DataAlphabet("Cat Liner"),
            DataAlphabet("Catbus"),
            DataAlphabet("Chirigo Oginoro"),
            )
        return arrayWords
    }
    fun itsDChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Death and Rebirth"),
            DataAlphabet("Deceased"),
            DataAlphabet("Depressed"),
            DataAlphabet("Dr.Katsuragi"),
            DataAlphabet("Dragon"),
        )
        return arrayWords
    }
    fun itsEChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Evangelion"),
            DataAlphabet("Emily"),
            DataAlphabet("Enigma"),
            DataAlphabet("Eagle"),
            DataAlphabet("Earthworm"),
        )
        return arrayWords
    }
    fun itsFChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Fio Piccolo"),
            DataAlphabet("Foreman"),
            DataAlphabet("Fox Squirel"),
            DataAlphabet("Fujimoto"),
            DataAlphabet("Fukuo"),
        )
        return arrayWords
    }
    fun itsGChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Ghibli"),
            DataAlphabet("Grandmother Okajima"),
            DataAlphabet("Granmamare"),
            DataAlphabet("Gaghiel"),
            DataAlphabet("Galvatron"),
            DataAlphabet("Gendo Ikari"),
        )
        return arrayWords
    }
    fun itsHChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Howl Moving Castle"),
            DataAlphabet("Hajime Aida"),
            DataAlphabet("Hideki Tama"),
            DataAlphabet("Hitomi Amagi"),
            DataAlphabet("Haku"),
            DataAlphabet("Heen"),
        )
        return arrayWords
    }
    fun itsIChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Inugami Gyobu"),
            DataAlphabet("Israfel"),
            DataAlphabet("Iguana"),
            DataAlphabet("Immortal"),
            DataAlphabet("Islam"),
            DataAlphabet("I Love You But i'm Letting Go"),
        )
        return arrayWords

    }
    fun itsJChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Jejak"),
            DataAlphabet("Jellyfish"),
            DataAlphabet("Jinji"),
            DataAlphabet("Jiro Horikoshi"),
            DataAlphabet("Janji"),
            DataAlphabet("Joji"),
        )
        return arrayWords

    }
    fun itsKChoosen():ArrayList<DataAlphabet>{
        arrayWords = arrayListOf(
            DataAlphabet("Kenangan Manis"),
            DataAlphabet("Kaede Agano"),
            DataAlphabet("Kotone Suzunamo"),
            DataAlphabet("Kawamaru"),
            DataAlphabet("Kaguya"),
            DataAlphabet("Kashira"),
        )
        return arrayWords
    }

}