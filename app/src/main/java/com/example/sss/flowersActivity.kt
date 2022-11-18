package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class flowersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flowers)
        supportActionBar?.hide()
    }

    fun ghg(view: View) {
        val intent= Intent(this@flowersActivity,ooooActivity::class.java)
        startActivity(intent)
    }
}