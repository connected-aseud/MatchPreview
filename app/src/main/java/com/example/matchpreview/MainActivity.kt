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

        addGameCard1() // Default left, Default right
        addGameCard2() // Default left
        addGameCard3() // Tennis left,  Default right
        addGameCard4() // Tennis left
        addGameCard5() //               Default right
    }

    private fun addGameCard1() {
        binding.layoutGame1.vsLeft.layoutResource = R.layout.layout_game_left
        binding.layoutGame1.vsLeft.inflate()
        binding.layoutGame1.vsRight.layoutResource = R.layout.layout_game_right
        binding.layoutGame1.vsRight.inflate()
    }

    private fun addGameCard2() {
        binding.layoutGame2.vsLeft.layoutResource = R.layout.layout_game_left
        binding.layoutGame2.vsLeft.inflate()
//        binding.layoutGame2.vsRight.layoutResource = R.layout.layout_game_right
//        binding.layoutGame2.vsRight.inflate()
    }

    private fun addGameCard3() {
        binding.layoutGame3.vsLeft.layoutResource = R.layout.layout_game_left_tennis
        binding.layoutGame3.vsLeft.inflate()
        binding.layoutGame3.vsRight.layoutResource = R.layout.layout_game_right
        binding.layoutGame3.vsRight.inflate()
    }

    private fun addGameCard4() {
        binding.layoutGame4.vsLeft.layoutResource = R.layout.layout_game_left_tennis
        binding.layoutGame4.vsLeft.inflate()
//        binding.layoutGame4.vsRight.layoutResource = R.layout.layout_game_right
//        binding.layoutGame4.vsRight.inflate()
    }

    private fun addGameCard5() {
//        binding.layoutGame5.vsLeft.layoutResource = R.layout.layout_game_left
//        binding.layoutGame5.vsLeft.inflate()
        binding.layoutGame5.vsRight.layoutResource = R.layout.layout_game_right
        binding.layoutGame5.vsRight.inflate()
    }
}