package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Exerciseeng1_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerciseeng1_3)
    }

    fun toastme(view: View) {
        val myToast = Toast.makeText(this, "Ответ не правильный!!!", Toast.LENGTH_SHORT)

        myToast.show()
    }
    fun engex1_3(view: View){
        val endInent = Intent(this, Exercises_End::class.java)
        startActivity(endInent)
    }
}