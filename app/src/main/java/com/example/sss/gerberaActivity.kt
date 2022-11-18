package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class gerberaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gerbera)
        supportActionBar?.hide()
    }

    fun ff(view: View) {
        val intent= Intent(this@gerberaActivity,gypsophilesActivity::class.java)
        startActivity(intent)
    }
}