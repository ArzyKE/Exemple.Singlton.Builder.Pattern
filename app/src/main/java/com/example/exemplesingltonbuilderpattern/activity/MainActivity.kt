package com.example.exemplesingltonbuilderpattern.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exemplesingltonbuilderpattern.PatternSingleton
import com.example.exemplesingltonbuilderpattern.R
import com.example.exemplesingltonbuilderpattern.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.setText.text = PatternSingleton.getData()

    }
}
