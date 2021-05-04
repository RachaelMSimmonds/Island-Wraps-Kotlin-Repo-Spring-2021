package com.simmonds.rachael.islandwrapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.simmonds.rachael.islandwrapsapp.databinding.ActivityMainBinding
import com.simmonds.rachael.islandwrapsapp.databinding.ActivityWrapBinding

class WrapActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWrapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWrapBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}