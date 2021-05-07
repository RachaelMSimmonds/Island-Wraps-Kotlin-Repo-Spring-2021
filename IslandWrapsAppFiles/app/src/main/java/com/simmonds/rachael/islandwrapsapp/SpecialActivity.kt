package com.simmonds.rachael.islandwrapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmonds.rachael.islandwrapsapp.databinding.ActivitySpecialBinding


class SpecialActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySpecialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpecialBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}