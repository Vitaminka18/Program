package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class astraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_astra)
        supportActionBar?.hide()

    }

    fun bnb(view: View) {
        val intent=Intent(this@astraActivity,lilyActivity::class.java)
        startActivity(intent)
    }

}