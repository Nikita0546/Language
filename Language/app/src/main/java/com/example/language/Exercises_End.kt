package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Exercises_End : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises_end)
    }

    fun engexe(view: View){
        val endInent2 = Intent(this, Exerciseeng::class.java)
        startActivity(endInent2)
    }
    fun theend(view: View){
        val endInent2 = Intent(this, MainActivity::class.java)
        startActivity(endInent2)
    }
}