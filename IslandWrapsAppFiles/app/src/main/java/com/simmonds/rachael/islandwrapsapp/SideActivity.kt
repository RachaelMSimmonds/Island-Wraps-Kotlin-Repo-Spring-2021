package com.simmonds.rachael.islandwrapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmonds.rachael.islandwrapsapp.databinding.ActivitySideBinding

class SideActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySideBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}