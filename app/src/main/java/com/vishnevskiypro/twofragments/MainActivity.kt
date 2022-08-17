package com.vishnevskiypro.twofragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var message: String = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val one = OneFragment()
        val two = TwoFragment()

        supportFragmentManager.beginTransaction().add(R.id.containerOne, one).commit()
        supportFragmentManager.beginTransaction().add(R.id.containerTwo, two).commit()


    }
}