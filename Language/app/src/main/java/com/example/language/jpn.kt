package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class jpn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jpn)
    }

    fun toastme(view: View) {
        val myToast = Toast.makeText(this, "Оформите подписку", Toast.LENGTH_SHORT)

        myToast.show()
    }
    fun engdict(view: View){
        val endInent = Intent(this, Dictionaryeng::class.java)
        startActivity(endInent)
    }

    fun jpnalp(view: View){
        val endInent1 = Intent(this, Alphabetjpn::class.java)
        startActivity(endInent1)
    }
}