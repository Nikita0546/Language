package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Exerciseeng : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exerciseeng)
    }
    fun toastme(view: View) {
        val myToast = Toast.makeText(this, "Оформите подписку", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun engex1(view: View) {
        val engIntent = Intent(this, Exerciseeng1::class.java)
        startActivity(engIntent)
    }
}