package com.example.datastructuresapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.datastructuresapp.databinding.ActivityMainBinding

/**
 * Controller for the Main page.
 */

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    /**
     * Function which initialises app, sets view to activity_main and sets click listeners on the view.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * The click listener for the stack button.
         */

        binding.btnStack.setOnClickListener {

            val intent = Intent(this, StackActivity::class.java)
            startActivity(intent)
            finish()
        }

        /**
         * The click listener for the queue button.
         */

        binding.btnQueue.setOnClickListener {

            val intent = Intent(this, QueueActivity::class.java)
            startActivity(intent)
            finish()
        }

        /**
         * The click listener for the map button.
         */

        binding.btnMap.setOnClickListener {

            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}