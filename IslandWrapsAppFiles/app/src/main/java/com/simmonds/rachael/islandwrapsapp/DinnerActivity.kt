package com.simmonds.rachael.islandwrapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmonds.rachael.islandwrapsapp.databinding.ActivityDinnerBinding

class DinnerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDinnerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDinnerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}