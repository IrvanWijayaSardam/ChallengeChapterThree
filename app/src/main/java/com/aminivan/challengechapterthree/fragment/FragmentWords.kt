package com.aminivan.challengechapterthree.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.aminivan.challengechapterthree.AlphabetAdapter
import com.aminivan.challengechapterthree.DataAlphabet
import com.aminivan.challengechapterthree.R
import com.aminivan.challengechapterthree.databinding.FragmentWordsBinding


class FragmentWords : Fragment() {

    private lateinit var binding: FragmentWordsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_words, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentWordsBinding.bind(view)


        var alphabetChoosen = arguments?.getString("alphabet_choosen")
        //binding.tvHelloWords.setText("Data Received : "+alphabetChoosen.toString())

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


    }

    fun itsAChoosen(){
        val listAlphabet = arrayListOf(
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

        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsBChoosen(){
        val listAlphabet = arrayListOf(
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

        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsCChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Castorp"),
            DataAlphabet("Cat King"),
            DataAlphabet("Cat Liner"),
            DataAlphabet("Catbus"),
            DataAlphabet("Chirigo Oginoro"),
            )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsDChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Death and Rebirth"),
            DataAlphabet("Deceased"),
            DataAlphabet("Depressed"),
            DataAlphabet("Dr.Katsuragi"),
            DataAlphabet("Dragon"),
        )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsEChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Evangelion"),
            DataAlphabet("Emily"),
            DataAlphabet("Enigma"),
            DataAlphabet("Eagle"),
            DataAlphabet("Earthworm"),
        )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsFChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Fio Piccolo"),
            DataAlphabet("Foreman"),
            DataAlphabet("Fox Squirel"),
            DataAlphabet("Fujimoto"),
            DataAlphabet("Fukuo"),
        )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsGChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Ghibli"),
            DataAlphabet("Grandmother Okajima"),
            DataAlphabet("Granmamare"),
            DataAlphabet("Gaghiel"),
            DataAlphabet("Galvatron"),
            DataAlphabet("Gendo Ikari"),
        )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsHChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Howl Moving Castle"),
            DataAlphabet("Hajime Aida"),
            DataAlphabet("Hideki Tama"),
            DataAlphabet("Hitomi Amagi"),
            DataAlphabet("Haku"),
            DataAlphabet("Heen"),
        )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsIChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Inugami Gyobu"),
            DataAlphabet("Israfel"),
            DataAlphabet("Iguana"),
            DataAlphabet("Immortal"),
            DataAlphabet("Islam"),
            DataAlphabet("I Love You But i'm Letting Go"),
        )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsJChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Jejak"),
            DataAlphabet("Jellyfish"),
            DataAlphabet("Jinji"),
            DataAlphabet("Jiro Horikoshi"),
            DataAlphabet("Janji"),
            DataAlphabet("Joji"),
        )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }
    fun itsKChoosen(){
        val listAlphabet = arrayListOf(
            DataAlphabet("Kenangan Manis"),
            DataAlphabet("Kaede Agano"),
            DataAlphabet("Kotone Suzunamo"),
            DataAlphabet("Kawamaru"),
            DataAlphabet("Kaguya"),
            DataAlphabet("Kashira"),
        )
        val adapter = AlphabetAdapter(listAlphabet)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recycleViewWords)

        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = adapter
    }




}