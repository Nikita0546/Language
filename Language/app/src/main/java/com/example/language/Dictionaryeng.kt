package com.example.language

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Dictionaryeng : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dictionaryeng)
    }

    fun toastme(view: View) {
        val myToast = Toast.makeText(this, "Оформите подписку", Toast.LENGTH_SHORT)

        myToast.show()
    }
}