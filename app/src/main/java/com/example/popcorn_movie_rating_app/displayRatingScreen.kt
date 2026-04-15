package com.example.popcorn_movie_rating_app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class displayRatingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display_rating_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Back btn
        val back = findViewById<Button>(R.id.btnBack)

        //PROCESSING - Goes back to the main form
        back.setOnClickListener {
            finish()
        }
        //Display the name of the movie
        val nameDisplay = findViewById<TextView>(R.id.txtMovieName)

        //get  the name from bundle
        val bundle: Bundle? = intent.extras
        val displayMovieName: String?=bundle?.getString("movieNameDisplay")
        nameDisplay.text = displayMovieName


    }
}