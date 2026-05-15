package com.example.popcorn_movie_rating_app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

class displayRatingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_display_rating_screen)

        //Declare the constant value of the img view of the stars used to display rating
        val oneStar = findViewById<ImageView>(R.id.img1Star)//(Mishka Dewlok,2026)
        val twoStar = findViewById<ImageView>(R.id.img2Star)//(Mishka Dewlok,2026)
        val threeStar = findViewById<ImageView>(R.id.img3Star)//(Mishka Dewlok,2026)
        val fourStar = findViewById<ImageView>(R.id.img4Star)//(Mishka Dewlok,2026)
        val fiveStar = findViewById<ImageView>(R.id.img5Star)//(Mishka Dewlok,2026)
        val sixStar = findViewById<ImageView>(R.id.img6)//(Mishka Dewlok,2026)
        val sevenStar = findViewById<ImageView>(R.id.img7Star)//(Mishka Dewlok,2026)
        val eighthStar = findViewById<ImageView>(R.id.img8Star)//(Mishka Dewlok,2026)
        val nineStar = findViewById<ImageView>(R.id.img9Star)//(Mishka Dewlok,2026)
        val tenStar = findViewById<ImageView>(R.id.img10Star)//(Mishka Dewlok,2026)


        //Back btn
        val back = findViewById<Button>(R.id.btnBack)//(Mishka Dewlok,2026)


        //PROCESSING - Goes back to the main form
        back.setOnClickListener {
            finish()
        }//(Mishka Dewlok,2026)
        //Display the name of the movie
        val nameDisplay = findViewById<TextView>(R.id.txtMovieName)//(Mishka Dewlok,2026)

        //get  the name from bundle
        val bundle: Bundle? = intent.extras
        val displayMovieName: String?=bundle?.getString("movieNameDisplay")//(Mishka Dewlok,2026)
        nameDisplay.text = displayMovieName
        //bundle- get rating
        val displayRating: String?=bundle?.getString("rating")//(Mishka Dewlok,2026)
        //PROCESSING - Determine how much the rating is
        var rating: Int
        //convert the rating from string to int
        rating = displayRating.toString().toInt()//(Mishka Dewlok,2026)
        //determine the rating and display the rating using stars
        if (rating==1){
            oneStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating== 2) {
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating == 3) {
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
            threeStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating == 4){
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
            threeStar.isVisible = true //(Mishka Dewlok,2026)
            fourStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating == 5){
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
            threeStar.isVisible = true //(Mishka Dewlok,2026)
            fourStar.isVisible = true //(Mishka Dewlok,2026)
            fiveStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating == 6){
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
            threeStar.isVisible = true //(Mishka Dewlok,2026)
            fourStar.isVisible = true //(Mishka Dewlok,2026)
            fiveStar.isVisible = true //(Mishka Dewlok,2026)
            sixStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating == 7){
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
            threeStar.isVisible = true //(Mishka Dewlok,2026)
            fourStar.isVisible = true //(Mishka Dewlok,2026)
            fiveStar.isVisible = true //(Mishka Dewlok,2026)
            sixStar.isVisible = true //(Mishka Dewlok,2026)
            sevenStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating == 8){
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
            threeStar.isVisible = true //(Mishka Dewlok,2026)
            fourStar.isVisible = true //(Mishka Dewlok,2026)
            fiveStar.isVisible = true //(Mishka Dewlok,2026)
            sixStar.isVisible = true //(Mishka Dewlok,2026)
            sevenStar.isVisible = true //(Mishka Dewlok,2026)
            eighthStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating == 9){
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
            threeStar.isVisible = true //(Mishka Dewlok,2026)
            fourStar.isVisible = true //(Mishka Dewlok,2026)
            fiveStar.isVisible = true //(Mishka Dewlok,2026)
            sixStar.isVisible = true //(Mishka Dewlok,2026)
            sevenStar.isVisible = true //(Mishka Dewlok,2026)
            eighthStar.isVisible = true //(Mishka Dewlok,2026)
            nineStar.isVisible = true //(Mishka Dewlok,2026)
        } else if (rating == 10){
            oneStar.isVisible = true //(Mishka Dewlok,2026)
            twoStar.isVisible = true //(Mishka Dewlok,2026)
            threeStar.isVisible = true //(Mishka Dewlok,2026)
            fourStar.isVisible = true //(Mishka Dewlok,2026)
            fiveStar.isVisible = true //(Mishka Dewlok,2026)
            sixStar.isVisible = true //(Mishka Dewlok,2026)
            sevenStar.isVisible = true //(Mishka Dewlok,2026)
            eighthStar.isVisible = true //(Mishka Dewlok,2026)
            nineStar.isVisible = true //(Mishka Dewlok,2026)
            tenStar.isVisible = true //(Mishka Dewlok,2026)
        } //(Mishka Dewlok,2026)

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


    }
}