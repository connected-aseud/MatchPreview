package com.example.matchpreview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.matchpreview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.layoutGame1.vsLeft.layoutResource = R.layout.layout_game_left
        binding.layoutGame1.vsLeft.inflate()
        binding.layoutGame1.vsRight.layoutResource = R.layout.layout_game_right
        binding.layoutGame1.vsRight.inflate()

        binding.layoutGame2.vsLeft.layoutResource = R.layout.layout_game_left
        binding.layoutGame2.vsLeft.inflate()
//        binding.layoutGame2.vsRight.layoutResource = R.layout.layout_game_right
//        binding.layoutGame2.vsRight.inflate()

//        binding.layoutGame3.vsLeft.layoutResource = R.layout.layout_game_left
//        binding.layoutGame3.vsLeft.inflate()
        binding.layoutGame3.vsRight.layoutResource = R.layout.layout_game_right
        binding.layoutGame3.vsRight.inflate()
    }
}