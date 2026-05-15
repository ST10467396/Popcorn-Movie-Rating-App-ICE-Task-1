package com.example.popcorn_movie_rating_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
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
        val name = findViewById<EditText>(R.id.edtName)//(Mishka Dewlok,2026)

        //Declare the button that will navigate the screen to the display screen
        val display = findViewById<Button>(R.id.btnCheckRating)//(Mishka Dewlok,2026)

        //Declare the intent for the display screen
        val intent = Intent(this, displayRatingScreen::class.java)//(Mishka Dewlok,2026)

        //Declare a variable for the name of the movie
        var movieName: String//(Mishka Dewlok,2026)

        //Declare the warning message that will appear when no name is entered
        val warning = findViewById<TextView>(R.id.txtNameWarning)//(Mishka Dewlok,2026)


        //Declare the movie rating value
        val ratingInput = findViewById<TextView>(R.id.txtRating)//(Mishka Dewlok,2026)
        var rating: String//(Mishka Dewlok,2026)

        //Declare the warning message if the user entered the wrong rating
        val error = findViewById<TextView>(R.id.txtRatingWarning)//(Mishka Dewlok,2026)

        //PROCESSING - Navigate to the display screen when pressed
        display.setOnClickListener {

            //Set the var name of movie to the constant movie name input we got from the user
            movieName = name.text.toString()//(Mishka Dewlok,2026)
            //var isRated: Boolean = false
            ////Set the var value of the rating to the constant rating we got from the user
            rating = ratingInput.text.toString()//(Mishka Dewlok,2026)
            //Error handling - check that the user entered a valid rating


            //Error handling - Check if the user entered a movie name
            if (movieName==""){ //if user did not enter a movie name an error message will pop up
                warning.isVisible = true//(Mishka Dewlok,2026)
            }else{ //if user did enter a movie name no message will pop up
                //Display the movie name on the second screen
                intent.putExtra("movieNameDisplay", movieName)//(Mishka Dewlok,2026)
                intent.putExtra("rating",rating)//(Mishka Dewlok,2026)
                //Navigate to the second screen, the display screen
                startActivity(intent)//(Mishka Dewlok,2026)
            }//(Mishka Dewlok,2026)


        }

    }
}
//References - Code Attribution
//Mishka Dewlok,M.D., 2026.
//IMAD5112 Online 2026-20260305_180248-Meeting Recording.mp4,
// IMAD5112, Introduction to Mobile Application Development IMAD5112 2026 PT HMAW0501 EMGPON Term 1 GR01
// [online via internal Virtual Learning Environment (VLE)].
// The Independent Institute of Education: Unpublished.
//Available at: <https://mystudies.iie.edu.za/d2l/le/lessons/66661/topics/5411078>
//[Accessed Date 11 May 2026].

//Mishka Dewlok,M.D., 2026.
//IMAD5112 Online 2026-20260319_180645-Meeting Recording.mp4,
// IMAD5112, Introduction to Mobile Application Development IMAD5112 2026 PT HMAW0501 EMGPON Term 1 GR01
// [online via internal Virtual Learning Environment (VLE)].
// The Independent Institute of Education: Unpublished.
//Available at: <https://mystudies.iie.edu.za/d2l/le/lessons/66661/topics/5488548>
//[Accessed Date 11 May 2026].

//Mishka Dewlok,M.D., 2026.
//IMAD5112 Online 2026-20260402_181545-Meeting Recording(1).mp4,
// IMAD5112, Introduction to Mobile Application Development IMAD5112 2026 PT HMAW0501 EMGPON Term 1 GR01
// [online via internal Virtual Learning Environment (VLE)].
// The Independent Institute of Education: Unpublished.
//Available at: <https://mystudies.iie.edu.za/d2l/le/lessons/66661/topics/5531872>
//[Accessed Date 11 May 2026].

//Mishka Dewlok,M.D., 2026.
//IMAD5112 Online 2026-20260416_180148-Meeting Recording.mp4,
// IMAD5112, Introduction to Mobile Application Development IMAD5112 2026 PT HMAW0501 EMGPON Term 1 GR01
// [online via internal Virtual Learning Environment (VLE)].
// The Independent Institute of Education: Unpublished.
//Available at: <https://mystudies.iie.edu.za/d2l/le/lessons/66661/topics/5777373>
//[Accessed Date 11 May 2026].
