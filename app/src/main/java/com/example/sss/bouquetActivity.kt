package com.example.sss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class bouquetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bouquet)
        supportActionBar?.hide()
    }

    fun vbl(view: View) {
        val intent= Intent(this@bouquetActivity,flowersActivity::class.java)
        startActivity(intent)
    }
}