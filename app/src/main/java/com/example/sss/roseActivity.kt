package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class roseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rose)
        supportActionBar?.hide()
    }

    fun ds(view: View) {
        val intent=Intent(this@roseActivity,tulipActivity::class.java)
        startActivity(intent)
    }
}