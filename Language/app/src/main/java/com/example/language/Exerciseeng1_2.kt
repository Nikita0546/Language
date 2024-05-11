package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Exerciseeng1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerciseeng1_2)
    }
    fun toastme(view: View) {
        val myToast = Toast.makeText(this, "Ответ не правильный!!!", Toast.LENGTH_SHORT)

        myToast.show()
    }
    fun engex1_2(view: View){
        val endInent = Intent(this, Exerciseeng1_3::class.java)
        startActivity(endInent)
    }
}