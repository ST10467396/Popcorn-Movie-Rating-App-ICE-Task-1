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
import androidx.core.view.isVisible

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

        //Declare the warning message that will appear when no name is entered
        val warning = findViewById<TextView>(R.id.txtNameWarning)

        //PROCESSING - Navigate to the display screen when pressed
        display.setOnClickListener {
            //Set the var name of movie to the constant movie name input we got from the user
            movieName = name.text.toString()

            //Error handling - Check if the user entered a movie name
            if (movieName==""){ //if user did not enter a movie name an error message will pop up
                warning.isVisible = true
            }else{ //if user did enter a movie name no message will pop up
                //Display the movie name on the second screen
                intent.putExtra("movieNameDisplay", movieName)
                //Navigate to the second screen, the display screen
                startActivity(intent)
            }


        }

    }
}
//References
//<https://notesjam.com/pick-image-from-gallery-in-android/>