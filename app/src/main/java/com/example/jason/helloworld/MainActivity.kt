package com.example.jason.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/*An activity is the building block to the UI. Can add user interactions to the elements made in
the xml files*/
class MainActivity : AppCompatActivity() {

    //A function in the MainActivity that is overridden
    override fun onCreate(savedInstanceState: Bundle?) {

        //Parent function
        super.onCreate(savedInstanceState)

        //The layout file that will be associated with this activity
        setContentView(R.layout.activity_main)
    }
}
