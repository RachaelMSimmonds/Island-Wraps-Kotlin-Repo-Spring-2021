package com.simmonds.rachael.islandwrapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmonds.rachael.islandwrapsapp.databinding.ActivityPlateBinding

class PlateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPlateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlateBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}