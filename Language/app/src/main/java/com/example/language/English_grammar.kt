package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class English_grammar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_english_grammar)
    }
    fun gramm(view: View) {
        val engIntent = Intent(this, Lesson_1::class.java)
        startActivity(engIntent)
    }
    fun gramm1(view: View) {
        val engIntent = Intent(this, Lesson_2::class.java)
        startActivity(engIntent)
    }
    fun toastme(view: View) {
        val myToast = Toast.makeText(this, "Оформите подписку", Toast.LENGTH_SHORT)

        myToast.show()
    }
}