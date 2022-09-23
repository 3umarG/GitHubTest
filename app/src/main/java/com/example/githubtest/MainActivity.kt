package com.example.githubtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is My Second Commit")
        println("Another Feature on Second Branch")
        println("Another Feature 2 on Second Branch")
        println("This is My Third  Commit")
        print("This is First Commit on First Branch")
        println("The Last Feature ")

        println("Hello from the other Side , friend !!")
    }
}