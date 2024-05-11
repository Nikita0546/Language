package com.example.language

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
    }

    fun toastmes(view: View) {
        val myToast = Toast.makeText(this, "Проводится ремонт", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun toastme1(view: View) {
        val myToast = Toast.makeText(this, "Не доступно в вашем регионе", Toast.LENGTH_SHORT)

        myToast.show()
    }
}