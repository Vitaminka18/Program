package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class pionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pions)
        supportActionBar?.hide()
    }

    fun uuu(view: View) {
        val intent= Intent(this@pionsActivity,pionsActivity2::class.java)
        startActivity(intent)
    }

    fun ppp(view: View) {
        val intent=Intent(this@pionsActivity,nezghazActivity2::class.java)
        startActivity(intent)
    }
}