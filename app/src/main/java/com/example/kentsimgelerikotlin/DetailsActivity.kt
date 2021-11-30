package com.example.kentsimgelerikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kentsimgelerikotlin.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val selectedLandmark = intent.getSerializableExtra("landmark") as Landmark
        binding.imageView.setImageResource(selectedLandmark.image)
        binding.landmarkName.text = selectedLandmark.name
        binding.landmarkCountry.text = selectedLandmark.country

    }
}