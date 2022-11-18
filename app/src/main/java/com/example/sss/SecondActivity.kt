package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        supportActionBar?.hide()
    }

    fun qwa(view: View) {
        val intent=Intent(this@SecondActivity,carnationActivity::class.java)
        startActivity(intent)
    }

    fun qwr(view: View) {
        val intent=Intent(this@SecondActivity,flowerrActivity::class.java)
        startActivity(intent)
    }

}