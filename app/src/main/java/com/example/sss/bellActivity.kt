package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class bellActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bell)
        supportActionBar?.hide()
    }

    fun ghj(view: View) {
        val intent=Intent(this@bellActivity,gerberaActivity::class.java)
        startActivity(intent)
    }
}