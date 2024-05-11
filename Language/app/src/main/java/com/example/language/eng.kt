package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class eng : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eng)
    }

    fun toastme(view: View) {
        val myToast = Toast.makeText(this, "Оформите подписку", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun engalp(view: View) {
        val engIntent = Intent(this, Alphabet::class.java)
        startActivity(engIntent)
    }
    fun enggr(view: View){
        val endInent1 = Intent(this, English_grammar::class.java)
        startActivity(endInent1)
    }

    fun engexe(view: View){
        val endInent2 = Intent(this, Exerciseeng::class.java)
        startActivity(endInent2)
    }
    fun engdict(view: View){
        val endInent2 = Intent(this, Dictionaryeng::class.java)
        startActivity(endInent2)
    }
}