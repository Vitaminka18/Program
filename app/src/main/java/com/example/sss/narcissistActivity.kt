package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class narcissistActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_narcissist)
        supportActionBar?.hide()
    }

    fun r(view: View) {
        val intent=Intent(this@narcissistActivity,roseActivity::class.java)
        startActivity(intent)
    }
}