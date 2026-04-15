package com.example.popcorn_movie_rating_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        //DECLARATIONS - Declare the constants and Variables
        //Declare the constant that will store the name of the movie
        val name = findViewById<EditText>(R.id.edtName)

        //Declare the button that will navigate the screen to the display screen
        val display = findViewById<Button>(R.id.btnCheckRating)

        //Declare the intent for the display screen
        val intent = Intent(this, displayRatingScreen::class.java)

        //Declare a variable for the name of the movie
        var movieName: String

        //PROCESSING - Navigate to the display screen when pressed
        display.setOnClickListener {
            //Navigate to the second screen, the display screen
            startActivity(intent)

            //Set the var name of movie to the constant movie name input we got from the user
            movieName = name.text.toString()

            //Display the movie name on the second screen
            intent.putExtra("movieNameDisplay",movieName)
        }

    }
}