package com.simmonds.rachael.islandwrapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmonds.rachael.islandwrapsapp.databinding.ActivitySaladBinding

class SaladActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySaladBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySaladBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}