package com.simmonds.rachael.islandwrapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmonds.rachael.islandwrapsapp.databinding.ActivityBeverageBinding

class BeverageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBeverageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeverageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}