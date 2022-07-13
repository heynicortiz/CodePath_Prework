package com.example.helloworld

import android.os.Bundle
import android.text.Layout
import android.text.Spannable
import android.text.SpannableString
import android.text.style.AlignmentSpan
import android.util.Log
import android.view.Gravity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hwButton = findViewById<Button>(R.id.sayHello)

        // initialize a counter to make increment based changes to the toast text and log entries
        var helloClickCount = 0

        // import the app name to use for the log entries
        val appName = getString(R.string.app_name)

        // import the hero image so it can be replaced
        val heroImage = findViewById<ImageView>(R.id.heroMainImage)

        hwButton.setOnClickListener {
            // on "Say Hello" button click, increment the counter
            helloClickCount++
            // creates a toast with placeholder text that will be replaced later based on the helloClickCount
            var toastString = "Placeholder"
            val toast = Toast.makeText(this, toastString, Toast.LENGTH_SHORT)

            // if the count is over 5, replace the image, change the toast text, and log entry
            if (helloClickCount > 5) {
                heroImage.setImageResource(R.drawable.dory)
                toastString = "Hey Dory, I gotta go now, but...\njust keep swimming\njust keep swimming."
                Log.v(appName, "Just keep swimming")
            }
            // if the count is over 1, change the toast text and log entry
            else if (helloClickCount > 1) {
                toastString = "Aw, you're so nice...\nYou've said hello $helloClickCount times!\nBut you can keep going if you really want."
                Log.v(appName, "Tease for more clicks")
            }
            // base scenario
            else {
                toastString = "Hey to you too!\nWanna try that again?"
                Log.v(appName, "Thanks for clicking Say Hello button")
            }

            // center the toast text
            val centeredText: Spannable = SpannableString(toastString)
            centeredText.setSpan(AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, centeredText.length, Spannable.SPAN_INCLUSIVE_INCLUSIVE)
            toast.setText(centeredText)

            // set the toast position to the center of the screen
            toast.setGravity(Gravity.CENTER, 0, 0)
            // display the toast message
            toast.show()


        }
    }
}