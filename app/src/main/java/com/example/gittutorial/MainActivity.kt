package com.example.gittutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("This is contained from second commit")

        println("Stash faile ")

        println("Change 2 in Testing branch for checking merge conflict")
    }
}