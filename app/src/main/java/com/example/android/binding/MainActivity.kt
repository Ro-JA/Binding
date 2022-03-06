package com.example.android.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android.binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.name.text = "Roman Boyarkin"
        binding.address.text = "Chita 4 - 35 - 42"
    }
}