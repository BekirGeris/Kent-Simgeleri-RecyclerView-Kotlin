package com.example.kentsimgelerikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kentsimgelerikotlin.databinding.ActivityDetailsBinding
import com.example.kentsimgelerikotlin.databinding.ActivityMainBinding

//var  globalLandmark : Landmark? = null

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarks: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        landmarks = ArrayList<Landmark>()

        val pisa = Landmark("Pisa", "Ital", R.drawable.pisa)
        val galata = Landmark("Galata kulesi", "Turkey", R.drawable.galata)
        val yss = Landmark("Yavuz Sultan Selim", "Turkey", R.drawable.ysz)

        landmarks.add(pisa)
        landmarks.add(galata)
        landmarks.add(yss)
        landmarks.add(pisa)
        landmarks.add(galata)
        landmarks.add(yss)
        landmarks.add(pisa)
        landmarks.add(yss)
        landmarks.add(pisa)
        landmarks.add(galata)
        landmarks.add(pisa)
        landmarks.add(pisa)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = LandmarkAdapter(landmarks)
        binding.recyclerView.adapter = adapter


    }
}