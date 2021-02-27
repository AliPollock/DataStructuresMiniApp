package com.example.datastructuresapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.datastructuresapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStack.setOnClickListener {

            val intent = Intent(this, StackActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnQueue.setOnClickListener {

            val intent = Intent(this, QueueActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnMap.setOnClickListener {

            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}