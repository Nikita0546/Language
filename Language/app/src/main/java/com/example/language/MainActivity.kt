package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun engst(view: View) {
        val engIntent = Intent(this, eng::class.java)
        startActivity(engIntent)
    }

    fun jpnst(view: View) {
        val jpnIntent = Intent(this, jpn::class.java)
        startActivity(jpnIntent)
    }

    fun stg(view: View) {
        val stgIntent = Intent(this, Settings::class.java)
        startActivity(stgIntent)
    }

    fun toastme(view: View) {
        val myToast = Toast.makeText(this, "Оформите подписку", Toast.LENGTH_SHORT)

        myToast.show()
    }
}