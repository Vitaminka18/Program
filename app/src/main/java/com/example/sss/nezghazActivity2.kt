package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class nezghazActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nezghaz2)
        supportActionBar?.hide()
    }

    fun nnn(view: View) {
        val intent=Intent(this@nezghazActivity2,nezghazActivity::class.java)
        startActivity(intent)
    }
}