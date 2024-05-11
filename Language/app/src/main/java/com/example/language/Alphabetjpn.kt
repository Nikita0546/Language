package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Alphabetjpn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabetjpn)
    }

    fun hiragana(view: View){
        val endInent = Intent(this, hiragana::class.java)
        startActivity(endInent)
    }

    fun katakana(view: View){
        val endInent = Intent(this, katakana::class.java)
        startActivity(endInent)
    }
}